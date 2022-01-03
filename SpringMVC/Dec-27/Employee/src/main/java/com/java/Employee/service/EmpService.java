package com.java.Employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.java.Employee.VO.EmpVO;
import com.java.Employee.VO.ProjectVO;
import com.java.Employee.VO.TechnologyVO;
import com.java.Employee.entity.EmpEntity;
import com.java.Employee.repository.EmpRepo;

@Service
public class EmpService {

	@Autowired
	EmpRepo  emprepo;
	@Autowired
	RestTemplate template;
	@Autowired
	ProjectVO projectVO;
	@Autowired
	TechnologyVO technologyVO;
	
	
	public <List<EmpVO>> void getAllEmployee() {
		List<EmpEntity> empList=emprepo.findAll();
		
		List<EmpVO> empdata=new ArrayList<EmpVO>();
		for(EmpEntity employee : empList) {
			EmpVO emp=new EmpVO();
			emp.setEmpId(employee.getEmpName());
			
			empdata.add(emp);
		}
		
	}

}
