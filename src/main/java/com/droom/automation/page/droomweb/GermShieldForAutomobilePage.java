package com.droom.automation.page.droomweb;

import org.openqa.selenium.By;

import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;

public class GermShieldForAutomobilePage extends SeleniumWrapper
{
	private static final By Click_On_My_Account=By.xpath("(//a[text()='My Account'])[2]");
	private static final By Page_Title=By.xpath("//li[contains(text(),'  Germ Shield')]");
	
	//webelements to select the catogory to protect
	private static final By Click_For_Automobile=By.xpath("//label[text()='Automobile']");
	private static final By Click_For_Car=By.xpath("//label[text()='Car']");
	private static final By Click_For_Bike=By.xpath("//label[text()='Bike']");
	private static final By Click_For_Scooter=By.xpath("//label[text()='Scooter']");
	private static final By Click_For_Premium_Bike=By.xpath("//label[text()='Premium Bike']");
	private static final By Click_For_Bus=By.xpath("//label[text()='Bus/Ambulance']");
	private static final By Click_On_Buy_Now_PopUp=By.xpath("//button[@id='listing-detail-buy-now']");
	private static final By Enter_Pincode= By.xpath("//input[@id='automobile-pincode']");
	private static final By Click_On_Buy_Now_After_Pin= By.xpath("//button[@id='auto-gs-submit']");
	private static final By Click_On_Checkout_Popup= By.xpath("//a[text()='Checkout Now']");
	
	
	LoginPage loginpage;
	HomePage homepage;
	PaymentPage paymentpage;
	String filepath;
	ExcelUtilities eu;
	
	
	public  GermShieldForAutomobilePage()
	{
		loginpage=new LoginPage();
		homepage=new HomePage();
		paymentpage=new PaymentPage();
		this.filepath="C:/Users/Honey/Desktop/DroomAutomation TestData.xlsx";
		this.eu=new ExcelUtilities(filepath);
	}

	
	public void getGermShieldPage(String username,String password)
	{
		loginpage.enterLoginPage();
		loginpage.loginValidationForIndividualAccount(username,password);
		verifyByText(Click_On_My_Account, "My Account");                        //verify Home Page
		loginpage.goToHome();
		homepage.enterGermShieldAntimicrobialCoating();                         //verify germ Shield Popup
		waitForPageLoad();
		verifyByContains(Page_Title, "Germ Shield");                            //verify Germ Shield Page
		executeScrollDownScript(500);
	}
	
