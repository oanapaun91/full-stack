export const DELETE_NOTE = "DELETE_NOTE";

export const deleteNote = (title, description) => {
    return {
        type: DELETE_NOTE,
        payload: {
            title: title,
            description: description
        }
    }
}

export const UPDATE_NOTE = "UPDATE_NOTE";

export const updateNote = (title, description) => {
    return {
        type: UPDATE_NOTE,
        payload: {
            title: title,
            description: description
        }
    }
}