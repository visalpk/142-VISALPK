package com.marticus.department.controller;

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

import com.marticus.department.entity.DepartmentEntity;
import com.marticus.department.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/")
	public ResponseEntity<Void> saveCustomer(@RequestBody DepartmentEntity departmentEnt){
		
		departmentService.saveCustomer(departmentEnt);
		return ResponseEntity.status(HttpStatus.CREATED).header("creation status", "created").build();
		
		
	}
	
    @GetMapping("/{id}")
    public ResponseEntity<DepartmentEntity> getDepartmentById(@PathVariable long id){
    	
    	DepartmentEntity dept= departmentService.findDepartmentById(id);
    	
    	return ResponseEntity.ok(dept);
    }
    
    @GetMapping("/")
    public ResponseEntity<List<DepartmentEntity> >getallDepartment(){
    	
    	List<DepartmentEntity> cust= departmentService.findAllDepartment();
    	
    	return ResponseEntity.ok(cust);
    }
    
 @DeleteMapping("/{id}")
 public ResponseEntity<String> deleteDepartmentById(@PathVariable long id){
    	
    	String body="Record deleted Succussfully" ;
    	
    	Boolean Status=departmentService.deleteDepartmentById(id);
    	if(!Status) {
    		body="Could not delete the record";
    	}
    	   	
    	
    	return ResponseEntity.ok().body(body);
    }
 
 @PutMapping("/")
 public ResponseEntity<String> updateCustomersById(@RequestBody DepartmentEntity custent){
		
	   departmentService.updateDepartmentById(custent);
	    
	    String body="Updated Successfully" ;
	    
	
    	return ResponseEntity.ok().body(body);
	    
		

		
	}
}
