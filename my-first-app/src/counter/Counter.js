import React, {Fragment} from "react";
import "../App.css";

class Counter extends React.Component {
    constructor() {
        super();
        this.state = {
            counterValue: 0,
        };
    }


    componentDidMount(){
        console.log("rendered")
    }
    componentDidUpdate(prevProps, prevState){
        console.log("updated")
    }

    render() {
        const counterValueText = "Fist counter value " + this.state.counterValue;
        return (
            <div id="container">
                <div>
                    <button
                        onClick={(event) => {
                            this.setState((state, props) => {
                                return {
                                  counterValue: state.counterValue - 1,
                                };
                            });
                        }}
                    >

                    </button>
                    <span>{counterValueText}</span>
                    <button
                        onClick={(event) => {
                            this.setState((state, props) => {
                                return {
                                    counterValue: state.counterValue + 1,
                                };
                            });
                        }}
                    >
                        +
                    </button>
                </div>
                <button
                    onClick={(event) => {
                        this.setState({ counterValue: 0 });
                    }}
                >
                    Reset counter
                </button>
            </div>

        );
    }
}

export default Counter;