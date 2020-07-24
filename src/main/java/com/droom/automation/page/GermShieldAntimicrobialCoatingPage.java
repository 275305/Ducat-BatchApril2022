package com.droom.automation.page;

import org.openqa.selenium.By;

import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.lib.SeleniumWrapper;

public class GermShieldAntimicrobialCoatingPage extends SeleniumWrapper
{
	private static final By Click_On_HatchBack_View_Details= By.xpath("//div[@id='carType']//p[text()='Hatchback']/following-sibling::span[text()='View Details']");
	private static final By Click_On_Buy_Now= By.xpath("//button[contains(text(),' Buy Now')]");
	private static final By Enter_Pincode= By.xpath("//input[@id='automobile-pincode']");
	private static final By Click_On_Buy_Now_After_Pin= By.xpath("//button[@id='auto-gs-submit']");
	private static final By Click_On_Checkout_Popup= By.xpath("//a[text()='Checkout Now']");
	private static final By Click_Button_Not_Intrested= By.xpath("//button[text()='I Am Not Interested']"); 
	private static final By Click_On_My_Account=By.xpath("(//a[text()='My Account'])[2]");
	private static final By Page_Title=By.xpath("//li[contains(text(),'  Germ Shield')]");
//	private static final By Click_On_My_Account=By.xpath("");
//	private static final By Click_On_My_Account=By.xpath("");
	
	
	LoginPage loginpage;
	HomePage homepage;
	PaymentPage paymentpage;
	String filepath;
	ExcelUtilities eu;
	
	public  GermShieldAntimicrobialCoatingPage()
	{
		loginpage=new LoginPage();
		homepage=new HomePage();
		paymentpage=new PaymentPage();
		this.filepath="C:/Users/Honey/Desktop/DroomAutomation TestData.xlsx";
		this.eu=new ExcelUtilities(filepath);
	}
	
	
	public void germShieldAntimicrobialCoatingValidation()
	{
		String username = eu.readData("GermShieldSheet", 1, 1);
		String password = eu.readData("GermShieldSheet", 1, 2);
		loginpage.enterLoginPage();
		loginpage.loginValidationForIndividualAccount(username,password);
		verifyByText(Click_On_My_Account, "My Account");                        //verify Home Page
		loginpage.goToHome();
		homepage.enterGermShieldAntimicrobialCoating();                         //verify germ Shield Popup
		waitForPageLoad();
		verifyByContains(Page_Title, "Germ Shield");                            //verify Germ Shield Page
		executeScrollDownScript(500);
		//verifyByText(by, text);
		executeClickOnElement(Click_On_HatchBack_View_Details);
		sleep(2000);
		executeClickOnElement(Click_On_Buy_Now);
		enterTextboxDetails(findElement(Enter_Pincode), "110005");
		executeClickOnElement(Click_On_Buy_Now_After_Pin);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
		executeClickOnElement(Click_Button_Not_Intrested);
		
	}
	

}
