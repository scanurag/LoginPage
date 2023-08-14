<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="sp.css">
	<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" >
</head>
<body>
<div id="ip" >
		<div class="Gk">
		<h1 ><i class="fa-solid fa-user"></i></h1>
	</div>
	<form  action="validateLogin" method="post" >
		<div class="Gk">
			<input type="text" placeholder="Enter Email" name="email">
		</div>
		<div class="Gk">
			<input type="text" placeholder="Enter Password" name="pwd">
		</div>
		<div class="Gk">
			<input type="submit"  value="Login">
		</div>
</form>
<a href="singnin.jsp">𝐒𝐢𝐠𝐧 𝐢𝐧</a>
</div>
</body>
</html>