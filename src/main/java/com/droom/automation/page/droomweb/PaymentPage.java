package com.droom.automation.page.droomweb;
import org.openqa.selenium.By;

import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;

public class PaymentPage extends SeleniumWrapper
{
	private final static By Select_NetBanking_Option=By.xpath("//input[@id='radio1']");
	private final static By Verify_NetBanking=By.xpath("(//label[text()='Net Banking'])[1]");
	//private final static By Continue_Pay_After_Mode_Selected=By.xpath("//button[@class='btn btn-block btn-primary proceed-to-pay']");
	private final static By Verify_Continue_To_Pay=By.xpath("//button[contains(text(),'Continue to Pay')]");
	private final static By Click_Proceed_To_Continue=By.xpath("//a[@id='proceed-to-checkout']");
	private final static By Continue_To_Address=By.xpath("//a[text()='Continue to Addresses']");
	private final static By Continue_To_Payment=By.xpath("//input[@value='Continue to Payment']");
	private final static By Click_On_Use_This_Address=By.xpath("//button[text()='Use This Address']");

	
	public void paymentViaNetBanking()
	{
		waitForPageLoad();
		verifyByText(Verify_NetBanking, "Net Banking");
		executeClickOnElement(Select_NetBanking_Option);
		verifyByContains(Verify_Continue_To_Pay, "Continue to Pay");
		executeClickOnElement(Verify_Continue_To_Pay);
	}
	
	public void continueToAddressToContinueToPayment()
	{
		verifyByText(Continue_To_Address, "Continue To Addresses");
		executeClickOnElement(Continue_To_Address);
		sleep(3000);
		executeClickOnElement(Click_On_Use_This_Address);
		sleep(4000);
		verifyByAttribute(Continue_To_Payment, "Continue to Payment");
		executeClickOnElement(Continue_To_Payment);
	}
	
	public void proceedToCheckout()
	{
		waitForPageLoad();
		verifyByAttributeByID(Click_Proceed_To_Continue, "proceed-to-checkout");
		executeClickOnElement(Click_Proceed_To_Continue);
		waitForPageLoad();
		continueToAddressToContinueToPayment();
    }
	
	public void proceedToCheckoutWithoutLoggedIn()
	{
		waitForPageLoad();
		verifyByAttributeByID(Click_Proceed_To_Continue, "proceed-to-checkout");
		executeClickOnElement(Click_Proceed_To_Continue);
		waitForPageLoad();
	}
	
	public void paymendMethod()
	{
		waitForPageLoad();
		WebDriverFactory.getDriver().switchTo().frame(0);
		executeClickOnElement(By.xpath("//div[text()='ICICI']"));
		sleep(2000);
		executeClickOnElement(By.xpath("//span[@id='footer-cta']"));
		waitForPageLoad();
		executeClickOnElement(By.xpath("//button[text()='Success']"));
		waitForPageLoad();
		
	}
	
}
