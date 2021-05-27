<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "com.classs.returndeposit"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyBank-Balance</title>
<link rel='stylesheet' type='text/css' media='screen' href='style1.css'>
</head>

<%
	response.setHeader("Cache-Control", "no-cache , no-store , must-revalidate");
	if(session.getAttribute("password") == null && session.getAttribute("username") == null)
	{
		response.sendRedirect("index.html");
	}
%>
<body>
<div>
	<form action = "operation">
			<input type = "submit" name = "action" value = "MyAccount" id = "myaccount" >
			<input type = "submit" name = "action" value = "Deposits" id = "deposits">
			<input type = "submit" name = "action" value = "Transactions" id = "transactions">
			<input type = "submit" name = "action" value = "Logout" id = "logout">
	</form>
</div>

<%
String accountnumber = (String)session.getAttribute("accountnumber");
returndeposit d = new returndeposit();
String amount = d.get(accountnumber);
%>

<h1 align = "center" id = "b">YOUR ACCOUNT BALANCE IS <% out.println(amount); %></h1>

</body>
</html>