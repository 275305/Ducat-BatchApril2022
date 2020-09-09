package com.droom.automation.droomweb.droomweb_prod;
import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.page.droomweb.SearchFeaturePage;

public class SearchFeatureTest extends AbstractBaseTest
{
	String filepath;
	ExcelUtilities eu;
	SearchFeaturePage searchpage;
	
	public SearchFeatureTest()
	{
		this.filepath="C:/Users/Honey/Desktop/Prod Automation Test Data.xlsx";
		this.eu=new ExcelUtilities(filepath);
		searchpage=new SearchFeaturePage();
	}
//	@Test(priority = 1)
//	public void serachForVehicleValidationAsLoggedInUser()
//	{
//		String username = eu.readData("BuyFeatureSheet", 1, 1);
//		String password = eu.readData("BuyFeatureSheet", 1, 2);
//		searchpage.searchForVehicle(username, password);
//	}
//	@Test(priority = 2)
//	public void serachForBikeValidationAsLoggedInUser()
//	{
//		String username = eu.readData("BuyFeatureSheet", 1, 1);
//		String password = eu.readData("BuyFeatureSheet", 1, 2);
//		searchpage.searchForBike(username, password);
//	}
//	@Test(priority = 3)
//	public void serachForScooterValidationAsLoggedInUserAtCheckout()
//	{
//		String username = eu.readData("BuyFeatureSheet", 1, 1);
//		String password = eu.readData("BuyFeatureSheet", 1, 2);
//		searchpage.searchForScooterAsLoggedInUser(username, password);
//	}
	@Test(priority = 4)
	public void serachForVehicleValidation()
	{
		searchpage.searchForScooterAsFBLoggedInUser();
	}
}
