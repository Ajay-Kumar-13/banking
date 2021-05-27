package com.classs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class returndeposit 
{
	String url = "jdbc:mysql://localhost:3306/Banking";
	String uname = "root";
	String pass = "";
	String sql = "select * from cash where accountnumber = ?";
	String amount;
	
	public String get(String accountnumber)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, accountnumber);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				amount = rs.getString(2);
			}
			
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return amount;
	}		
}
		
