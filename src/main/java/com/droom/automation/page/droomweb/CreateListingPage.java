package com.droom.automation.page.droomweb;
import org.openqa.selenium.By;

import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.lib.SeleniumWrapper;

public class CreateListingPage extends SeleniumWrapper
{
	private final static By Select_Catogory=By.xpath("//select[@id='wizard_category_id']");
	private final static By Click_Location=By.xpath("//input[@id='location_plugin']");
	private final static By Enter_City=By.xpath("//div[@id='main_header_location']//label/following-sibling::input");
	private final static By Select_City_Name=By.xpath("//li[text()='Delhi'])[3]");
	private final static By Select_Make=By.xpath("//select[@name='make'and@data-field='make']");
	private final static By Select_Model=By.xpath("//select[@name='model'and@data-field='model']");
	private final static By Select_Year=By.xpath("//select[@name='year'and@data-field='year']");
	private final static By Select_Trim=By.xpath("//select[@name='trim'and@data-field='trim']");
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
	private final static By Click_Save_And_Continue_After_Selecting_ListingType=By.xpath("(//input[@value='Save & Continue'])[1]");
	private final static By Click_For_Premium=By.xpath("//div[text()='₹499/-']");
	private final static By Click_For_Normal=By.xpath("//div[text()='free']");
	private final static By Click_For_Concierge=By.xpath("//div[text()='₹699/-']");
	private final static By Click_Activate_Listing_Button=By.xpath("//input[@id='activate']");
	private final static By Click_Cirtification_Tool_Continue_Button=By.xpath("(//input[@value='Save and Continue'])[6]");
	private final static By Verify_Catogory_Car=By.xpath("//select[@id='wizard_category_id']//option[text()='Car']");
	private final static By Check_Image=By.xpath("//div[@id='photo']//img");
	private final static By Verify_Listing_Save_And_Continue=By.xpath("(//input[@id='regular_submit-button'])[1]");

	LoginPage lp;
	HomePage hp;
	
	public CreateListingPage()
	{
		lp=new LoginPage();
		hp=new HomePage();
	}
	
	public void createYourListing(String username,String password) throws InterruptedException
	{
		lp.enterLoginPage();
		lp.loginValidationForIndividualAccount(username, password);
		demo();
	//	executeClickOnElement(Go_To_Home);
		sleep(3000);
		hp.enterSellByTopPanel();
		selectOptionByText( Select_Catogory, "Car");
		sleep(2000);
		verifyByText(Verify_Catogory_Car, "Car");
		sleep(3000);
		executeClickOnElement(Click_Location);
		selectCity();
		scrolling("(//li[text()='Delhi'])[3]");
		sleep(2000);
		executeClickOnElement(By.xpath("//span[text()='Select From']"));
		selectOptionByText(Select_Make,"Fiat" );
		verifyByContains(Select_Make, "Fiat");
		selectOptionByText(Select_Model,"Punto" );
		verifyByContains(Select_Model, "Punto");
		selectOptionByText(Select_Year, "2014");
		verifyByContains(Select_Year, "2014");
		selectOptionByText(Select_Trim, "ACTIVE 1.2");
		verifyByContains(Select_Trim, "ACTIVE 1.2");
		executeClickOnElement(Click_Create_Listing_Now);
		sleep(5000);
		verifyByContains(Login_To_Continue, "Create Listing");
		executeClickOnElement(Login_To_Continue);
		sleep(5000);
    }
	
	public void basicFacts()
	{
		waitForPageLoad();
		executeClickOnElement(By.xpath("//input[@id='Basic_Facts']"));
		
	}
	
	
	public void keyInformation()
	{
		waitForPageLoad();
		moveToElementAndClick(Select_Location);
		enterTextboxDetails(findElement(Search_Location), "Allahabad");
		enterKey(Search_Location);
		verifyByText(Select_Location, "Allahabad");
		String registerNumber = vehiclesRegistartionRandomNumber();
		enterTextboxDetails(findElement(Select_Registration_Number),registerNumber );
		verifyByAttribute(Select_Registration_Number, registerNumber);
		moveToElementAndClick(Select_Registration_State);
		enterTextboxDetails(findElement(Select_Registartion_Search), "Delhi");
		sleep(2000);
		enterKey(Select_Registartion_Search);
		sleep(2000);
		enterTextboxDetails(findElement(Enter_KM_Driven), "35000");
		verifyByAttribute(Enter_KM_Driven, "35000");
		executeClickOnElement(Continue_After_Key_Information);
		sleep(5000);
    }
	

	public void pricing(String sellingPrice)
	{
		sleep(4000);
		enterTextboxDetails(findElement(Enter_Selling_Price), sellingPrice);
		verifyByAttribute(Enter_Selling_Price, sellingPrice);
		executeScrollDownScript(1000);
		executeClickOnElement(Click_Save_Continue_After_SellingPrice);
	}
	
