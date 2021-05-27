package com.booleans;

import com.classs.returndeposit;

public class transactions 
{
	String url = "jdbc:mysql:localhost:3306://Banking";
	String uname = "root";
	String pass = "";
	
	public boolean transactionn(String youraccount , String clientaccount , int amount)
	{
		returndeposit deposit = new returndeposit();
		int mybalance = Integer.parseInt(deposit.get(youraccount));
		
		if (mybalance >= amount)
		{
			updatedeposit update = new updatedeposit();
			if(update.update(clientaccount, amount))
			{
				amount = 0 - amount;
				if (update.update(youraccount, amount))
				{
					return true;
				}
			}
		}
		else
		{
			System.out.println("No sufficient balance");
		}
		
		return false;
	}
}
