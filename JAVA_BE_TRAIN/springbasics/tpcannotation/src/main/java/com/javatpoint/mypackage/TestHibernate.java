
package com.javatpoint.mypackage;

import org.hibernate.Session;
import com.javapoint.tcpannotation.util.*;

public class TestHibernate {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Regular_Employee e2=new Regular_Employee();
		e2.setName("Vivek Kumar");
		e2.setSalary(50000);
		e2.setBonus(5);
		
		Contract_Employee e3=new Contract_Employee();
		e3.setName("Arjun Kumar");
		e3.setPay_per_hour(1000);
		e3.setContract_duration("15 hours");
		
		session.save(e2);
		session.save(e3);
 
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}

}
