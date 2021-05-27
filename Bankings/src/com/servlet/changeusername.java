package com.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.booleans.Changeusername;


@WebServlet("/cusername")
public class changeusername extends HttpServlet 
{
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		String username = req.getParameter("changeusername");
		Changeusername uname = new Changeusername();
		
		HttpSession session = req.getSession();
		String accountnumber = (String)session.getAttribute("accountnumber");
		
		if(uname.change(username, accountnumber))
		{
			res.sendRedirect("logout");
		}
	}
}
