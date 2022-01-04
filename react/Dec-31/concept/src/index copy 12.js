import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
class Calculator extends React.Component
{
  constructor(props)
  {
    super(props);
    this.state = {
      a : parseInt(props.a),
      b : parseInt(props.b),
      c : "",
      result:0
    };
    this.AddHandler = this.AddHandler.bind(this);
    this.SubHandler = this.SubHandler.bind(this);
    this.MulHandler = this.MulHandler.bind(this);
    this.divHandler = this.divHandler.bind(this);
  }

  AddHandler()
  {
    this.setState(
      {c: "+"}
    );
    this.setState(i =>(
      {result:i.a+i.b}
    ));
    

  }
  SubHandler()
  {
    this.setState(
      {c: "-"}
    );

    this.setState(i =>(
      {result : i.a-i.b}
    ));
    
    
  }

  MulHandler()
  { this.setState(
    {c: "*"}
  );
    this.setState(i=>(
      {result : i.a*i.b}
    ));
   
  }

  divHandler()
  { this.setState(
    {c: "/"}
  );
    this.setState(i=>(
      {result : i.a/i.b}
    ));
    
  }

  render()
  {
    return(<div>
     <h1>{this.state.a}{this.state.c}{this.state.b} is {this.state.result}</h1>
      <button onClick={this.AddHandler}>Add</button><br></br>
    <button onClick={this.SubHandler}>Subtract</button> <br></br>
   <button onClick={this.MulHandler}>Multiply</button><br></br>
    <button onClick={this.divHandler}>Division</button><br></br>
    
    </div>
    );
  }
}

ReactDOM.render(
  <Calculator a="13" b="69"/>,
  document.getElementById("root")
);
