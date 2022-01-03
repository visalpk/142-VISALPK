package com.java.Technology.entity;


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
@Table(name="technology")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TechEntity {
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
    
    
    @Column(name="technology_name")
    String technologyname;
    
   
    
}
