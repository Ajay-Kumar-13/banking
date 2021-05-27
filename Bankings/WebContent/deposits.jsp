<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "com.servlet.operations"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyBank-Deposits</title>
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
<div id = "topbar">
	<form action = "operation">
			<input type = "submit" name = "action" value = "MyAccount" id = "myaccount" >
			<input type = "submit" name = "action" value = "Deposits" id = "deposits">
			<input type = "submit" name = "action" value = "Transactions" id = "transactions">
			<input type = "submit" name = "action" value = "Logout" id = "logout">
	</form>
</div>
<br>

<h1 id = subtitle>Deposits</h1>
<p id = "stitle">It's quick and easy</p>
<div align = "center" id = "depositbox">
	<form action = "deposit">
		<input type = "text" name = "accountnumber" placeholder = "Enter AccountNumber " id = "accountnumber"><br><br>
		<input type = "text" name = "amount" placeholder = "Enter Amount" id = "amount"><br><br>
		<input type = "submit" value = "Deposit" id = "deposit">
	</form>
</div>

<br>
</body>
</html>