package com.droom.automation.droomweb.droomweb_qa;
import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.page.droomweb.CreateListingPage;
import com.droom.automation.page.droomweb.PaymentPage;

public class CreateListingTest extends AbstractBaseTest
{
	String filepath;
	ExcelUtilities eu;
	PaymentPage paymentpage;
	
	public CreateListingTest()
	{
		this.filepath="C:/Users/Honey Maurya/Desktop/QA Automation TestData.xlsx";
		this.eu=new ExcelUtilities(filepath);
		this.paymentpage=new PaymentPage();
	}
	@Test(priority = 1)
	public void createNormalListingAsLoggedInUser1() throws Exception
	{
		String username = eu.readData("CreateListingSheet", 1, 1);
		String password = eu.readData("CreateListingSheet", 1, 2);
		String kmDriver = eu.readData("CreateListingSheet", 13, 3);
		String sellingPrice = eu.readData("CreateListingSheet", 13, 4);
		CreateListingPage createlistingpage=new CreateListingPage();
		createlistingpage.createYourListing(username, password);
		createlistingpage.basicFacts();
		createlistingpage.keyFactors(kmDriver);
		createlistingpage.transperancyFactors();
		createlistingpage.pricing(sellingPrice);
		createlistingpage.uploadPicture();
		createlistingpage.normalListing();
		createlistingpage.certificationToolQA();
		createlistingpage.activateListingQA();
	}
	
