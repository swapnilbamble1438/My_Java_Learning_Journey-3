package com.A5_Cascading;

import java.util.ArrayList;
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
		cfg.configure("com/A5_Cascading/hibernate.cfg.xml");
		SessionFactory sessionfactory = cfg.buildSessionFactory();

		Session session = sessionfactory.openSession();

		Transaction tx = session.beginTransaction();

		/*// it is common method to save data 
		Question3 q1 = new Question3();
		q1.setQuestionId(3);
		q1.setQuestion("What is Cascading?");
		
		Answer3 a1 = new Answer3(3,"In hibernate it is important concept.",q1);
		Answer3 a2 = new Answer3(33,"Second Answer.",q1);
		Answer3 a3 = new Answer3(333,"Third Answer.",q1);
		
		List<Answer3> list = new ArrayList<>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		q1.setAnswer(list);
		session.save(q1); // it will only save Question not Answer
		
		session.save(a1);
		session.save(a2);
		session.save(a3);
		*/
		
		// cascade method to save data
		Question3 q2 = new Question3();
		q2.setQuestionId(4);
		q2.setQuestion("What is Swing Framework?");
		
		Answer3 a4 = new Answer3(4,"Use for development.",q2);
		Answer3 a5 = new Answer3(44,"Desktop.",q2);
		Answer3 a6 = new Answer3(444,"learn by programmers.",q2);
		
		List<Answer3> list2 = new ArrayList<>();
		list2.add(a4);
		list2.add(a5);
		list2.add(a6);
		
		q2.setAnswer(list2);
		session.save(q2); // 
		
	//	session.save(a4);    // no need to add these extra line
	//	session.save(a5);    // to save the answer
	//	session.save(a6);	// because applying Cascade type will automatically
							// save the answer while saving the question
		 
		
		tx.commit();  // session.getTransaction().commit();
		session.close();
		
		sessionfactory.close();
		
	}
}
