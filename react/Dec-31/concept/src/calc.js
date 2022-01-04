class Calculator extends React.Component
{
  constructor()
  {
    super();
    this.handler = this.handler.bind(this);
    // this.changeHandler=this.changeHandler.bind(this);
    this.state={
      a:0,
      b:0,
      orp:'',
      ans:0,
    }
  }
  handler(x)
  {
    var ans;
    var a= document.getElementById("a").value;
    var b=document.getElementById("b").value;
    a=parseInt(a);
    b=parseInt(b);
    if(x=="+"){ans=a+b;}
    else if(x=="-"){ans=a-b;}
    else if(x=="*"){ans=a*b;}
    else if(x=="/"){ans=a/b;}
    
   this.setState(({
      a:a,
      b:b,
      ans:ans,
      orp:orp
   }));
  }  

  render()
  {
    return(
    <>
   <table>
     <tr>
   <h1>{this.state.a} {this.state.orp} {this.state.b} = {this.state.ans} </h1>
   </tr>
   <tr> <input  id="a" type="text" defaultValue={this.state.a}/></tr>
   <tr> <input  id="b" type="text" defaultValue={this.state.b}/></tr>
   </table>
   <button id="inr" onClick={()=>this.handler("+")} >+</button>
   <button id="dol" onClick={()=>this.handler("-")} >-</button>
   <button id="yen" onClick={()=>this.handler("")} ></button>
   <button id="yen" onClick={()=>this.handler("/")}  >/</button>
    </>
    );
  }
}

ReactDOM.render(
  <Calculator />,
  document.getElementById("root")
);