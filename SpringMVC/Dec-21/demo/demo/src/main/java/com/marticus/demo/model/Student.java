package com.marticus.demo.model;

public class Student {
String stuID;
String stuName;
public Student(String stuID, String stuName) {
	super();
	this.stuID = stuID;
	this.stuName = stuName;
}
public String getStuID() {
	return stuID;
}
public void setStuID(String stuID) {
	this.stuID = stuID;
}
public String getStuName() {
	return stuName;
}
public void setStuName(String stuName) {
	this.stuName = stuName;
}

}
