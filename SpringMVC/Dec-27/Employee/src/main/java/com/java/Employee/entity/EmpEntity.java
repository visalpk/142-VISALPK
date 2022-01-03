package com.java.Employee.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpEntity {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		long id;
	    
	    @Column(name="emp_id")
	    String empid;
	    
	    @Column(name="emp_name")
	    String empname;
	    
	    @Column(name="project_id")
	    String projectid;
	   
	    
	}



