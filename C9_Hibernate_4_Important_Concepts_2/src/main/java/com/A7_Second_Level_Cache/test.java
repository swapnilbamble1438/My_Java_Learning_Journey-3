package com.A7_Second_Level_Cache;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class test {

	public static void main(String[] args) {
		

		Configuration cfg = new Configuration();
		cfg.configure("com/A7_Second_Level_Cache/hibernate.cfg.xml");
		SessionFactory sessionfactory = cfg.buildSessionFactory();

		Session session1 = sessionfactory.openSession();		
		Transaction tx1 = session1.beginTransaction();
		
		// first
		Stud st1 =  session1.get(Stud.class,2);
		System.out.println("st1: " + st1);
		
		tx1.commit();  
		session1.close();
		
//------------------------------------------------------------------
		
		Session session2 = sessionfactory.openSession();		
		Transaction tx2 = session2.beginTransaction();
		
		// second
		Stud st2 =  session2.get(Stud.class,2);
		System.out.println("st2: " + st2);
		
		tx2.commit();  
		session1.close();
		
		
		// Second level cache is session factory level cache 
		// and it is available across all sessions 
		
		
		
		sessionfactory.close();
		
	}
}
