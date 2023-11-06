package com.A6_ManyToMany_mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class test {


		public static void main(String[] args) {
			
			
			Configuration cfg = new Configuration();
			cfg.configure("com/A6_ManyToMany_mapping/hibernate.cfg.xml");
			SessionFactory sessionfactory = cfg.buildSessionFactory();

		
			Session session = sessionfactory.openSession();
			
			Transaction tx = session.beginTransaction();

			
			Emp e1 = new Emp();
			Emp e2 = new Emp();
			
			e1.setEid(1);
			e1.setName("Ram");
			
			e2.setEid(2);
			e2.setName("shyam");
			
			Project p1 = new Project();
			Project p2 = new Project();
			
			List<Emp> list1 = new ArrayList<Emp>();
			
			list1.add(e1);
			list1.add(e2);
			
			//============
			
			p1.setPid(11);
			p1.setProject_name("Library Management System");
			
			p2.setPid(22);
			p2.setProject_name("Ecommerce Project");
			
			List<Project> list2 = new ArrayList<Project>();
	
			list2.add(p1);
			list2.add(p2);
			
			
			e1.setProjects(list2);
			e2.setProjects(list2);
		//	p2.setEmps(list1);
			
			
			session.save(e1);
			session.save(e2);
			session.save(p1);
			session.save(p2);
			
			tx.commit();  // session.getTransaction().commit();
			session.close();
			sessionfactory.close();
			
		
		
		}	
		
}
