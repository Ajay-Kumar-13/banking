<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyBank-ChangePassword</title>
<link rel='stylesheet' type='text/css' media='screen' href='style1.css'>
</head>
<body>

<%
	response.setHeader("Cache-Control", "no-cache , no-store , must-revalidate");
	if(session.getAttribute("password") == null && session.getAttribute("username") == null)
	{
		response.sendRedirect("index.html");
	}
%>

	<form action = "password">
		<h1 align = "center" id = "t">MyBank</h1>
		<div id = "passwordbox" align = "center">
			
			<input type = "text" name = "CurrentPassword" id = "currentpassoword" placeholder = "CurrentPassword"><br>
			<input type = "password" name = "NewPassword" id = "newpassword" placeholder = "Password"><br>
			<input type = "password" name = "RePassword" id = "repassword" placeholder = "ReType-Password"><br>
			<input type = "submit" value = "change" id = "change">
		</div>
	</form>
</body>
</html>