import {TableRow} from "@mui/material";
import {TableBody} from "@mui/material";
import {TableCell} from "@mui/material";
import {TableContainer} from "@mui/material";
import {TableHead} from "@mui/material";
import {Table} from "@mui/material";
// import Table from '@material-ui/core/Table';
// import TableBody from '@material-ui/core/TableBody';
// import TableCell from '@material-ui/core/TableCell';
// import TableContainer from '@material-ui/core/TableContainer';
// import TableHead from '@material-ui/core/TableHead';
// import TableRow from '@material-ui/core/TableRow';
import {Box, Button, Modal, Paper} from "@mui/material";
import {Fragment, useState} from "react";
import {books} from "./booksData";


const BooksMaterialTable = () => {
    const [modalData, setModalData] = useState(undefined);
    const handleOpen = (data) => setModalData(data);
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
            <TableContainer component={Paper}>
                <Table aria-label="simple table">
                    <TableHead>
                        <TableRow>
                            <TableCell>ID</TableCell>
                            <TableCell>TITLE</TableCell>
                            <TableCell>AUTHOR</TableCell>
                            <TableCell>GENRE</TableCell>
                            <TableCell>DESCRIPTION</TableCell>
                            <TableCell>ACTION</TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {books.data.map(e => (
                                <TableRow style={{background: e.id % 2 === 0 ? "#edaa7e" : "#f5ea98"}} onClick={() => handleOpen(e)}>
                                    <TableCell>{e.id}</TableCell>
                                    <TableCell>{e.title}</TableCell>
                                    <TableCell>{e.author}</TableCell>
                                    <TableCell>{e.genre}</TableCell>
                                    <TableCell>{e.description}</TableCell>
                                    <TableCell>
                                        <Button onClick={(event) => {
                                            console.log("button click")
                                            event.stopPropagation();
                                        }}>Delete row</Button>
                                    </TableCell>
                                </TableRow>
                            )
                        )}
                    </TableBody>
                </Table>
            </TableContainer>
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
export default BooksMaterialTable;