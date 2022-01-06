import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';

//working with forms

class App extends React.Component {

  constructor(props){
    super(props);
    this.state = {fname:'',lname:'',email:'',pwd:''};
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event){
    //this.setState({value: event.target.value});
    const target = event.target;
    const value = target.value;
    const name = target.name;

    console.log(name +" "+ value);
    this.setState({[name]:value});
  }

  handleSubmit(event){
    alert('login successfull '+this.state.fname);
    event.preventDefault();
  }
    render() {
        return (<div className="App auth-wrapper auth-inner">
        
         
            <form onSubmit={this.handleSubmit}>
                <h3>Sign Up</h3>

                <div className="form-group">
                    <label>First name</label>
                    <input name="fname" type="text" className="form-control" placeholder="First name" value={this.state.fname} onChange={this.handleChange} />
                </div>

                <div className="form-group">
                    <label>Last name</label>
                    <input name="lname" type="text" className="form-control" placeholder="Last name" value={this.state.lname} onChange={this.handleChange}  />
                </div>

                <div className="form-group">
                    <label>Email address</label>
                    <input name="email" type="email" className="form-control" placeholder="Enter email" value={this.state.email} onChange={this.handleChange}  />
                </div>

                <div className="form-group" name="gender"   value={this.state.email} onChange={this.handleChange} >
                    <label>Gender</label>       <br/>             
                          <input className="radiosp" type="radio"  name="fav_language" value="HTML"/>
                          <label for="html">Male</label><br/>
                          <input className="radiosp" type="radio"  name="fav_language" value="CSS"/>
                          <label for="css">Female</label><br/>
                         
                </div>

                <div className="form-group">
                    <label>Password</label>
                    <input name="pwd" type="password" className="form-control" placeholder="Enter password" value={this.state.pwd} onChange={this.handleChange} />
                </div>

                <button type="submit" className="btn btn-primary btn-block pad">Sign Up</button>
                <p className="forgot-password text-right">
                    Already registered <a href="index.js">sign in?</a>
                </p>
            </form></div>
        );
    }
}

ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);
