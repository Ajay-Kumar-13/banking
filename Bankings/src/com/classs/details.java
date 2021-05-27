package com.classs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class details 
{
	String url = "jdbc:mysql://localhost:3306/Banking";
	String uname = "root";
	String pass = "";
	String value = "";
	String sql = "select * from accounts where username = ? and Passwords = ? ";
	
	public String get(String username , String password , int n)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			if (rs.next())
			{
				value = rs.getString(n);
			}

			
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
}
