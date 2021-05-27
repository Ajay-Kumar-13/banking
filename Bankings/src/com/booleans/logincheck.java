package com.booleans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class logincheck 
{
	String username = "root";
	String password = "";
	String url = "jdbc:mysql://localhost:3306/Banking";
	String sql = "select * from accounts where username = ? and Passwords = ?";
	
	public boolean check(String uname , String pass)
	{
		
		try 
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, uname);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery();
			if (rs.next())
			{
				return true;
			}
			
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
