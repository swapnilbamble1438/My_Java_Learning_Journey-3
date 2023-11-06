<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Note</title>
	<%@ include file = "all_css_n_js.jsp" %>

</head>
<body>
<div class="container">
		<%@ include file = "navbar.jsp" %>
		<br>
		<h1>Please fill your Note details:</h1>
		
		<form action="addnote" method="post">
  <div class="form-group">
    <label for="title">Note Title</label>
    <input type="text" class="form-control"  name ="title" id="title"  placeholder="Enter your title" required>
  </div>
  <div class="form-group">
    <label for="content">Note Content</label>
    <textarea class="form-control"  id = "content" name = "content" placeholder = "Enter your content" style="height:300px" required></textarea>
  </div>

  <div class = "container text-center">
  	<button type="submit" class="btn btn-primary">Add</button>
  </div>
  
</form>
	</div>
</body>
</html>