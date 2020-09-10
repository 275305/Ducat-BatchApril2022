package com.droom.automation.page.droomweb;

import org.openqa.selenium.By;

import com.droom.automation.lib.DataBaseDemo;
import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;

public class SubmitRequirementPage extends SeleniumWrapper
{
	private final static By Click_Select_From_Dropdown=By.xpath("//span[text()='Select From']");
	private final static By Click_Continue_After_Selecting_Model=By.xpath("(//a[contains(text(),'Continue')])[1]");
	private final static By Click_Continue_Two=By.xpath("(//a[contains(text(),'Continue')])[2]");
	private final static By Click_Continue_Three=By.xpath("(//a[contains(text(),'Continue')])[3]");
	private final static By Select_Category_After_Vehicle_Selection=By.xpath("//div[@class='sub-section req_main_vehicles']//div//select[@name='category']");
//	private final static By =By.xpath("");
	
	
	
	
	private final static By Select_Insurance_As_NO=By.xpath("//input[@id='insurance_available_on_droomNo']");
	private final static By Select_Loan_As_NO=By.xpath("//input[@id='credit_availableNo']");
	private final static By Select_RTO_As_NO=By.xpath("//input[@id='rto_service_availableNo']");
	private final static By Select_RSA_As_NO=By.xpath("//input[@id='rsa_availableNo']");
	
	// webelements for How Quickly you want to buy
	private final static By Click_Immediately=By.xpath("//input[@id='req_2']");
	private final static By Click_Within_Four_days=By.xpath("//input[@id='req_4']");
	private final static By Click_This_Week=By.xpath("//input[@id='req_7']");
	private final static By Click_One_To_Four_Week=By.xpath("//input[@id='req_14']");
	private final static By Click_One_To_Three_Month=By.xpath("//input[@id='req_30']");
	private final static By Click_Not_Decided=By.xpath("//input[@id='req_60']");
	private final static By Click_Yes_To_Exchange=By.xpath("//input[@id='req_yes']");
	private final static By Click_No_To_Exchange=By.xpath("//input[@id='req_no']");
	private final static By Click_Done=By.xpath("(//a[contains(text(),'Done')])[2]");
	private final static By Verify_ThankYou=By.xpath("//strong[text()='Thank You']");
	
	
//	private final static By =By.xpath("");
	
	
	HeaderPage headerpage;
	LoginPage loginpage;
	
	public SubmitRequirementPage()
	{
		headerpage=new	HeaderPage();
		loginpage=new LoginPage();
	}
	public void submitReqAsIndividualLoggedInUser(String username, String password)
	{
		loginpage.enterLoginPage();
		loginpage.loginValidationForIndividualAccount(username, password);
		loginpage.goToHome();
	}
	public void submitReqAsProSellerLoggedInUser(String username, String password)
	{
		loginpage.enterLoginPage();
		loginpage.loginValidationForIndividualAccount(username, password);
		sleep(2000);
		executeClickOnElement(By.xpath("//div[@id='qs-journey-hiw']//span[text()='×']"));
		executeClickOnElement(By.xpath("//span[text()='Home']"));
	}
	public void selectForBuy()
	{
		headerpage.clickSubmitRequirement();
	    sleep(5000);
	    verifyByContains(By.xpath("//div[text()='Buy']"), "Buy");
	    executeClickOnElement(By.xpath("//div[text()='Buy']"));
	}
	public void selectForSell()
	{
		headerpage.clickSubmitRequirement();
	    sleep(5000);
	    executeClickOnElement(By.xpath("//div[text()='Sell']"));
	}
	public void selectCategoryAfterSell(String enterCategory)
	{
		sleep(2000);
		verifyByContains(By.xpath("//label[text()='"+enterCategory+"']"), enterCategory);
		executeClickOnElement(By.xpath("//label[text()='"+enterCategory+"']"));
		verifyByContains(By.xpath("//a[contains(text(),'Proceed')]"), "");
		executeClickOnElement(By.xpath("//a[contains(text(),'Proceed')]"));
		switchToWindow("child");
	}
	public void selectWhatAreYouSearchingFor(String searchingFor)
	{
	    selectOptionByText(By.xpath("//select[@name='tab']"), searchingFor);
	    verifyByContains(By.xpath("//select[@name='tab']"), searchingFor);
	}
	
	public void selectCategory(String selectCatogery)
	{
		selectOptionByText(Select_Category_After_Vehicle_Selection, selectCatogery);
		verifyByContains(Select_Category_After_Vehicle_Selection, selectCatogery);
	}
	
	public void selectServiceAfterAutomobileService(String selectCatogeryUnderAutoService)
	{
		selectOptionByText(By.xpath("//label[text()='Please select a Service']/parent::div//select"), selectCatogeryUnderAutoService);
		verifyByContains(By.xpath("//label[text()='Please select a Service']/parent::div//select"), selectCatogeryUnderAutoService);
	}
	
