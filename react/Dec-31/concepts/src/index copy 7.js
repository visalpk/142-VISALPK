import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

//class based component in react

class App extends React.Component{

  constructor(props){
    super(props);
  }
render(){

  return <div><h1>hello {this.props.name}</h1></div>;
}

}
ReactDOM.render(<App name="visal"/>  , 
  document.getElementById('root'));


