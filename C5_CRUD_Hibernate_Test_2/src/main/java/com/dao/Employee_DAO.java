package com.dao;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.entity.Employee;
import com.sess.DBSession;

import org.hibernate.Transaction;


public class Employee_DAO {
	
	SessionFactory sessionfactory = DBSession.getsessionfactory();
	Session session = sessionfactory.openSession();
	

	// add employee 
	public int  insert_data(HttpServletRequest request) {
		
		int a = 0;
		try {
			
			
			
			
			Transaction tx = session.beginTransaction();
			
			
			Employee m1 = new Employee();

			List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
			for (FileItem item1 : multiparts) {
				if (item1.isFormField()) {
					if (item1.getFieldName().equals("sl_no"))
						m1.setSl_no(Integer.parseInt(item1.getString()));

					if (item1.getFieldName().equals("employee_name"))
						m1.setEmployee_name(item1.getString());

					if (item1.getFieldName().equals("mobil_no"))
						m1.setMobil_no(item1.getString());

				}
			}

			session.save(m1);

			tx.commit();
		    a= 1;
			session.close();
			sessionfactory.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}
	return a;
		
	}

	// view all employees
	public List<Employee> getAllEmployee(){
		
		List<Employee> list = new ArrayList<Employee>();
		Transaction tx = null;
		
		try {

			
			tx = session.beginTransaction();
			
			
			
			List < Employee > m1 = session.createQuery("from Employee", Employee.class).getResultList();
			
			for(Employee z:m1) {
				 
				 list.add(new Employee(z.getSl_no(),z.getEmployee_name(),z.getMobil_no()));
			 }
			
			
			tx.commit();
			session.close();
			sessionfactory.close();
			
		}catch(HibernateException e) {
			 if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }
		
		return list;
	}
	
	//delete employee
	
	public boolean delete_data(Employee eid)
	{
        	
		int b = eid.getSl_no();
	
		
		boolean f = false;
	;
		Transaction tx = null;
		try { 

						
			tx = session.beginTransaction();
			
			Employee emp = session.find(Employee.class,b);
			session.delete(emp);
			
			tx.commit();
			if(tx != null)
				f  = true;	
			
		}catch (HibernateException e) {
	         if (tx!=null)
	         {
	        	 tx.rollback();
	        	 }
	         e.printStackTrace(); 
	      }	finally {
	         session.close();
	         sessionfactory.close();
	      }
		return f;
	}
	
	// display selected employee values in edit employee page
	public List<Employee> getEmployeeById(int id) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		
		Transaction tx = null;
		
		try {
			
			
			tx = session.beginTransaction();
			
			Employee emp = session.get(Employee.class,id);
					
			list.add(emp);
			
			tx.commit();
		
			
		}catch (HibernateException e) {
	         if (tx!=null)
	         {
	        	 tx.rollback();
	        	 }
	         e.printStackTrace(); 
	      }	finally {
	         session.close();
	         sessionfactory.close();
	      }
		return list;
	}
	
	// update employee
	public int update_employee(int x,String y, String z) {
		int a = 0;
		try {
			
			
			Transaction tx = session.beginTransaction();
			
			Employee emp = session.get(Employee.class,x);
			emp.setSl_no(x);
			emp.setEmployee_name(y);
			emp.setMobil_no(z);
			
			tx.commit();
		    a= 1;
			session.close();
			sessionfactory.close();
			
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	  return a;
	}
	
	
}