	public void selectConditionAsNew()
	{
		executeClickOnElement(By.xpath("//input[@id='req_new']"));
		verifyRadioButton(By.xpath("//input[@id='req_new']"));
	}
	public void selectConditionAsUsed()
	{
		executeClickOnElement(By.xpath("//input[@id='req_used']"));
		verifyRadioButton(By.xpath("//input[@id='req_used']"));
	}
	public void clickOnDropDown()
	{
		verifyByContains(Click_Select_From_Dropdown, "Select From");
		executeClickOnElement(Click_Select_From_Dropdown);
	}
	
	public void selectSearchingAsLoanAndInsurance()
	{
		selectOptionByText(By.xpath("//select[@name='tab']"), "Loan & Insurance");
	    verifyByContains(By.xpath("//select[@name='tab']"), "Loan & Insurance");
	}
	
	public void selectSearchingAsCertificationServices()
	{
		selectOptionByText(By.xpath("//select[@name='tab']"), "Certification Services");
	    verifyByContains(By.xpath("//select[@name='tab']"), "Certification Services");
	}
	
	public void selectSearchingAsAutomobileServices()
	{
		selectOptionByText(By.xpath("//select[@name='tab']"), "Automobile Services");
	    verifyByContains(By.xpath("//select[@name='tab']"), "Automobile Services");
	}
	
	public void selectCategoryAfterLoanAndInsurance(String selectCategory)
	{
		selectOptionByText(By.xpath("//div[@class='sub-section req_main_loan_insurance']//div//select[@name='sub_category']"), selectCategory);
		verifyByContains(By.xpath("//div[@class='sub-section req_main_loan_insurance']//div//select[@name='sub_category']"), selectCategory);
	}
	public void selectCategoryAfterCertificationServices(String selectCategory)
	{
		selectOptionByText(By.xpath("//div[@class='sub-section req_main_certification_services']//div//select[@name='selection']"), selectCategory);
		verifyByContains(By.xpath("//div[@class='sub-section req_main_certification_services']//div//select[@name='selection']"), selectCategory);
	}
	public void selectCategoryAfterAutomobileServices(String selectCategory)
	{
		selectOptionByText(By.xpath("//div[@class='form-group floating-group select-form-group active']//select[@name='sub_category']"), selectCategory);
		verifyByContains(By.xpath("//div[@class='form-group floating-group select-form-group active']//select[@name='sub_category']"), selectCategory);
	}
	
	
	public void selectServiceUnderLoanAndInsuranceAsAutoloan()
	{
		selectOptionByText(By.xpath("//label[text()='Please select a Service']/parent::div//select"), "Autoloan");
	    verifyByContains(By.xpath("//label[text()='Please select a Service']/parent::div//select"), "Autoloan");
	}
	
	public void selectServiceUnderLoanAndInsuranceAsInsurance()
	{
		selectOptionByText(By.xpath("//label[text()='Please select a Service']/parent::div//select"), "Insurance");
	    verifyByContains(By.xpath("//label[text()='Please select a Service']/parent::div//select"), "Insurance");
	}
	
