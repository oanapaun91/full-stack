import "./Bookstable.css"
import {books} from "./booksData"
import {Box} from "@mui/material";
import Modal from '@mui/material/Modal';
import {Fragment, useState} from "react";

const BooksTable = () => {
    const [modalData, setModalData] = useState(undefined);
    const handleOpen = (data) => {
        console.log('handle open called');
        setModalData(data);
    };
    const handleClose = () => setModalData(undefined);

    const boxStyle = {
        width: 480,
        bgcolor: 'background.paper',
        border: '2px solid #000',
        boxShadow: 24,
        p: 4,
    }

    return (
        <Fragment>
            <table id="table">
                <thead>
                <tr className="rows">
                    <th>ID</th>
                    <th>TITLE</th>
                    <th>AUTHOR</th>
                    <th>GENRE</th>
                    <th>DESCRIPTION</th>
                </tr>
                </thead>
                <tbody>
                {books.data.map(e => {
                        return (
                            <tr id="row" style={{background: e.id % 2 === 0 ? "#edaa7e" : "#f5ea98"}}
                                onClick={() => handleOpen(e)}>
                                <td>{e.id}</td>
                                <td>{e.title}</td>
                                <td>{e.author}</td>
                                <td>{e.genre}</td>
                                <td>{e.description}</td>
                            </tr>
                        )
                    }
                )}
                </tbody>
            </table>
            {
                modalData &&
                <Modal
                    open={true}
                    onClose={handleClose}>
                    <Box style={boxStyle}>
                        <img src={modalData.image}/>
                    </Box>
                </Modal>
            }
        </Fragment>
    )
}

export default BooksTable;