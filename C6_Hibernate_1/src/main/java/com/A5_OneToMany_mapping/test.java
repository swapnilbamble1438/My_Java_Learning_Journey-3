package com.A5_OneToMany_mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class test {


		public static void main(String[] args) {
			
			
			Configuration cfg = new Configuration();
			cfg.configure("com/A5_OneToMany_mapping/hibernate.cfg.xml");
			SessionFactory sessionfactory = cfg.buildSessionFactory();

		
			Session session = sessionfactory.openSession();
			
			Transaction tx = session.beginTransaction();
//			
//			// creating Question1
//			Question3 q1 = new Question3();
//			q1.setQuestionId(1);
//			q1.setQuestion("What is java ?");
//			
//			
//			//creating Answers of Question1
//			// multiple answers
//			// first answer
//			Answer3 a1a = new Answer3();
//			a1a.setAnswerId(1);
//			a1a.setAnswer("Java is a programming language.");
//			
//			a1a.setQuestion(q1);
//		
//			
//			// second answer
//			Answer3 a1b = new Answer3();
//			a1b.setAnswerId(11);
//			a1b.setAnswer("With the help of java we can create softwares");
//			
//			a1b.setQuestion(q1);
//			
//			// third answer
//			Answer3 a1c = new Answer3();
//			a1c.setAnswerId(111);
//			a1c.setAnswer("Java has different types of framework");
//			
//			a1c.setQuestion(q1);
//			
//			List<Answer3> list = new ArrayList<Answer3>();
//			list.add(a1a);
//			list.add(a1b);
//			list.add(a1c);
//			
//			
//			q1.setAnswer(list);
//			
//			
//			// creating Question2
//			Question3 q2 = new Question3();
//			q2.setQuestionId(2);
//			q2.setQuestion("What is Collection Framework ?");
//			
//			//creating Answer2
//			Answer3 a2 = new Answer3();
//			a2.setAnswerId(2);
//			a2.setAnswer("API to work with objects in java.");
//			
//			a2.setQuestion(q2);
//			
//			List<Answer3> list2 = new ArrayList<Answer3>();
//			list2.add(a2);
//			q2.setAnswer(list2);
//			
//			
//
//			
//			session.save(q1);
//			session.save(q2);
//			session.save(a1a);
//			session.save(a1b);
//			session.save(a1c);
//			session.save(a2);
			
			
			// for fetching data
			Question3 q = (Question3)session.get(Question3.class,1);
			System.out.println(q.getQuestion());
			
			for(Answer3 a: q.getAnswer())
			{
				System.err.println(a.getAnswer());
			}
			
			
			tx.commit();  // session.getTransaction().commit();
			session.close();
			sessionfactory.close();
			
		
		
		}	
		
}
