package com.droom.automation;

import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.page.CreateListingPage;
import com.droom.automation.page.PaymentPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class CreateListingTest extends AbstractBaseTest
{
	@Test(priority = 1)
	@Description("Validating Listing As Logged In User")
	@Story("Customer LoggedIn And Can Create Listing")
	@Severity(SeverityLevel.CRITICAL)
	public void createNormalListingAsLoggedInUser() throws Exception
	{
		CreateListingPage createlistingpage=new CreateListingPage();
		createlistingpage.createYourListing();
		createlistingpage.keyInformation();
		createlistingpage.pricing();
		createlistingpage.uploadPicture();
		createlistingpage.normalListing();
		createlistingpage.certificationTool();
		createlistingpage.activateListing();
		
	}
	
//	@Test(priority = 2)
//	@Description("Validating Listing As Logged In User")
//	@Story("Customer LoggedIn And Can Create Listing")
//	@Severity(SeverityLevel.CRITICAL)
//	public void createPremiumListingAsLoggedInUser() throws Exception
//	{
//		CreateListingPage createlistingpage=new CreateListingPage();
//		createlistingpage.createYourListing();
//		createlistingpage.keyInformation();
//		createlistingpage.pricing();
//		createlistingpage.uploadPicture();
//		createlistingpage.premiumListing();
//		createlistingpage.certificationTool();
//		createlistingpage.activateListing();
//		PaymentPage paymentpage=new PaymentPage();
//		paymentpage.paymentViaNetBanking();
//	}
//	
//	@Test(priority = 3)
//	@Description("Validating Listing As Logged In User")
//	@Story("Customer LoggedIn And Can Create Listing")
//	@Severity(SeverityLevel.CRITICAL)
//	public void createConciergeListingAsLoggedInUser() throws Exception
//	{
//		CreateListingPage createlistingpage=new CreateListingPage();
//		createlistingpage.createYourListing();
//		createlistingpage.keyInformation();
//		createlistingpage.pricing();
//		createlistingpage.uploadPicture();
//		createlistingpage.conciergeListing();
//		createlistingpage.certificationTool();
//		createlistingpage.activateListing();
//		PaymentPage paymentpage=new PaymentPage();
//		paymentpage.paymentViaNetBanking();
//	}

}
