
import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
/*
function Calc(props){
 
  let avg = props.avg;
  if (avg>90){
  return <p>  A grade </p>
} else if (avg>80){
  return <p> B grade </p>
} else if (avg>70){
  return <p> c grade </p>
} else{ 
  return <p> Fail </p> }
}<div> <p className='inset'><Calc avg={this.state.avg} /></p></div>*/
class GradeCalc extends React.Component{
  constructor(props)
  {
    super(props);
    this.state = {
     value1:0, value2:0, value3:0,      
     avg:0
    };  
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
    this.gradeHandler = this.gradeHandler.bind(this);
  }
  
  handleChange(event){
    this.setState({value1: event.target.value1})
    this.setState({value2: event.target.value2})
    this.setState({value3: event.target.value3})
   
   
  }
  gradeHandler(event){
   // this.setState({avg:(this.state.value1+this.state.value2+this.state.value3)/3})
   console.log(this.state.value1)
   console.log(this.state.value2)
   console.log(this.state.value3)
  }
  handleSubmit(event){
    
    event.preventDefault();
   
  }
render()
{ 
  return(  <>
    <form onSubmit={this.handleSubmit}>
      <label>  Enter the marks <br></br>
      <input type="text" value1={this.state.value1} onChange={this.handleChange} /> <br></br>
      <input type="text" value2={this.state.value2} onChange={this.handleChange} />  <br></br>
      <input type="text" value3={this.state.value3} onChange={this.handleChange} /> <br></br>
      </label>
      <button type="submit" onClick={this.gradeHandler}>Grade</button>
 
   </form>
  
   </>  
  );
}}
ReactDOM.render(<GradeCalc />  , document.getElementById('root'));


