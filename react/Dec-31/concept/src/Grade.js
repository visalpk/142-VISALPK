import { render } from '@testing-library/react';
import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
//working with forms
//forms always maintain state
//by controlled components

class MyForm extends React.Component{

  constructor(props){
    super(props)
    this.state={value:"", value1:"", value2:"", avg:""}
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }
  
  handleChange(event){
    this.setState({value: event.target.value})
    this.setState({value1: event.target.value1})
    this.setState({value2: event.target.value2})
    
   console.log(this.state.value)
  }

  handleSubmit(event){
    
    event.preventDefault();
   
  }

  render(){
    return(<>
      <form onSubmit={this.handleSubmit}>
        <lable>
          Enter the Number:<br></br>
          <input type="text" value={this.state.value}  onChange={this.handleChange} /><br></br>
          <input type="text" value1={this.state.value1}  /><br></br>
                    <input type="text" value2={this.state.value2}  /><br></br>
          
        </lable>
        <input type="submit" value="submit"/>
      </form>
      </> 
    );
  }
}

ReactDOM.render(
  <MyForm />,
  document.getElementById("root")
);
