package com.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.booleans.Changeusername;

@WebServlet("/password")
public class changepassword extends HttpServlet 
{
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		String currentpassword = req.getParameter("CurrentPassword");
		HttpSession session = req.getSession();
		String password = (String)session.getAttribute("password");
		
		if (currentpassword.equals(password))
		{
			String accountnumber = (String)session.getAttribute("accountnumber");
			String newpassword = req.getParameter("NewPassword");
			String repassword = req.getParameter("RePassword");
			
			if (newpassword.equals(repassword))
			{
				Changeusername pass = new Changeusername();
				if(pass.changepassword(newpassword, accountnumber))
				{
					res.sendRedirect("logout");
				}
				
			}
			
		}
		
	}
}
