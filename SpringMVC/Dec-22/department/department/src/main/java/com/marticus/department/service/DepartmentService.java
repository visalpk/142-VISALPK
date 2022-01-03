package com.marticus.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marticus.department.entity.DepartmentEntity;
import com.marticus.department.repo.DepartmentRepository;

@Service
public class DepartmentService {
    
	@Autowired
	DepartmentRepository departmentRepository;
	
	public void saveCustomer(DepartmentEntity departmentEnt) {

		departmentRepository.save(departmentEnt);
		
	}

	public DepartmentEntity findDepartmentById(long id) {

		
		return departmentRepository.findDepartmentById(id);
	}

	public void updateDepartmentById(DepartmentEntity custent) {
		DepartmentEntity x=departmentRepository.findDepartmentById(custent.getId());
		
		x.setDepartmentCode(custent.getDepartmentCode());
		x.setDepartmentName(custent.getDepartmentName());
		System.out.println(x);
		departmentRepository.save(x);
		
	}

	public Boolean deleteDepartmentById(long id) {
		DepartmentEntity cust=departmentRepository.findDepartmentById(id);
		if(cust!=null) {
			
			departmentRepository.delete(cust);
			return true;
		}
		return false;
	}

	public List<DepartmentEntity> findAllDepartment() {
		return departmentRepository.findAll();
	}

}
