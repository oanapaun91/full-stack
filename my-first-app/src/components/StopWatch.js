import React, { useState, useEffect } from "react";
import {clear} from "@testing-library/user-event/dist/clear";

const StopWatch = () => {
   const [secondsValue, setSecondsValue] = useState(0);
    const [minutesValue, setMinutesValue] = useState(0);
    const [runningState, setRunningState] = useState(false);
    let interval = null;

    useEffect (() => {
        if (runningState) {
            interval = setInterval(() => {
                setSecondsValue(secondsValue + 1)
                if (secondsValue == 60) {
                    setSecondsValue(0);
                    setMinutesValue(minutesValue + 1);
                }
            }, 1000);
        } else clearInterval(interval);
        return () => clearInterval(interval);

   })

    return (
        <div>
            { minutesValue + ":" + secondsValue }
            <button
                onClick={() => {
                    setSecondsValue(0);
                    setMinutesValue(0);
                    setRunningState(true);
                }}>
                Start
            </button>


            <button
                onClick={() =>
                    setRunningState(false)}>
                Stop
            </button>
        </div>
    )
}
export default StopWatch;