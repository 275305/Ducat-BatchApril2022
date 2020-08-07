package com.droom.automation.page.droomweb;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;

public class SearchFeaturePage extends SeleniumWrapper
{
	
	private final static By Click_On_Maruti_Vitara=By.xpath("//img[@alt='Maruti Suzuki Wagon R VXi 2016']");
	private final static By Pay_Fully_Refundable_Token_Amount=By.xpath("//button[@id='cart_add']//span");
	private final static By Click_Proceed=By.xpath("//button[@type='button'and@class='btn btn-success proceed']");
	private final static By Proceed_To_Payment=By.xpath("//button[@id='add_listing_services_to_cart']");
	private final static By Click_On_YamahaFZ=By.xpath("(//img[@alt='Honda Activa 110cc 2014'])[1]");
	private final static By Click_On_Scooty=By.xpath("(//img[@alt='Hero Splendor Plus Self Alloy 100cc 2019'])[1]");
	private final static By Click_On_Scooty_Via_Fb=By.xpath("(//img[@alt='Honda CB Hornet 160R  ABS DLX 2020'])[1]");
	private final static By Get_Car_Amount=By.xpath("//span[contains(text(),' 9,310')]");
	private final static By Get_Car_Amount_At_Checkout=By.xpath("//strong[contains(text(),'9,310')]");
	private final static By Get_Bike_Amount=By.xpath("//span[contains(text(),' 5,985')]");
	private final static By Get_Bike_Amount_At_Checkout=By.xpath("//strong[contains(text(),'5,985')]");
	
	private final static By Get_Scooty_Amount=By.xpath("//span[contains(text(),' 1,873')]");
	private final static By Get_Scooty_Amount_At_Checkout=By.xpath("//strong[contains(text(),'1,873')]");
	private final static By Get_Scooty_Amount_Via_Fb=By.xpath("//span[contains(text(),'3,282')]");
	private final static By Get_Scooty_Amount_At_Checkout_Via_Fb=By.xpath("//strong[contains(text(),'₹  3,282')]");
	private final static By Click_On_Home_Delivery=By.xpath("//label[contains(text(),'Home Delivery')]");
	private final static By Click_On_RSA=By.xpath("//label[contains(text(),'RSA')]");
//	private final static By =By.xpath("");
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
		homepage.enterSearchBox("Maruti Suzuki Wagon R VXi 2016");
		waitForPageLoad();
		executeClickOnElement(Click_On_Maruti_Vitara);
		switchToWindow("New Tab");
		waitForPageLoad();
		String initialAmount = WebDriverFactory.getDriver().findElement(Get_Car_Amount).getText();
		executeClickOnElement(Pay_Fully_Refundable_Token_Amount);
		executeClickOnElement(Click_Proceed);
		executeClickOnElement(Proceed_To_Payment);
		waitForPageLoad();
		String finalAmount = WebDriverFactory.getDriver().findElement(Get_Car_Amount_At_Checkout).getText();
		Assert.assertTrue(initialAmount.contains(finalAmount));
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}
	
	
	
	public void searchForBike(String username, String password)
	{
		homepage.enterSearchBox("Honda Activa 110cc 2014");
		waitForPageLoad();
		executeClickOnElement(Click_On_YamahaFZ);
		switchToWindow("New Tab");
		waitForPageLoad();
		String initialAmount = WebDriverFactory.getDriver().findElement(Get_Bike_Amount).getText();
		executeClickOnElement(Pay_Fully_Refundable_Token_Amount);
		executeClickOnElement(Click_Proceed);
		executeClickOnElement(Proceed_To_Payment);
		waitForPageLoad();
		String finalAmount = WebDriverFactory.getDriver().findElement(Get_Bike_Amount_At_Checkout).getText();
		Assert.assertTrue(initialAmount.contains(finalAmount));
		paymentpage.proceedToCheckoutWithoutLoggedIn();
		loginpage.loginAtCheckout(username, password);
		paymentpage.continueToAddressToContinueToPayment();
		paymentpage.paymentViaNetBanking();
	}
	
	public void searchForScooterAsLoggedInUser(String username, String password)
	{
		homepage.enterSearchBox("Hero Splendor Plus Self Alloy 100cc 2019");
		waitForPageLoad();
		executeClickOnElement(Click_On_Scooty);
		switchToWindow("New Tab");
		waitForPageLoad();
		String initialAmount = WebDriverFactory.getDriver().findElement(Get_Scooty_Amount).getText();
		executeClickOnElement(Pay_Fully_Refundable_Token_Amount);
		executeClickOnElement(Click_On_Home_Delivery);
		executeClickOnElement(Proceed_To_Payment);
		waitForPageLoad();
		String finalAmount = WebDriverFactory.getDriver().findElement(Get_Scooty_Amount_At_Checkout).getText();
		Assert.assertTrue(initialAmount.contains(finalAmount));
		paymentpage.proceedToCheckoutWithoutLoggedIn();
		loginpage.loginAtCheckout(username, password);
		paymentpage.continueToAddressToContinueToPayment();
		paymentpage.paymentViaNetBanking();
		
	}
	
	public void searchForScooterAsFBLoggedInUser(String username, String password)
	{
		homepage.enterSearchBox("Honda CB Hornet 160R  ABS DLX 2020");
		waitForPageLoad();
		executeClickOnElement(Click_On_Scooty_Via_Fb);
		switchToWindow("New Tab");
		waitForPageLoad();
		String initialAmount = WebDriverFactory.getDriver().findElement(Get_Scooty_Amount_Via_Fb).getText();
		executeClickOnElement(Pay_Fully_Refundable_Token_Amount);
		executeClickOnElement(Click_On_RSA);
		executeClickOnElement(Proceed_To_Payment);
		waitForPageLoad();
		String finalAmount = WebDriverFactory.getDriver().findElement(Get_Scooty_Amount_At_Checkout_Via_Fb).getText();
		Assert.assertTrue(initialAmount.contains(finalAmount));
		paymentpage.proceedToCheckoutWithoutLoggedIn();
		loginpage.loginViaFacebookAtCheckout();
		sleep(8000);
		paymentpage.continueToAddressToContinueToPayment();
		paymentpage.paymentViaNetBanking();
		
	}

}
