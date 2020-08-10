package com.droom.automation.lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Format;

public class DataBaseDemo
{
	static String url="jdbc:mysql://qa1.droom.in:3306/cscart_new";
	static String user="root";
	static String password="$6bK6R=a";

	public static int getotp(String qry) throws Exception
		{
		
	//	String qry="";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement statement = connection.createStatement();
		System.out.println("connected");
		ResultSet rs = statement.executeQuery(qry);
		rs.next();
		String otp = rs.getString("code");
		System.out.println(otp);
		int otpNumber = Integer.parseInt(otp);
		statement.close();
		connection.close();
		return otpNumber;
	}
	
	public static void deleteMailID(String qry) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement statement = connection.createStatement();
		System.out.println("connected");
		 int rs = statement.executeUpdate(qry);
		 statement.close();
			connection.close();
	}
}
