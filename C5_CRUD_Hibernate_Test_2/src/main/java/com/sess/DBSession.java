package com.sess;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class DBSession {
	
	
	public static SessionFactory getsessionfactory()
	{
		
		 SessionFactory sessionfactory = null;
		
		
			try {
			
			Configuration cfg = new Configuration();
	        cfg.configure("com/hibernate.cfg.xml");
   
	        sessionfactory = cfg.buildSessionFactory();
	       
			
		}catch (Exception e) {
			 System.out.println(e);
		
		}
		
		
		
		
		return sessionfactory;
	}
}
