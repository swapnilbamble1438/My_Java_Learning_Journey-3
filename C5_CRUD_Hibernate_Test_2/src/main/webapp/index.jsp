<%@page import="java.util.List"%>
<%@page import="com.entity.Employee"%>
<%@page import="com.sess.DBSession"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="com.dao.Employee_DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="" method= "post">

	<%@ include file = "navbar.jsp" %>
	
	<h1>Employee Management System</h1>
	
	<div class = "container">
		<h2>All Employee Details</h2>
		
		<table border>
		<thead>
			<tr>
				<th>sl_no</th>
				<th>employee_name</th>
				<th>mobil_no</th>
				<th colspan="2" align="center">Actions</th>
			</tr>
		</thead>
		<tbodY>
		
		<%
			Employee_DAO dao = new Employee_DAO();
			List<Employee> list = dao.getAllEmployee();
			for(Employee s : list)
			{%>
			<tr>
				<td><%= s.getSl_no() %></td>
				<td><%= s.getEmployee_name() %></td>
				<td><%= s.getMobil_no() %></td>
				<td> <a href = edit_data.jsp?id=<%=s.getSl_no() %>>Edit Employee</a></td>
				<td><a href = delete_servlet?id=<%=s.getSl_no() %>>Delete Employee</a></td>
			</tr>
			<%}
		%>
		
		
		
		</tbodY>
		</table>
	</div>
	
	
</form>	
</body>
</html>