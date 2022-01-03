package com.java.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.Project.entity.ProEntity;



@Repository
public interface ProRepo extends JpaRepository<ProEntity, Long> {
	

	ProEntity findProjectById(long id);

}
