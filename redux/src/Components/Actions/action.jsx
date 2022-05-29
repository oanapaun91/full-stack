import AddNote from "../AddNote";
export const ADD_NOTE = "ADD_NOTE";


const addNote = (title, description) => {
    return {
        type: ADD_NOTE,
        payload: {
            title: title,
            description: description}
        }
    }
export default addNote;