import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

function Calc(props){
  let x=parseInt(props.a);
  let y=parseInt(props.b);
  let z=parseInt(props.c);
  let result = (x + y + z)/3;
  if (result>90){
  return <h1> marks scored {props.a}, {props.b} and  {props.c} - A grade </h1>
} else if (result>80){
  return <h1> marks scored {props.a}, {props.b} and  {props.c} - B grade </h1>
} else if (result>70){
  return <h1> marks scored {props.a}, {props.b} and  {props.c} - c grade </h1>
} else{ 
  return <h1> marks scored {props.a}, {props.b} and  {props.c} - Fail </h1> }
}
ReactDOM.render(<Calc a="91" b="90" c="90"/>  , document.getElementById('root'));


