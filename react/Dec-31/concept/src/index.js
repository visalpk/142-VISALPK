
import { useState } from "react";
import ReactDOM from "react-dom";

function MyForm() {
  const [inputs, setInputs] = useState({mark1:"",mark2:"",mark3:""});

  const handleChange = (event) => {
    const name = event.target.name;
    const value = event.target.value;
    setInputs(values => ({...values, [name]: value}))
  }

  const handleSubmit = (event) => {
    event.preventDefault();
    console.log(inputs);
  }

  return (
    <form onSubmit={handleSubmit}>
      <label>Enter the 1st marks:
      <input 
        type="number" 
        name="mark1" 
        value={inputs.mark1 || ""} 
        onChange={handleChange}
      />
      </label><br></br>
      <label>Enter the 2nd marks:
        <input 
          type="number" 
          name="mark2" 
          value={inputs.mark2 || ""} 
          onChange={handleChange}
        />
        </label><br></br>
        <label>Enter the 3rd marks:
        <input 
          type="number" 
          name="mark2" 
          value={inputs.mark2 || ""} 
          onChange={handleChange}
        />
        </label><br></br>
        <input type="submit" />
    </form>
  )
}

ReactDOM.render(<MyForm />, document.getElementById('root'));
