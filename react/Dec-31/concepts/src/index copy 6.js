import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

//class based component in react

class App extends React.Component{
render(){

  return(
<div><h1>hello</h1></div>
  );
}

}
ReactDOM.render(<App/>  , 
  document.getElementById('root'));


