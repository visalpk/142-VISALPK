import React from "react";

const ItemTable = (props) => {

    return(<div className="form-group">
        <table id="usertable">
            <thead>
                <tr>
                    <th>Items Name</th>
                    <th>Item</th>
                    <th>Price</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                {props.items.length > 0 ? (
                    props.items.map( (item) =>
                <tr key={item.id}>
                    <td>{item.name}</td>
                    <td>{item.gimg}</td>
                    <td>{item.price}</td>
                    <td>
                       
                        <button onClick={
                            () => props.addItem(item.id)
                        } 
                         className=" dbutton">Add to Cart</button>
                    </td>
                </tr>
                )):(
                    <tr>
                        <td colSpan={3}>the List is Empty</td>
                    </tr>

                )}
            </tbody>
        </table></div>
    );

}

export default ItemTable;