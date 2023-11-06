package com.test;
import javax.persistence.*;

public class insert {

	public static void main(String[] args) {
		
		
			MyCust m1=new MyCust();
			m1.setcid(15);
			m1.setcname("Madhav");
			m1.setcincome(52000);
			
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa project");
			EntityManager em=emf.createEntityManager();  
			em.getTransaction().begin();
			em.persist(m1);
			
			em.getTransaction().commit();
			em.close();
			emf.close();

	}

}