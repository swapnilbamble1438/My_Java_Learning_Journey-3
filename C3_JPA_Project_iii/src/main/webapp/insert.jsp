<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page import="javax.persistence.EntityManager"%>    
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="insert_servlet" method="post">
	
	cid <input type="number" name="cid"><br><br>
	
	cname <input type="text" name="cname" ><br><br>
	
	cincome <input type="number" name="cincome"><br><br>

	<input type="submit" value="submit">


</form>






</body>
</html>