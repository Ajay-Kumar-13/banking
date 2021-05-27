package com.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.booleans.logincheck;

@WebServlet("/usercheck")
public class login extends HttpServlet
{
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		String username = req.getParameter("uname");
		String password = req.getParameter("pass");
		
		logincheck l = new logincheck();
		if(l.check(username, password)) 
		{
			HttpSession session = req.getSession();
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			res.sendRedirect("welcome.jsp");
		}
		
	}
}
