package com.java.Technology.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.Technology.entity.TechEntity;

@Repository
public interface TechRepo  extends JpaRepository<TechEntity, Long>{

	TechEntity findTechnologyById(long id);

}
