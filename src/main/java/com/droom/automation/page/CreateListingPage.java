package com.droom.automation.page;

import java.awt.AWTException;

import org.openqa.selenium.By;

import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;

public class CreateListingPage extends SeleniumWrapper
{
	private final static By Select_Catogory=By.xpath("//select[@id='wizard_category_id']");
	private final static By Click_Location=By.xpath("//input[@id='location_plugin']");
	private final static By Enter_City=By.xpath("//div[@id='main_header_location']//label/following-sibling::input");
	private final static By Select_City_Name=By.xpath("//li[text()='Delhi'])[3]");
	private final static By Select_Make=By.xpath("//select[@id='make']");
	private final static By Select_Model=By.xpath("//select[@id='model']");
	private final static By Select_Year=By.xpath("//select[@id='year']");
	private final static By Select_Trim=By.xpath("//select[@id='trim']");
	private final static By Click_Create_Listing_Now=By.xpath("//button[@id='old_listing']");
	private final static By Login_To_Continue=By.xpath("//a[text()='Create Listing']");
	private final static By Go_To_Home=By.xpath("//a[text()='Home']");
	private final static By Select_Location=By.xpath("//span[@id='select2-location-container']");
	private final static By Search_Location=By.xpath("//input[@class='select2-search__field']");
	private final static By Select_Registration_Number=By.xpath("//input[@id='vehicle_registration_number']");
	private final static By Select_Registration_State=By.xpath("//span[@id='select2-registration_state-container']");
	private final static By Select_Registartion_Search=By.xpath("//input[@type='search']");
	private final static By Enter_KM_Driven=By.xpath("//input[@id='kilometers_driven']");
	private final static By Continue_After_Key_Information=By.xpath("//input[@id='Key_Information']");
	private final static By Enter_Selling_Price=By.xpath("//input[@id='selling_price']");
	private final static By Click_Save_Continue_After_SellingPrice=By.xpath("//form[@id='frm-price']//input[@value='Save and Continue']");
	private final static By Click_To_Upload=By.xpath("//div[@class='dz-default dz-message']");
	private final static By Continue_After_Upload=By.xpath("//div[@id='photo']//input[@value='Save and Continue']");
	private final static By Click_Get_Later=By.xpath("//button[text()='Maybe Later']");
	private final static By Click_Save_And_Continue_After_Selecting_ListingType=By.xpath("//input[@id='original_submit-button']");
	private final static By Click_For_Premium=By.xpath("//div[text()='₹499/-']");
	private final static By Click_For_Normal=By.xpath("//div[text()='free']");
	private final static By Click_For_Concierge=By.xpath("//div[text()='₹699/-']");
	private final static By Click_Activate_Listing_Button=By.xpath("//input[@id='activate']");
	private final static By Click_Cirtification_Tool_Continue_Button=By.xpath("(//input[@value='Save and Continue'])[6]");
	private final static By Verify_Catogory_Car=By.xpath("//select[@id='wizard_category_id']//option[text()='Car']");
	private final static By Check_Image=By.xpath("//div[@id='photo']//img");
	private final static By Verify_Listing_Save_And_Continue=By.xpath("(//input[@value='Save & Continue'])[1]");

	
	
	
	String filepath;
	ExcelUtilities eu;
	
