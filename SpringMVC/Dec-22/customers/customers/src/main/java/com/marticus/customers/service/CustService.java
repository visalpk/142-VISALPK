package com.marticus.customers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.marticus.customers.entity.CustEntity;
import com.marticus.customers.repo.CustRepo;

@Service
public class CustService {

	@Autowired
	CustRepo  custrepo;
	public void saveCust(CustEntity custent) {
		custrepo.save(custent);
	}

	public CustEntity findCustomersById(long id) {

       return custrepo.findCustomersById(id);
	}

	public Boolean deleteCustomersById(long id) {
		CustEntity cust=custrepo.findCustomersById(id);
		if(cust!=null) {
			
			custrepo.delete(cust);
			return true;
		}
		return false;
	}

	public List<CustEntity> findAllCustomers() {
		
		return custrepo.findAll();
	}


	public void updateCustomersById(CustEntity custent) {
		
		CustEntity x=custrepo.findCustomersById(custent.getId());
		
		x.setCustomername(custent.getCustomername());
		x.setCustomerno(custent.getCustomerno());
		x.setCustomerloc(custent.getCustomerloc());
		System.out.println(x);
		custrepo.save(x);
		
	}

	public List<CustEntity> findAllCustomersByCustomername(String name) {
		
		return custrepo.findAllCustomersByCustomername(name);
	}

	public List<CustEntity> findAllCustomersByCustomernameLike(String name) {
	
		return custrepo.findAllCustomersByCustomernameContaining(name);
	}

	

	public List<CustEntity> findAllCustomersByCustomernameAndCustomerno(String name, String cno) {

		return custrepo.findAllCustomersByCustomernameAndCustomerno(name,cno);
	}

	public List<CustEntity> SortAllCustomers() {
			
		return custrepo.findAll(Sort.by(Sort.Direction.ASC,"customername"));
	}
	

	

}
