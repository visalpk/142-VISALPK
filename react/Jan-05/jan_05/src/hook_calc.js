import React, { useState } from 'react';
import ReactDOM from 'react-dom';
import './index.css';

//function based component and class based component difference is -->state
//function based component are stateles
//class based component are stateful

//React Hooks
// technique to use stateful behaviour in function based components
//useState Hook
//Returns a stateful value, and a function to update it.

function MyCalculatorWithHook(props){

  const[first,setFirst] = useState(props.a);
  const[second,setSecond] = useState(props.b);
  var[op,setOp]= useState(props.op);
  const[result,setResult] = useState(0);

  const changeHandler =(event) =>{
    var val=event.target.value;
      if(event.target.name=="value1")
      {
        setFirst(val);
      }else if (event.target.name=="value2"){
        setSecond(val);}
      }

  const handleadd = () =>{
    setResult(parseInt(first)+parseInt(second));
    setOp(op="Addition ")
    console.log(op)
  }
  
  const handlesub = () =>{
    setResult(parseInt(first)-parseInt(second));
    setOp(op="Subtraction ")
  }
  
  const handlemul = () =>{
    setResult(parseInt(first)*parseInt(second));
    setOp(op="Multiplication ")
  }
  
  const handlediv = () =>{
    setResult(parseInt(first)/parseInt(second));
    setOp(op="Division ")
  }

  return(< div className="App auth-wrapper auth-inner"><center>
       <div className="form-group">
                    <label>First name</label>
                    <input name="value1" type="text" onChange={changeHandler}  className="form-control" placeholder="value1"  />
                    <input name="value2" type="text" onChange={changeHandler}  className="form-control" placeholder="value1"  />
                </div>
    <div>      
      <p>{op} of {first} and {second} is {result}</p>
      <button className='dbutton' onClick={handleadd} op="addition" >Addition</button>
    </div>
    <div>      
    
    <button className='dbutton' onClick={handlesub}>subtraction</button>
  </div>
  <div>      
 
  <button className='dbutton' onClick={handlemul}>multiplication</button>
</div>
<div>      
      
      <button  className='dbutton' onClick={handlediv}>division</button>
    </div></center></div>
  );

}

ReactDOM.render(  
  <MyCalculatorWithHook  /> ,
document.getElementById('root')
);