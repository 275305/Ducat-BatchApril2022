package com.droom.automation.page.droomweb;
import org.openqa.selenium.By;

import com.droom.automation.lib.DataBaseDemo;
import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;

public class BuyPage extends SeleniumWrapper
{
	private final static By Select_Vehicle=By.xpath("//label[text()='Vehicles']");
	private final static By Select_City_Delhi=By.xpath("//label[text()='Delhi']");
	private final static By Select_Vehicle_As_Car=By.xpath("//div[@id='cars']//label[contains(text(),'All')]");
	private final static By Select_Body_Type=By.xpath("//label[text()='Suv']");
	private final static By Select_Fuel_Type=By.xpath("//label[text()='Diesel']");
	private final static By Select_Transmission_Type=By.xpath("//label[text()='Manual']");
	private final static By Select_Make_And_Model=By.xpath("//span[@data-toggle='modal']//i");
	private final static By Select_Model=By.xpath("//input[@id='make_bf54fecf8f926be7d84e6ac87950f0b0']");
	private final static By Click_On_Apply=By.xpath("//button[@id='apply_make']");
	private final static By Click_On_View_Listing=By.xpath("//a[@id='vehicles_btn']");
	private final static By Select_Car=By.xpath("//img[@alt='Mahindra Bolero SLX BS IV 2018']");
	private final static By Pay_Fully_Refundable_Token_Amount=By.xpath("//button[text()='Pay Now Refundable Token Amount']");
	private final static By Click_Proceed=By.xpath("//button[@type='button'and@class='btn btn-success proceed']");
	private final static By Proceed_To_Payment=By.xpath("//button[@id='add_listing_services_to_cart']");
	
	//for automobile services webelements
	private final static By Click_For_Automobile_Services=By.xpath("//label[text()='Automobile Services']");
	private final static By Click_For_RTO_Service=By.xpath("//label[text()='RTO Services']");
	private final static By Click_On_Get_Assistance=By.xpath("//a[contains(text(),' Get Assistance')]");
	private final static By Click_Buy_Now=By.xpath("//a[@id='btn-non-luxury-modal']");
	private final static By Click_Send_OTP=By.xpath("//a[@id='otp-send-btn']");
	private final static By Click_Submit_Button=By.xpath("//a[@id='wg-submit']");
	private final static By Click_Car_Care_And_Detailing=By.xpath("//label[text()='Car Care & Detailing']");
	private final static By Click_Automobile_Services_Via_Jumpstart=By.xpath("//label[text()='Jumpstart']");
	private final static By Click_Get_JumpStart_Service=By.xpath("(//a[text()='Get Jumpstart Service'])[1]");
	private final static By Enter_JS_Address=By.xpath("//input[@id='js_address']");
	private final static By Enter_JS_Pincode=By.xpath("//input[@id='js_pincode']");
	private final static By Click_Book_Now=By.xpath("//button[@class='jumpstart_book_now btn btn-jumpstart btn-block btn-primary']");
	private final static By Click_Checkout_Now=By.xpath("//a[text()='Checkout Now']");
	private final static By Enter_For_Search_Model=By.xpath("//input[@id='search_make_model']");
	private final static By Select_Model_As_Hyundai=By.xpath("//label[text()='Hyundai']");
	private final static By Select_Vehicle_New_Tab=By.xpath("(//div[@id='search_results']//img)[1]");
	private final static By Verify_Token_Amount=By.xpath("//button[@id='cart_add']//span");
	private final static By Verify_Token_Amount_Popup=By.xpath("//span[text()='₹20,892']");
	private final static By Select_Car_As_Vehicle_Catogory=By.xpath("//label[text()='Car']");
	private final static By Select_Motorcycle_Bike_As_Vehicle_Catogory=By.xpath("//label[text()='Motorcycle/bike']");
	
	//Webelements for enter detail for popup
	private final static By Enter_Full_Name=By.xpath("//input[@id='wg-full-name']");
	private final static By Enter_Mail_Id=By.xpath("//input[@id='wg-email']");
	private final static By Enter_Mobile_Number=By.xpath("//input[@id='wg-phone']");
//	private final static By =By.xpath("");
//	private final static By =By.xpath("");
	
	
	
