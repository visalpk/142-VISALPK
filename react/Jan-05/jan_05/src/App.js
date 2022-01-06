import './App.css';
import { Route,Routes } from 'react-router-dom';
import Login from './pages/hook_login';
import Signup from './pages/hook_signup';

export default function App(){
  return(
    <Routes>
      <Route exact path="/" element={<Login />} />    
      <Route exact path="/signup" element={<Signup />} />   
    </Routes>
  );
}