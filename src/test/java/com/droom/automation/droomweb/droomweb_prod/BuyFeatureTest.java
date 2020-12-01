package com.droom.automation.droomweb.droomweb_prod;

import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.page.droomweb.BuyPage;

public class BuyFeatureTest extends AbstractBaseTest
{
	
	String filepath;
	ExcelUtilities eu;
	
	public BuyFeatureTest()
	{
		this.filepath="C:/Users/Honey Maurya/Desktop/Prod Automation Test Data.xlsx";
		this.eu=new ExcelUtilities(filepath);
	}

	@Test(priority = 1)
	public void buyVehicleAsLoggedInUser() throws InterruptedException
	{
		String username = eu.readData("BuyFeatureSheet", 1, 1);
		String password = eu.readData("BuyFeatureSheet", 1, 2);
		BuyPage buypage=new BuyPage();
	//	buypage.selectBuyCategory(username, password);
	}
	
	@Test(priority = 2)
	public void buyRTOServiceAsLoggedInUser()
	{
		String username = eu.readData("BuyFeatureSheet", 1, 1);
		String password = eu.readData("BuyFeatureSheet", 1, 2);
		BuyPage buypage=new BuyPage();
		buypage.buyAutomobileServicesViaRTO(username, password);
	}
	
	@Test(priority = 3)
	public void buyJumpstartServiceAsLoggedInUser()
	{
		String username = eu.readData("BuyFeatureSheet", 1, 1);
		String password = eu.readData("BuyFeatureSheet", 1, 2);
		BuyPage buypage=new BuyPage();
		buypage.buyAutomobileServicesViaJumpstart(username, password);
	}
	
	@Test(priority = 4)
	public void buyCarCareAndDetailingAsLoggedInUser()
	{
		String username = eu.readData("BuyFeatureSheet", 1, 1);
		String password = eu.readData("BuyFeatureSheet", 1, 2);
		BuyPage buypage=new BuyPage();
		buypage.buyAutomobileServicesViaCarCareAndDetailing(username, password);
	}
	
	
	@Test(priority = 5)
	public void buyRoadSideAssistanceServiceAsLogged() throws Exception
	{
		String username = eu.readData("BuyFeatureSheet", 1, 1);
		String password = eu.readData("BuyFeatureSheet", 1, 2);
		BuyPage buypage=new BuyPage();
		buypage.buyAutomobileServicesViaRTOAsLoggedInLater(username, password);
	}
}