	@Test(priority = 2)
	public void createNormalListingAsLoggedInUser2() throws Exception
	{
		String username = eu.readData("CreateListingSheet", 1, 1);
		String password = eu.readData("CreateListingSheet", 1, 2);
		String kmDriver = eu.readData("CreateListingSheet", 14, 3);
		String sellingPrice = eu.readData("CreateListingSheet", 14, 4);
		CreateListingPage createlistingpage=new CreateListingPage();
		createlistingpage.createYourListing(username, password);
		createlistingpage.basicFacts();
		createlistingpage.keyFactors(kmDriver);
		createlistingpage.transperancyFactors();
		createlistingpage.pricing(sellingPrice);
		createlistingpage.uploadPicture();
		createlistingpage.normalListing();
		createlistingpage.certificationToolQA();
		createlistingpage.activateListingQA();
	}
	
//	@Test(priority = 3)
//	public void createNormalListingAsLoggedInUser3() throws Exception
//	{
//		String username = eu.readData("CreateListingSheet", 1, 1);
//		String password = eu.readData("CreateListingSheet", 1, 2);
//		String kmDriver = eu.readData("CreateListingSheet", 15, 3);
//		String sellingPrice = eu.readData("CreateListingSheet", 15, 4);
//		CreateListingPage createlistingpage=new CreateListingPage();
//		createlistingpage.createYourListing(username, password);
//		createlistingpage.basicFacts();
//		createlistingpage.keyFactors(kmDriver);
//		createlistingpage.transperancyFactors();
//		createlistingpage.pricing(sellingPrice);
//		createlistingpage.uploadPicture();
//		createlistingpage.normalListing();
//		createlistingpage.certificationToolQA();
//		createlistingpage.activateListingQA();
//	}
//	
//	@Test(priority = 4)
//	public void createNormalListingAsLoggedInUser4() throws Exception
//	{
//		String username = eu.readData("CreateListingSheet", 1, 1);
//		String password = eu.readData("CreateListingSheet", 1, 2);
//		String kmDriver = eu.readData("CreateListingSheet", 16, 3);
//		String sellingPrice = eu.readData("CreateListingSheet", 16, 4);
//		CreateListingPage createlistingpage=new CreateListingPage();
//		createlistingpage.createYourListing(username, password);
//		createlistingpage.basicFacts();
//		createlistingpage.keyFactors(kmDriver);
//		createlistingpage.transperancyFactors();
//		createlistingpage.pricing(sellingPrice);
//		createlistingpage.uploadPicture();
//		createlistingpage.normalListing();
//		createlistingpage.certificationToolQA();
//		createlistingpage.activateListingQA();
//	}
//	
//	@Test(priority = 5)
//	public void createNormalListingAsLoggedInUser5() throws Exception
//	{
//		String username = eu.readData("CreateListingSheet", 1, 1);
//		String password = eu.readData("CreateListingSheet", 1, 2);
//		String kmDriver = eu.readData("CreateListingSheet", 17, 3);
//		String sellingPrice = eu.readData("CreateListingSheet", 17, 4);
//		CreateListingPage createlistingpage=new CreateListingPage();
//		createlistingpage.createYourListing(username, password);
//		createlistingpage.basicFacts();
//		createlistingpage.keyFactors(kmDriver);
//		createlistingpage.transperancyFactors();
//		createlistingpage.pricing(sellingPrice);
//		createlistingpage.uploadPicture();
//		createlistingpage.normalListing();
//		createlistingpage.certificationToolQA();
//		createlistingpage.activateListingQA();
//	}
//	
//	@Test(priority = 6)
//	public void createNormalListingAsLoggedInUser6() throws Exception
//	{
//		String username = eu.readData("CreateListingSheet", 1, 1);
//		String password = eu.readData("CreateListingSheet", 1, 2);
//		String kmDriver = eu.readData("CreateListingSheet", 18, 3);
//		String sellingPrice = eu.readData("CreateListingSheet", 18, 4);
//		CreateListingPage createlistingpage=new CreateListingPage();
//		createlistingpage.createYourListing(username, password);
//		createlistingpage.basicFacts();
//		createlistingpage.keyFactors(kmDriver);
//		createlistingpage.transperancyFactors();
//		createlistingpage.pricing(sellingPrice);
//		createlistingpage.uploadPicture();
//		createlistingpage.normalListing();
//		createlistingpage.certificationToolQA();
//		createlistingpage.activateListingQA();
//	}
//	
//	@Test(priority = 7)
//	public void createNormalListingAsLoggedInUser7() throws Exception
//	{
//		String username = eu.readData("CreateListingSheet", 1, 1);
//		String password = eu.readData("CreateListingSheet", 1, 2);
//		String kmDriver = eu.readData("CreateListingSheet", 19, 3);
//		String sellingPrice = eu.readData("CreateListingSheet", 19, 4);
//		CreateListingPage createlistingpage=new CreateListingPage();
//		createlistingpage.createYourListing(username, password);
//		createlistingpage.basicFacts();
//		createlistingpage.keyFactors(kmDriver);
//		createlistingpage.transperancyFactors();
//		createlistingpage.pricing(sellingPrice);
//		createlistingpage.uploadPicture();
//		createlistingpage.normalListing();
//		createlistingpage.certificationToolQA();
//		createlistingpage.activateListingQA();
//	}
//	
//	@Test(priority = 8)
//	public void createNormalListingAsLoggedInUser8() throws Exception
//	{
//		String username = eu.readData("CreateListingSheet", 1, 1);
//		String password = eu.readData("CreateListingSheet", 1, 2);
//		String kmDriver = eu.readData("CreateListingSheet", 20, 3);
//		String sellingPrice = eu.readData("CreateListingSheet", 20, 4);
//		CreateListingPage createlistingpage=new CreateListingPage();
//		createlistingpage.createYourListing(username, password);
//		createlistingpage.basicFacts();
//		createlistingpage.keyFactors(kmDriver);
//		createlistingpage.transperancyFactors();
//		createlistingpage.pricing(sellingPrice);
//		createlistingpage.uploadPicture();
//		createlistingpage.normalListing();
//		createlistingpage.certificationToolQA();
//		createlistingpage.activateListingQA();
//	}
//	
//	@Test(priority = 9)
//	public void createNormalListingAsLoggedInUser9() throws Exception
//	{
//		String username = eu.readData("CreateListingSheet", 1, 1);
//		String password = eu.readData("CreateListingSheet", 1, 2);
//		String kmDriver = eu.readData("CreateListingSheet", 21, 3);
//		String sellingPrice = eu.readData("CreateListingSheet", 21, 4);
//		CreateListingPage createlistingpage=new CreateListingPage();
//		createlistingpage.createYourListing(username, password);
//		createlistingpage.basicFacts();
//		createlistingpage.keyFactors(kmDriver);
//		createlistingpage.transperancyFactors();
//		createlistingpage.pricing(sellingPrice);
//		createlistingpage.uploadPicture();
//		createlistingpage.normalListing();
//		createlistingpage.certificationToolQA();
//		createlistingpage.activateListingQA();
//	}
//	
//	@Test(priority = 10)
//	public void createNormalListingAsLoggedInUser10() throws Exception
//	{
//		String username = eu.readData("CreateListingSheet", 1, 1);
//		String password = eu.readData("CreateListingSheet", 1, 2);
//		String kmDriver = eu.readData("CreateListingSheet", 22, 3);
//		String sellingPrice = eu.readData("CreateListingSheet", 22, 4);
//		CreateListingPage createlistingpage=new CreateListingPage();
//		createlistingpage.createYourListing(username, password);
//		createlistingpage.basicFacts();
//		createlistingpage.keyFactors(kmDriver);
//		createlistingpage.transperancyFactors();
//		createlistingpage.pricing(sellingPrice);
//		createlistingpage.uploadPicture();
//		createlistingpage.normalListing();
//		createlistingpage.certificationToolQA();
//		createlistingpage.activateListingQA();
//	}

	
//	@Test(priority = 2)
//	public void createPremiumListingAsLoggedInUser() throws Exception
//	{
//		String username = eu.readData("CreateListingSheet", 1, 1);
//		String password = eu.readData("CreateListingSheet", 1, 2);
//		CreateListingPage createlistingpage=new CreateListingPage();
//		createlistingpage.createYourListing(username, password);
//		createlistingpage.keyInformation();
//		createlistingpage.pricing();
//		createlistingpage.uploadPicture();
//		createlistingpage.premiumListing();
//		createlistingpage.certificationTool();
//		createlistingpage.activateListing();
//	}
//	
//	@Test(priority = 3)
//	public void createConciergeListingAsLoggedInUser() throws Exception
//	{
//		String username = eu.readData("CreateListingSheet", 1, 1);
//		String password = eu.readData("CreateListingSheet", 1, 2);
//		CreateListingPage createlistingpage=new CreateListingPage();
//		createlistingpage.createYourListing(username, password);
//		createlistingpage.keyInformation();
//		createlistingpage.pricing();
//		createlistingpage.uploadPicture();
//		createlistingpage.conciergeListing();
//		createlistingpage.certificationTool();
//		createlistingpage.activateListing();
//	}

}
