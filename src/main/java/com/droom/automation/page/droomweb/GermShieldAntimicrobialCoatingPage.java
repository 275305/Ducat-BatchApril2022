package com.droom.automation.page.droomweb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;

public class GermShieldAntimicrobialCoatingPage extends SeleniumWrapper
{
	private static final By Click_On_HatchBack_View_Details= By.xpath("//div[@id='carType']//p[text()='Hatchback']/following-sibling::span[text()='View Details']");
	//private static final By Click_On_Buy_Now= By.xpath("//button[contains(text(),' Buy Now')]");
	private static final By Enter_Pincode= By.xpath("//input[@id='automobile-pincode']");
	private static final By Click_On_Buy_Now_After_Pin= By.xpath("//button[@id='auto-gs-submit']");
	private static final By Click_On_Checkout_Popup= By.xpath("//a[text()='Checkout Now']");
	private static final By Click_Button_Not_Intrested= By.xpath("//button[text()='I Am Not Interested']"); 
	private static final By Click_On_My_Account=By.xpath("(//a[text()='My Account'])[2]");
	private static final By Page_Title=By.xpath("//li[contains(text(),'  Germ Shield')]");
	
	//for Elevator webelements
	private static final By Click_On_Elevator=By.xpath("//label[text()='Elevator']");
	private static final By Click_On_My_Other_Facility=By.xpath("//label[text()='Other Facility']");
	
	//webelements for view details
	private static final By Click_On_View_Details_For_Small=By.xpath("//div[@id='elevatorType']//p[contains(text(),'Small (4 Person)')]/following-sibling::span[text()='View Details']");
	private static final By Click_On_View_Details_For_Hospital=By.xpath("//div[@id='otherFacility']//p[text()='Hospital']/following-sibling::span[text()='View Details']");
	
	
	private static final By Click_On_Buy_Now_PopUp=By.xpath("//button[@id='listing-detail-buy-now']");
	private static final By Enter_Address=By.cssSelector("input[id='facilities-address']");
	private static final By Enter_Pin=By.cssSelector("input[id='facilities-pincode']");
	private static final By Enter_Date=By.cssSelector("input[id='facilities-date']");
	private static final By Amount_Added_To_Buy=By.xpath("//div[@id='elevatorType']//label[text()='₹ 899']");
	private static final By Final_Amount_To_Pay=By.xpath("(//b[text()=' 899'])[1]");
	private static final By Enter_Area_In_SqrFeet=By.xpath("//input[@id='facilities-builtup']");
	private static final By Amount_Added_For_Hospital=By.xpath("//span[contains(text(),'(₹1500 Incl. GST)')]");
	private static final By Final_Amount_Added_For_Hospital=By.xpath("//strong[text()='₹  1,500']");
	private static final By Click_To_Remove_Discount=By.xpath("//a[text()='Remove Coupon']");
	private static final By Click_To_Accept_Discount=By.xpath("//button[text()='OK']");
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
		verifyByContains(Page_Title, "Germ Shield");                           //verify Germ Shield Page
		executeScrollDownScript(500);
		executeClickOnElement(Click_On_HatchBack_View_Details);
		sleep(2000);
	//	executeClickOnElement(Click_On_Buy_Now);
		enterTextboxDetails(findElement(Enter_Pincode), "110005");
		executeClickOnElement(Click_On_Buy_Now_After_Pin);
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}
	

	public void germShieldForElevator(String username,String password)
	{
		loginpage.enterLoginPage();
		loginpage.loginValidationForIndividualAccount(username,password);
		verifyByText(Click_On_My_Account, "My Account");                        //verify Home Page
		loginpage.goToHome();
		homepage.enterGermShieldAntimicrobialCoating();                         //verify germ Shield Popup
		waitForPageLoad();
		verifyByContains(Page_Title, "Germ Shield");                            //verify Germ Shield Page
		executeScrollDownScript(500);
		executeClickOnElement(Click_On_Elevator);
		executeClickOnElement(Click_On_View_Details_For_Small);
		sleep(3000);
		String initialAmount = WebDriverFactory.getDriver().findElement(Amount_Added_To_Buy).getText();
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(By.cssSelector("input[id='elevator-address']")), "Gurgaon");
		enterTextboxDetails(findElement(By.cssSelector("input[id='elevator-pincode']")), "122018");
		executeClickOnElement(By.cssSelector("input[id='elevator-date']"));
		executeClickOnElement(By.xpath("//button[@id='elevator-gs-submit']"));
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
		String finalAmount = WebDriverFactory.getDriver().findElement(By.xpath("//strong[text()='₹  899']")).getText();
		Assert.assertTrue(initialAmount.contains(finalAmount));
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}
	
	public void germShieldForOtherFacility(String username,String password)
	{
		loginpage.enterLoginPage();
		loginpage.loginValidationForIndividualAccount(username,password);
		verifyByText(Click_On_My_Account, "My Account");                        //verify Home Page
		loginpage.goToHome();
		homepage.enterGermShieldAntimicrobialCoating();                         //verify germ Shield Popup
		waitForPageLoad();
		verifyByContains(Page_Title, "Germ Shield");                            //verify Germ Shield Page
		executeScrollDownScript(500);
		executeClickOnElement(Click_On_My_Other_Facility);
		executeClickOnElement(Click_On_View_Details_For_Hospital);
		sleep(3000);
		executeClickOnElement(Click_On_Buy_Now_PopUp);
		enterTextboxDetails(findElement(Enter_Area_In_SqrFeet), "100");
		enterTextboxDetails(findElement(Enter_Address), "Gurgaon");
		sleep(2000);
		enterTextboxDetails(findElement(Enter_Pin), "110001");
		sleep(2000);
		executeClickOnElement(Enter_Date);
		sleep(2000);
		By bikeAmount = By.xpath("//span[text()='₹1500']");
		verifyByContains(bikeAmount, "₹1500");
		executeClickOnElement(By.xpath("//button[@id='facilities-gs-book']"));
		sleep(2000);
		executeClickOnElement(Click_On_Checkout_Popup);
		waitForPageLoad();
//		executeClickOnElement(Click_To_Remove_Discount);
//		sleep(2000);
//		executeClickOnElement(Click_To_Accept_Discount);
//		sleep(8000);
		verifyByContains(Final_Amount_Added_For_Hospital, "1,500");
		paymentpage.proceedToCheckout();
		paymentpage.paymentViaNetBanking();
	}
}
