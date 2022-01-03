package com.javabydeveloper.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Teacher")
@Entity(name = "Teacher")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	@Column(name = "ID")
	private Long teacherId;

	@Column(name = "TNAME")
	private String teacherName;

	@Column(name = "SUB")
	private String subject;

	@Column(name = "DEGREE")
	private String degree;

	

	


	public Long getTeacherId() {
		return teacherId;
	}



	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}



	public String getTeacherName() {
		return teacherName;
	}



	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public String getDegree() {
		return degree;
	}



	public void setDegree(String degree) {
		this.degree = degree;
	}



	@Override
	public String toString() {
		return "Teacher [TeacherId=" + teacherId + ", TeacherName=" +  teacherName + ", Subject=" + subject
				+ ", Degree=" + degree + "]";
	}
	
}
