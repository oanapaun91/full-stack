import React from "react";
import Badge from "./Badge.js";

const information = [
    {firstName: 'Oana', lastName: 'Paun', avatarImage: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRIMJf32XCdIMPR005aLZbkk5TldBubjW2CfA&usqp=CAU', birthDate:'24Jan1996', description: 'Heeeelo', hobby: 'tennis'},
    {firstName: 'Andreea', lastName: 'Ion', avatarImage: 'https://thumbs.dreamstime.com/b/default-avatar-photo-placeholder-profile-icon-eps-file-easy-to-edit-default-avatar-photo-placeholder-profile-icon-124557887.jpg', birthDate:'24Jan1998', description: 'Buna', hobby: 'Java'},
];

class EmployeeOverview extends React.Component {
    render() {
        return (

            <div id="badges">
                {information.map(e => (
                    <Badge
                        firstName= {e.firstName}
                        lastName={e.lastName}
                        avatarImage={e.img}
                        birthDate={e.birthDate}
                        description={e.description}
                        hobby={e.hobby}
                    />
                ))}
            </div>
        );
    }
}

export default EmployeeOverview;