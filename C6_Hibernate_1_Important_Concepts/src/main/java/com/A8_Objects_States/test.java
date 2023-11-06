package com.A8_Objects_States;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class test {


		public static void main(String[] args) {
			
			
			Configuration cfg = new Configuration();
			cfg.configure("com/A8_Objects_States/hibernate.cfg.xml");
			SessionFactory sessionfactory = cfg.buildSessionFactory();

		
		//	Session session = sessionfactory.openSession();
			
		//	Transaction tx = session.beginTransaction();
	
			
			Stud st = new Stud();
			st.setId(5);
			st.setName("Payas");
			st.setCity("Virar");
			st.setCerti(new Certificate("Java Advance Course","2 months"));
		// so till this object "st" is in Transient state
			
			Session session = sessionfactory.openSession();
			
			Transaction tx = session.beginTransaction();
			
			session.save(st);
			// so object "st" will be in Persistent state after saving
			
			
			st.setName("Rahul"); // so even if object("st") is in persistent state we can do changes
			
	
			tx.commit();  // session.getTransaction().commit();
			session.close();
			// it is detached state of object "st"
			// and after closing session we cannot do any chages
			
			sessionfactory.close();
			
		
		
		}	
		
}
