package com.automation.utilites;

import java.util.Date;

public class Accessories {

	
	public static String timeStamp() {
		
	           java.util.Date today = new java.util.Date();
	           System.out.println("The Sql Time is :"+new java.sql.Timestamp(today.getTime()).toString());
	        return new java.sql.Timestamp(today.getTime()).toString();
	        
	}
}
