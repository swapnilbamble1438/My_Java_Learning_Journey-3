package com.A4_Native_SQL_Queries;

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
		cfg.configure("com/A4_Native_SQL_Queries/hibernate.cfg.xml");
		SessionFactory sessionfactory = cfg.buildSessionFactory();

		Session session = sessionfactory.openSession();

		Transaction tx = session.beginTransaction();

		// SQL Query
		String q = "select * from Stud";
		
		 NativeQuery nq = session.createSQLQuery(q);
		
		 List<Object []> list =  nq.list();
		 
		 for(Object[] st: list)
		 {
			// System.out.println(Arrays.toString(st));
			 System.out.println(st[1] + ":" + st[2]);
		 }
		 
		
		tx.commit();  // session.getTransaction().commit();
		session.close();
		
		sessionfactory.close();
		
	}
}
