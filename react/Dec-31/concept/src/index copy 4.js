import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

function Calc(props){
  let myArray = [props.a,props.c,props.b]; 
  let result=eval(myArray[0] + myArray[1] + myArray[2]);
  return <h1>  {props.a} {props.c} {props.b} is {result}</h1>
}

ReactDOM.render(<Calc a="10" b="20" c="-"/>  , document.getElementById('root'));


