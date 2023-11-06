package com.A4ii_OneToOne_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class test {


		public static void main(String[] args) {
			
			
			Configuration cfg = new Configuration();
			cfg.configure("com/A4ii_OneToOne_mapping/hibernate.cfg.xml");
			SessionFactory sessionfactory = cfg.buildSessionFactory();

		
			Session session = sessionfactory.openSession();
			
			Transaction tx = session.beginTransaction();
			
			// creating Question1
			Question2 q1 = new Question2();
			q1.setQuestionId(1);
			q1.setQuestion("What is java ?");
			
			
			//creating Answer1
			Answer2 a1 = new Answer2();
			a1.setAnswerId(1);
			a1.setAnswer("Java is a programming language.");
		
			q1.setAnswer(a1);
			a1.setQuestion(q1);
			
			// creating Question2
			Question2 q2 = new Question2();
			q2.setQuestionId(2);
			q2.setQuestion("What is Collection Framework ?");
			
			//creating Answer2
			Answer2 a2 = new Answer2();
			a2.setAnswerId(2);
			a2.setAnswer("API to work with objects in java.");
		
			q2.setAnswer(a2);
			a2.setQuestion(q2);

			
			session.save(q1);
			session.save(q2);
			
			session.save(a1);
			session.save(a2);
			
			tx.commit();  // session.getTransaction().commit();
			session.close();
			sessionfactory.close();
			
		
		
		}	
		
}
