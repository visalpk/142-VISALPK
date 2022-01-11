import './index.css';
import React, {  useState } from "react";
import { Link } from 'react-router-dom';

//working with forms


export default  function Signup(props) {
  const initialFormstate={fname:'',lname:'',email:'',pwd:'',bday:'',gen:''};
  const[user,setUser]= useState(initialFormstate); 

  const changeHandler =(event) =>{
    const {name,value}=event.target;
    setUser({...user,[name]:value});
  }

  

  const handleSubmit = () =>{
   
    alert(JSON.stringify(user))
  }
        return (<div className="App auth-wrapper auth-inner">
        
         
            <form onSubmit={handleSubmit} >
                <h3>Sign Up</h3>
                
                <div className="form-group">
                    <label>First name</label>
                    <input name="fname" type="text" onChange={changeHandler}  className="form-control" placeholder="First name"  />
                </div>

                <div className="form-group">
                    <label>Last name</label>
                    <input name="lname" type="text" onChange={changeHandler}  className="form-control" placeholder="Last name" />
                </div>

                <div className="form-group">
                    <label>Email address</label>
                    <input name="email" type="email"  onChange={changeHandler} className="form-control" placeholder="Enter email"  />
                </div>             

                <div className="form-group">
                    <label>Password</label>
                    <input name="pwd" type="password"  onChange={changeHandler} className="form-control" placeholder="Enter password"   />
                </div>

                <div className="form-group">
                    <label >Birthday:</label><br/>
                    <input name="birthday" type="date"  onChange={changeHandler} className="form-control mar10"   />
                </div>

                <div className="form-group mar"  onChange={changeHandler}>
                                <label > Select you gender</label><br/>
               
                <select  defaultValue="none" name="gender" className='mar10'>
                  <option value="none" selected>Gender</option>
                  <option value="male">Male</option>
                  <option value="female">Female</option>
                  <option value="other">other</option>
                </select></div>

                <button type="submit" className="btn btn-primary btn-block pad dbutton">Sign Up</button>
                <p className="forgot-password text-right">
                    Already registered <Link to="/">sign in?</Link>
                </p>
            </form></div>
        );
    
}


