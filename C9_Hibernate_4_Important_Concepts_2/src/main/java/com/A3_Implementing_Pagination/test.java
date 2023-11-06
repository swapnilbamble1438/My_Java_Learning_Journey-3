package com.A3_Implementing_Pagination;

import org.hibernate.query.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("com/A3_Implementing_Pagination/hibernate.cfg.xml");
		SessionFactory sessionfactory = cfg.buildSessionFactory();

		Session session = sessionfactory.openSession();

		Transaction tx = session.beginTransaction();

		
		String q = ("from Stud");
		
		Query<Stud> query = session.createQuery(q);
		
		// implementing pegination usin hibernate
		
		query.setFirstResult(0);  // from which row we want the result
		
		query.setMaxResults(3);   // number of rows we want
		
		List<Stud> list = query.list();
		
		for(Stud st: list)
		{
			System.out.println(st.getId()+ " : "+ st.getName()+ " : " + st.getCity());
		}
		
		
		
		
		tx.commit();  // session.getTransaction().commit();
		session.close();
		
		sessionfactory.close();
		
		
		
	}
}
