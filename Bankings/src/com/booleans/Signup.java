package com.booleans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Signup 
{
	String uname = "root";
	String pass = "";
	String url = "jdbc:mysql://localhost:3306/Banking";
	String sql = "insert into accounts values(?,?,?,?,?,?,?,?,?,?)";
	String sql1 = "insert into cash values (?,?)";
	
	public boolean SignUp(String username,String password , String fname , String lname,String dob,String phonenumber ,String gender
			,String email ,String remail,String accountnumber)
	{
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2,password);
			ps.setString(3,fname);
			ps.setString(4,lname);
			ps.setString(5,dob);
			ps.setString(6,phonenumber);
			ps.setString(7,gender);
			ps.setString(8,email);
			ps.setString(9,remail);
			ps.setString(10, accountnumber);
			
			int Count = ps.executeUpdate();
			
			if(Count == 1)
			{
				return true;
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return false;
		
	}
	
	public boolean update(String accountnumber)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			PreparedStatement ps = con.prepareStatement(sql1);
			
			ps.setString(1, accountnumber);
			ps.setString(2,"0");
		
			
			int Count = ps.executeUpdate();
			if (Count == 1)
			{
				return true;
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return false;
	}
}
