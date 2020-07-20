package com.droom.automation;

import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.page.LoginPage;

public class LoginTest extends AbstractBaseTest
{
	@Test(priority=1)
	public void ValidLogin()
	{
		LoginPage loginpage = new LoginPage();
		loginpage.EnterLoginPage();
		loginpage.LoginValidation();
	}
	
	@Test(priority=2)
	public void LoginViaOTP() throws Exception
	{
		LoginPage loginpage = new LoginPage();
		loginpage.EnterLoginPage();
		loginpage.LoginValidationByOTP();
	}
	
//	@Test(priority=3)
//	public void LoginViaForgotYourPassword()
//	{
//		LoginPage loginpage = new LoginPage();
//		loginpage.EnterLoginPage();
//		loginpage.LoginValidationByForgotYourPassword();
//	}

}
