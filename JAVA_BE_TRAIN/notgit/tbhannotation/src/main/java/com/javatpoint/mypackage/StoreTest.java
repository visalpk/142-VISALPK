package com.javatpoint.mypackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreTest {

	public static void main(String args[])
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		
		 Transaction t=session.beginTransaction();  
	      
//		    Employee e1=new Employee();  
//		    e1.setName("Gaurav Chawla");  
//		      
//		    Regular_Employee e2=new Regular_Employee();  
//	        e2.setName("Vivek Kumar");  
//          e2.setSalary(50000);  
//          e2.setBonus(5);  
//		      
//		    Contract_Employee e3=new Contract_Employee();  
//		    e3.setName("Arjun Kumar");  
//		    e3.setPay_per_hour(1000);  
//		    e3.setContract_duration("15 hours");  
		      
//          session.persist(e1);  
//		    session.persist(e2);  
//	        session.persist(e3);
		    
		    Account a1=new Account();
		    a1.setAccountID("101");
		    a1.setAcccountHoldername("surendar");
		    
		    Savings a2=new Savings();
		    a2.setAccountID("102");
		    a2.setAcccountHoldername("balaji");
		    
		    Current a3=new Current();
		    a3.setAccountID("103");
		    a3.setAcccountHoldername("karthi");
		 
		      
		    session.persist(a1);  
		    session.persist(a2);  
		    session.persist(a3);  
		    t.commit();  
		    session.close();  
		    System.out.println("success");  
		
	}
	
}
