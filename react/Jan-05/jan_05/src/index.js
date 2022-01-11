import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import Login from './App';
import Signup from './Signup';
import { BrowserRouter ,Route ,Routes } from 'react-router-dom';
import ShoppingList from './shoppinglist';

ReactDOM.render(
  <BrowserRouter>
      <Login />   
      <Routes>      
      <Route exact path="/" element={Login} />       
      <Route exact path="/signup" element={Signup} />
      <Route exact path="/shoppinglist" element={ShoppingList}/>
      </Routes>  
  </BrowserRouter>,

  document.getElementById('root')
);
