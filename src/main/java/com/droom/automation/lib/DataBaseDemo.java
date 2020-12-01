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
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement statement = connection.createStatement();
		System.out.println("connected");
		ResultSet rs = statement.executeQuery(qry);
		rs.next();
		String otp = rs.getString("code");
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
	
	public static  char[] otpAsString(String qry) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement statement = connection.createStatement();
		System.out.println("connected");
		ResultSet rs = statement.executeQuery(qry);
		rs.next();
		String otp = rs.getString("code");
		System.out.println(otp);
		char[] crArr = otp.toCharArray();
		statement.close();
		connection.close();
        return crArr;
	}
	
	public static int getotpOnProd(String qry) throws Exception
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://10.70.2.237:3306/cscart", "qa_usr", "z@N5K[m");
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
}
