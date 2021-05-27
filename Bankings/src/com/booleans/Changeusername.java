package com.booleans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Changeusername 
{
	
	String uname = "root";
	String pass = "";
	String url = "jdbc:mysql://localhost:3306/Banking";
	String sql = "update accounts set username = ? where accountnumber = ?";
	String sql1 = "update accounts set Passwords = ? where accountnumber = ?";
	
	public boolean change(String username , String accountnumber)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, accountnumber);
			int count = ps.executeUpdate();
			
			
			if (count == 1)
			{
				return true;
			}
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}
	
	public boolean changepassword(String password , String accountnumber)
	{
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			PreparedStatement ps = con.prepareStatement(sql1);
			ps.setString(1, password);
			ps.setString(2, accountnumber);
			int count1 = ps.executeUpdate();
			
			System.out.println(count1);
			if (count1 == 1)
			{
				return true;
			}
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}
	
}