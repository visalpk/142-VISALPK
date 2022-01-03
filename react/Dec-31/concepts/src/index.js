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

  myHandler(){
    this.a=!this.a;
    console.log(this.a)
    if(this.a)
    {
      document.getElementById("image").innerHTML="<img src='/8.jpg'></img>"
    
    }else{
      document.getElementById("image").innerHTML="<img src='/7.jpg'></img>"
      
    }
    
  }

  render(){
    return (<>
          <div>  
      <button onClick={this.myHandler}>click</button>
      </div>
       <div id="image"></div>
      
      </>
    );
  }
}

ReactDOM.render(
  <Toggle />,
  document.getElementById("root")
);