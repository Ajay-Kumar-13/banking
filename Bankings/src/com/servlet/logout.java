package com.servlet;


import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class logout extends HttpServlet  
{
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		HttpSession session = req.getSession();
		session.removeAttribute("username");
		session.removeAttribute("password");
		session.invalidate();
		res.sendRedirect("index.html");
	
	}
}
