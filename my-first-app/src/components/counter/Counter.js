import "../../App.css";
import React, { useState, useEffect } from 'react';


// class Counter extends React.Component {
//     constructor() {
//         super();
//         this.state = {
//             counterValue: 0,
//         };
//     }
//
//
//     componentDidMount(){
//         console.log("rendered")
//     }
//     componentDidUpdate(prevProps, prevState){
//         console.log("updated")
//     }
//
//     render() {
//         const counterValueText = "Fist counter value " + this.state.counterValue;
//         return (
//             <div id="container">
//                 <div>
//                     <button
//                         onClick={(event) => {
//                             this.setState((state, props) => {
//                                 return {
//                                   counterValue: state.counterValue - 1,
//                                 };
//                             });
//                         }}
//                     >
//
//                     </button>
//                     <span>{counterValueText}</span>
//                     <button
//                         onClick={(event) => {
//                             this.setState((state, props) => {
//                                 return {
//                                     counterValue: state.counterValue + 1,
//                                 };
//                             });
//                         }}
//                     >
//                         +
//                     </button>
//                 </div>
//                 <button
//                     onClick={(event) => {
//                         this.setState({ counterValue: 0 });
//                     }}
//                 >
//                     Reset counter
//                 </button>
//             </div>
//             </div>
//
//         );
//     }
// }

const Counter = () => {
    const [counterValue, setCounterValue] = useState (0);
    useEffect (() => {
    console.log('mount and update');

    return() =>{
        console.log ("cleanup");
    };
    });
        return (
            <div id="container">
                <h2>{`Counter value: ${counterValue}`}</h2>
                    <button
                        onClick={() =>
                          setCounterValue(counterValue - 1)}>
                    </button>
                    <p>Remove1</p>

                    <button
                         onClick={() =>
                        setCounterValue(counterValue + 1)}>
                    </button>
                    <p>Add1</p>
            </div>
    );
}
export default Counter;