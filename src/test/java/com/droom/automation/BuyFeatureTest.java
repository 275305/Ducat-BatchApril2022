package com.droom.automation;

import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.page.BuyPage;

public class BuyFeatureTest extends AbstractBaseTest
{
	@Test(priority = 1)
	public void buyCarAsLoggedInUser() throws InterruptedException
	{
		BuyPage buypage=new BuyPage();
		buypage.selectBuyCategory();
		
	}

	
//	@Test(priority = 1)
//	public void buyRTOServiceAsLoggedInUser()
//	{
//		BuyPage buypage=new BuyPage();
//		buypage.buyAutomobileServicesViaRTO();
//	}
//	
//	@Test(priority = 2)
//	public void buyJumpstartServiceAsLoggedInUser()
//	{
//		BuyPage buypage=new BuyPage();
//		buypage.buyAutomobileServicesViaJumpstart();
//	}
//	
//	@Test(priority = 3)
//	public void buyCarCareAndDetailingAsLoggedInUser()
//	{
//		BuyPage buypage=new BuyPage();
//		buypage.buyAutomobileServicesViaCarCareAndDetailing();
//	}
}
