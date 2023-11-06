package com.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Note;
import com.helper.FactoryProvider;



@MultipartConfig
@WebServlet("/deletenote")
public class deletenote_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public deletenote_servlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		try{
			
		int id = Integer.parseInt(request.getParameter("id").trim());
		String content = request.getParameter("content");
			
		
	
		Session s = FactoryProvider.getFactory().openSession();
	Transaction tx = s.beginTransaction();
		
		Note note = s.get(Note.class, id);
		s.delete(note);
		tx.commit();	
		
		s.close();
		response.sendRedirect("viewallnotes.jsp");
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}
