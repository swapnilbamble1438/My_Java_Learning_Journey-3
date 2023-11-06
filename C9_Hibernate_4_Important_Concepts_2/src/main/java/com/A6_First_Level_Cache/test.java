package com.A6_First_Level_Cache;

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
		cfg.configure("com/A6_First_Level_Cache/hibernate.cfg.xml");
		SessionFactory sessionfactory = cfg.buildSessionFactory();

		Session session = sessionfactory.openSession();

		Transaction tx = session.beginTransaction();

		
		Stud stud = session.get(Stud.class,2); // if you see in console 
		System.out.println(stud);				// you will see select query is fire 
												// to display the output
		System.out.println("working something..");
		 
		Stud stud2 = session.get(Stud.class,2); // but when we want to display the same
		System.out.println(stud2);				// output hibernate will not fire the same query again
												// for getting the same output it will see the output or get the
												// output from its cache memory
		
		System.out.println(session.contains(stud2)); // for checking whether the output is still in the cache or not
		
		// first level cache is associate with session means
		// after closing session all the cache will be gone
		
		tx.commit();  // session.getTransaction().commit();
		session.close();
		
		sessionfactory.close();
		
	}
}
