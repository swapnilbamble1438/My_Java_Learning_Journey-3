package com.helper;


import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class FactoryProvider {

	
	
	public static SessionFactory getFactory()
	
	{
	 SessionFactory factory = null;
		
	try
		{
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			factory = cfg.buildSessionFactory();

		}catch (Exception e) {
		 System.out.println(e);
	
		}
		return factory;
	}
	
	
	
}
