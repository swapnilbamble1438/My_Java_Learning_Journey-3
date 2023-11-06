package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class update {
	
public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa project");
		EntityManager em=emf.createEntityManager();
		MyCust c1=em.find(MyCust.class,5);
		System.out.println(c1.getcname());
		c1.setcname("Nit");
		em.getTransaction().begin();
		
		em.merge(c1);
		
		em.getTransaction().commit();
		em.close();
		emf.close();

}
}
