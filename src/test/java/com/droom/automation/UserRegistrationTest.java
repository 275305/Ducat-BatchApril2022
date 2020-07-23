package com.droom.automation;

import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.page.RegistrationPage;

public class UserRegistrationTest extends AbstractBaseTest
{
	@Test(priority=1)
	public void registerAsIndividualUser() throws Exception
	{
		RegistrationPage registrationpage=new RegistrationPage();
		registrationpage.creatIndividualAccount();
	}
	
	@Test(priority=2)
	public void registerAsProSeller() throws Exception
	{
		RegistrationPage registrationpage=new RegistrationPage();
		registrationpage.createProSellerAccount();
	}

}
