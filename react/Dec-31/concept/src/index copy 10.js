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
    this.a="10"
    this.b="20"
    this.c="*"
    //the properties which are owned by component are known as state of the component
  
  }

  render(){
    let result = eval(this.a + this.c + this.b);
    return <h1>  {this.a} {this.c} {this.b} is {result}</h1>
  }

}
ReactDOM.render(<App /> , document.getElementById('root'));

