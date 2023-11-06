package com.A1_HQL;

import java.util.List;


import org.hibernate.query.*; // Deprication problem will be solved
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class test2 {

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("com/A1_HQL/hibernate.cfg.xml");
		SessionFactory sessionfactory = cfg.buildSessionFactory();

		Session session = sessionfactory.openSession();

		Transaction tx = session.beginTransaction();

		// HQL
		// Syntax
		
		// single result -(Unique)
		// multiple result -(list)
		// q.uniqueResult();
		
//==============================================================
		String query = "delete from Stud s where s.city=: c";
		
	Query q = session.createQuery(query);
		
	q.setParameter("c", "Mumbai");	
	
	int r = q.executeUpdate();
	System.out.println("Deleted: " + r);
	
	System.out.println("==============================================================");
//================================================================	
	
	
	
	tx.commit();  // session.getTransaction().commit();
		session.close();
		
		sessionfactory.close();
	}
}