	 public void enterBuyerDetails(String firstName,String phoneNumber,String email)
	 {
		sleep(2000);
	    enterTextboxDetails(findElement(By.xpath("//input[@id='first_name']")), firstName);
	    verifyByAttribute(By.xpath("//input[@id='first_name']"), firstName);
	    enterTextboxDetails(findElement(By.xpath("//input[@id='phone']")), phoneNumber);
	    verifyByAttribute(By.xpath("//input[@id='phone']"), phoneNumber);
	    enterTextboxDetails(findElement(By.xpath("//input[@id='email']")), email);
	    verifyByAttribute(By.xpath("//input[@id='email']"), email);
	 }
	 public void enterSellerDetails(String firstName,String lastName,String phoneNumber,String email)
	 {
		sleep(5000);
	    enterTextboxDetails(findElement(By.xpath("//input[@id='first_name']")), firstName);
	    verifyByAttribute(By.xpath("//input[@id='first_name']"), firstName);
	    enterTextboxDetails(findElement(By.xpath("//input[@id='last_name']")), lastName);
	    verifyByAttribute(By.xpath("//input[@id='last_name']"), lastName);
	    enterTextboxDetails(findElement(By.xpath("//input[@id='email']")), email);
	    verifyByAttribute(By.xpath("//input[@id='email']"), email);
	    enterTextboxDetails(findElement(By.xpath("//input[@id='mobile_phone']")), phoneNumber);
	    verifyByAttribute(By.xpath("//input[@id='mobile_phone']"), phoneNumber);
	 }
	 public void enterSellerDeatilsAfterNumber(String enterSellCategory,String enterPincode,String enterKmDriver,String Make,String Model,String Trim,String Year)
	 {
	    selectOptionByText(By.xpath("//select[@id='category_id']"), enterSellCategory);
	    executeClickOnElement(By.xpath("//span[text()='Select From']"));
	    selectOptionByText(By.xpath("//label[text()='Select Make']/parent::div//select"), Make);
	    verifyByContains(By.xpath("//label[text()='Select Make']/parent::div//select"), FirstLetterUpperCase(Make));
	    selectOptionByText(By.xpath("//label[text()='Select Model']/parent::div//select"), Model);
	    verifyByContains(By.xpath("//label[text()='Select Model']/parent::div//select"), FirstLetterUpperCase(Model));
	    selectOptionByText(By.xpath("//label[text()='Select Year']/parent::div//select"), Year);
	    verifyByContains(By.xpath("//label[text()='Select Year']/parent::div//select"), Year);
	    selectOptionByText(By.xpath("//label[text()='Select Trim']/parent::div//select"), Trim);
	    verifyByContains(By.xpath("//label[text()='Select Trim']/parent::div//select"), Trim);
	    enterTextboxDetails(findElement(By.xpath("//input[@id='pincode']")), enterPincode);
	    verifyByAttribute(By.xpath("//input[@id='pincode']"), enterPincode);
	    enterTextboxDetails(findElement(By.xpath("//input[@id='kms_driven']")), enterKmDriver);
	    verifyByAttribute(By.xpath("//input[@id='kms_driven']"), enterKmDriver);
	    String registerNumber = vehiclesRegistartionRandomNumber();
	    enterTextboxDetails(findElement(By.xpath("//input[@id='vehicle_registration_number']")),registerNumber );
	    verifyByAttribute(By.xpath("//input[@id='vehicle_registration_number']"), registerNumber);
	    executeClickOnElement(By.xpath("//button[text()='Create My Listing']"));
	 }
	 
	 public void selectLocation()
	 {
	    verifyByContains(By.xpath("//div[@id='display_location']"), "Select Location");
	    executeClickOnElement(By.xpath("//div[@id='display_location']"));
	    enterTextboxDetails(findElement(By.xpath("(//label[text()='Search My Location']/parent::div//input)[2]")), "Delhi");
	    moveToElementAndClick(By.xpath("(//li[text()='Delhi'])[5]"));
	 }
	 
	 public void clickSubmitAfterBuyerDetails()
	 {
		 verifyByContains(By.xpath("//div[@class='action text-center']//a[contains(text(),'Submit')]"), "Submit");
		 executeClickOnElement(By.xpath("//div[@class='action text-center']//a[contains(text(),'Submit')]"));
	 }
	 public void selectLocationForOtherPopup()
	 {
	    verifyByContains(By.xpath("//div[@id='display_location']"), "Select Location");
	    executeClickOnElement(By.xpath("//div[@id='display_location']"));
	    enterTextboxDetails(findElement(By.xpath("(//label[text()='Search My Location']/parent::div//input)[2]")), "Delhi");
	    moveToElementAndClick(By.xpath("(//li[text()='Delhi'])[5]"));
	    verifyByContains(Click_Continue_After_Selecting_Model, "Continue");
	    executeClickOnElement(Click_Continue_After_Selecting_Model);
	 }
	 
	 public void continueToOtpPopup(String phoneNumber) throws Exception
	 {
	    sleep(8000);
	    char[] otp = DataBaseDemo.otpAsString("SELECT * FROM cscart_new.otp_verification where phone='"+phoneNumber+"' order by id desc limit 1;");
	    enterTextboxDetails(findElement(By.xpath("//input[@id='otp-input1']")), String.valueOf(otp[0]));
	    enterTextboxDetails(findElement(By.xpath("//input[@id='otp-input2']")), String.valueOf(otp[1]));
	    enterTextboxDetails(findElement(By.xpath("//input[@id='otp-input3']")), String.valueOf(otp[2]));
	    enterTextboxDetails(findElement(By.xpath("//input[@id='otp-input4']")), String.valueOf(otp[3]));
	    verifyByContains(By.xpath("(//a[contains(text(),'Done')])[1]"), "Done");
	    executeClickOnElement(By.xpath("(//a[contains(text(),'Done')])[1]"));
	    sleep(2000);
	 }
	 
