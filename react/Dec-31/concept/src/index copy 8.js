import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

//class based component in react
//state in class based component
//function based component do not have state while class based component have their state
class App extends React.Component{

  constructor(props){
    super(props);
    this.surname = "Kasinathan";
    //the properties which are owned by component are know as state of the component
  
  }
render(){

  return <div><h1>hello {this.props.name} {this.surname}</h1></div>;
}

}
ReactDOM.render(<App name="Visal"/>  , 
  document.getElementById('root'));


