package com.A2_Complex_n_Join_Queries;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class test {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("com/A2_Complex_n_Join_Queries/hibernate.cfg.xml");
		SessionFactory sessionfactory = cfg.buildSessionFactory();

		Session session = sessionfactory.openSession();

		Transaction tx = session.beginTransaction();

		
		
//==============================================================
		String query = "select q.questionId, q.question,a.answer from Question3 as q INNER JOIN q.answer as a";
		
	Query q = session.createQuery(query);
		
	List<Object []> list = q.getResultList();
	
	for(Object[] arr:list)
	{
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	System.out.println("==============================================================");
//================================================================	
	
		
		
		
		
		
		
		
		
		
		
		tx.commit();  // session.getTransaction().commit();
		session.close();
		
		sessionfactory.close();
		
		
		
	}

}
