package com.droom.automation.page.droomweb;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;

public class SearchFeaturePage extends SeleniumWrapper
{
	
	private final static By Pay_Fully_Refundable_Token_Amount=By.xpath("//button[text()='Pay Now Refundable Token Amount']");
	private final static By Click_Proceed=By.xpath("//button[@type='button'and@class='btn btn-success proceed']");
	private final static By Proceed_To_Payment=By.xpath("//button[@id='add_listing_services_to_cart']");
	
	private final static By Get_Amount=By.xpath("//button[@id='cart_add']//span");
//	private final static By Get_Amount_At_Checkout=By.xpath("//label[text()='Pay Online']/parent::div/strong[text()='₹  20,250']");
//	private final static By Get_Amount_At_Checkout=By.xpath("//div[@class='payAmount']//strong[text()='₹  19,320']");
	
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
	//	executeClickOnElement(Click_To_Deselect_Used);
		sleep(5000);
		executeClickOnElement(By.xpath("//img[@alt='BMW X3 xDrive 20d Expedition 2015']"));
		switchToWindow("New Tab");
		waitForPageLoad();
		verifyByContains(By.xpath("//div[text()='₹78000']"), "₹78000");
		executeClickOnElement(Pay_Fully_Refundable_Token_Amount);
		executeClickOnElement(Click_Proceed);
		executeClickOnElement(Proceed_To_Payment);
		waitForPageLoad();
		verifyByContains(By.xpath("//label[text()='Pay Online']/parent::div/strong[text()='₹  78,000']"), "₹ 78,000");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}
	
	public void searchForBike(String username, String password)
	{
		loginpage.enterLoginPage();
		loginpage.loginValidationForIndividualAccount(username, password);
		homepage.enterSearchBox("bike");
		waitForPageLoad();
		executeClickOnElement(By.xpath("//img[@alt='Ducati Scrambler 1100 2020']"));
		switchToWindow("New Tab");
		waitForPageLoad();
		verifyByContains(By.xpath("//div[text()='₹41250']"), "₹41250");
		executeClickOnElement(Pay_Fully_Refundable_Token_Amount);
		executeClickOnElement(Click_Proceed);
		executeClickOnElement(Proceed_To_Payment);
		waitForPageLoad();
		verifyByContains(By.xpath("//label[text()='Pay Online']/parent::div/strong[text()='₹  41,250']"), "₹ 41,250");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}
	
	public void searchForScooterAsLoggedInUser(String username, String password)
	{
		homepage.enterSearchBox("Scooty");
		waitForPageLoad();
		executeClickOnElement(By.xpath("(//img[@alt='TVS Scooty Pep+ 90cc 2012'])[1]"));
		switchToWindow("New Tab");
		waitForPageLoad();
		verifyByContains(By.xpath("//div[text()='₹900']"), "₹900");
		executeClickOnElement(Pay_Fully_Refundable_Token_Amount);
		executeClickOnElement(Click_On_Home_Delivery);
		executeClickOnElement(Proceed_To_Payment);
		waitForPageLoad();
		verifyByContains(By.xpath("//div[@class='payAmount']//strong[text()='₹  900']"), "₹ 900");
		paymentpage.proceedToCheckoutWithoutLoggedIn();
		loginpage.loginAtCheckout(username, password);
		paymentpage.continueToAddressToContinueToPayment();
		paymentpage.paymentViaNetBanking();
	}
	
	public void searchForScooterAsFBLoggedInUser()
	{
		homepage.enterSearchBox("Scooty");
		waitForPageLoad();
		executeClickOnElement(By.xpath("(//img[@alt='TVS Scooty Pep+ 90cc 2012'])[1]"));
		switchToWindow("New Tab");
		waitForPageLoad();
		verifyByContains(By.xpath("//div[text()='₹900']"), "₹900");
		executeClickOnElement(Pay_Fully_Refundable_Token_Amount);
		executeClickOnElement(Click_On_Home_Delivery);
		executeClickOnElement(Proceed_To_Payment);
		waitForPageLoad();
		verifyByContains(By.xpath("//div[@class='payAmount']//strong[text()='₹  900']"), "₹ 900");
		paymentpage.proceedToCheckoutWithoutLoggedIn();
		loginpage.loginViaFacebookAtCheckout();
		sleep(5000);
		paymentpage.continueToAddressToContinueToPayment();
		paymentpage.paymentViaNetBanking();
	}

}
