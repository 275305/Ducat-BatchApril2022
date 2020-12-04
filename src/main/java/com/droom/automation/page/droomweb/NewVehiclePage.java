package com.droom.automation.page.droomweb;

import org.openqa.selenium.By;
import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;

public class NewVehiclePage extends SeleniumWrapper
{
	public static final By SelectCategoryAsCar=By.xpath("//div[text()='car']");
	public static final By SelectCategoryAsBike=By.xpath("");
	public static final By SelectForLocationAsDelhi=By.xpath("//div[text()='Delhi']");
	public static final By ClickOnViewListing=By.xpath("//a[text()=' View Listings']");
	
	private final static By Pay_Fully_Refundable_Token_Amount=By.xpath("//button[@id='cart_add']//span");
	private final static By Click_Proceed=By.xpath("//button[@type='button'and@class='btn btn-success proceed']");
	private final static By Proceed_To_Payment=By.xpath("//button[@id='add_listing_services_to_cart']");
	
	private final static By Get_Amount=By.xpath("//button[@id='cart_add']//span");
	
//	public static final By xyz=By.xpath("");
//	public static final By xyz=By.xpath("");
	
	
	PaymentPage paymentpage;
	
	public NewVehiclePage()
	{
		paymentpage=new PaymentPage();
	}
	
	public static void carAsHatchback(String username, String password)
	{
		LoginPage.enterLoginPage();
		LoginPage.loginValidationForIndividualAccount(username, password);
		LoginPage.goToHome();
		scrolling("(//div[@id='position_2_blocks']//div[@class='owl-next']//i)[1]");
		waitForElementTobePresent(By.xpath("//h4[contains(text(),'  New Vehicles')]"));
		verifyByContains(By.xpath("//h4[contains(text(),'  New Vehicles')]"), "New Vehicles");
		executeClickOnElement(By.xpath("//img[@src='https://cdn1.droom.in/photos/images/Marketing/New_vehicle_600x250.jpg']"));
		waitForPageLoad();
		executeClickOnElement(SelectCategoryAsCar);
		sleep(3000);
		executeClickOnElement(SelectForLocationAsDelhi);
		sleep(3000);
		executeClickOnElement(By.xpath("//div[text()='Hatchback']"));
		sleep(3000);
		executeClickOnElement(By.xpath("//div[text()='Petrol']"));
		sleep(3000);
		executeClickOnElement(By.xpath("//div[text()='Manual']"));
		sleep(2000);
		executeClickOnElement(ClickOnViewListing);
//		executeClickOnElement(By.xpath("//img[@alt='Toyota Corolla G AT 2004']"));
//		switchToWindow("New Tab");
//		waitForPageLoad();
//		executeClickOnElement(Get_Amount);
//	//	String initialAmount = WebDriverFactory.getDriver().findElement(Get_Amount).getText();
//		executeClickOnElement(Pay_Fully_Refundable_Token_Amount);
//		executeClickOnElement(Click_Proceed);
//		executeClickOnElement(Proceed_To_Payment);
//		waitForPageLoad();
//	//	String finalAmount = WebDriverFactory.getDriver().findElement(By.xpath("//label[text()='Pay Online']/parent::div/strong[text()='₹  15,696']")).getText();
//	//	Assert.assertTrue(initialAmount.contains(finalAmount));
//		paymentpage.proceedToCheckout();
//		paymentpage.paymentViaNetBanking();
		
	}
	
	public void carAsSedan()
	{
		
	}
	
	
	public void carAsSuv()
	{
		
	}
	

}
