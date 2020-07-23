package com.droom.automation;

import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.page.LoginPage;

public class UserLoginTest extends AbstractBaseTest
{
	@Test(priority=1)
	public void loginAsIndividualUserViaPassword()
	{
		LoginPage loginpage = new LoginPage();
		loginpage.enterLoginPage();
		loginpage.loginValidationForIndividualAccount();
	}
	
	@Test(priority=2)
	public void loginAsProSellerViaPassword()
	{
		LoginPage loginpage = new LoginPage();
		loginpage.enterLoginPage();
		loginpage.loginValidationForPro_SellerAccount();
	}
	
	@Test(priority=3)
	public void loginAsIndividualUserViaOTP() throws Exception
	{
		LoginPage loginpage = new LoginPage();
		loginpage.enterLoginPage();
		loginpage.loginValidationByOTPForIndividualAccount();
	}
	
	@Test(priority=4)
	public void loginAsProSellerViaOTP() throws Exception
	{
		LoginPage loginpage = new LoginPage();
		loginpage.enterLoginPage();
		loginpage.loginValidationForPro_SellerByOTP();
	}
	
//	@Test(priority=3)
//	public void loginViaForgotYourPassword()
//	{
//		LoginPage loginpage = new LoginPage();
//		loginpage.enterLoginPage();
//		loginpage.loginValidationByForgotYourPassword();
//	}

}
