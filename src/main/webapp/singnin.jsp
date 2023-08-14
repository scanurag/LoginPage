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

<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body class="container-fluid card" style="width:21rem;">
<h2 class="bg-danger text-white text-center">𝐒𝐢𝐠𝐧 𝐢𝐧</h2>
<form  action="savesignin"  method="post" >
<pre>
NAME          :<input type="text" name="name">
PHONE         :<input type="text" name="phone">
EMAIL         :<input type="text" name="email">
PASSWORD      :<input type="text" name="pwd1">
CNF PASSWORD  :<input type="text" name="pwd2">
			  <input type="submit" value="Signin">

</pre>
</form>
</body>
</html>