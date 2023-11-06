package com.test;
import javax.persistence.*;
public class Findingtabledata {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("YashJPA");
		EntityManager em=emf.createEntityManager();
		MyCustomer e1=em.find(MyCustomer.class,3);
		MyCustomer e2=em.find(MyCustomer.class,3);
		MyCustomer e3=em.find(MyCustomer.class,3);
		System.out.println(e1.getCid());
		System.out.println(e2.getCname());
		System.out.println(e3.getCincome());
		
	}

}
