import React, { useState } from "react";
import '../../src/index.css';
const EditUserForm = (props) => {
    const[user,setUser] = useState(props.currentUser);


    const handleInputChange = (event) => {
        const {name,value} = event.target;
        setUser({...user,[name]:value});
    }

    return(<div className=" container">
        <form onSubmit={ (event) => {
            event.preventDefault()
           props.updatedUser(user.id,user)
        }}>
            <div className="form-group">
            <label>Name</label>
            <input type="text" name="name" value={user.name} onChange={handleInputChange} className="form-group"/>
            </div>
           

            <div className="form-group">
            <label>User Name</label>
            <input type="text" name="username" value={user.username} onChange={handleInputChange} className="form-group"/>
            <button className="btn btn-primary btn-block pad dbutton">Add New User</button>
            </div>
        </form></div>
    );

}

export default EditUserForm;