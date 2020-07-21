package com.droom.automation.page;

import org.openqa.selenium.By;

import com.droom.automation.lib.SeleniumWrapper;

public class PaymentPage extends SeleniumWrapper
{
	private final static By Select_NetBanking_Option=By.xpath("//input[@id='radio1']");
	private final static By Continue_Pay_After_Mode_Selected=By.xpath("//button[@class='btn btn-block btn-primary proceed-to-pay']");
	private final static By Click_Proceed_To_Continue=By.xpath("//a[@id='proceed-to-checkout']");
	private final static By Continue_To_Address=By.xpath("//a[text()='Continue to Addresses']");
	private final static By Continue_To_Payment=By.xpath("//input[@value='Continue to Payment']");
	//private final static By =By.xpath("");

	
	public void paymentViaNetBanking()
	{
		executeClickOnElement(Select_NetBanking_Option);
		executeClickOnElement(Select_NetBanking_Option);
		
	}
	
	public void proceedToCheckout()
	{
		waitForPageLoad();
		executeClickOnElement(Click_Proceed_To_Continue);
		sleep(3000);
		executeClickOnElement(Continue_To_Address);
		sleep(3000);
		executeClickOnElement(Continue_To_Payment);
		paymentViaNetBanking();
		
	}
	
}
