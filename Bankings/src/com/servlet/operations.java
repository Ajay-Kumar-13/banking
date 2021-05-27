package com.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.classs.deleteaccount;

@WebServlet("/operation")
public class operations extends HttpServlet
{
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		String action = req.getParameter("action");
		
		if(action.equals("MyAccount"))
		{
			res.sendRedirect("myaccount.jsp");
		}
		if (action.equals("Deposits"))
		{
			res.sendRedirect("deposits.jsp");
		}
		if(action.equals("Transactions"))
		{
			res.sendRedirect("transactions.jsp");
		}
		if(action.equals("Logout")) 
		{
			res.sendRedirect("logout");
		}
		if(action.equals("Change Username"))
		{
			res.sendRedirect("changeusername.jsp");
		}
		if(action.equals("Change Password"))
		{
			res.sendRedirect("changepassword.jsp");
		}
		if(action.equals("Account Balance"))
		{
			res.sendRedirect("accountbalance.jsp");
		}
		if(action.equals("Delete account"))
		{
			HttpSession session = req.getSession();
			String accountnumber =	(String)session.getAttribute("accountnumber");
			deleteaccount account = new deleteaccount();
			if (account.deletecashaccount(accountnumber))
			{
				if(account.deleteaccountsaccount(accountnumber))
				{
					res.sendRedirect("index.html");
				}
			}
		}
	}
}
