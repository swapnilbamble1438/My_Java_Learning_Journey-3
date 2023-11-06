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
@WebServlet("/update_servlet")
public class update_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public update_servlet() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 int a=Integer.parseInt(request.getParameter("sl_no"));
		 String b=request.getParameter("employee_name");
		 String c=request.getParameter("mobil_no");
		
		try{
			Employee_DAO d=new Employee_DAO();
			
		 	if(d.update_employee(a,b,c)>0)
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