	   public void submitReq()
	   {
		sleep(2000);
	    executeClickOnElement(Select_Insurance_As_NO);
	    verifyRadioButton(Select_Insurance_As_NO);
	    executeClickOnElement(Select_Loan_As_NO);
	    verifyRadioButton(Select_Loan_As_NO);
	    executeClickOnElement(Select_RTO_As_NO);
	    verifyRadioButton(Select_RTO_As_NO);
	    executeClickOnElement(Select_RSA_As_NO);
	    verifyRadioButton(Select_RSA_As_NO);
	   }
	   public void howQuicklyPopup()
	   {
		sleep(2000);
	    executeClickOnElement(Click_This_Week);
	    verifyRadioButton(Click_This_Week);
	    executeClickOnElement(Click_No_To_Exchange);
	    verifyRadioButton(Click_No_To_Exchange);
	    verifyByContains(Click_Done, "Done");
	    executeClickOnElement(Click_Done);
	    sleep(3000);
	    verifyByContains(Verify_ThankYou, "Thank You");
	}
	   
	   public void selectForMakeModelTrimYear(String Make,String Model,String Trim,String Year)
	   {
		    selectOptionByText(By.xpath("//label[text()='Select Make']/parent::div//select"), Make);
		    verifyByContains(By.xpath("//label[text()='Select Make']/parent::div//select"), FirstLetterUpperCase(Make));
		    selectOptionByText(By.xpath("//label[text()='Select Model']/parent::div//select"), Model);
		    verifyByContains(By.xpath("//label[text()='Select Model']/parent::div//select"), FirstLetterUpperCase(Model));
		    selectOptionByText(By.xpath("//label[text()='Select Trim']/parent::div//select"), Trim);
		    verifyByContains(By.xpath("//label[text()='Select Trim']/parent::div//select"), Trim);
		    selectOptionByText(By.xpath("//label[text()='Select Year']/parent::div//select"), Year);
		    verifyByContains(By.xpath("//label[text()='Select Year']/parent::div//select"), Year);
		    verifyByContains(Click_Continue_After_Selecting_Model, "Continue");
		    executeClickOnElement(Click_Continue_After_Selecting_Model);
	   }
	   
	   public void selectForBodyFuelTransmissionType(String bodytype,String fueltype,String transmissiontype)
	   {
		   selectOptionByText(By.xpath("//select[@name='body_type']"), bodytype);
		   verifyByContains(By.xpath("//select[@name='body_type']"), FirstLetterUpperCase(bodytype));
		    selectOptionByText(By.xpath("//select[@name='fuel_type']"), fueltype);
		    verifyByContains(By.xpath("//select[@name='fuel_type']"), FirstLetterUpperCase(fueltype));
		    selectOptionByText(By.xpath("//select[@name='transmission_type']"), transmissiontype);
		    verifyByContains(By.xpath("//select[@name='transmission_type']"), FirstLetterUpperCase(transmissiontype));
		    verifyByContains(Click_Continue_Two, "Continue");
		    executeClickOnElement(Click_Continue_Two);
	   }

	   
	public void buyVehicleAsCar(String firstName,String phoneNumber,String email,String Make,String Model,String Trim,String Year)throws Exception
	{
	    sleep(2000);
	    selectForMakeModelTrimYear(Make, Model, Trim, Year);
	    enterBuyerDetails(firstName, phoneNumber, email);
	    selectLocation();
	    clickSubmitAfterBuyerDetails();
	}
	public void buyVehicleAsMotorCycleOrBike(String firstName,String phoneNumber,String email,String Make,String Model,String Trim,String Year) throws Exception
	{
	    sleep(3000);
	    selectForMakeModelTrimYear(Make, Model, Trim, Year);
	    enterBuyerDetails(firstName, phoneNumber, email);
	    selectLocation();
	    clickSubmitAfterBuyerDetails();
	}
	public void buyVehicleAsScooter(String firstName,String phoneNumber,String email,String Make,String Model,String Trim,String Year) throws Exception
	{
	    sleep(3000);
	    selectForMakeModelTrimYear(Make, Model, Trim, Year);
	    enterBuyerDetails(firstName, phoneNumber, email);
	    selectLocation();
	    clickSubmitAfterBuyerDetails();
	}
	public void buyVehicleAsTaxi(String firstName,String phoneNumber,String email,String Make,String Model,String Trim,String Year) throws Exception
	{
	    sleep(3000);
	    selectForMakeModelTrimYear(Make, Model, Trim, Year);
	    enterBuyerDetails(firstName, phoneNumber, email);
	    selectLocation();
	    clickSubmitAfterBuyerDetails();
	}
	public void commonMethodForCarBikeScootyTaxi(String bodytype,String fueltype,String transmissiontype)
	{
		sleep(2000);
	    selectForBodyFuelTransmissionType(bodytype, fueltype, transmissiontype);
	    submitReq();
	    executeClickOnElement(Click_Continue_Three);
	    howQuicklyPopup();
	}
	public void msgAsThankYou()
	{
		sleep(5000);
		verifyByContains(By.xpath("//strong[text()='Thank You']"), "Thank You");
	}
	
}
