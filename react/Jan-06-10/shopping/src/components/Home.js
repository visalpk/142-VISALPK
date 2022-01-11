
import Header from './Header';
import Main from './Main';
import Cart from './Cart';
import Checkout from './Checkout';
import data from '../data';
import { useState } from 'react';
import { Link } from 'react-router-dom';
import { render } from '@testing-library/react';

export default function Home() {
    const { products } = data;
    const [cartItems, setCartItems] = useState([]);
    const onAdd = (product) => {
      const exist = cartItems.find((x) => x.id === product.id);
      if (exist) {
        setCartItems(
          cartItems.map((x) =>
            x.id === product.id ? { ...exist, qty: exist.qty + 1 } : x
          )
        );
      } else {
        setCartItems([...cartItems, { ...product, qty: 1 }]);
      }
    };
    const onRemove = (product) => {
      const exist = cartItems.find((x) => x.id === product.id);
      if (exist.qty === 1) {
        setCartItems(cartItems.filter((x) => x.id !== product.id));
      } else {
        setCartItems(
          cartItems.map((x) =>
            x.id === product.id ? { ...exist, qty: exist.qty - 1 } : x
          )
        );
      }
    };

    
    return (
      
    
      <>
   
      <div className="App">
        <Header countCartItems={cartItems.length}></Header>
        <div className="row">
          <Main products={products} onAdd={onAdd}></Main>
          <Cart
            cartItems={cartItems}
            onAdd={onAdd}
            onRemove={onRemove}
          ></Cart>
         
           </div>
        </div>
               
<div className="nont">
  <Checkout
  cartItems={cartItems}
  onAdd={onAdd}
  onRemove={onRemove}
></Checkout>
 </div></>
      
      
    );}  