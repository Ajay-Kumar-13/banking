package com.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.booleans.updatedeposit;

@WebServlet("/deposit")
public class deposit extends HttpServlet
{
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		String accountnumber = req.getParameter("accountnumber");
		int money = Integer.parseInt(req.getParameter("amount"));
		
		updatedeposit deposit = new updatedeposit();
		if(deposit.update(accountnumber, money))
		{
			res.sendRedirect("welcome.jsp");
		}
		else
		{
			System.out.println("not done");
		}
	}
}
