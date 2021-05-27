<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "com.servlet.operations"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyBank-Transactions</title>
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
	
	<h1 id = subtitle>Transactions</h1>
	<p id = "stitle">It's quick and easy</p>
	<div id = "transactionbox" align = center> 
		<form action="transaction">
			<input type =  "text" name = "youraccount" placeholder = "Enter your accountnumber" id = "youraccount">
			<input type = "text" name = "clientaccount" placeholder = "Enter client accountnumber" id = "clientaccount">
			<div align = "center"><input type = "text" name = "amount" placeholder = "Enter Amount" id = "amounttosend"></div>
			<input type = "submit" value = "Done" id = "done">
		</form>
	</div>
	
</div>


</body>
</html>