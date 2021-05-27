package com.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.booleans.transactions;

@WebServlet("/transaction")
public class transaction extends HttpServlet 
{
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		String youraccount = req.getParameter("youraccount");
		String clientaccount = req.getParameter("clientaccount");
		int amount = Integer.parseInt(req.getParameter("amount"));
		
		transactions transact = new transactions();
		if(transact.transactionn(youraccount, clientaccount, amount))
		{
			res.sendRedirect("welcome.jsp");
		}
	}
}
