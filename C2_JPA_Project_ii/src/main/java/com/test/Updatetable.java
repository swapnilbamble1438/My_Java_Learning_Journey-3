package com.test;
import javax.persistence.*;
public class Updatetable {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("YashJPA");
		EntityManager em=emf.createEntityManager();
		MyCustomer c1=em.find(MyCustomer.class,5);
		System.out.println(c1.getCname());
		c1.setCname("Nitin");
		em.getTransaction().begin();
		em.merge(c1);
		
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
