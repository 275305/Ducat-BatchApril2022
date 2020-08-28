package com.droom.automation.droomweb.droomweb_prod;
import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.page.droomweb.LoginPage;

public class UserLoginTest extends AbstractBaseTest
{
	
	String filepath;
	ExcelUtilities eu;
	LoginPage loginpage;
	
	public UserLoginTest()
	{
		this.filepath="C:/Users/Honey/Desktop/Prod Automation Test Data.xlsx";
		this.eu=new ExcelUtilities(filepath);
		loginpage = new LoginPage();
	}
	
	
//	@Test(priority=1)
//	public void loginAsIndividualUserViaPassword()
//	{
//		String username = eu.readData("LoginTest", 1, 1);
//		String password = eu.readData("LoginTest", 1, 2);
//		loginpage.enterLoginPage();
//		loginpage.loginValidationForIndividualAccount(username,password);
//	}
//	
//	@Test(priority=2)
//	public void inValidIDloginAsIndividualUserViaPassword()
//	{
//		String username = eu.readData("LoginTest", 2, 1);
//		String password = eu.readData("LoginTest", 2, 2);
//		loginpage.enterLoginPage();
//		loginpage.invalidLoginValidation(username,password);
//	}
//	
//	@Test(priority=3)
//	public void inValidPasswordloginAsIndividualUserViaPassword()
//	{
//		String username = eu.readData("LoginTest", 3, 1);
//		String password = eu.readData("LoginTest", 3, 2);
//		loginpage.enterLoginPage();
//		loginpage.invalidLoginValidation(username,password);
//	}
	
	@Test(priority=4)
	public void loginAsIndividualUserViaOTP() throws Exception
	{
		String username = eu.readData("LoginTest", 4, 1);
		loginpage.enterLoginPage();
		loginpage.loginValidationByOTPForIndividualAccount(username);
	}
	
	@Test(priority=5)
	public void inValidOTPloginAsIndividualUserViaOTP() throws Exception
	{
		String username = eu.readData("LoginTest", 5, 1);
		String otp = eu.readData("LoginTest", 5, 3);
		loginpage.enterLoginPage();
		loginpage.invalidOTPloginValidation(username, otp);
	}

	
//	@Test(priority=6)
//	public void loginAsProSellerViaPassword()
//	{
//		String username = eu.readData("LoginTest", 8, 1);
//		String password = eu.readData("LoginTest", 8, 2);
//		loginpage.enterLoginPage();
//		loginpage.loginValidationForProSellerAccount(username,password);
//	}
//	
//	
//	@Test(priority=7)
//	public void inValidLoginIDAsProSellerViaPassword()
//	{
//		String username = eu.readData("LoginTest", 9, 1);
//		String password = eu.readData("LoginTest", 9, 2);
//		loginpage.enterLoginPage();
//		loginpage.invalidLoginValidation(username,password);
//	}
//	
//	@Test(priority=8)
//	public void inValidLoginPasswordAsProSellerViaPassword()
//	{
//		String username = eu.readData("LoginTest", 10, 1);
//		String password = eu.readData("LoginTest", 10, 2);
//		loginpage.enterLoginPage();
//		loginpage.invalidLoginValidation(username,password);
//	}
	
	
	
	@Test(priority=9)
	public void loginAsProSellerViaOTP() throws Exception
	{
		String username = eu.readData("LoginTest", 11, 1);
		loginpage.enterLoginPage();
		loginpage.loginValidationForProSellerByOTP(username);
	}
	
	@Test(priority=10)
	public void inValidOTPloginAsProSellerViaOTP() throws Exception
	{
		String username = eu.readData("LoginTest", 12, 1);
		String otp = eu.readData("LoginTest", 12, 3);
		loginpage.enterLoginPage();
		loginpage.invalidOTPloginValidation(username,otp);
	}
//
//	@Test(priority = 11)
//	public void franchiseLoginValidation()
//	{
//		String username = eu.readData("FranchiseSheet", 11, 3);
//		String password = eu.readData("FranchiseSheet", 11, 5);
//		loginpage.franchiseLoginValidation(username,password);
//	}
}
