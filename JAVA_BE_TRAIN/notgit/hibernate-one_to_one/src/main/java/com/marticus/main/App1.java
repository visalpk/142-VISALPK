package com.marticus.main;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.marticus.dao.Aadhar;
import com.marticus.dao.Person;
import com.marticus.util.HibernateUtil;

public class App1 {
	 

		public static void main(String[] args) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			try {
				transaction = session.beginTransaction();
		//    Address address1 = new Address("OMR Road", "Chennai", "TN", "600097");
			//	Address address2 = new Address("Ring Road", "Banglore", "Karnataka", "560000");
			//Student student1 = new Student("Eswar", address1);
			//	Student student2 = new Student("Joe", address2);
				
				Aadhar aadhar1= new Aadhar("802172149740");
				Aadhar aadhar2= new Aadhar("802172149741");
				Person person1=new Person("visal",aadhar1);
				Person person2=new Person("surendar",aadhar2);
				
				
				session.save(person1);
				session.save(person2);
				transaction.commit();
			} catch (HibernateException e) {
				transaction.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}

		}

	}
 
