<%@page import="com.helper.FactoryProvider"%>
<%@page import="com.entity.Note"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Page</title>
<%@ include file = "all_css_n_js.jsp" %>
</head>
<body>

	<div class="container">
		<%@ include file = "navbar.jsp" %>
		<h1>Edit your note:</h1>
		<br>
		<%
		int id = Integer.parseInt(request.getParameter("id").trim());
		Session s = FactoryProvider.getFactory().openSession();
		
		Note note = s.get(Note.class,id);
		
		
		%>
		<form action="updatenote" method="post">
		
		<input type= "hidden" value= "<%=note.getId() %>" name = "id" >
		
		
  <div class="form-group">
    <label for="title">Note Title</label>
    <input type="text" value="<%=note.getTitle() %>" class="form-control"  name ="title" id="title"  placeholder="Enter your title" required>
  </div>
  <div class="form-group">
    <label for="content">Note Content</label>
    <textarea class="form-control"  id = "content" name = "content" placeholder = "Enter your content" style="height:300px" required><%=note.getContent() %></textarea>
  </div>

  <div class = "container text-center">
  	<button type="submit" class="btn btn-success">Update</button>
  </div>
		
	</div>
	
	
</body>
</html>