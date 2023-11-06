package com.dao;


import org.hibernate.query.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Note;
import com.helper.FactoryProvider;



public class NoteDAO {
	
	SessionFactory factory = FactoryProvider.getFactory();
	
	
	
	
	// insert data
	public int  insert_data(Note note) {
		int a = 0;
	
	Session s = factory.openSession();
	Transaction tx = s.beginTransaction();
	
	s.save(note);
		
	
	tx.commit();	
	if(tx != null)
		a = 1;
	
	s.close();
	factory.close();
	return a;
	
	
	}
	
	
	
	// delete data
		public int  delete_data(int id) {
			int a = 0;
		
			Session s = factory.openSession();
			Transaction tx = s.beginTransaction();
			
			Note note = new Note();
					note = s.find(Note.class, id);
		s.delete(note);
			
	
		
			tx.commit();
			
			if(tx != null)
				a = 1;
			
			s.close();
	
		factory.close();
		return a;
		}
		
		
		
		//
		

		// view all data
			public List<Note>  view_alldata() {
				
				List<Note> list = new ArrayList<Note>();
			
				Session s = factory.openSession();
				Transaction tx = s.beginTransaction();
				
				List<Note> m1 = s.createQuery("from Note", Note.class).getResultList();
				
				for(Note note: m1) {
					 
					
					 list.add(note);
				 }
				
				
				tx.commit();
				
				s.close();
				factory.close();
			
			return list;
			}
			
			

			// view selected data
			public Note view_selecteddata(int id) {
				
				Note note = new Note();
				
				Session s = factory.openSession();
				Transaction tx = s.beginTransaction();
				
				note = s.get(Note.class,id);
				
					
					tx.commit();
				
					s.close();
					factory.close();
				return note;
			}
			
			
			// update data
			public int update_data(int id,String title, String content) {
				int f = 0;
				
				Session s = factory.openSession();
				Transaction tx = s.beginTransaction();
				
				Note note = new Note();
				note =s.get(Note.class, id);
				note.setTitle(title);
				note.setAddedDate(new Date());
				note.setContent(content);
				
				s.update(note);
				s.save(note);
					
				tx.commit();
				if(tx != null)
					f = 1;
				
					
				s.close();	
				factory.close();
				
			  return f;
			}
			
			
			
		
		
		

}
