package com.droom.automation.page.droomweb;

import org.openqa.selenium.By;

import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;

public class GermShieldForHomePage extends SeleniumWrapper
{
	
	private static final By Click_On_My_Account=By.xpath("(//a[text()='My Account'])[2]");
	private static final By Page_Title=By.xpath("//li[contains(text(),'  Germ Shield')]");
	
	private static final By Click_For_Home=By.xpath("//label[text()='Home']");
//	private static final By =By.xpath("");
//	private static final By =By.xpath("");
	
	//webelements for view details
	private static final By Click_View_Details_For_Independent_Home=By.xpath("//div[@id='home']//p[text()='Independent Home']/following-sibling::span[text()='View Details']");
	private static final By Click_View_Details_For_Bungalow=By.xpath("//div[@id='home']//p[text()='Bungalow']/following-sibling::span[text()='View Details']");	
	private static final By Click_View_Details_For_Flat=By.xpath("//div[@id='home']//p[text()='Flat']/following-sibling::span[text()='View Details']");
	private static final By Click_View_Details_For_Villa=By.xpath("//div[@id='home']//p[text()='Villa']/following-sibling::span[text()='View Details']");
	private static final By Click_View_Details_For_Penthouse=By.xpath("//div[@id='home']//p[text()='Penthouse']/following-sibling::span[text()='View Details']");
	private static final By Click_View_Details_For_Farmhouse=By.xpath("//div[@id='home']//p[text()='Farmhouse']/following-sibling::span[text()='View Details']");
	private static final By Click_On_Buy_Now_PopUp=By.xpath("//button[@id='listing-detail-buy-now']");
	
	//webelements to enter details
	private static final By Enter_Area=By.cssSelector("input[id='home-builtup']");
	private static final By Enter_Address=By.xpath("//input[@id='home-address']");
	private static final By Enter_Pin=By.cssSelector("input[id='home-pincode']");
	private static final By Enter_Date=By.cssSelector("input[id='home-date']");
	private static final By Click_On_Buy_Now=By.xpath("//button[@id='home-gs-book']");
	private static final By Click_On_Checkout_Popup= By.xpath("//a[text()='Checkout Now']");
	
	//webelements for verify amount
	private static final By Verify_Amount_Added_For_Independent_Home=By.xpath("//span[text()='₹1500']");
	private static final By Verify_Amount_Added_For_Independent_Home_At_Checkout=By.xpath("//strong[text()='₹  1,500']");
	private static final By Verify_Amount_Added_For_Bungalow=By.xpath("//span[text()='₹1500']");
	private static final By Verify_Amount_Added_For_Bungalow_At_Checkout=By.xpath("//strong[text()='₹  1,500']");
	private static final By Verify_Amount_Added_For_Flat=By.xpath("//span[text()='₹1500']");
	private static final By Verify_Amount_Added_For_Flat_At_Checkout=By.xpath("//strong[text()='₹  1,500']");
	private static final By Verify_Amount_Added_For_Villa=By.xpath("//span[text()='₹1500']");
	private static final By Verify_Amount_Added_For_Villa_At_Checkout=By.xpath("//strong[text()='₹  1,500']");
	
	private static final By Click_Button_Not_Intrested= By.xpath("//button[text()='I Am Not Interested']");
//	private static final By =By.xpath("");
//	private static final By =By.xpath("");
//	private static final By =By.xpath("");
//	private static final By =By.xpath("");
//	private static final By =By.xpath("");
//	private static final By =By.xpath("");
//	private static final By =By.xpath("");
//	private static final By =By.xpath("");
//	private static final By =By.xpath("");
	
	
	LoginPage loginpage;
	HomePage homepage;
	PaymentPage paymentpage;
	String filepath;
	ExcelUtilities eu;
	
	
	public  GermShieldForHomePage()
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
	
