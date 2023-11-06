<%@page import="com.dao.NoteDAO"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.query.Query"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.entity.Note"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Notes</title>
<%@ include file = "all_css_n_js.jsp" %>
</head>
<body>
	
	<div class = "container">
		<%@ include file = "navbar.jsp" %>
		<br>
		<h1>All Notes:</h1>
		
		<div class = "row">
			<div class = "col-12">
				
						
				<%
				NoteDAO dao = new NoteDAO();
				List<Note> list = dao.view_alldata();
				for(Note note:list)
				{%>
					<div class="card mt-3">
				  <img class="card-img-top m-4 mx-auto" style="max-width:60px" src="image/notes.png" alt="Card image cap">
				  <div class="card-body px-5">
				    <h5 class="card-title"><%= note.getTitle() %></h5>
				    <p class="card-text"><%=note.getContent() %></p>
				    <p><b>Note Updated on:</b> <b style="color:blue"><%=note.getAddedDate() %></b></p>

				    <div class = "container text-center mt-2">
				    	<a href="deletenote?id=<%=note.getId()%>" class="btn btn-danger">Delete</a>
				    	<a href="editnote.jsp?id=<%=note.getId()%>" class="btn btn-primary">Update</a>
				    </div>
				  </div>
				</div>
								
				
				
				<%}
				
			
				%>
				
			</div>
		</div>

	</div>
	<br>
	<br>

</body>
</html>