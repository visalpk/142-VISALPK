package com.marticus.main;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.marticus.util.HibernateUtil;
import com.marticus.dao.*;
public class App2 {
	public static void main(String[] args) {
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction transaction = null;
	try {
	transaction = session.beginTransaction();

	Set<CoachingClass> cclasses = new HashSet<CoachingClass>();
	cclasses.add(new CoachingClass("LearnPhysics","Physics"));
	cclasses.add(new CoachingClass("MathsYoga","Maths"));
	cclasses.add(new CoachingClass("ChemLearn","Chemistry"));

	Student2 student = new Student2("visal", cclasses);
	session.save(student);

	transaction.commit();
	} catch (HibernateException e) {
	transaction.rollback();
	e.printStackTrace();
	} finally {
	session.close();
	}

	}

	}
