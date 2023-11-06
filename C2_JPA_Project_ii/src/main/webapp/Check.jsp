<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import=" javax.persistence.*" %>
  <%@ page import="com.A1_Crud.MyCustomer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
try{
		int cid= Integer.parseInt(request.getParameter("cid"));
		String cname=request.getParameter("cname");
		int cincome= Integer.parseInt(request.getParameter("cincome"));
EntityManagerFactory emf=Persistence.createEntityManagerFactory("YashJPA");
EntityManager em=emf.createEntityManager();  
MyCustomer m1=new MyCustomer();
m1.setCid(cid);
m1.setCname(cname);
m1.setCincome(cincome);
em.getTransaction().begin();
em.persist(m1);
em.getTransaction().commit();
em.close();
emf.close();
out.println("<h1>record is added successfully</h1>");
}catch(Exception ex)
{
	out.println(ex.getMessage());
}
%>
</body>
</html>