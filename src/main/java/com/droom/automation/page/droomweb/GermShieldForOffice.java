package com.droom.automation.page.droomweb;

import org.openqa.selenium.By;

import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.lib.SeleniumWrapper;

public class GermShieldForOffice extends SeleniumWrapper
{
	private static final By Click_On_My_Account=By.xpath("(//a[text()='My Account'])[2]");
	private static final By Page_Title=By.xpath("//li[contains(text(),'  Germ Shield')]");
	
	private static final By Click_For_Office=By.xpath("//label[text()='Office']");
	
	//webelements for view details
	private static final By Click_View_Details_For_Independent_Building=By.xpath("//div[@id='office']//p[text()='Independent Building']/following-sibling::span[text()='View Details']");
	private static final By Click_View_Details_For_High_Rise_Building=By.xpath("//div[@id='office']//p[text()='High Rise Building']/following-sibling::span[text()='View Details']");	
	private static final By Click_View_Details_For_Co_working_Space=By.xpath("//div[@id='office']//p[text()='Co-working Space']/following-sibling::span[text()='View Details']");
	private static final By Click_On_Buy_Now_PopUp=By.xpath("//button[@id='listing-detail-buy-now']");
	
	//webelements to enter details
	private static final By Enter_Area=By.cssSelector("input[id='office-builtup']");
	private static final By Enter_Address=By.cssSelector("input[id='office-address']");
	private static final By Enter_Pin=By.cssSelector("input[id='office-pincode']");
	private static final By Enter_Date=By.cssSelector("input[id='office-date']");
	private static final By Click_On_Buy_Now=By.xpath("//button[@id='office-gs-book']");
	private static final By Click_On_Checkout_Popup= By.xpath("//a[text()='Checkout Now']");
	
	//webelements for verify amount
	private static final By Verify_Amount_Added_For_Independent_Building=By.xpath("//span[text()='₹3000']");
	private static final By Verify_Amount_Added_For_Independent_Building_At_Checkout=By.xpath("//strong[text()='₹  3,000']");
	private static final By Verify_Amount_Added_For_High_Rise_Building=By.xpath("//span[text()='₹3000']");
	private static final By Verify_Amount_Added_For_High_Rise_Building_At_Checkout=By.xpath("//strong[text()='₹  3,000']");
	private static final By Verify_Amount_Added_For_Co_working_Space=By.xpath("//span[text()='₹3000']");
	private static final By Verify_Amount_Added_For_Co_working_Space_At_Checkout=By.xpath("//strong[text()='₹  3,000']");
	
	private static final By Click_Button_Not_Intrested= By.xpath("//button[text()='I Am Not Interested']");
	
	
	LoginPage loginpage;
	HomePage homepage;
	PaymentPage paymentpage;
	String filepath;
	ExcelUtilities eu;
	GermShieldForHome homegermshield;
	
	
	public  GermShieldForOffice()
	{
		loginpage=new LoginPage();
		homepage=new HomePage();
		paymentpage=new PaymentPage();
		homegermshield=new GermShieldForHome();
		this.filepath="C:/Users/Honey/Desktop/DroomAutomation TestData.xlsx";
		this.eu=new ExcelUtilities(filepath);
	}
	
	
	public void germShieldValidationForHomeAsIndependentBuilding(String username,String password,String area,String address,String pincode)
	{
		homegermshield.getGermShieldPage(username, password);
		verifyByContains(Click_For_Office, "Office");
		executeClickOnElement(Click_For_Office);
		sleep(2000);
		verifyByContains(Click_View_Details_For_Independent_Building, "View Details");
		executeClickOnElement(Click_View_Details_For_Independent_Building);
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Area), area);
		verifyByAttribute(Enter_Area,area );
		// IMMEDIATE CHANGE IN AMOUNT AT SUBMIT BUTTON
		sleep(2000);
    	verifyByContains(Verify_Amount_Added_For_Independent_Building, "₹3000");
		enterTextboxDetails(findElement(Enter_Address), address);
		verifyByAttribute(Enter_Address,address );
		enterTextboxDetails(findElement(Enter_Pin), pincode);
		verifyByAttribute(Enter_Pin,pincode );
		executeClickOnElement(Enter_Date);
		executeClickOnElement(Click_On_Buy_Now);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		verifyByContains(Verify_Amount_Added_For_Independent_Building_At_Checkout, "3,000");
		paymentpage.proceedToCheckout();
//		paymentpage.paymentViaNetBanking();
//		executeClickOnElement(Click_Button_Not_Intrested);
		
	}

	
	public void germShieldValidationForHomeAsHighRiseBuilding(String username,String password,String area,String address,String pincode)
	{
		homegermshield.getGermShieldPage(username, password);
		verifyByContains(Click_For_Office, "Office");
		executeClickOnElement(Click_For_Office);
		sleep(2000);
		verifyByContains(Click_View_Details_For_High_Rise_Building, "View Details");
		executeClickOnElement(Click_View_Details_For_High_Rise_Building);
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Area), area);
		verifyByAttribute(Enter_Area,area );
		// IMMEDIATE CHANGE IN AMOUNT AT SUBMIT BUTTON
		sleep(2000);
    	verifyByContains(Verify_Amount_Added_For_High_Rise_Building, "₹3000");
		enterTextboxDetails(findElement(Enter_Address), address);
		verifyByAttribute(Enter_Address,address );
		enterTextboxDetails(findElement(Enter_Pin), pincode);
		verifyByAttribute(Enter_Pin,pincode );
		executeClickOnElement(Enter_Date);
		executeClickOnElement(Click_On_Buy_Now);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		verifyByContains(Verify_Amount_Added_For_High_Rise_Building_At_Checkout, "3,000");
		paymentpage.proceedToCheckout();
//		paymentpage.paymentViaNetBanking();
//		executeClickOnElement(Click_Button_Not_Intrested);
		
	}
	
	public void germShieldValidationForHomeAsCoWorkingSpace(String username,String password,String area,String address,String pincode)
	{
		homegermshield.getGermShieldPage(username, password);
		verifyByContains(Click_For_Office, "Office");
		executeClickOnElement(Click_For_Office);
		sleep(2000);
		verifyByContains(Click_View_Details_For_Co_working_Space, "View Details");
		executeClickOnElement(Click_View_Details_For_Co_working_Space);
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Area), area);
		verifyByAttribute(Enter_Area,area );
		// IMMEDIATE CHANGE IN AMOUNT AT SUBMIT BUTTON
		sleep(2000);
    	verifyByContains(Verify_Amount_Added_For_Co_working_Space, "₹3000");
		enterTextboxDetails(findElement(Enter_Address), address);
		verifyByAttribute(Enter_Address,address );
		enterTextboxDetails(findElement(Enter_Pin), pincode);
		verifyByAttribute(Enter_Pin,pincode );
		executeClickOnElement(Enter_Date);
		executeClickOnElement(Click_On_Buy_Now);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		verifyByContains(Verify_Amount_Added_For_Co_working_Space_At_Checkout, "3,000");
		paymentpage.proceedToCheckout();
//		paymentpage.paymentViaNetBanking();
//		executeClickOnElement(Click_Button_Not_Intrested);
		
	}
	
}