	public void germShieldValidationForHomeAsIndependent(String username,String password,String area,String address,String pincode)
	{
		getGermShieldPage(username, password);
		verifyByContains(Click_For_Home, "Home");
		executeClickOnElement(Click_For_Home);
		sleep(2000);
		verifyByContains(Click_View_Details_For_Independent_Home, "View Details");
		executeClickOnElement(Click_View_Details_For_Independent_Home);
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Area), area);
		verifyByAttribute(Enter_Area,area );
		// IMMEDIATE CHANGE IN AMOUNT AT SUBMIT BUTTON
		sleep(2000);
		String a = WebDriverFactory.getDriver().findElement(Verify_Amount_Added_For_Independent_Home).getText();
		System.out.println(a);
    	verifyByContains(Verify_Amount_Added_For_Independent_Home, "₹1500");
		enterTextboxDetails(findElement(Enter_Address), address);
		verifyByAttribute(Enter_Address,address );
		enterTextboxDetails(findElement(Enter_Pin), pincode);
		verifyByAttribute(Enter_Pin,pincode );
		executeClickOnElement(Enter_Date);
		executeClickOnElement(Click_On_Buy_Now);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		verifyByContains(Verify_Amount_Added_For_Independent_Home_At_Checkout, "1,500");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}
	
	public void germShieldValidationForHomeAsBungalow(String username,String password,String area,String address,String pincode)
	{
		getGermShieldPage(username, password);
		verifyByContains(Click_For_Home, "Home");
		executeClickOnElement(Click_For_Home);
		sleep(2000);
		verifyByContains(Click_View_Details_For_Bungalow, "View Details");
		executeClickOnElement(Click_View_Details_For_Bungalow);
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Area), area);
		verifyByAttribute(Enter_Area,area );
		// IMMEDIATE CHANGE IN AMOUNT AT SUBMIT BUTTON
		sleep(2000);
    	verifyByContains(Verify_Amount_Added_For_Bungalow, "₹1500");
		enterTextboxDetails(findElement(Enter_Address), address);
		verifyByAttribute(Enter_Address,address );
		enterTextboxDetails(findElement(Enter_Pin), pincode);
		verifyByAttribute(Enter_Pin,pincode );
		executeClickOnElement(Enter_Date);
		executeClickOnElement(Click_On_Buy_Now);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		verifyByContains(Verify_Amount_Added_For_Bungalow_At_Checkout, "1,500");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}

	public void germShieldValidationForHomeAsFlat(String username,String password,String area,String address,String pincode)
	{
		getGermShieldPage(username, password);
		verifyByContains(Click_For_Home, "Home");
		executeClickOnElement(Click_For_Home);
		sleep(2000);
		verifyByContains(Click_View_Details_For_Flat, "View Details");
		executeClickOnElement(Click_View_Details_For_Flat);
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Area), area);
		verifyByAttribute(Enter_Area,area );
		// IMMEDIATE CHANGE IN AMOUNT AT SUBMIT BUTTON
		sleep(2000);
    	verifyByContains(Verify_Amount_Added_For_Flat, "₹1500");
		enterTextboxDetails(findElement(Enter_Address), address);
		verifyByAttribute(Enter_Address,address );
		enterTextboxDetails(findElement(Enter_Pin), pincode);
		verifyByAttribute(Enter_Pin,pincode );
		executeClickOnElement(Enter_Date);
		executeClickOnElement(Click_On_Buy_Now);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		verifyByContains(Verify_Amount_Added_For_Flat_At_Checkout, "1,500");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}
	
	public void germShieldValidationForHomeAsVilla(String username,String password,String area,String address,String pincode)
	{
		getGermShieldPage(username, password);
		verifyByContains(Click_For_Home, "Home");
		executeClickOnElement(Click_For_Home);
		sleep(2000);
		verifyByContains(Click_View_Details_For_Villa, "View Details");
		executeClickOnElement(Click_View_Details_For_Villa);
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Area), area);
		verifyByAttribute(Enter_Area,area );
		// IMMEDIATE CHANGE IN AMOUNT AT SUBMIT BUTTON
		sleep(2000);
    	verifyByContains(Verify_Amount_Added_For_Villa, "₹1500");
		enterTextboxDetails(findElement(Enter_Address), address);
		verifyByAttribute(Enter_Address,address );
		enterTextboxDetails(findElement(Enter_Pin), pincode);
		verifyByAttribute(Enter_Pin,pincode );
		executeClickOnElement(Enter_Date);
		executeClickOnElement(Click_On_Buy_Now);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		verifyByContains(Verify_Amount_Added_For_Villa_At_Checkout, "1,500");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}
	
	public void germShieldValidationForHomeAsPenthouse(String username,String password,String area,String address,String pincode)
	{
		getGermShieldPage(username, password);
		verifyByContains(Click_For_Home, "Home");
		executeClickOnElement(Click_For_Home);
		sleep(2000);
		verifyByContains(Click_View_Details_For_Penthouse, "View Details");
		executeClickOnElement(Click_View_Details_For_Penthouse);
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Area), area);
		verifyByAttribute(Enter_Area,area );
		// IMMEDIATE CHANGE IN AMOUNT AT SUBMIT BUTTON
		sleep(2000);
		String intamt = calculatedAmountAsPerArea(area);
		String actualAmt="₹"+intamt;
		By Verify_Amount_Added_For_Penthouse = By.xpath("//span[text()='₹"+intamt+"']");
    	verifyByContains(Verify_Amount_Added_For_Penthouse, actualAmt);
		enterTextboxDetails(findElement(Enter_Address), address);
		verifyByAttribute(Enter_Address,address );
		enterTextboxDetails(findElement(Enter_Pin), pincode);
		verifyByAttribute(Enter_Pin,pincode );
		executeClickOnElement(Enter_Date);
		executeClickOnElement(Click_On_Buy_Now);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		String finalAmount = addingCommaToInt(intamt);
		System.out.println(finalAmount);
		By verifyAmountAtCheckout = By.xpath("//strong[text()='₹  "+finalAmount+"']");
		verifyByContains(verifyAmountAtCheckout, finalAmount);
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}
	
	public void germShieldValidationForHomeAsFarmhouse(String username,String password,String area,String address,String pincode)
	{
		getGermShieldPage(username, password);
		verifyByContains(Click_For_Home, "Home");
		executeClickOnElement(Click_For_Home);
		sleep(2000);
		verifyByContains(Click_View_Details_For_Farmhouse, "View Details");
		executeClickOnElement(Click_View_Details_For_Farmhouse);
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Area), area);
		verifyByAttribute(Enter_Area,area );
		// IMMEDIATE CHANGE IN AMOUNT AT SUBMIT BUTTON
		sleep(2000);
		String intamt = calculatedAmountAsPerArea(area);
		String actualAmt="₹"+intamt;
		By Verify_Amount_Added_For_Farmhouse = By.xpath("//span[text()='₹"+intamt+"']");
    	verifyByContains(Verify_Amount_Added_For_Farmhouse, actualAmt);
		enterTextboxDetails(findElement(Enter_Address), address);
		verifyByAttribute(Enter_Address,address );
		enterTextboxDetails(findElement(Enter_Pin), pincode);
		verifyByAttribute(Enter_Pin,pincode );
		executeClickOnElement(Enter_Date);
		executeClickOnElement(Click_On_Buy_Now);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		String finalAmount = addingCommaToInt(intamt);
		By verifyAmountAtCheckout = By.xpath("//strong[text()='₹  "+finalAmount+"']");
		verifyByContains(verifyAmountAtCheckout, finalAmount);
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}
}
