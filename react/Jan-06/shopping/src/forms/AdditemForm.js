import React, { useState } from "react";
import '../../src/index.css';
const AddItemForm = (props) => {
    
  const initialFormState = {id:null,name:'',price:'',gimg:<img height="80px" width="120px" src="" alt="image not found" />};

    const[item,setItem] = useState(initialFormState);

    const handleInputChange = (event) => {
        const {name,value} = event.target;
        setItem({...item,[name]:value});
    }

    return(<div className=" container">
        <form onSubmit={ (event) => {
            event.preventDefault()
            if(!item.name){
            console.log("entered")
            return }
            else{
            props.addItem(item)
            setItem(initialFormState)}
        }}>
            <div className="form-group">
            <label>Name</label>
            <input type="text" name="name" value={item.name} onChange={handleInputChange} className="form-group"/>
            </div>
           

            <div className="form-group">
           
            </div>
        </form></div>
    );

}

export default AddItemForm;