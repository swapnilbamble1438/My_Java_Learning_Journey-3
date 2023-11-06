package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 import com.dao.Employee_DAO;
import com.entity.Employee;



@MultipartConfig
@WebServlet("/delete_servlet")
public class delete_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public delete_servlet() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	

		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Employee eid = new Employee();
		
		eid.setSl_no(id);
		
			Employee_DAO d=new Employee_DAO();
			
			boolean f = d.delete_data(eid);
			
		 	if(f)
			{
				
				response.sendRedirect("index.jsp");
				
				
			}
			else
			{
		
				response.sendRedirect("fail.jsp");
			
			}
	
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
