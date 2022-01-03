package com.marticus.demo.model;

public class Employee {
String EmpID;
String EmpName;
public String getEmpID() {
	return EmpID;
}
public void setEmpID(String empID) {
	EmpID = empID;
}
public String getEmpName() {
	return EmpName;
}
public void setEmpName(String empName) {
	EmpName = empName;
}
public Employee(String empID, String empName) {
	super();
	EmpID = empID;
	EmpName = empName;
}

}
