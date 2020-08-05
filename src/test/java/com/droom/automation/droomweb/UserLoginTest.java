package com.droom.automation.droomweb;
import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.page.droomweb.LoginPage;

public class UserLoginTest extends AbstractBaseTest
{
	
	String filepath;
	ExcelUtilities eu;
	
	public UserLoginTest()
	{
		this.filepath="C:/Users/Honey/Desktop/DroomAutomation TestData.xlsx";
		this.eu=new ExcelUtilities(filepath);
	}
	
	
	@Test(priority=1)
	public void loginAsIndividualUserViaPassword()
	{
		String username = eu.readData("Sheet1", 1, 1);
		String password = eu.readData("Sheet1", 1, 2);
		LoginPage loginpage = new LoginPage();
		loginpage.enterLoginPage();
		loginpage.loginValidationForIndividualAccount(username,password);
	}
	
	@Test(priority=2)
	public void inValidIDloginAsIndividualUserViaPassword()
	{
		String username = eu.readData("Sheet1", 2, 1);
		String password = eu.readData("Sheet1", 2, 2);
		LoginPage loginpage = new LoginPage();
		loginpage.enterLoginPage();
		loginpage.invalidLoginValidation(username,password);
	}
	
	@Test(priority=3)
	public void inValidPasswordloginAsIndividualUserViaPassword()
	{
		String username = eu.readData("Sheet1", 3, 1);
		String password = eu.readData("Sheet1", 3, 2);
		LoginPage loginpage = new LoginPage();
		loginpage.enterLoginPage();
		loginpage.invalidLoginValidation(username,password);
	}
	
	@Test(priority=4)
	public void loginAsIndividualUserViaOTP() throws Exception
	{
		String username = eu.readData("Sheet1", 4, 1);
		LoginPage loginpage = new LoginPage();
		loginpage.enterLoginPage();
		loginpage.loginValidationByOTPForIndividualAccount(username);
	}
	
	@Test(priority=5)
	public void inValidOTPloginAsIndividualUserViaOTP() throws Exception
	{
		String username = eu.readData("Sheet1", 5, 1);
		String otp = eu.readData("Sheet1", 5, 3);
		LoginPage loginpage = new LoginPage();
		loginpage.enterLoginPage();
		loginpage.invalidOTPloginValidation(username, otp);
	}

	
	@Test(priority=6)
	public void loginAsProSellerViaPassword()
	{
		String username = eu.readData("Sheet1", 8, 1);
		String password = eu.readData("Sheet1", 8, 2);
		LoginPage loginpage = new LoginPage();
		loginpage.enterLoginPage();
		loginpage.loginValidationForProSellerAccount(username,password);
	}
	
	
	@Test(priority=7)
	public void inValidLoginIDAsProSellerViaPassword()
	{
		String username = eu.readData("Sheet1", 9, 1);
		String password = eu.readData("Sheet1", 9, 2);
		LoginPage loginpage = new LoginPage();
		loginpage.enterLoginPage();
		loginpage.invalidLoginValidation(username,password);
	}
	
	@Test(priority=8)
	public void inValidLoginPasswordAsProSellerViaPassword()
	{
		String username = eu.readData("Sheet1", 10, 1);
		String password = eu.readData("Sheet1", 10, 2);
		LoginPage loginpage = new LoginPage();
		loginpage.enterLoginPage();
		loginpage.invalidLoginValidation(username,password);
	}
	
	
	
	@Test(priority=9)
	public void loginAsProSellerViaOTP() throws Exception
	{
		String username = eu.readData("Sheet1", 11, 1);
		LoginPage loginpage = new LoginPage();
		loginpage.enterLoginPage();
		loginpage.loginValidationForProSellerByOTP(username);
	}
	
	@Test(priority=10)
	public void inValidOTPloginAsProSellerViaOTP() throws Exception
	{
		String username = eu.readData("Sheet1", 12, 1);
		String otp = eu.readData("Sheet1", 12, 3);
		LoginPage loginpage = new LoginPage();
		loginpage.enterLoginPage();
		loginpage.invalidOTPloginValidation(username,otp);
	}
	


}
