import './App.css';
import * as React from "react";
import InfoCard from "./components/InfoCards/InfoCards";
import laptop from "./assets/laptop.png";
import group from "./assets/group.png";
import lightbulb from "./assets/lightbulb.png";
import BooksTable from "./components/BooksTable.jsx";
import BooksMaterialTable from "./components/BooksMaterialTable.jsx";
import Modal from "@mui/material/Modal";

class App extends React.Component{
  render(){
    return (
        <div>
            <BooksTable/>
            <BooksMaterialTable/>
        </div>
    )}

}
export default App;


        // <div if = "container">
        //   {cards.map((cardInfo, cardIndex) => {
        //     return (
        //         <InfoCard
        //             image={cardInfo.image}
        //             description={cardInfo.description}
        //             question={cardInfo.question}
        //             separatorClass={cardInfo.separatorClass}
        //         />
        //     )
        //       }
        //   )}
        // </div>


{/*const cards = [*/}
{/*  {*/}
{/*    image: laptop,*/}
{/*    separatorClass: "red",*/}
{/*    question: "Cui ne adresăm?",*/}
{/*    description:*/}
{/*        "Programele de formare sunt dedicate tuturor celor care doresc să învețe și să aprofundeze programare, pentru a urma o carieră în dezvoltarea software. Indiferent de specializarea profesională, pentru a reuși îți trebuie determinare, perseverență, dorință de învățare, gândire logică, analitică și încredere în tine.",*/}
{/*  },*/}
{/*  {*/}
{/*    image: group,*/}
{/*    separatorClass: "orange",*/}
{/*    question: "Cine sunt mentorii?",*/}
{/*    description:*/}
{/*        "Trainerii Devmind au o vechime de peste 4 ani atât în mediul academic cât și în industria IT pe plan național și internațional. În calitate de asistenți universitari, aceștia au participat la formarea a zeci de tineri, la principalele materii de programare, algoritmi și software design din cadrul Facultății de Automatică și Calculatoare, Universitatea Politehnică București.",*/}
{/*  },*/}
{/*  {*/}
{/*    image: lightbulb,*/}
{/*    separatorClass: "blue",*/}
{/*    question: "Cum se desfasoara?",*/}
{/*    description:*/}
{/*        "Procesul de predare este 100% orientat pe practică, astfel încât se pune accentul atât pe sedimentarea cunoștințelor învățate cât și pe dobândirea unor abilități fundamentale în programarea software. Concret, elementele teoretice vor fi însoțite de exemple, exerciții și proiecte pentru consolidarea noțiunilor.",*/}
{/*  },*/}
{/*];*/}


