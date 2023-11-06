package com.A9_Set_User_Roles;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class test {


		public static void main(String[] args) {
			
			
			Configuration cfg = new Configuration();
			cfg.configure("com/A9_Set_User_Roles/hibernate.cfg.xml");
			SessionFactory sessionfactory = cfg.buildSessionFactory();

			
		   System.out.println("Application Started...");
		   
		   Session session = sessionfactory.getCurrentSession();
			
			Transaction tx = session.beginTransaction();
			
	
			tx.commit();  // session.getTransaction().commit();
			session.close();
			sessionfactory.close();
		}	
		
}