	public CreateListingPage()
	{
		this.filepath="C:/Users/Honey/Desktop/DroomAutomation TestData.xlsx";
		this.eu=new ExcelUtilities(filepath);
	}
	
	
	public void createYourListing() throws InterruptedException
	{
		String username = eu.readData("CreateListingSheet", 1, 1);
		String password = eu.readData("CreateListingSheet", 1, 2);
		System.out.println(username);
		System.out.println(password);
		LoginPage lp=new LoginPage();
		lp.enterLoginPage();
		lp.loginValidationForIndividualAccount(username, password);
		executeClickOnElement(Go_To_Home);
		sleep(3000);
		HomePage hp=new HomePage();
		hp.enterSellByTopPanel();
		selectOptionByText( Select_Catogory, "Car");
		sleep(2000);
		verifyByText(Verify_Catogory_Car, "Car");
		sleep(3000);
		executeClickOnElement(Click_Location);
		selectCity();
		scrolling("(//li[text()='Delhi'])[3]");
		sleep(2000);
		selectOptionByText(Select_Make,"Audi" );
		verifyByContains(Select_Make, "Audi");
		selectOptionByText(Select_Model,"Q3" );
		verifyByContains(Select_Model, "Q3");
		selectOptionByText(Select_Year, "2020");
		verifyByContains(Select_Year, "2020");
		selectOptionByText(Select_Trim, "30 TFSI PREMIUM");
		verifyByContains(Select_Trim, "30 TFSI PREMIUM");
		executeClickOnElement(Click_Create_Listing_Now);
		sleep(5000);
		verifyByContains(Login_To_Continue, "Create Listing");
		executeClickOnElement(Login_To_Continue);
		sleep(5000);
    }
	
	
	public void keyInformation()
	{
		executeScrollDownScript(700);
		driverClick(Select_Location);
		enterTextboxDetails(findElement(Search_Location), "Allahabad");
		//sleep(1000);
		enterKey(Search_Location);
		verifyByText(Select_Location, "Allahabad");
		String registerNumber = generateRandomNumber();
		enterTextboxDetails(findElement(Select_Registration_Number),registerNumber );
		verifyByAttribute(Select_Registration_Number, registerNumber);
		driverClick(Select_Registration_State);
		enterTextboxDetails(findElement(Select_Registartion_Search), "Delhi");
		sleep(2000);
		enterKey(Select_Registartion_Search);
		sleep(2000);
		//verifyByText(Select_Registration_State, "Delhi");
		enterTextboxDetails(findElement(Enter_KM_Driven), "15000");
		verifyByAttribute(Enter_KM_Driven, "15000");
		executeClickOnElement(Continue_After_Key_Information);
		sleep(5000);
    }
	

	public void pricing()
	{
		sleep(4000);
		enterTextboxDetails(findElement(Enter_Selling_Price), "300000");
		verifyByAttribute(Enter_Selling_Price, "300000");
		executeScrollDownScript(1000);
		executeClickOnElement(Click_Save_Continue_After_SellingPrice);
	}
	
	public void uploadPicture() throws Exception
	{
		//doPageRefresh();
		executeClickOnElement(Click_To_Upload);
		sleep(2000);
		fileUpload("C:\\Users\\Honey\\Desktop\\cycle.png");
		sleep(12000);
		CheckImage(Check_Image);
		//verifyByContains(Continue_After_Upload, "Save and Continue");
		executeClickOnElement(Continue_After_Upload);
		sleep(3000);
		verifyByContains(Click_Get_Later, "Maybe Later");
		executeClickOnElement(Click_Get_Later);
		sleep(8000);
		
	}
	
	public void normalListing()
	{
		verifyByText(Click_For_Normal, "FREE");
		executeClickOnElement(Click_For_Normal);
		sleep(2000);
		verifyByAttribute(Verify_Listing_Save_And_Continue, "Save & Continue");
		executeClickOnElement(Click_Save_And_Continue_After_Selecting_ListingType);
		doPageRefresh();
	}
	
	
	public void premiumListing()
	{
		verifyByText(Click_For_Premium, "₹499/-");
		executeClickOnElement(Click_For_Premium);
		verifyByAttribute(Verify_Listing_Save_And_Continue, "Save & Continue");
		executeClickOnElement(Click_Save_And_Continue_After_Selecting_ListingType);
    }
	
	public void conciergeListing()
	{
		verifyByText(Click_For_Concierge, "₹699/-");
		executeClickOnElement(Click_For_Concierge);
		verifyByAttribute(Verify_Listing_Save_And_Continue, "Save & Continue");
		executeClickOnElement(Click_Save_And_Continue_After_Selecting_ListingType);
	}
	
	public void certificationTool()
	{
		waitForPageLoad();
		executeScrollDownScript(1400);
		executeClickOnElement(Click_Cirtification_Tool_Continue_Button);
	}
	
	public void activateListing()
	{
		waitForPageLoad();
		doPageRefresh();
		executeClickOnElement(Click_Activate_Listing_Button);
	    sleep(5000);
	}
	
}
