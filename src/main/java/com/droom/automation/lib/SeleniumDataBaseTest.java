package com.droom.automation.lib;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumDataBaseTest
{

	int otpNumber=0;
	    @Test 
	    public int getOTPFromDataBase(String enterQry)
	    {
		 
	    	try{
		       	 Class.forName("com.mysql.jdbc.Driver");
		       	 Connection con=DriverManager.getConnection("jdbc:mysql://qa1.droom.in:3306/cscart_new","root","$6bK6R=a");
		       	 Statement stmt=con.createStatement();
		       	System.out.println("connected");
		       	 ResultSet rs=stmt.executeQuery(enterQry);
		         rs.next();
		     	 String otp = rs.getString("code");
		       	otpNumber = Integer.parseInt(otp);
		       	System.out.println(otp);
		       	System.out.println(otpNumber);
			}	
		     catch(Exception e)
		     { System.out.println(e);}
			return otpNumber;
	    }
//	    @Test
//	    public void deleteDataFromDB(String deleteQry)
//	    {
//	    	try{
//		       	 Class.forName("com.mysql.jdbc.Driver");
//		       	 Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://qa1.droom.in:3306/cscart_new","root","$6bK6R=a");
//		       	System.out.println("cxn created");
//		       	 Statement stmt=(Statement) con.createStatement();
//		       	System.out.println("stmt created");
//		       	 ResultSet rs=(ResultSet) stmt.executeQuery(deleteQry);
//		       	System.out.println("stmt executed");
//		       	rs.next();
//		       	rs.deleteRow();
//	    }
//	    	catch(Exception e)
//		     { System.out.println(e);}

}
