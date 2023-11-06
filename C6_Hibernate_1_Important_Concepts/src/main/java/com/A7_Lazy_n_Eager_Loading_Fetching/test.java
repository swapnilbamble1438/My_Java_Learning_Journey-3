package com.A7_Lazy_n_Eager_Loading_Fetching;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class test {


		public static void main(String[] args) {
			
			
			Configuration cfg = new Configuration();
			cfg.configure("com/A7_Lazy_n_Eager_Loading_Fetching/hibernate.cfg.xml");
			SessionFactory sessionfactory = cfg.buildSessionFactory();

		
			Session session = sessionfactory.openSession();
			
			Transaction tx = session.beginTransaction();
	
			
			
			// for fetching data
			Question3 q = (Question3)session.get(Question3.class,1);
			System.out.println(q.getQuestion());
			
			for(Answer3 a: q.getAnswer())
			{
				System.out.println(a.getAnswer());
			}
			
			System.out.println("===========================================================");
			
			System.out.println(q.getQuestionId());
			System.out.println(q.getQuestion());
			System.out.println(q.getAnswer().size());
			System.out.println(q.getAnswer());
			
			System.out.println("===========================================================");

			
			
			
			
			
	
			tx.commit();  // session.getTransaction().commit();
			session.close();
			sessionfactory.close();
			
		
		
		}	
		
}
