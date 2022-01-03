package com.marticus.customers.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marticus.customers.entity.CustEntity;

@Repository
public interface CustRepo extends JpaRepository<CustEntity, Long>{

	CustEntity findCustomersById(long id);


	List<CustEntity> findAllCustomersByCustomernameContaining(String name);


	List<CustEntity> findAllCustomersByCustomername(String name);


	List<CustEntity> findAllCustomersByCustomernameAndCustomerno(String name, String cno);

}
