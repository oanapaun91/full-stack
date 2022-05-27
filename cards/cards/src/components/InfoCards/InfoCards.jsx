import React from "react";
import "./InfoCards.css";

const InfoCard = (props) => {
    const description = props.description;
    const image = props.image;
    const separatorClass = props.separatorClass;
    const question = props.question;
    return(
    <div className="card-container">
        <img src={image}></img>
        <span className="question">{question}</span>
        <div className={`separator ${separatorClass}`} />
        <span className="description">{description}</span>
    </div>
    );
};

export default InfoCard;
