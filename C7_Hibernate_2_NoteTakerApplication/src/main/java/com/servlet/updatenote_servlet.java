package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

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
@WebServlet("/updatenote")
public class updatenote_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public updatenote_servlet() {
        super();

    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	

		try{
			
		int id = Integer.parseInt(request.getParameter("id").trim());
		String title = request.getParameter("title");
		String content = request.getParameter("content");
			
		
		
		// hibernate:save()
		Session s = FactoryProvider.getFactory().openSession();
		Transaction tx = s.beginTransaction();
		
		Note note = s.get(Note.class, id);
		note.setTitle(title);
		note.setAddedDate(new Date());
		note.setContent(content);
		
		
		s.save(note);
		tx.commit();	
		
		s.close();
		response.sendRedirect("viewallnotes.jsp");
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}
