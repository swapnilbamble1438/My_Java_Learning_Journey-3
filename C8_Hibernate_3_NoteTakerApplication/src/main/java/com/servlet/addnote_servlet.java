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

import com.dao.NoteDAO;
import com.entity.Note;
import com.helper.FactoryProvider;


@MultipartConfig
@WebServlet("/addnote")
public class addnote_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public addnote_servlet() {
        super();

    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	

		try{
			
		String title = request.getParameter("title");
		String content = request.getParameter("content");
			
		Note note = new Note(title,content,new Date());
		
		NoteDAO dao = new NoteDAO();
		
		if(dao.insert_data(note) > 0)
		{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h1 style='text-align:center'>Note is added successfully</h1>");
			out.println("<h1 style='text-align:center'><a href= 'viewallnotes.jsp'>View all notes</a></h1>");
			
		}
		
		else {
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h1 style='text-align:center'>Something went wrong</h1>");
			out.println("<h1 style='text-align:center'><a href= 'viewallnotes.jsp'>View all notes</a></h1>");
			
		}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}
