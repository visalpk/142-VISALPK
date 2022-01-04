import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
//working with lists in react

const myList=[1,2,3,4,5]
const listelements=myList.map(
  (i) =>
  <li key={i.toString}>
     {i}
  </li>
);

ReactDOM.render(
  <ul>{listelements}</ul>,document.getElementById("root")
);