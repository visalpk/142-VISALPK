package com.marticus.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT2")
public class Student2 {

private long studentId;
private String studentName;
private Set<CoachingClass> Coachingclasses = new HashSet<CoachingClass>(0);

public Student2() {
}

public Student2(String studentName, Set<CoachingClass> Coachingclasses) {
this.studentName = studentName;
this.Coachingclasses = Coachingclasses;
}


@Id
@GeneratedValue
@Column(name = "STUDENT_ID")
public long getStudentId() {
	return studentId;
}

public void setStudentId(long studentId) {
	this.studentId = studentId;
}


@Column(name = "STUDENT_NAME", nullable = false, length = 100)
public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

@OneToMany(cascade = CascadeType.ALL)
@JoinTable(name = "COACHING_CLASS", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "COACHING_CLASS_NAMES") })
public Set<CoachingClass> getCoachingclasses() {
	return Coachingclasses;
}

public void setCoachingclasses(Set<CoachingClass> coachingclasses) {
	Coachingclasses = coachingclasses;
}

}