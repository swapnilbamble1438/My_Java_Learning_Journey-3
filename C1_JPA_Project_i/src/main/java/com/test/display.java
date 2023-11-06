package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class display {
	
public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa project");
		EntityManager em=emf.createEntityManager();
		MyCust e1=em.find(MyCust.class,5);
		MyCust e2=em.find(MyCust.class,5);
		MyCust e3=em.find(MyCust.class,5);
		System.out.println(e1.getcid());
		System.out.println(e2.getcname());
		System.out.println(e3.getcincome());
		
	}

}
