import EmployeeOverview from "./EmployeeOverview";
import Badge from "./Badge";

const Bio = (props) => {
    return (
        <div>
            <p>{props.birthDate}</p>
            <p>{props.descriere}</p>
            <p>{props.hobby}</p>
        </div>
    )
}

export default Bio;