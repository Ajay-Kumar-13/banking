<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyBank-Welcome</title>
<link rel='stylesheet' type='text/css' media='screen' href='style.css'>
</head>
<body >
<%
	response.setHeader("Cache-Control", "no-cache , no-store , must-revalidate");
	if(session.getAttribute("password") == null && session.getAttribute("username") == null)
	{
		response.sendRedirect("index.html");
	}
%>
<div ><h1 >MyBank</h1><h3>-Helps you know about online Banking </h3></div>
	<form action = "operation">
		<input type = "submit" name = "action" value = "MyAccount" id = "myaccount" >
		<input type = "submit" name = "action" value = "Deposits" id = "deposits">
		<input type = "submit" name = "action" value = "Transactions" id = "transactions">
		<input type = "submit" name = "action" value = "Logout" id = "logout">
	</form>
	</body>
</html>