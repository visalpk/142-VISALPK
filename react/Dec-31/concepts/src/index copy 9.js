import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

//class based component in react
//state in class based component
//function based component do not have state while class based component have their state
class App extends React.Component{

  constructor(props){
    //state
    super(props);
    //the properties which are owned by component are known as state of the component
  
  }

  render(){
    let myArray = [ this.props.a , this.props.c , this.props.b ]; 
    let result = eval(myArray[0] + myArray[1] + myArray[2]);
    return <h1>  {this.props.a} {this.props.c} {this.props.b} is {result}</h1>
  }

}
ReactDOM.render(<App a="91" b="90" c="-"/> , document.getElementById('root'));


