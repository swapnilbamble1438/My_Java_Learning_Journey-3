package com.A1_Crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class test {

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("com/A1_Crud/hibernate.cfg.xml");
		SessionFactory sessionfactory = cfg.buildSessionFactory();

		//	System.out.println(factory);
		//	System.out.println(factory.isClosed());
		
		
		Session session = sessionfactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		/* 
		// insert data
		Stud st = new Stud();
		st.setId(3);
		st.setName("Pratik");
		st.setCity("Kalwa");
		session.save(st);
		*/
		
		
		
		/*
		 // delete data
		 Stud st = new Stud();
		 st= session.find(Stud.class, 3);
		 session.delete(st);
		*/
		
		/*
		// update data
		Stud sti = new Stud();
		sti = session.find(Stud.class, 2);
		sti.setId(2);
		sti.setName("John");
		sti.setCity("Mulund");
		session.update(sti);
		*/
		
		/*
		// view single data
		Stud sti = new Stud();
		sti = session.get(Stud.class, 1);
		System.out.println(sti);
		*/
		
		/*
		// view single data by load method
		Stud sti = new Stud();
		sti = session.load(Stud.class, 1);
		System.out.println(sti);
		*/
		
		
		
		/*
		// view all data
		List<Stud> sti = session.createQuery("from Stud", Stud.class).getResultList();
		for(Stud z : sti)
		{
			System.out.println(z);
		}
		*/
		
		
	
		
			
		tx.commit();  // session.getTransaction().commit();
		session.close();
		sessionfactory.close();
		
	
	
	
	
	
	
	}
	
}
