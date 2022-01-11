import React from "react";

const UserTable = (props) => {

    return(<div className="form-group">
        <table id="usertable">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>UserName</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                {props.users.length > 0 ? (
                    props.users.map( (user) =>
                <tr key={user.id}>
                    <td>{user.name}</td>
                    <td>{user.username}</td>
                    <td>
                        <button  onClick={() => props.editRow(user)}         
                         className="button muted-button">Edit</button>

                        <button  onClick={() => props.deleteUser(user.id)}
                         className="button muted-button">Delete</button>
                    </td>
                </tr>
                )):(
                    <tr>
                        <td colSpan={3}>No User Found.</td>
                    </tr>

                )}
            </tbody>
        </table></div>
    );

}

export default UserTable;