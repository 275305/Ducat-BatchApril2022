package com.droom.automation.droomweb.droomweb_prod;
import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.page.droomweb.CreateListingPage;
import com.droom.automation.page.droomweb.LoginPage;
import com.droom.automation.page.droomweb.PaymentPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class CreateListingTest extends AbstractBaseTest
{
	String filepath;
	ExcelUtilities eu;
	
	public CreateListingTest()
	{
		this.filepath="C:/Users/Honey/Desktop/Prod Automation Test Data.xlsx";
		this.eu=new ExcelUtilities(filepath);
	}
	@Test(priority = 1)
	public void createNormalListingAsLoggedInUser() throws Exception
	{
		String username = eu.readData("CreateListingSheet", 1, 1);
		String password = eu.readData("CreateListingSheet", 1, 2);
		CreateListingPage createlistingpage=new CreateListingPage();
		createlistingpage.createYourListing(username, password);
		createlistingpage.keyInformation();
		createlistingpage.pricing();
		createlistingpage.uploadPicture();
		createlistingpage.normalListing();
		createlistingpage.certificationTool();
		createlistingpage.activateListing();
		
	}
	
	@Test(priority = 2)
	public void createPremiumListingAsLoggedInUser() throws Exception
	{
		String username = eu.readData("CreateListingSheet", 1, 1);
		String password = eu.readData("CreateListingSheet", 1, 2);
		CreateListingPage createlistingpage=new CreateListingPage();
		createlistingpage.createYourListing(username, password);
		createlistingpage.keyInformation();
		createlistingpage.pricing();
		createlistingpage.uploadPicture();
		createlistingpage.premiumListing();
		createlistingpage.certificationTool();
		createlistingpage.activateListing();
	}
	
	@Test(priority = 3)
	public void createConciergeListingAsLoggedInUser() throws Exception
	{
		String username = eu.readData("CreateListingSheet", 1, 1);
		String password = eu.readData("CreateListingSheet", 1, 2);
		CreateListingPage createlistingpage=new CreateListingPage();
		createlistingpage.createYourListing(username, password);
		createlistingpage.keyInformation();
		createlistingpage.pricing();
		createlistingpage.uploadPicture();
		createlistingpage.conciergeListing();
		createlistingpage.certificationTool();
		createlistingpage.activateListing();
	}

}
