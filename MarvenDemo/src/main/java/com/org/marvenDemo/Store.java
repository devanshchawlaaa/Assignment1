package com.org.marvenDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.org.marvenDemo.Address;
import com.org.marvenDemo.Employee;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Configuration  cfg= new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory fact = cfg.buildSessionFactory();
	        Session sess= fact.openSession();
	        sess.beginTransaction();
	//	Session s1 = HibernateUtil.getSessionFactory().openSession();
		//Transaction t1 = null;
		
		try {
			
			//t1 = s1.beginTransaction();
			
			
	        Employee e1=new Employee();    
	        e1.setName("Ravi Malik");    
	        e1.setEmail("ravi@gmail.com");
	        
	        Address address1=new Address();    
	        address1.setAddressLine1("G-21,Lohia nagar");    
	        address1.setCity("Ghaziabad");    
	        address1.setState("UP");    
	        address1.setCountry("India");    
	        address1.setPincode(201301);
	        address1.setEmployee(e1);
	        
	        e1.setAddress(address1);    
	        address1.setEmployee(e1);
	        
	        sess.save(e1);
	        sess.save(address1);
	        
	        sess.getTransaction().commit();
	        System.out.println("Success");
		}  catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	        
	}

}
