package com.classs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class AccountNumber
{
    public String account()
    {
        
        LocalDateTime date = LocalDateTime.now();
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MM:uuuu:HH:mm:ss", Locale.ENGLISH);
	  String output = dtf.format(date);
      	  String arr[] = output.split(":");
	  int length = arr.length;
	  String accnumber="";
	for (int i = 0 ; i<length ; i++)
	{	
		accnumber = accnumber+arr[i];	
	}
	
	
	return accnumber;
    }
}