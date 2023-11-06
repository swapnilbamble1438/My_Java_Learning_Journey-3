package com.A3_Embedding_objects;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class test {

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("com/A3_Embedding_objects/hibernate.cfg.xml");
		SessionFactory sessionfactory = cfg.buildSessionFactory();

	
		Session session = sessionfactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Stud st = new Stud();
		st.setId(3);
		st.setName("Jayesh");
		st.setCity("Diva");
		
		Certificate ct = new Certificate();
		ct.setCourse("Android");
		ct.setDuration("2 months");
		st.setCerti(ct);
		
		session.save(st);
		
	
		
			
		tx.commit();  // session.getTransaction().commit();
		session.close();
		sessionfactory.close();
		
	
	
	
	
	
	
	}
	
}
