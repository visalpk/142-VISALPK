package com.java.Project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="project")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProEntity {
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
    
    @Column(name="project_name")
    String projectname;
    
    @Column(name="technology_id")
    String technologyid;
   
    
}
