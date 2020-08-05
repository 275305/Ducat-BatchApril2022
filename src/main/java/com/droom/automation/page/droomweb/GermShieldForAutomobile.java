package com.droom.automation.page.droomweb;

import org.openqa.selenium.By;

import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;

public class GermShieldForAutomobile extends SeleniumWrapper
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
	
	//webelements for amount displayed
	private static final By Amount_For_Hatchback=By.xpath("//label[text()='₹ 1179']");
	private static final By Amount_For_Sedan=By.xpath("//label[text()='₹ 1651']");
	private static final By Amount_For_SUV_Luxury=By.xpath("//li[@id='carFirstListing']//label[text()='₹ 2123']");
	private static final By Amount_For_Bike=By.xpath("//label[text()='₹ 589']");
	private static final By Amount_For_Scooter=By.xpath("//label[text()='₹ 599']");
	private static final By Amount_For_Premium_Bike=By.xpath("//label[text()='₹ 1099']");
	private static final By Amount_For_Bus=By.xpath("//label[text()='₹ 6699']");
	//private static final By =By.xpath("");
	
	//webelements for view details
	private static final By Click_View_Details_For_Hatchback=By.xpath("//li[@id='carFirstListing']//p[text()='Hatchback']/following-sibling::span[text()='View Details']");
	private static final By Click_View_Details_For_Sedan=By.xpath("//li[@id='carFirstListing']//p[text()='Sedan']/following-sibling::span[text()='View Details']");
	private static final By Click_On_Buy_Now_PopUp=By.xpath("//button[@id='listing-detail-buy-now']");
	private static final By Click_View_Details_For_Bike=By.xpath("//div[@id='bikeType']//p[text()='Bike']/following-sibling::span[text()='View Details']");
	private static final By Click_View_Details_For_Scooter=By.xpath("//div[@id='scooterType']//p[text()='Scooter']/following-sibling::span[text()='View Details']");
	private static final By Click_View_Details_For_Premium_Bike=By.xpath("//div[@id='premiumBikeType']//p[text()='Super Bike']/following-sibling::span[text()='View Details']");
	private static final By Click_View_Details_For_Bus=By.xpath("//div[@id='busAmbulaceType']//p[text()='Bus']/following-sibling::span[text()='View Details']");
//	private static final By =By.xpath("");
	
	
	private static final By Enter_Pincode= By.xpath("//input[@id='automobile-pincode']");
	private static final By Click_On_Buy_Now_After_Pin= By.xpath("//button[@id='auto-gs-submit']");
	private static final By Click_On_Checkout_Popup= By.xpath("//a[text()='Checkout Now']");
	private static final By Verify_Amount_Added_For_HatchBack=By.xpath("//span[contains(text(),'(₹1179 Incl. GST)')]");
	private static final By Verify_Amount_Added_For_HatchBack_At_Checkout=By.xpath("//strong[text()='₹  1,179']");
	private static final By Verify_Amount_Added_For_Sedan=By.xpath("//span[contains(text(),'(₹1651 Incl. GST)')]");
	private static final By Verify_Amount_Added_For_Sedan_At_Checkout=By.xpath("//strong[text()='₹  1,651']");
	private static final By Click_Button_Not_Intrested= By.xpath("//button[text()='I Am Not Interested']");
	private static final By Verify_Amount_Added_For_Bike=By.xpath("//span[contains(text(),'(₹589 Incl. GST)')]");
	private static final By Verify_Amount_Added_For_Scooter=By.xpath("//span[contains(text(),'(₹599 Incl. GST)')]");
	private static final By Verify_Amount_Added_For_Bike_At_Checkout=By.xpath("//strong[text()='₹  589']");
	private static final By Verify_Amount_Added_For_Scooter_At_Checkout=By.xpath("//strong[text()='₹  599']");
