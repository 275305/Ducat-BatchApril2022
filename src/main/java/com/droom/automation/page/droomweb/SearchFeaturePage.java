package com.droom.automation.page.droomweb;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;

public class SearchFeaturePage extends SeleniumWrapper
{
	
	private final static By Pay_Fully_Refundable_Token_Amount=By.xpath("//button[@id='cart_add']//span");
	private final static By Click_Proceed=By.xpath("//button[@type='button'and@class='btn btn-success proceed']");
	private final static By Proceed_To_Payment=By.xpath("//button[@id='add_listing_services_to_cart']");
	
	private final static By Get_Amount=By.xpath("//button[@id='cart_add']//span");
	private final static By Get_Amount_At_Checkout=By.xpath("//label[text()='Pay Online']/parent::div/strong[text()='₹  20,250']");
	
	private final static By Click_On_Home_Delivery=By.xpath("//label[contains(text(),'Home Delivery')]");
	private final static By Click_On_RSA=By.xpath("//label[contains(text(),'RSA')]");
	private final static By Click_To_Deselect_Used=By.xpath("//label[contains(text(),' Used')]/preceding-sibling::input");
//	private final static By =By.xpath("");
	
	
	
	LoginPage loginpage;
	HomePage homepage;
	PaymentPage paymentpage;
	
	
	
	public SearchFeaturePage()
	{
		loginpage=new LoginPage();
		homepage=new HomePage();
		paymentpage=new PaymentPage();
	}
	
	
	public void searchForVehicle(String username, String password)
	{
		loginpage.enterLoginPage();
		loginpage.loginValidationForIndividualAccount(username, password);
		homepage.enterSearchBox("Car");
		waitForPageLoad();
		executeClickOnElement(Click_To_Deselect_Used);
		sleep(5000);
		executeClickOnElement(By.xpath("(//img[@alt='Ford Figo Trend 1.5L TDCi 2019'])[1]"));
		switchToWindow("New Tab");
		waitForPageLoad();
		String initialAmount = WebDriverFactory.getDriver().findElement(Get_Amount).getText();
		executeClickOnElement(Pay_Fully_Refundable_Token_Amount);
		executeClickOnElement(Click_Proceed);
		executeClickOnElement(Proceed_To_Payment);
		waitForPageLoad();
		String finalAmount = WebDriverFactory.getDriver().findElement(By.xpath("//label[text()='Pay Online']/parent::div/strong[text()='₹  15,696']")).getText();
		Assert.assertTrue(initialAmount.contains(finalAmount));
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}
	
	
	
	public void searchForBike(String username, String password)
	{
		loginpage.enterLoginPage();
		loginpage.loginValidationForIndividualAccount(username, password);
		homepage.enterSearchBox("bike");
		waitForPageLoad();
		executeClickOnElement(By.xpath("(//img[@alt='Hero HF Deluxe Eco 100cc 2019'])[1]"));
		switchToWindow("New Tab");
		waitForPageLoad();
		String initialAmount = WebDriverFactory.getDriver().findElement(Get_Amount).getText();
		executeClickOnElement(Pay_Fully_Refundable_Token_Amount);
		executeClickOnElement(Click_Proceed);
		executeClickOnElement(Proceed_To_Payment);
		waitForPageLoad();
		String finalAmount = WebDriverFactory.getDriver().findElement(By.xpath("//label[text()='Pay Online']/parent::div/strong[text()='₹  1,665']")).getText();
		System.out.println(initialAmount);
		System.out.println(finalAmount);
		Assert.assertTrue(initialAmount.contains(finalAmount));
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}
	
	public void searchForScooterAsLoggedInUser(String username, String password)
	{
		homepage.enterSearchBox("Scooty");
		waitForPageLoad();
		executeClickOnElement(By.xpath("(//img[@alt='Ved Motors Scoopy 60V Standard 2019'])[1]"));
		switchToWindow("New Tab");
		waitForPageLoad();
		String initialAmount = WebDriverFactory.getDriver().findElement(Get_Amount).getText();
		executeClickOnElement(Pay_Fully_Refundable_Token_Amount);
		executeClickOnElement(Click_On_Home_Delivery);
		executeClickOnElement(Proceed_To_Payment);
		waitForPageLoad();
		String finalAmount = WebDriverFactory.getDriver().findElement(By.xpath("//div[@class='payAmount']//strong[text()='₹  1,820']")).getText();
		Assert.assertTrue(initialAmount.contains(finalAmount));
		paymentpage.proceedToCheckoutWithoutLoggedIn();
		loginpage.loginAtCheckout(username, password);
		paymentpage.continueToAddressToContinueToPayment();
		paymentpage.paymentViaNetBanking();
	}
	
	public void searchForScooterAsFBLoggedInUser()
	{
		homepage.enterSearchBox("Scooty");
		waitForPageLoad();
		executeClickOnElement(By.xpath("(//img[@alt='Ved Motors Scoopy 60V Standard 2019'])[1]"));
		switchToWindow("New Tab");
		waitForPageLoad();
		String initialAmount = WebDriverFactory.getDriver().findElement(Get_Amount).getText();
		executeClickOnElement(Pay_Fully_Refundable_Token_Amount);
		executeClickOnElement(Click_On_Home_Delivery);
		executeClickOnElement(Proceed_To_Payment);
		waitForPageLoad();
		String finalAmount = WebDriverFactory.getDriver().findElement(By.xpath("//div[@class='payAmount']//strong[text()='₹  1,820']")).getText();
		Assert.assertTrue(initialAmount.contains(finalAmount));
		paymentpage.proceedToCheckoutWithoutLoggedIn();
		loginpage.loginViaFacebookAtCheckout();
		sleep(8000);
		paymentpage.continueToAddressToContinueToPayment();
		paymentpage.paymentViaNetBanking();
	}

}
