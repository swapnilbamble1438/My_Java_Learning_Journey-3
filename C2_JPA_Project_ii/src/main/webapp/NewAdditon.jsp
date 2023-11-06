<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.A1_Crud.MyCustomer"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page import="javax.persistence.EntityManager"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Addition</title>
</head>
<body>
	<form action="Check.jsp" method="post">
	cid : 		<input type="number" value="cid" name="cid"> <br><br>
	cname :		<input type="text" value="" name="cname"> <br><br>
	cincome :   <input type="number" value="cincome" name="cincome"> <br><br>
	<input type="submit" value="Add Your Record">
	</form>
</body>
</html>