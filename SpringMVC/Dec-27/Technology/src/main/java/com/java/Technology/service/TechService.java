package com.java.Technology.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.Technology.entity.TechEntity;
import com.java.Technology.repository.TechRepo;

@Service
public class TechService {
	@Autowired
	TechRepo techrepo;
	
	public List<TechEntity> findAllTech() {
		return techrepo.findAll();
	}

	public TechEntity findtechById(long id) {
		
		return techrepo.findTechnologyById(id);
	}

}
