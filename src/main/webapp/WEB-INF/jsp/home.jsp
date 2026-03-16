<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align: center">
	<form action="addCustomer" method="POST">
		<h1>Welcome to SpringBoot</h1>
		<input type="text" name ="FirstName" placeholder="Enter Your FirstName"> <br> 
		<input type="text" name ="LastName" placeholder="Enter Your LastName">  <br>
		<input type="text" name ="Email" placeholder="Enter Your Email">		<br> 
		<input type="submit" value="Submited">
	</form>
</body>
</html>