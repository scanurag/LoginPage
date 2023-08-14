<%@ page language="java"   contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="dao.ContactDao" %>
     <%@ page import="java.sql.ResultSet"%>
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
	ResultSet rs=ContactDao.getallcontacts(email);
	%>
	<table border="2px">
	<tr>
	<th>NAME</th>
	<th>PHONE</th>
	</tr>
	<%
	while(rs.next()){
	%>
	<tr>
	<td><%=rs.getString(2) %></td>
	<td><%=rs.getLong(3) %></td>
	
<%
	}
}else{
	response.sendRedirect("Login1.jsp");
}
%>
</table>
</body>
</html>