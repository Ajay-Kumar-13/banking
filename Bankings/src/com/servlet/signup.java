package com.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.booleans.Signup;
import com.booleans.sendEmail;
import com.classs.AccountNumber;

@WebServlet("/account")
public class signup extends HttpServlet
{
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		String username = req.getParameter("uname");
		String password = req.getParameter("pass");
		String fname = req.getParameter("fn");
		String lname = req.getParameter("ln");
		String dob = req.getParameter("dob");
		
		String phonenumber = req.getParameter("phonenumber");
		String gender = req.getParameter("gender");
		String email = req.getParameter("email");
		String remail = req.getParameter("remail");
		AccountNumber number = new AccountNumber();
		String accountnumber = number.account();
		
		
		
		Signup up = new Signup();
		if (up.SignUp(username, password, fname, lname, dob,  phonenumber, gender, email, remail,accountnumber) && up.update(accountnumber))
		{
			
			
			String message = "Thank you, for creating account in MyBank your accountnumber is "+accountnumber +" and your recovery email is "+remail;
			String from = "bdummy44@gmail.com";
			String to = email;
			String subject = "AccountDetails";
			sendEmail mail = new sendEmail();
			if(mail.sendemail(message, subject, to, from))
			{
				res.sendRedirect("index.html");
			}
			
			
		}
	}
}
