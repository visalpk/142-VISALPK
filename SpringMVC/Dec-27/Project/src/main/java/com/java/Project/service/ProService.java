package com.java.Project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.Project.entity.ProEntity;
import com.java.Project.repository.ProRepo;

@Service
public class ProService {
	@Autowired
	ProRepo prorepo;

	public List<ProEntity> findAllProject() {

		return prorepo.findAll();
	}

	

	public ProEntity findProjectsById(long id) {
		// TODO Auto-generated method stub
		return prorepo.findProjectById(id);
	}

	
}
