package com.droom.automation;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.page.CreateListingPage;
import com.droom.automation.page.PaymentPage;

public class SellFeatureTest extends AbstractBaseTest
{
	@Test
	public void sellFeatureValidation() throws InterruptedException, AWTException
	{
		CreateListingPage sp=new CreateListingPage();
		sp.createYourListing();
		sp.keyInformation();
		sp.pricing();
		sp.uploadPicture();
		sp.premiumListing();
		sp.activateListing();
		PaymentPage paymentpage=new PaymentPage();
		paymentpage.paymentViaNetBanking();
		//paymentpage.proceedToCheckout();
	}

}
