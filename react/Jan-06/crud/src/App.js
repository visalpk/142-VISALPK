import logo from './logo.svg';
import './App.css';
import './index.css';
import { useState } from 'react';
import UserTable from './tables/UserTable';
import AddUserForm from './forms/AddUserForm';
import EditUserForm from './forms/EditUserForm';
//CRUD application using React Hooks

const App = () =>{
  const userData = [
    {id:101,name:"Tamil",username:'tamil99'},
    {id:102,name:"surendar",username:'suray65'},
    {id:103,name:"karthi",username:'karthi99'}
  ];

  const[users,setUsers] = useState(userData);

  const [editing,setEditing]= useState(false);

  const initialFormState = {id:null,name:'',username:''};

  const[currentUser,setCurrentUser] = useState(initialFormState);


  /*adding user*/
  const addUser = (user) => {
    user.id = users.length+101
    setUsers([...users,user]);
  }
  /*deleting user*/
  const deleteUser = (id) => {
    setUsers(users.filter((user) => user.id!==id ));
  }
  
  /*phase1: fetching the user and set Edit=true*/
  const editRow = (user) => {
    setEditing(true);
    setUsers({id:user.id,name:user.name,username:user.username});
  }

  /*phase2: update the row with value fetched and set Edit=false*/
  const updatedUser = (id,updatedUser) =>{
    setEditing(false);
    setCurrentUser(users.map((user) => user.id === id ? updatedUser:user));
  }

  return(
    <div className=" App auth-wrapper auth-inner">
      <h3>CRUD Application</h3>

      <div className='flex-row '>
{editing?(
  
  <div className='flex-largs'>
  <h3>Edit User</h3>
    <EditUserForm setEditing={setEditing} currentUser={currentUser} updatedUser={updatedUser}/>        
  </div>
      
  ):(

      
          <div className='flex-largs'>
          <h3>Add User</h3>
            <AddUserForm adduser={addUser}/>        
          </div>)

}
        <div className='flex-largs '>
          <h2>View Users Data: </h2>
          <UserTable users={users} editRow={editRow} deleteUser={deleteUser}/>
        </div>

      </div>
    </div>
  );

}

export default App;
