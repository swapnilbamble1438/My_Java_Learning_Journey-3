package com.A4_OneToOne_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class test {


		public static void main(String[] args) {
			
			
			Configuration cfg = new Configuration();
			cfg.configure("com/A4_OneToOne_mapping/hibernate.cfg.xml");
			SessionFactory sessionfactory = cfg.buildSessionFactory();

		
			Session session = sessionfactory.openSession();
			
			Transaction tx = session.beginTransaction();
			
			// creating Question1
			Question q1 = new Question();
			q1.setQuestionId(1);
			q1.setQuestion("What is java ?");
			
			//creating Answer1
			Answer a1 = new Answer();
			a1.setAnswerId(1);
			a1.setAnswer("Java is a programming language.");
		
			q1.setAnswer(a1);
			
			
			// creating Question2
			Question q2 = new Question();
			q2.setQuestionId(2);
			q2.setQuestion("What is Collection Framework ?");
			
			//creating Answer2
			Answer a2 = new Answer();
			a2.setAnswerId(2);
			a2.setAnswer("API to work with objects in java.");
		
			q2.setAnswer(a2);
			

			
			session.save(q1);
			session.save(q2);
			
			session.save(a1);
			session.save(a2);
			
			tx.commit();  // session.getTransaction().commit();
			session.close();
			sessionfactory.close();
			
		
		
		}	
		
}
