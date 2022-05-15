import React from "react";
import Bio from "./Bio";

// const Badge = (props) => {
//     return (
//         <div
//             style={{
//                 border: "1px solid black",
//                 width: "320x",
//                 borderRadius: "8px",
//                 padding: "7px",
//                 display: "flex",
//                 height: "360px",
//             }}
//         >
//             <div style={{ width: "75%" }}>
//                 <p>{props.firstName}</p>
//                 <p>{props.lastName}</p>
//                 <Bio
//                     birthDate = {props.birthDate}
//                     description = {props.description}
//                     hobby = {props.hobby}
//                 />
//                 <p>  Hobby contains java or react: {props.hobby.includes("Java", "React") ? "True" :"False"}</p>
//             </div>
//             <img src={props.avatarImage} height="64px" />
//         </div>
//     );
//
// }
// export default Badge;
class Badge extends React.Component{
    constructor(props){
        super(props);
    }
    render() {
        return (
            <div
            style={{
                border: "1px solid black",
                width: "320x",
                borderRadius: "8px",
                padding: "7px",
                display: "flex",
                height: "360px",
            }}
        >
            <div style={{ width: "75%" }}>
                <h1>{this.props.firstName}</h1>
                <h2>{this.props.lastName}</h2>
                <Bio
                    birthDate = {this.props.birthDate}
                    descriere = {this.props.description}
                    hobby = {this.props.hobby}
                />
                <p>  Hobby contains java or react: {this.props.hobby.includes("Java", "React") ? "True" :"False"}</p>
            </div>
            <img src={this.props.avatarImage} height="64px" alt=""/>
        </div>
        );
    }
}
export default Badge;