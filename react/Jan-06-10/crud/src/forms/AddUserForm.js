import React, { useState } from "react";
import '../../src/index.css';
const AddUserForm = (props) => {
    const initialFormState = {id:null,name:'',username:''};

    const[user,setUser] = useState(initialFormState);

    const handleInputChange = (event) => {
        const {name,value} = event.target;
        setUser({...user,[name]:value});
    }

    return(<div className=" container">
        <form onSubmit={ (event) => {
            event.preventDefault()
            if(!user.name || !user.username)

            return 
            props.adduser(user)
            setUser(initialFormState)
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

export default AddUserForm;