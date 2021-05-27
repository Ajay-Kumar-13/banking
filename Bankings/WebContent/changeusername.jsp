<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "com.classs.details" import=" javax.servlet.http.HttpSession"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyBank-ChangeUsername</title>
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
<form action = "operation">
		<input type = "submit" name = "action" value = "MyAccount" id = "myaccount" >
		<input type = "submit" name = "action" value = "Deposits" id = "deposits">
		<input type = "submit" name = "action" value = "Transactions" id = "transactions">
		<input type = "submit" name = "action" value = "Logout" id = "logout">
</form>
<br>

<%

	String username = (String)session.getAttribute("username");
	String password = (String)session.getAttribute("password");
	details d = new details();
	String uname = d.get(username, password, 1);
	String pass  = d.get(username , password, 2);
	String fn 	 = d.get(username ,password , 3);
	String ln 	 = d.get(username , password , 4);
	String dob = d.get(username , password , 5);
	String phonenumber = d.get(username , password , 6);
	String gender = d.get(username , password , 7);
	String email = d.get(username , password , 8);
	String remail = d.get(username , password , 9);
		
%>

<form action = "operation">
	<input type = "submit" name = "action" value = "Change Username" id = "changeusername">
	<input type = "submit" name = "action" value = "Change Password" id = "changepassword">
	<input type = "submit" name = "action" value = "Account Balance" id = "accountbalance">
	<input type = "submit" name = "action" value = "Delete account"  id = "deleteaccount">
</form>
<br>


<form action = "cusername">
	<div id = "form" align = "center">
		<table>
			<tr>
				<td><h5>USERNAME : </h5></td>
				<td><input type = "text" name = "changeusername" placeholder = "Enter new username"></td>
			</tr>
			<tr>
				<td><h5>FIRSTNAME      : </h5></td>
				<td><% out.println(fn); %></td>
			</tr>
			<tr>
				<td><h5>LASTNAME       : </h5></td>
				<td><% out.println(ln); %></td>
			</tr>
			<tr>
				<td><h5>DATE-OF-BIRTH  : </h5></td>
				<td><% out.println(dob); %></td>
			</tr>
			<tr>
				<td><h5>PHONE NUMBER   : </h5></td>
				<td><% out.println(phonenumber); %></td>
			</tr>
			<tr>
				<td><h5>EMAIL          : </h5></td>
				<td><% out.println(email); %></td>
			</tr>
			<tr>
				<td><h5>RECOVERY-EMAIL : </h5></td>
				<td><% out.println(remail); %></td>
			</tr>
		</table>
	</div>
	
	<div align = "center">
		<input type = "submit" value = "update" id = "update">
	</div>
	
</form>

</body>
</html>