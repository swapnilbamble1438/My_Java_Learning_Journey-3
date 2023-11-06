package com.test;
import  javax.persistence.*;

public class MyMain {

	public static void main(String[] args) {
		MyCustomer m1=new MyCustomer();
		m1.setCid(4);
		m1.setCname("Deepak");
		m1.setCincome(10000);
		MyCustomer m2= new MyCustomer(5,"Pratik",70000);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("YashJPA");
		EntityManager em=emf.createEntityManager();  
		em.getTransaction().begin();
		em.persist(m1);
		em.persist(m2);
		em.getTransaction().commit();
		em.close();
		emf.close();


	}

}