	LoginPage loginpage;
	PaymentPage paymentpage;
	HomePage homepage;
	
	
	public BuyPage()
	{
		loginpage=new LoginPage();
		paymentpage=new PaymentPage();
		homepage=new HomePage();
	}
	
	
	public void shoppingForVehiclesAsCoupeCars(String username, String password, String bodytype) throws InterruptedException
	{
		loginpage.goToBuyViaMyAccount(username, password);
		waitForPageLoad();
		executeClickOnElement(Select_Vehicle);
		sleep(3000);
		executeClickOnElement(Select_City_Delhi);
		sleep(3000);
		selectVehicleCategoryAsAllCars();
		sleep(3000);
		selectBodyType(bodytype);
		sleep(3000);
		executeClickOnElement(By.xpath("//label[text()='Petrol']"));
		sleep(3000);
		executeClickOnElement(By.xpath("//label[text()='Manual']"));
		sleep(3000);
//		executeClickOnElement(Select_Make_And_Model);
//		sleep(2000);
//		enterTextboxDetails(findElement(Enter_For_Search_Model), "Hyundai");
//		sleep(2000);
//		executeClickOnElement(Select_Model_As_Hyundai);
//		sleep(2000);
//		executeClickOnElement(Click_On_Apply);
		executeClickOnElement(Click_On_View_Listing);
		waitForPageLoad();
		executeClickOnElement(By.xpath("//img[@alt='Hyundai Creta 1.6 E Petrol 2019']"));
		switchToWindow("New Tab");
		waitForPageLoad();
		verifyByText(Verify_Token_Amount, "Pay Fully Refundable Token Amount - ₹ 20,892");
		executeClickOnElement(Pay_Fully_Refundable_Token_Amount);
		executeClickOnElement(Click_Proceed);
		//verifyByText(Verify_Token_Amount_Popup, "₹20,892");
		//verifyByWebElements(Verify_Token_Amount, Verify_Token_Amount_Popup);
		executeClickOnElement(Proceed_To_Payment);
		System.out.println(WebDriverFactory.getDriver().findElement(By.xpath("//strong[text()='₹  20,892']")).getText());
		verifyByText(By.xpath("//strong[text()='₹  20,892']"), "₹ 20,892");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
		executeClickOnElement(Select_Vehicle_New_Tab);
		switchToWindow("New Tab");
		waitForPageLoad();
		verifyByText(By.xpath("//div[text()='₹28020']"), "₹28020");
		executeClickOnElement(Pay_Fully_Refundable_Token_Amount);
		executeClickOnElement(Click_Proceed);
		executeClickOnElement(Proceed_To_Payment);
		verifyByText(By.xpath("//strong[text()='₹  28,020']"), "₹ 28,020");
		PaymentPage paymentpage=new PaymentPage();
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}
	
	public void selectVehicleCategoryAsAllCars()
	{
		executeClickOnElement(By.xpath("//div[@class='item active']//label[contains(text(),'All')]"));
	}
	public void selectVehicleCategoryAsPremiumCars()
	{
		executeClickOnElement(By.xpath("//i[@class='icon icon-car-premium']"));
	}
	public void selectVehicleCategoryAsVintageCars()
	{
		executeClickOnElement(By.xpath("//i[@class='icon icon-car-vintage']"));
	}
	public void selectVehicleCategoryAsElectricCars()
	{
		executeClickOnElement(By.xpath("//i[@class='icon icon-car-electric']"));
	}
	
	public void selectBodyType(String bodytype)
	{
		executeClickOnElement(By.xpath("//i[@class='icon icon-car-"+bodytype+"']"));
	}
	public void selectAutomobileServices()
	{
		executeClickOnElement(Click_For_Automobile_Services);
		sleep(3000);
	}
	
	
	public void buyAutomobileServicesViaRTO(String username, String password)
	{
		loginpage.goToBuyViaMyAccount(username, password);
		waitForPageLoad();
		selectAutomobileServices();
		executeClickOnElement(Click_For_RTO_Service);
		sleep(3000);
		executeClickOnElement(Select_City_Delhi);
		sleep(3000);
		executeClickOnElement(Click_On_Get_Assistance);
		sleep(3000);
		executeClickOnElement(Click_Buy_Now);
		sleep(3000);
		executeClickOnElement(Click_Send_OTP);
		sleep(2000);
		executeClickOnElement(Click_Submit_Button);
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
		waitForPageLoad();
		verifyByContains(By.xpath("//strong[text()='₹  999']"), "₹ 999");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
		
	}
	
	public void buyAutomobileServicesViaJumpstart(String username, String password)
	{
		loginpage.goToBuyViaMyAccount(username, password);
		waitForPageLoad();
		selectAutomobileServices();
		executeClickOnElement(Click_Automobile_Services_Via_Jumpstart);
		waitForPageLoad();
		executeClickOnElement(Click_Get_JumpStart_Service);
		enterTextboxDetails(findElement(Enter_JS_Address), "gurgaon");
		enterTextboxDetails(findElement(Enter_JS_Pincode), "122015");
		executeClickOnElement(Click_Book_Now);
		sleep(3000);
		executeClickOnElement(Click_Checkout_Now);
		waitForPageLoad();
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
		verifyByContains(By.xpath("//strong[text()='₹  999']"), "₹ 999");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}
	
	public void buyAutomobileServicesViaCarCareAndDetailing(String username, String password)
	{
		loginpage.goToBuyViaMyAccount(username, password);
		waitForPageLoad();
		selectAutomobileServices();
		executeClickOnElement(Click_Car_Care_And_Detailing);
		sleep(3000);
		executeClickOnElement(Click_On_Get_Assistance);
		sleep(3000);
		executeClickOnElement(Click_Buy_Now);
		sleep(3000);
		executeClickOnElement(Click_Send_OTP);
		sleep(2000);
		executeClickOnElement(Click_Submit_Button);
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
		waitForPageLoad();
		verifyByContains(By.xpath("//strong[text()='₹  999']"), "₹ 999");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}

	public void buyAutomobileServicesViaRTOAsLoggedInLater(String username, String password) throws Exception
	{
		loginpage.goToBuyViaMyAccount(username, password);
		waitForPageLoad();
		selectAutomobileServices();
		executeClickOnElement(By.xpath("//label[text()='Road Side Assistance']"));
		sleep(3000);
		executeClickOnElement(Select_City_Delhi);
		sleep(3000);
		executeClickOnElement(By.xpath("//label[text()='Car']"));
		sleep(3000);
		executeClickOnElement(Click_On_Get_Assistance);
		sleep(3000);
		executeClickOnElement(Click_Buy_Now);
		sleep(3000);
		executeClickOnElement(Click_Send_OTP);
		sleep(2000);
		executeClickOnElement(Click_Submit_Button);
		waitForPageLoad();
		verifyByContains(By.xpath("//strong[text()='₹  999']"), "₹ 999");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}
	
	
}
