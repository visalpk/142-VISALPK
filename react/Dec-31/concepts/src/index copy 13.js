import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';


//nested components

function MyHello(props){
  return document.getElementById("image").innerHTML="<img src='/8.jpg'></img>"
}

function YourHello(props){
  return  document.getElementById("image").innerHTML="<img src='/7.jpg'></img>"
}

function SayHello(props){
   props.isTrue=!props.isTrue;
  console.log(display);

  if(display){
    return <MyHello />
  }else{
    return <YourHello />
  }
}

render(){  return (<>
        <div>  
    <button onClick={this.myHandler}>click</button>
    </div>
     <div id="image"></div>
    
    </>
  );
}

ReactDOM.render(  
  <SayHello isTrue={true} /> ,
  
document.getElementById('root')
);

      
      