//	private static final By =By.xpath("");
//	private static final By =By.xpath("");
	
	
	
	LoginPage loginpage;
	HomePage homepage;
	PaymentPage paymentpage;
	String filepath;
	ExcelUtilities eu;
	
	
	public  GermShieldForAutomobile()
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
	
	public void germShieldValidationForCarAsHatchback(String username,String password)
	{
		getGermShieldPage(username, password);
		verifyByContains(Click_For_Automobile, "Automobile");
		executeClickOnElement(Click_For_Automobile);
		verifyByContains(Click_For_Car, "Car");
		executeClickOnElement(Click_For_Car);
		verifyByContains(Amount_For_Hatchback, "₹ 1179");
		verifyByContains(Click_View_Details_For_Hatchback, "View Details");
		executeClickOnElement(Click_View_Details_For_Hatchback);
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Pincode), "110005");
		verifyByContains(Verify_Amount_Added_For_HatchBack, "(₹1179 Incl. GST)");
		executeClickOnElement(Click_On_Buy_Now_After_Pin);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		verifyByContains(Verify_Amount_Added_For_HatchBack_At_Checkout, "1,179");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
		executeClickOnElement(Click_Button_Not_Intrested);
		
	}
	
	public void germShieldValidationForCarAsSedan(String username,String password)
	{
		getGermShieldPage(username, password);
		verifyByContains(Click_For_Automobile, "Automobile");
		executeClickOnElement(Click_For_Automobile);
		verifyByContains(Click_For_Car, "Car");
		executeClickOnElement(Click_For_Car);
		verifyByContains(Amount_For_Sedan, "₹ 1651");
		verifyByContains(Click_View_Details_For_Sedan, "View Details");
		executeClickOnElement(Click_View_Details_For_Sedan);
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Pincode), "110005");
		verifyByContains(Verify_Amount_Added_For_Sedan, "(₹1651 Incl. GST)");
		executeClickOnElement(Click_On_Buy_Now_After_Pin);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		verifyByContains(Verify_Amount_Added_For_Sedan_At_Checkout, "1,651");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
		executeClickOnElement(Click_Button_Not_Intrested);
		
	}
	
	public void germShieldValidationForBike(String username,String password)
	{
		getGermShieldPage(username, password);
		verifyByContains(Click_For_Automobile, "Automobile");
		executeClickOnElement(Click_For_Automobile);
		verifyByContains(Click_For_Bike, "Bike");
		executeClickOnElement(Click_For_Bike);
		verifyByContains(Amount_For_Bike, "₹ 589");
		verifyByContains(Click_View_Details_For_Bike, "View Details");
		executeClickOnElement(Click_View_Details_For_Bike);
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Pincode), "110005");
		verifyByContains(Verify_Amount_Added_For_Bike, "(₹589 Incl. GST)");
		executeClickOnElement(Click_On_Buy_Now_After_Pin);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		verifyByContains(Verify_Amount_Added_For_Bike_At_Checkout, "589");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
		executeClickOnElement(Click_Button_Not_Intrested);
		
	}
	
	public void germShieldValidationForScooter(String username,String password)
	{
		getGermShieldPage(username, password);
		verifyByContains(Click_For_Automobile, "Automobile");
		executeClickOnElement(Click_For_Automobile);
		verifyByContains(Click_For_Scooter, "Scooter");
		executeClickOnElement(Click_For_Scooter);
		verifyByContains(Amount_For_Scooter, "₹ 599");
		verifyByContains(Click_View_Details_For_Scooter, "View Details");
		executeClickOnElement(Click_View_Details_For_Scooter);
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Pincode), "110005");
		verifyByContains(Verify_Amount_Added_For_Scooter, "(₹599 Incl. GST)");
		executeClickOnElement(Click_On_Buy_Now_After_Pin);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		verifyByContains(Verify_Amount_Added_For_Scooter_At_Checkout, "599");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
		executeClickOnElement(Click_Button_Not_Intrested);
		
	}
	
	public void germShieldValidationForPremiumBike(String username,String password)
	{
		getGermShieldPage(username, password);
		verifyByContains(Click_For_Automobile, "Automobile");
		executeClickOnElement(Click_For_Automobile);
		verifyByContains(Click_For_Premium_Bike, "Premium Bike");
		executeClickOnElement(Click_For_Premium_Bike);
		verifyByContains(Amount_For_Premium_Bike, "₹ 1099");
		verifyByContains(Click_View_Details_For_Premium_Bike, "View Details");
		executeClickOnElement(Click_View_Details_For_Premium_Bike);
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Pincode), "110005");
		By bikeAmount = By.xpath("//span[text()='₹1099']");
		verifyByContains(bikeAmount, "₹1099");
		executeClickOnElement(Click_On_Buy_Now_After_Pin);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		By bikeAmount2 = By.xpath("//strong[text()='₹  1,099']");
		verifyByContains(bikeAmount2, "1,099");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
		executeClickOnElement(Click_Button_Not_Intrested);
		
	}
	
	public void germShieldValidationForBus(String username,String password)
	{
		getGermShieldPage(username, password);
		verifyByContains(Click_For_Automobile, "Automobile");
		executeClickOnElement(Click_For_Automobile);
		verifyByContains(Click_For_Bus, "Bus/Ambulance");
		executeClickOnElement(Click_For_Bus);
		verifyByContains(Amount_For_Bus, "₹ 6699");
		verifyByContains(Click_View_Details_For_Bus, "View Details");
		executeClickOnElement(Click_View_Details_For_Bus);
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Pincode), "110005");
		By bikeAmount = By.xpath("//span[text()='₹6699']");
		verifyByContains(bikeAmount, "₹6699");
		executeClickOnElement(Click_On_Buy_Now_After_Pin);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		By bikeAmount2 = By.xpath("//strong[text()='₹  6,699']");
		verifyByContains(bikeAmount2, "6,699");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
		executeClickOnElement(Click_Button_Not_Intrested);
		
	}
	
	
	
	
	
	
	
	
}
