package com.java.Employee.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;


import com.java.Employee.VO.EmpVO;
import com.java.Employee.VO.ProjectVO;
import com.java.Employee.VO.TechnologyVO;
import com.java.Employee.entity.EmpEntity;
import com.java.Employee.service.EmpService;

@Controller
@RequestMapping("/")
public class EmpController {
	
	EmpService empserv;
	
	@Autowired
	RestTemplate proj;
	
	@Autowired
	RestTemplate tech;
	
	@GetMapping("/")
    public ResponseEntity<List<EmpVO>> getAllEmployee(){
    	
		List<EmpVO> emp= empserv.getAllEmployee();
    	
    	return ResponseEntity.ok(emp);
    }
	
   @GetMapping("{empid}")
   public ResponseEntity<EmpEntity> getCustomersByEmpId(@PathVariable long empid){
   	
   	EmpEntity emp= empserv.findEmployeeByEmpId(empid);
   	
   	return ResponseEntity.ok(emp);
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<EmpEntity> getCustomersById(@PathVariable long id){
   	
   	EmpEntity emp= empserv.findEmployeeById(id);
   	
   	return ResponseEntity.ok(emp);
   }

	
	

	
	@GetMapping("project")
    public ResponseEntity<ProjectVO> getEmployeesEmpById(){
    	

		ProjectVO rstdata= new ProjectVO();
		String url="https:localhost:9002/proj";
		
		rstdata=proj.getForObject(url,ProjectVO.class) ;
		
		return ResponseEntity.ok(rstdata);
    }

	@GetMapping("technology")
    public ResponseEntity<TechnologyVO> getEmployeesById(){
    	
    	
		TechnologyVO rstdata= new TechnologyVO();
		String url="https:localhost:9003/tech";
		
		rstdata=tech.getForObject(url,TechnologyVO.class) ;
		
		return ResponseEntity.ok(rstdata);
    }
	

}
