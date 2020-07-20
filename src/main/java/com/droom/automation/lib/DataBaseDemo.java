package com.droom.automation.lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseDemo
{

	public static int getotp(String qry) throws Exception
		{
		String url="jdbc:mysql://qa1.droom.in:3306/cscart_new";
		String user="root";
		String password="$6bK6R=a";
	//	String qry="SELECT * FROM cscart_new.otp_verification where phone='6307641802' order by id desc limit 1";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement statement = connection.createStatement();
		System.out.println("connected");
		ResultSet rs = statement.executeQuery(qry);
		rs.next();
		String otp = rs.getString("code");
		System.out.println(otp);
		int otpNumber = Integer.parseInt(otp);
       	System.out.println(otp);
       	System.out.println(otpNumber);
//		
//		statement.close();
//		connection.close();
		return otpNumber;
		
	}
	

}
