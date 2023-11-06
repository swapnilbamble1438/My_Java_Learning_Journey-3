<%@page import="java.util.List"%>
<%@page import="com.entity.Employee"%>
<%@page import="com.sess.DBSession"%>
<%@page import="com.dao.Employee_DAO"%>
<%@ page import=" javax.persistence.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "update_servlet" method = "post">

	<%@ include file = "navbar.jsp" %>
	
	<%
		int id = Integer.parseInt(request.getParameter("id"));
		
		Employee_DAO dao = new Employee_DAO();
		
		List <Employee> p = dao.getEmployeeById(id);
		
	%>

<h1>Edit Employee</h1>
<% 
for(Employee f: p ){
	%>
sl_no : <input type = "number" name = "sl_no" value ="<%=f.getSl_no() %>" required><br><br>

employee_name : <input type = "text" name = "employee_name" value ="<%=f.getEmployee_name() %>" required><br><br>

mobil_no : <input type = "text" name = "mobil_no" value ="<%=f.getMobil_no() %>" required><br><br>


<input type = "hidden" name = "i"  value = "<%= f.getSl_no() %>">

	<% }%>
<input type = "submit" value="Update">



</form>
</body>
</html>