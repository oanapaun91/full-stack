import {useState, useEffect} from "react";

const WelcomeMessage = () => {
    const[welcome, setWelcome] = useState("Please wait...")

    useEffect(() => {
        setTimeout(() => { setWelcome("Welcome to Devmind") }, 3000);
        return () => {
            console.log('cleanup');

        };
    }, []);

    return (
        <div>
            <h1>{ welcome }</h1>
        </div>
    )

}
export default WelcomeMessage;