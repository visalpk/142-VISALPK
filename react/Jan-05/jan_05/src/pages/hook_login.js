import ReactDOM from 'react-dom';
import './index.css';
import React, { useState } from "react";
import { Link } from 'react-router-dom';

//working with forms

  

function Login(props) {
  
  const initialFormstate={email:'',pwd:''};
  const[user,setUser]= useState(initialFormstate); 

  const changeHandler =(event) =>{
    const {name,value}=event.target;
    setUser({...user,[name]:value});
  }
  
  const invaliddata =()=>{
    document.getElementById("message").style.display = "none";
    console.log("called")
  }
    
 
  

  const handleSubmit = () =>{
    if(user.email==="admin@123" && user.pwd==="pass"){
      alert("login successfull")
      
  }else{



  }
  }
        
        
        return (
          
        
        <div  onLoad={invaliddata} className="App auth-wrapper auth-inner">      
         
            <form onSubmit={handleSubmit} >
                <h3>Login Up</h3>
                
               
                <div className="form-group">
                    <label>Email address</label>
                    <input name="email" type="email"  onChange={changeHandler} className="form-control" placeholder="Enter email"  />
                </div>             

                <div className="form-group">
                    <label>Password</label>
                    <input name="pwd" type="password"  onChange={changeHandler} className="form-control" placeholder="Enter password"   />
                </div>

               

                <button type="submit" className="btn btn-primary btn-block pad ">Login</button>
               <div><center>
                    <p id="message">invalid</p></center>
                    </div>
                <p className="forgot-password text-right">
                    New to site  <Link to="/">sign up?</Link>
                </p>
            </form></div>
        );
    
}

ReactDOM.render(
  <React.StrictMode>
    <Login />
  </React.StrictMode>,
  document.getElementById('root')
);

export default Login;