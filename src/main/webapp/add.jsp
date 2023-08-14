<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
  background-image: url('https://images.unsplash.com/photo-1558470598-a5dda9640f68?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxleHBsb3JlLWZlZWR8MTh8fHxlbnwwfHx8fHw%3D&auto=format&fit=crop&w=500&q=60');
  background-size: cover;
}
</style>
</head>
<body>
<%
String email=(String)session.getAttribute("email");
if(email!=null){

%>
	<form action="addcontact" method="post">
	<pre>
	NAME :<input type="text" name="name">
	PHONE:<input type="text" name="phone">
	      <input type="text" name="email" value ="<%=email%>" hidden>
	      <input type="submit" value="save">
	</pre>
	</form>

    <%
}else{
	response.sendRedirect("Login1.jsp");
}
    %>
</body>
</html>