	public void germShieldValidationForCarAsHatchback(String username,String password,String amount,String pincode)
	{
		getGermShieldPage(username, password);
		verifyByContains(Click_For_Automobile, "Automobile");
		executeClickOnElement(Click_For_Automobile);
		verifyByContains(Click_For_Car, "Car");
		waitForElementTobePresent(Click_For_Car);
		moveToElementAndClick(Click_For_Car);
		verifyByContains(By.xpath("//label[text()='₹ "+amount+"']"), "₹ "+amount+"");
		verifyByContains(By.xpath("//li[@id='carFirstListing']//p[text()='Hatchback']/following-sibling::span[text()='View Details']"), "View Details");
		executeClickOnElement(Click_For_Car);
//		verifyByContains(By.xpath("//label[text()='₹ "+amount+"']"), "₹ "+amount+"");
//		verifyByContains(By.xpath("//li[@id='carFirstListing']//p[text()='Hatchback']/following-sibling::span[text()='View Details']"), "View Details");
		executeClickOnElement(By.xpath("//li[@id='carFirstListing']//p[text()='Hatchback']/following-sibling::span[text()='View Details']"));
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Pincode), pincode);
		By bikeAmount = By.xpath("//div[@id='automobile-section']//span[text()='₹"+amount+"']");
		verifyByContains(bikeAmount, "₹"+amount+"");
		executeClickOnElement(Click_On_Buy_Now_After_Pin);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		verifyByContains(By.xpath("//strong[text()='₹  "+addingCommaToInt(amount)+"']"), addingCommaToInt(amount));
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
		
	}
	
	public void germShieldValidationForCarAsSedan(String username,String password,String amount,String pincode)
	{
		getGermShieldPage(username, password);
		verifyByContains(Click_For_Automobile, "Automobile");
		executeClickOnElement(Click_For_Automobile);
		verifyByContains(Click_For_Car, "Car");
		executeClickOnElement(Click_For_Car);
		sleep(2000);
//		verifyByContains(By.xpath("//label[text()='₹ "+amount+"']"), "₹ "+amount+"");
//		verifyByContains(By.xpath("//li[@id='carFirstListing']//p[text()='Sedan']/following-sibling::span[text()='View Details']"), "View Details");
		executeClickOnElement(By.xpath("//li[@id='carFirstListing']//p[text()='Sedan']/following-sibling::span[text()='View Details']"));
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Pincode), pincode);
		verifyByContains(By.xpath("//span[text()='₹"+amount+"']"), "₹"+amount+"");
		executeClickOnElement(Click_On_Buy_Now_After_Pin);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		verifyByContains(By.xpath("//strong[text()='₹  "+addingCommaToInt(amount)+"']"), addingCommaToInt(amount));
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}
	
	public void germShieldValidationForBike(String username,String password,String amount,String pincode)
	{
		getGermShieldPage(username, password);
		verifyByContains(Click_For_Automobile, "Automobile");
		executeClickOnElement(Click_For_Automobile);
		verifyByContains(Click_For_Bike, "Bike");
		executeClickOnElement(Click_For_Bike);
		sleep(2000);
//		verifyByContains(By.xpath("//label[text()='₹ "+amount+"']"), "");
//		verifyByContains(By.xpath("//div[@id='bikeType']//p[text()='Bike']/following-sibling::span[text()='View Details']"), "");
		executeClickOnElement(By.xpath("//div[@id='bikeType']//p[text()='Bike']/following-sibling::span[text()='View Details']"));
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Pincode), pincode);
		verifyByContains(By.xpath("//span[text()='₹"+amount+"']"), "₹"+amount+"");
		executeClickOnElement(Click_On_Buy_Now_After_Pin);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		verifyByContains(By.xpath("//strong[text()='₹  "+addingCommaToInt(amount)+"']"), addingCommaToInt(amount));
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
		
	}
	
	public void germShieldValidationForScooter(String username,String password,String amount,String pincode)
	{
		getGermShieldPage(username, password);
		verifyByContains(Click_For_Automobile, "Automobile");
		executeClickOnElement(Click_For_Automobile);
		sleep(2000);
		verifyByContains(Click_For_Scooter, "Scooter");
		executeClickOnElement(Click_For_Scooter);
		sleep(2000);
		verifyByContains(By.xpath("//div[@id='scooterType']//label[text()='₹ "+amount+"']"), "₹ "+amount+"");
		verifyByContains(By.xpath("//div[@id='scooterType']//p[text()='Scooter']/following-sibling::span[text()='View Details']"), "View Details");
		executeClickOnElement(By.xpath("//div[@id='scooterType']//p[text()='Scooter']/following-sibling::span[text()='View Details']"));
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Pincode), pincode);
		verifyByContains(By.xpath("//span[text()='₹"+amount+"']"), "₹"+amount+"");
		executeClickOnElement(Click_On_Buy_Now_After_Pin);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		verifyByContains(By.xpath("//strong[text()='₹  "+addingCommaToInt(amount)+"']"), ""+addingCommaToInt(amount)+"");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
		
	}
	
	public void germShieldValidationForPremiumBike(String username,String password,String amount,String pincode)
	{
		getGermShieldPage(username, password);
		verifyByContains(Click_For_Automobile, "Automobile");
		executeClickOnElement(Click_For_Automobile);
		sleep(2000);
		verifyByContains(Click_For_Premium_Bike, "Premium Bike");
		executeClickOnElement(Click_For_Premium_Bike);
		sleep(2000);
		verifyByContains(By.xpath("//label[text()='₹ "+amount+"']"), "₹ "+amount+"");
		verifyByContains(By.xpath("//div[@id='premiumBikeType']//p[text()='Super Bike']/following-sibling::span[text()='View Details']"), "View Details");
		executeClickOnElement(By.xpath("//div[@id='premiumBikeType']//p[text()='Super Bike']/following-sibling::span[text()='View Details']"));
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Pincode), pincode);
		verifyByContains(By.xpath("//span[text()='₹"+amount+"']"), "₹"+amount+"");
		executeClickOnElement(Click_On_Buy_Now_After_Pin);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		verifyByContains(By.xpath("//strong[text()='₹  "+addingCommaToInt(amount)+"']"), addingCommaToInt(amount));
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}
	
	public void germShieldValidationForBus(String username,String password,String amount,String pincode)
	{
		getGermShieldPage(username, password);
		verifyByContains(Click_For_Automobile, "Automobile");
		executeClickOnElement(Click_For_Automobile);
		sleep(3000);
		verifyByContains(Click_For_Bus, "Bus/Ambulance");
		executeClickOnElement(Click_For_Bus);
		verifyByContains(By.xpath("//label[text()='₹ "+amount+"']"), "₹ "+amount+"");
		verifyByContains(By.xpath("//div[@id='busAmbulaceType']//p[text()='Bus']/following-sibling::span[text()='View Details']"), "View Details");
		executeClickOnElement(By.xpath("//div[@id='busAmbulaceType']//p[text()='Bus']/following-sibling::span[text()='View Details']"));
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Pincode), pincode);
		verifyByContains(By.xpath("//span[text()='₹"+amount+"']"), "₹"+amount+"");
		executeClickOnElement(Click_On_Buy_Now_After_Pin);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		verifyByContains(By.xpath("//strong[text()='₹  "+addingCommaToInt(amount)+"']"), addingCommaToInt(amount));
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}
}
