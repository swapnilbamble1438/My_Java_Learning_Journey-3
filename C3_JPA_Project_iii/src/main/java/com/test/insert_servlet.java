package com.test;

import com.test.MyCust;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/insert_servlet")
public class insert_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public insert_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try{
			int cid=Integer.parseInt(request.getParameter("cid"));
			String cname=request.getParameter("cname");
			int cincome=Integer.parseInt(request.getParameter("cincome"));
			 

			MyCust m1=new MyCust();
			m1.setCid(cid);
			m1.setCname(cname);
			m1.setCincome(cincome);

			EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa project2");
			EntityManager em=emf.createEntityManager();

			System.out.println("Record is added");

			em.getTransaction().begin();
			em.persist(m1);

			em.getTransaction().commit();
			em.close();
			emf.close();	
			
				
				
			}catch (Exception ex){
				ex.getMessage();
			}
		
	}

}
