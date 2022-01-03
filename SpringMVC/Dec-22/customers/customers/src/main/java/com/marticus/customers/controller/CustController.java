package com.marticus.customers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.marticus.customers.entity.Bored;
import com.marticus.customers.entity.CustEntity;
import com.marticus.customers.entity.RestData;
import com.marticus.customers.service.CustService;
import com.marticus.customers.util.Util;


@RestController
@RequestMapping("/customers")
public class CustController {
		
	@Autowired
	CustService custservice;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	RestTemplate bored;

  	@PostMapping("/")
  	public ResponseEntity<Void> saveCust(@RequestBody CustEntity custent){
	
  		custservice.saveCust(custent);
  		
  		return ResponseEntity.status(HttpStatus.CREATED).header("creation status", "created").build();
			
  	}
  	
	@PostMapping("/login/{username}/{password}")
  	public ResponseEntity<String> login(@PathVariable("username") String username,
  			@PathVariable("password") String password){
            
		    String token = Util.getJWTToken();
		   
		
    	return ResponseEntity.ok(token);
  	}
	
	@GetMapping("/{id}")
    public ResponseEntity<CustEntity> getCustomersById(@PathVariable long id){
    	
    	CustEntity cust= custservice.findCustomersById(id);
    	
    	return ResponseEntity.ok(cust);
    }

   @GetMapping("/")
    public ResponseEntity<List<CustEntity>> getallCustomers(){
    	
    	List<CustEntity> cust= custservice.findAllCustomers();
    	
    	return ResponseEntity.ok(cust);
    }
   
   @GetMapping("/sortbyname")
    public ResponseEntity<List<CustEntity>> getallCustomersSortbyname(){
    	
    	List<CustEntity> cust= custservice.SortAllCustomers();
    	
    	return ResponseEntity.ok(cust);
    }
   
   @GetMapping("/fetch/{name}")
    public ResponseEntity<List<CustEntity>> getCustomersByCustomername(@PathVariable String name){
    	
    	List<CustEntity> cust= custservice.findAllCustomersByCustomername(name);
    	
    	return ResponseEntity.ok(cust);
    }
   
   @GetMapping("/fetchcon/{name}")
    public ResponseEntity<List<CustEntity>> getCustomersByCustomernameLike(@PathVariable String name){
    	
	   	List<CustEntity> cust= custservice.findAllCustomersByCustomernameLike(name);
    	
    	return ResponseEntity.ok(cust);
    }
   
   @GetMapping("/fetch/{name}/{cno}")
    public ResponseEntity<List<CustEntity>> getCustomersByCustomername
    (@PathVariable String name,@PathVariable String cno){
    	
    	List<CustEntity> cust= custservice.findAllCustomersByCustomernameAndCustomerno(name,cno);
    	
    	return ResponseEntity.ok(cust);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCustomersById(@PathVariable long id){
    	
    	String body="Record deleted Succussfully" ;
    	
    	Boolean Status=custservice.deleteCustomersById(id);
    	if(!Status) {
    		body="Could not delete the record";
    	}
    	   	
    	
    	return ResponseEntity.ok().body(body);
    }
 
   	@PutMapping("/")
   	public ResponseEntity<String> updateCustomersById(@RequestBody CustEntity custent){
		
	    custservice.updateCustomersById(custent);
	    
	    String body="Updated Successfully" ;
	    
	
    	return ResponseEntity.ok().body(body);
	    
		

		
   	}
   	
   	@GetMapping("/genderizeapi/{name}")
	public ResponseEntity<RestData> getRestDatas(@PathVariable String name)
	{
		RestData rstdata= new RestData();
		String url="https://api.genderize.io/?name="+name;
		
		rstdata=restTemplate.getForObject(url, RestData.class) ;
		
		return ResponseEntity.ok(rstdata);
		
		
	}
   	
   	@GetMapping("/boredapi")
	public ResponseEntity<Bored> getRestDatas()
	{
		Bored rstdata= new Bored();
		String url="https://www.boredapi.com/api/activity";
		
		rstdata=bored.getForObject(url,Bored.class) ;
		
		return ResponseEntity.ok(rstdata);
		
		
	}
	
}
