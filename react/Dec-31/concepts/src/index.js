import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
//class based components in React
//working with handlers

class Toggle extends React.Component{

  constructor(props){
    super(props);  
    this.a=true;  
    this.myHandler = this.myHandler.bind(this);
  }
 Myimg1() {
  document.getElementById("image").innerHTML="<img src='/8.jpg'></img>"
 }
 Myimg2(){
  document.getElementById("image").innerHTML="<img src='/7.jpg'></img>"
      
 }
  myHandler(){
    this.a=!this.a;
    if(this.a)
    {
     {this.Myimg1}
    
    }else{
      {this.Myimg2}
    }
    
  }

  render(){
    return (
      <>
      <div>  
      <button onClick={this.myHandler}>click</button>
      </div>
      <div id="image"></div>
      </>
    );
  }
}

ReactDOM.render(
  <Toggle />,document.getElementById("root")
);