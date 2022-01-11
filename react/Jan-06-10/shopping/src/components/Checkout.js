import React from 'react';

import { Link } from "react-router-dom";

import { render } from '@testing-library/react';
export default function Checkout(props) {
  
  const { cartItems, onAdd, onRemove } = props;
  const itemsPrice = cartItems.reduce((a, c) => a + c.qty * c.price, 0);
  const totalPrice = itemsPrice ;
  

  return (
    
    <>
          <h2>Checkout</h2>
      <div>
        {cartItems.length === 0 && <div>Cart is empty</div>}
        {cartItems.map((item) => (
          <div key={item.id} className="row">
            <div className="col-2">{item.name}</div>
            <div className="col-2">
              <button onClick={() => onRemove(item)} className="remove">
                -
              </button>{' '}
              <button onClick={() => onAdd(item)} className="add">
                +
              </button>
            </div>

            <div className="col-2 text-right">
              {item.qty} x {item.price.toFixed(2)}
            </div>
          </div>
        ))}

        {cartItems.length !== 0 && (
          <>

            <hr></hr>
            <div className="row">
              <div className="col-2">Items Price</div>
              <div className="col-1 text-right">Rs{itemsPrice.toFixed(2)}</div>
            </div>
          
            <div className="row">
              <div className="col-2">
                <strong>Total Price</strong>
              </div>

              <div className="col-1 text-right">
                <strong>Rs{totalPrice.toFixed(2)}</strong>
              </div>
            </div>

            <hr />
            <div className="row">              
              <button className='white'  >
               <div><Link to="/checkout">Checkout</Link></div>
              </button>
            </div>

           
          </>

        )}
      </div>
   </>
  );
}



