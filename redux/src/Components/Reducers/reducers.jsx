import {ADD_NOTE} from "../Actions/action";
import {DELETE_NOTE, UPDATE_NOTE} from "../Actions/actionDelete";

const initialState = {
    notes: [],
};

const rootReducer = (state = initialState, action) => {
    switch (action.type) {
        case ADD_NOTE:
            console.log("adding " + action.payload.title)
            return {
                notes: [
                    ...state.notes,
                    {
                        title: action.payload.title,
                        description: action.payload.description,
                    }
                ]
            };

        case DELETE_NOTE:
            const res = state.notes.filter(note => {
                return note.title !== action.payload.title
            })
            return {notes: res}

        case UPDATE_NOTE:
            console.log("update")
                state.notes.map((note) => {
                    if (note.id === action.payload.title && note.description === action.payload.description) {
                        return {
                            ...state.notes,
                            notes: [...state.notes]
                        }
                    } else {
                        return {notes: [...state.notes]};
                    }
                })

        default:
            return state;
    }
};

export default rootReducer;