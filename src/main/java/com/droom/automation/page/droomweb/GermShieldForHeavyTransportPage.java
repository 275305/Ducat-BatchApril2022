package com.droom.automation.page.droomweb;

import java.text.MessageFormat;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;

public class GermShieldForHeavyTransportPage extends SeleniumWrapper
{
	private static final By Click_On_My_Account=By.xpath("(//a[text()='My Account'])[2]");
	private static final By Page_Title=By.xpath("//li[contains(text(),'  Germ Shield')]");
	
	private static final By Click_For_Heavy_Transport=By.xpath("//label[text()='Heavy Transport']");
	
	//webelements for view details
	private static final By Click_View_Details_For_Plane=By.xpath("//div[@id='heavyTransportFacility']//p[text()='Germ Shield For Plane']/following-sibling::span[text()='View Details']");
	private static final By Click_View_Details_For_Helicopter=By.xpath("//div[@id='heavyTransportFacility']//p[text()='Germ Shield For Helicopter']/following-sibling::span[text()='View Details']");	
	private static final By Click_View_Details_For_Train=By.xpath("//div[@id='heavyTransportFacility']//p[text()='Germ Shield For Train']/following-sibling::span[text()='View Details']");
	private static final By Click_On_Buy_Now_PopUp=By.xpath("//button[@id='listing-detail-buy-now']");
	
	//webelements to enter details
	private static final By Enter_Area=By.cssSelector("input[id='heavy-transport-builtup']");
	private static final By Enter_Address=By.cssSelector("input[id='heavy-transport-address']");
	private static final By Enter_Pin=By.cssSelector("input[id='heavy-transport-pincode']");
	private static final By Enter_Date=By.cssSelector("input[id='heavy-transport-date']");
	private static final By Click_On_Buy_Now=By.xpath("//button[@id='heavy-transport-gs-book']");
	private static final By Click_On_Checkout_Popup= By.xpath("//a[text()='Checkout Now']");
	
	//webelements for verify amount
	private static final By Verify_Amount_Added_For_Plane_At_Checkout=By.xpath("//strong[text()='₹  4,500']");
	private static final By Verify_Amount_Added_For_Helicopter=By.xpath("//span[text()='₹4500']");
	private static final By Verify_Amount_Added_For_Helicopter_At_Checkout=By.xpath("//strong[text()='₹  4,500']");
	private static final By Verify_Amount_Added_For_Train=By.xpath("//span[text()='₹4500']");
	private static final By Verify_Amount_Added_For_Train_At_Checkout=By.xpath("//strong[text()='₹  4,500']");
	
	private static final By Click_Button_Not_Intrested= By.xpath("//button[text()='I Am Not Interested']");
	
	
	LoginPage loginpage;
	HomePage homepage;
	PaymentPage paymentpage;
	GermShieldForHomePage homegermshield;
	
	
	public  GermShieldForHeavyTransportPage()
	{
		loginpage=new LoginPage();
		homepage=new HomePage();
		paymentpage=new PaymentPage();
		homegermshield=new GermShieldForHomePage();
	}
	
	public void germShieldValidationForHeavyTransportAsPlane(String username,String password,String area,String address,String pincode)
	{
		homegermshield.getGermShieldPage(username, password);
		verifyByContains(Click_For_Heavy_Transport, "Heavy Transport");
		executeClickOnElement(Click_For_Heavy_Transport);
		sleep(2000);
		verifyByContains(Click_View_Details_For_Plane, "View Details");
		executeClickOnElement(Click_View_Details_For_Plane);
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Area), area);
		verifyByAttribute(Enter_Area,area );
		// IMMEDIATE CHANGE IN AMOUNT AT SUBMIT BUTTON
		sleep(2000);
		String intamt = calculatedAmountForGermShield(area);
		String actualAmt="₹"+intamt;
		By Verify_Amount_Added_For_Plane = By.xpath("//span[text()='₹"+intamt+"']");
    	verifyByContains(Verify_Amount_Added_For_Plane, actualAmt);
		enterTextboxDetails(findElement(Enter_Address), address);
		verifyByAttribute(Enter_Address,address );
		enterTextboxDetails(findElement(Enter_Pin), pincode);
		verifyByAttribute(Enter_Pin,pincode );
		executeClickOnElement(Enter_Date);
		executeClickOnElement(Click_On_Buy_Now);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		verifyByContains(Verify_Amount_Added_For_Plane_At_Checkout, addingCommaToInt(intamt));
		paymentpage.proceedToCheckout();
    	paymentpage.paymentViaNetBanking();
		
	}
	
	public void germShieldValidationForHeavyTransportAsHelicopter(String username,String password,String area,String address,String pincode)
	{
		homegermshield.getGermShieldPage(username, password);
		verifyByContains(Click_For_Heavy_Transport, "Heavy Transport");
		executeClickOnElement(Click_For_Heavy_Transport);
		sleep(2000);
		verifyByContains(Click_View_Details_For_Helicopter, "View Details");
		executeClickOnElement(Click_View_Details_For_Helicopter);
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Area), area);
		verifyByAttribute(Enter_Area,area );
		// IMMEDIATE CHANGE IN AMOUNT AT SUBMIT BUTTON
		sleep(2000);
		String intamt = calculatedAmountForGermShield(area);
		String actualAmt="₹"+intamt;
		By Verify_Amount_Added_For_Helicopter = By.xpath("//span[text()='₹"+intamt+"']");
    	verifyByContains(Verify_Amount_Added_For_Helicopter, actualAmt);
		enterTextboxDetails(findElement(Enter_Address), address);
		verifyByAttribute(Enter_Address,address );
		enterTextboxDetails(findElement(Enter_Pin), pincode);
		verifyByAttribute(Enter_Pin,pincode );
		executeClickOnElement(Enter_Date);
		executeClickOnElement(Click_On_Buy_Now);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		verifyByContains(Verify_Amount_Added_For_Helicopter_At_Checkout, "4,500");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
		
	}
	
	public void germShieldValidationForHeavyTransportAsTrain(String username,String password,String area,String address,String pincode)
	{
		homegermshield.getGermShieldPage(username, password);
		verifyByContains(Click_For_Heavy_Transport, "Heavy Transport");
		executeClickOnElement(Click_For_Heavy_Transport);
		sleep(2000);
		verifyByContains(Click_View_Details_For_Train, "View Details");
		executeClickOnElement(Click_View_Details_For_Train);
		sleep(3000);
		verifyByContains(Click_On_Buy_Now_PopUp, "Buy Now");
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Area), area);
		verifyByAttribute(Enter_Area,area );
		// IMMEDIATE CHANGE IN AMOUNT AT SUBMIT BUTTON
		sleep(2000);
		String intamt = calculatedAmountForGermShield(area);
		String actualAmt="₹"+intamt;
		By Verify_Amount_Added_For_Train = By.xpath("//span[text()='₹"+intamt+"']");
    	verifyByContains(Verify_Amount_Added_For_Train, actualAmt);
		enterTextboxDetails(findElement(Enter_Address), address);
		verifyByAttribute(Enter_Address,address );
		enterTextboxDetails(findElement(Enter_Pin), pincode);
		verifyByAttribute(Enter_Pin,pincode );
		executeClickOnElement(Enter_Date);
		executeClickOnElement(Click_On_Buy_Now);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		verifyByContains(Verify_Amount_Added_For_Train_At_Checkout, "4,500");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
		
	}

}
