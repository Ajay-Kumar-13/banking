package com.booleans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.classs.returndeposit;

public class updatedeposit 
{
	String url = "jdbc:mysql://localhost:3306/Banking";
	String uname = "root";
	String pass = "";
	String sql = "update cash set amount = ? where accountnumber = ?";
	
	public boolean update(String accountnumber , int money)
	{
		
		returndeposit deposit = new returndeposit();
		int amount = Integer.parseInt(deposit.get(accountnumber));
		int c = amount+money;
		String cash = String.valueOf(c);
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(2, accountnumber);
			ps.setString(1, cash);
			
			int Count = ps.executeUpdate();
			
			if (Count == 1)
			{
				return true;
			}
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println(e.getStackTrace());
		}
		
		return false;
	}
}
