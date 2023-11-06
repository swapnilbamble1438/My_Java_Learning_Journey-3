<%@page import="java.sql.*,java.io.*,java.text.*,java.util.*" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "insert_servlet" method = "post" enctype = "multipart/form-data">
	  <%@ include file = "navbar.jsp" %>
	  
	   Enter sl_no:<input type="number"	name="sl_no"><br><br>
	   
       Enter employee_name: <input type="text" name="employee_name"><br><br>
          
       Enter mobil_no: <input type="text" name="mobil_no"><br><br>
       
          <input type="submit" value="submit" >

</form>
</body>
</html>