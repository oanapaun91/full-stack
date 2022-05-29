import {useState} from "react";
import { useDispatch } from "react-redux";
import addNote from "./Actions/action";

const AddNote = () => {
    const [title, setTitle] = useState(null);
    const[description, setDescription] = useState(null);
    const dispatch = useDispatch();

    const addNewNote = () => {
        dispatch(addNote(title, description));
        setTitle("");
        setDescription("");
    };

    return(
        <div
            style = {{
                width: "50%",
                display: "flex",
                flexDirection: "column",
                alignItems: "center"}}>
            <input onChange={(event) => setTitle(event.target.value)}>
            </input>

            <textarea onChange={(event) => setDescription(event.target.value)}>
            </textarea>

            <button onClick={addNewNote}>Add note</button>
        </div>
    )
}
export default AddNote;