package com.A2_Basic_annotations_n_saving_image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class test {

	public static void main(String[] args) throws IOException {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("com/A2_Basic_annotations_n_saving_image/hibernate.cfg.xml");
		SessionFactory sessionfactory = cfg.buildSessionFactory();
		
		Session session = sessionfactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
		Address ad = new Address();
		ad.setStreet("Thakurpada");
		ad.setCity("Mumbra");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(1234);
		
		
		// adding image, Reading image
		FileInputStream fi = new FileInputStream("src/main/java/himage.jpg");
		byte[] data = new byte[fi.available()];
		fi.read(data);
		ad.setImage(data);
		
		session.save(ad);
			
		tx.commit();  // session.getTransaction().commit();
		session.close();
		sessionfactory.close();
		
		System.out.println("Done...");
	
	
	
	
	
	}
	
}
