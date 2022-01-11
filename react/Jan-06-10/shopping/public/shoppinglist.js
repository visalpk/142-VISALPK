import './App.css';
import './index.css';
import { useState } from 'react';
import ItemTable from './tables/ItemTable';
//CRUD application using React Hooks

const App = () =>{
 
  const ItemData = [
    {id:101,name:"milk",price:'25',gimg:<img height="80px" width="120px" src="https://post.healthline.com/wp-content/uploads/2020/05/beautiful_hands_holding_glass_of_milk-1200x628-facebook-1200x628.jpg" alt="image not found" />},
    {id:102,name:"egg",price:'5',gimg:<img height="80px" width="120px" src="https://images-prod.healthline.com/hlcmsresource/images/AN_images/health-benefits-of-eggs-1296x728-feature.jpg" alt="image not found" />},
    {id:103,name:"bread",price:'30',gimg:<img height="80px" width="120px" src="https://images-prod.healthline.com/hlcmsresource/images/AN_images/ezekiel-bread-1296x728-feature.jpg" alt="image not found" />}
  ];

  const[items,setItems] = useState(ItemData);



  /*deleting user*/
  const deleteItem = (id) => {
    setItems(items.filter((item) => item.id!==id ));
  }
  

  return(
    <div className=" App auth-wrapper auth-inner">
      <h3>Shopping list</h3>

     
        <div className='flex-largs '>
          <h2>List of Items Availabe: </h2>
          <ItemTable items={items}  deleteItem={deleteItem}/>
        </div>

      </div>
   
  );

}

export default App;
