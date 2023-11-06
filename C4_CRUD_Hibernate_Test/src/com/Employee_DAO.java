package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.Employee;

import org.hibernate.Transaction;



public class Employee_DAO {
	
	public static void main(String args[]) {
		
		 Employee_DAO.insert_data();
		
		
		// Employee_DAO.get_data();
		
	//	 Employee_DAO.update_data();
		
	//	Employee_DAO.delete_data();
		
		
		
		}
	
	
	//  create or insert data
	
	public static void insert_data() {
		try {
			 Configuration cfg = new Configuration();
		        cfg.configure("com/hibernate.cfg.xml");
		        SessionFactory sessionfactory = cfg.buildSessionFactory();
			
			Session session = sessionfactory.openSession();
			
			Transaction tx = session.beginTransaction();
			
			Employee obj_Employee = new Employee();		
			obj_Employee.setSl_no(4);
			obj_Employee.setEmployee_name("employee four");
			obj_Employee.setMobil_no("4444");
			
			session.save(obj_Employee);
			
			tx.commit();
			session.close();
			sessionfactory.close();
			
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	// read data
	
	public static void get_data() {
		
		try {
			
		 Configuration cfg = new Configuration();
	        cfg.configure("com/hibernate.cfg.xml");
	        SessionFactory sessionfactory = cfg.buildSessionFactory();
		
		Session session = sessionfactory.openSession();
		
		session.beginTransaction();
		
		Employee obj_Employee = new Employee();		
		obj_Employee=(Employee)session.get(Employee.class,1);
		System.out.println(obj_Employee.getEmployee_name());
		
		session.save(obj_Employee);
		
		session.beginTransaction().commit();
		session.close();
		sessionfactory.close();
		
		
		
	}catch (Exception e) {
		System.out.println(e);
	}
	}
	
	//update data
	
public static void update_data() {
		
		try {
			
		 Configuration cfg = new Configuration();
	        cfg.configure("com/hibernate.cfg.xml");
	        SessionFactory sessionfactory = cfg.buildSessionFactory();
		
		Session session = sessionfactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
		Employee obj_Employee = new Employee();		
		obj_Employee=(Employee)session.find(Employee.class,3);
				
		obj_Employee.setSl_no(3);
		obj_Employee.setEmployee_name("employee upd");
		obj_Employee.setMobil_no("upd");
		
		session.update(obj_Employee);
	
		
		tx.commit();
		session.close();
		sessionfactory.close();
		 
		
		
	}catch (Exception e) {
		 e.printStackTrace();
	}
	}



	//delete data
	
	public static void delete_data() {
		
		try {
			
		 Configuration cfg = new Configuration();
	        cfg.configure("com/hibernate.cfg.xml");
	        SessionFactory sessionfactory = cfg.buildSessionFactory();
		
		Session session = sessionfactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
		Employee obj_Employee = new Employee();		
		obj_Employee=(Employee)session.find(Employee.class,4);
		
		session.delete(obj_Employee);
		
		
		tx.commit();
		session.close();
		sessionfactory.close();
		 
		
		
	}catch (Exception e) {
		 e.printStackTrace();
	}
	}

	
	
	
}
