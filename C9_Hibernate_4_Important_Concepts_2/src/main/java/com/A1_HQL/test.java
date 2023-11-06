package com.A1_HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class test {

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
		String query = "from Stud";
		
	Query q = session.createQuery(query);
		
		
	List<Stud> list =   q.list();
	for(Stud s: list)
	{
		System.out.println(s.getName());
	}
	
	System.out.println("==============================================================");
//================================================================	
	String query2 = "from Stud where city='Virar'";
	
	Query q2 = session.createQuery(query2);
		
	
		
	List<Stud> list2 =   q2.list();
	for(Stud s: list2)
	{
		System.out.println(s.getName() +":"+ s.getCerti().getCourse());
	}
	
	System.out.println("==============================================================");
		
	
//================================================================	
		
String query3 = "from Stud as s where s.city=:x and s.name=:y";
	
	Query q3 = session.createQuery(query3);
	
	q3.setParameter("x", "Kalyan");
	q3.setParameter("y", "Prakash" );
	
	List<Stud> list3 =   q3.list();
	for(Stud s: list3)
	{
		System.out.println(s.getName() +":"+ s.getCerti().getCourse());
	}
	
	System.out.println("==============================================================");
		
	
//================================================================	

	
	
	tx.commit();  // session.getTransaction().commit();
		session.close();
		
		sessionfactory.close();
	}
}
