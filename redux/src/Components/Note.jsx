import addNote from "./Actions/action";
import {DELETE_NOTE, deleteNote, updateNote} from "./Actions/actionDelete";
import {useDispatch} from "react-redux";
import {useState} from "react";


const Note = (props) => {
    const dispatch = useDispatch();
    const [editable, setEditable] = useState(false);
    const [newTitle, setNewTitle] = useState(null);
    const [newDescription, setNewDescription] = useState(null);

    const removeNote = () => {
        dispatch(deleteNote(props.title, props.description));
    };

    const editNote = () => {
        console.log(newTitle)
        dispatch(updateNote(newTitle, newDescription));
    };

    function handleTextChange(e){
        setNewTitle(e.target.title)
        console.log("valoare newTitle " + newTitle)
    }
    return (
        <div
            style={{
                width: "50%",
                display: "flex",
                flexDirection: "column",
                alignItems: "left"
            }}>

            <div>
                {props.title}
                <p>{props.description}</p>
            </div>

            {editable === true &&
                <div>
                    <input defaultValue={props.title}
                           onChange={(e) => handleTextChange(e)
                           }>
                    </input>
                    <textarea defaultValue={props.description}
                              onChange={(e) => setNewDescription(e.target.description)
                              }>
                    </textarea>
                    <p>
                        <button onClick={editNote}>Save note</button>
                    </p>
                </div>
            }

            <p>
                <button onClick={removeNote}>Remove note</button>
            </p>

            <p>
                <button onClick={() => {
                    setEditable(true);
                }
                }>Edit
                </button>
            </p>


        </div>
    )

}
export default Note;