	public void uploadPicture() throws Exception
	{
		executeClickOnElement(Click_To_Upload);
		sleep(2000);
		fileUpload("C:\\Users\\Honey Maurya\\Desktop\\cycle.png");
		sleep(12000);
		CheckImage(Check_Image);
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
		verifyByAttribute(Verify_Listing_Save_And_Continue, "Save & Continue");
		executeClickOnElement(Click_Save_And_Continue_After_Selecting_ListingType);
	}
	
	
	public void premiumListing()
	{
		verifyByText(Click_For_Premium, "₹499/-");
		executeClickOnElement(Click_For_Premium);
		executeClickOnElement(By.xpath("//input[@id='original_submit-button']"));
//		verifyByAttribute(Verify_Listing_Save_And_Continue, "Save & Continue");
//		executeClickOnElement(Click_Save_And_Continue_After_Selecting_ListingType);
    }
	
	public void conciergeListing()
	{
		verifyByText(Click_For_Concierge, "₹699/-");
		waitForElementTobePresent(By.xpath("//div[@id='listing_concierge']"));
		executeClickOnElement(By.xpath("//div[@id='listing_concierge']"));
	    sleep(2000);
	    waitForElementTobePresent(By.xpath("//input[@id='original_submit-button']"));
		executeClickOnElement(By.xpath("//input[@id='original_submit-button']"));
//		verifyByAttribute(Verify_Listing_Save_And_Continue, "Save & Continue");
//		executeClickOnElement(Click_Save_And_Continue_After_Selecting_ListingType);
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
	
	public void quickSell()
	{
		waitForPageLoad();
		executeClickOnElement(By.xpath("(//h2[text()='QuickSell'])[1]"));
		verifyByContains(By.xpath("(//input[@value='Save and Continue'])[6]"), "Save & Continue");
		executeClickOnElement(By.xpath("(//input[@value='Save and Continue'])[6]"));
	}
	
	public void regularSell()
	{
		waitForPageLoad();
		executeClickOnElement(By.xpath("(//h2[text()='QuickSell'])[1]"));
		verifyByContains(Verify_Listing_Save_And_Continue, "Save & Continue");
		executeClickOnElement(Verify_Listing_Save_And_Continue);
	}
	
	public void distressSale()
	{
		waitForPageLoad();
		executeClickOnElement(By.xpath("(//h2[text()='QuickSell'])[1]"));
		verifyByContains(Verify_Listing_Save_And_Continue, "Save & Continue");
		executeClickOnElement(Verify_Listing_Save_And_Continue);
	}
	
	//------------------------>>>>>>>>>>>>>>>>>>>>>--------------------------------------- TEMP Changes
	
	public void demo()
	{
		waitForElementTobePresent(By.xpath("(//button[@class='close']//span)[6]"));
		executeClickOnElement(By.xpath("(//button[@class='close']//span)[6]"));
		executeClickOnElement(By.xpath("//span[text()='Home']"));
	}
	
	public void keyFactors(String kmDriver)
	{
		waitForPageLoad();
	//	moveToElementAndClick(Select_Location);
		driverClick(Select_Location);
		enterTextboxDetails(findElement(Search_Location), "Allahabad");
		enterKey(Search_Location);
		verifyByText(Select_Location, "Allahabad");
		String registerNumber = vehiclesRegistartionRandomNumber();
		enterTextboxDetails(findElement(Select_Registration_Number),registerNumber );
		verifyByAttribute(Select_Registration_Number, registerNumber);
		moveToElementAndClick(Select_Registration_State);
		enterTextboxDetails(findElement(Select_Registartion_Search), "Delhi");
		sleep(2000);
		enterKey(Select_Registartion_Search);
		sleep(2000);
		enterTextboxDetails(findElement(Enter_KM_Driven), kmDriver);
		verifyByAttribute(Enter_KM_Driven, kmDriver);
		executeClickOnElement(By.xpath("//input[@id='Key_Factors']"));
		sleep(5000);
    }
	
	public void transperancyFactors()
	{
		executeClickOnElement(By.xpath("//input[@id='opt_6031']"));
		executeClickOnElement(By.xpath("//input[@id='opt_2101']"));
		executeClickOnElement(By.xpath("//input[@id='opt_2231']"));
		enterTextboxDetails(findElement(By.xpath("//input[@id='name_on_the_rc']")), "Eeshwar");
		enterTextboxDetails(findElement(By.xpath("//textarea[@id='description']")), "I am the owner");
		executeClickOnElement(By.xpath("//input[@id='Transparency_Factors']"));
	}
	
	public void certificationToolQA()
	{
		waitForPageLoad();
		executeScrollDownScript(1400);
		executeClickOnElement(By.xpath("(//input[@value='Save and Continue'])[8]"));
	}
	
	public void activateListingQA()
	{
		waitForPageLoad();
		doPageRefresh();
		executeClickOnElement(Click_Activate_Listing_Button);
	}
}
