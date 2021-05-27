package com.classs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class deleteaccount
{
	String url = "jdbc:mysql://localhost:3306/Banking";
	String uname = "root";
	String pass = "";
	String sql = "delete from cash where accountnumber = ? ";
	String sql1 = "delete from accounts where accountnumber = ?";
	
	public boolean deletecashaccount(String accountnumber)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url , uname , pass);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, accountnumber);
			
			int Count = ps.executeUpdate();
			if (Count == 1)
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
	public boolean deleteaccountsaccount(String accountnumber)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url , uname , pass);
			PreparedStatement ps = con.prepareStatement(sql1);
			ps.setString(1, accountnumber);
			int Count = ps.executeUpdate();
			if (Count == 1)
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
