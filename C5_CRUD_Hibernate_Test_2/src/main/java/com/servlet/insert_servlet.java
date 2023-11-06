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
@WebServlet("/insert_servlet")
public class insert_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public insert_servlet() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		try{
			Employee_DAO d=new Employee_DAO();
			
		 	if(d.insert_data(request)>0)
			{
				
				response.sendRedirect("pass.jsp");
				
				
			}
			else
			{
		
				response.sendRedirect("fail.jsp");
			
			}
			
		}catch (Exception ex){
			System.out.println(ex);
		}

	
			
	
				
			
			
		
		
	}

}
