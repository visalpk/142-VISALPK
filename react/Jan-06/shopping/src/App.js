
import Checkout from './components/Checkout';
import Home from './components/Home';
import './App.css';

import { Route,Routes } from 'react-router-dom';

export default function App(){
  return(

    
<div>
<Routes>
  
<Route exact path="/" element={<Home />} /> 
<Route exact path="/checkout" element={<Checkout />} />     

</Routes></div>

  );
}

 