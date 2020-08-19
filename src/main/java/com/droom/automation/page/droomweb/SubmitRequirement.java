package com.droom.automation.page.droomweb;

import org.openqa.selenium.By;

import com.droom.automation.lib.DataBaseDemo;
import com.droom.automation.lib.SeleniumWrapper;

public class SubmitRequirement extends SeleniumWrapper
{
	private final static By Click_Select_From_Dropdown=By.xpath("//span[text()='Select From']");
	private final static By Click_Continue_After_Selecting_Model=By.xpath("(//a[contains(text(),'Continue')])[1]");
	private final static By Click_Continue_Two=By.xpath("(//a[contains(text(),'Continue')])[2]");
	private final static By Click_Continue_Three=By.xpath("(//a[contains(text(),'Continue')])[3]");
	private final static By Select_Category=By.xpath("//div[@class='sub-section req_main_vehicles']//div//select[@name='category']");
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
	
	public SubmitRequirement()
	{
		headerpage=new	HeaderPage();
	}
	
	public void buyRequirementForVehicles()
	{
		headerpage.clickSubmitRequirement();
	    sleep(2000);
	    verifyByContains(By.xpath("//div[text()='Buy']"), "Buy");
	    executeClickOnElement(By.xpath("//div[text()='Buy']"));
	    selectOptionByText(By.xpath("//select[@name='tab']"), "Vehicles");
	    verifyByContains(By.xpath("//select[@name='tab']"), "Vehicles");
	}
	
	    
	 public void enterBuyerDetails(String firstName,String phoneNumber,String email)throws Exception
	 {
		 sleep(2000);
	    enterTextboxDetails(findElement(By.xpath("//input[@id='first_name']")), firstName);
	    verifyByAttribute(By.xpath("//input[@id='first_name']"), firstName);
	    enterTextboxDetails(findElement(By.xpath("//input[@id='phone']")), phoneNumber);
	    verifyByAttribute(By.xpath("//input[@id='phone']"), phoneNumber);
	    enterTextboxDetails(findElement(By.xpath("//input[@id='email']")), email);
	    verifyByAttribute(By.xpath("//input[@id='email']"), email);
	    verifyByContains(By.xpath("//div[@id='display_location']"), "Select Location");
	    executeClickOnElement(By.xpath("//div[@id='display_location']"));
	    enterTextboxDetails(findElement(By.xpath("(//label[text()='Search My Location']/parent::div//input)[2]")), "Delhi");
	    moveToElementAndClick(By.xpath("(//li[text()='Delhi'])[5]"));
	    verifyByContains(By.xpath("//div[@class='action text-center']//a[contains(text(),'Submit')]"), "Submit");
	    executeClickOnElement(By.xpath("//div[@class='action text-center']//a[contains(text(),'Submit')]"));
	    char[] otp = DataBaseDemo.otpAsString("SELECT * FROM cscart_new.otp_verification where phone='"+phoneNumber+"' order by id desc limit 1;");
	    System.out.println(otp);
	    sleep(2000);
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
	    sleep(2000);
	    verifyByContains(Verify_ThankYou, "Thank You");
	}

	public void buyVehicleAsCar(String firstName,String phoneNumber,String email)throws Exception
	{
		buyRequirementForVehicles();
		selectOptionByText(Select_Category, "Car");
	    verifyByContains(Select_Category, "Car");
	    verifyByContains(Click_Select_From_Dropdown, "Select From");
	    executeClickOnElement(Click_Select_From_Dropdown);
	    sleep(2000);
	    selectOptionByText(By.xpath("//label[text()='Select Make']/parent::div//select"), "Mahindra");
	    verifyByContains(By.xpath("//label[text()='Select Make']/parent::div//select"), "Mahindra");
	    selectOptionByText(By.xpath("//label[text()='Select Model']/parent::div//select"), "bolero");
	    verifyByContains(By.xpath("//label[text()='Select Model']/parent::div//select"), "Bolero");
	    selectOptionByText(By.xpath("//label[text()='Select Trim']/parent::div//select"), "2 WD AT");
	    verifyByContains(By.xpath("//label[text()='Select Trim']/parent::div//select"), "2 WD AT");
	    selectOptionByText(By.xpath("//label[text()='Select Year']/parent::div//select"), "2010");
	    verifyByContains(By.xpath("//label[text()='Select Year']/parent::div//select"), "2010");
	    verifyByContains(Click_Continue_After_Selecting_Model, "Continue");
	    executeClickOnElement(Click_Continue_After_Selecting_Model);
	    enterBuyerDetails(firstName, phoneNumber, email);
	    selectOptionByText(By.xpath("//select[@name='body_type']"), "Suv");
	    verifyByContains(By.xpath("//select[@name='body_type']"), "Suv");
	    selectOptionByText(By.xpath("//select[@name='fuel_type']"), "Petrol");
	    verifyByContains(By.xpath("//select[@name='fuel_type']"), "Petrol");
	    selectOptionByText(By.xpath("//select[@name='transmission_type']"), "Manual");
	    verifyByContains(By.xpath("//select[@name='transmission_type']"), "Manual");
	    verifyByContains(Click_Continue_Two, "Continue");
	    executeClickOnElement(Click_Continue_Two);
	    submitReq();
	    executeClickOnElement(Click_Continue_Three);
	    howQuicklyPopup();
	}
	public void buyVehicleAsMotorCycleOrBike(String firstName,String phoneNumber,String email) throws Exception
	{
		buyRequirementForVehicles();
		selectOptionByText(Select_Category, "Motorcycle/Bike");
	    verifyByContains(Select_Category, "Motorcycle/Bike");
	    verifyByContains(Click_Select_From_Dropdown, "Select From");
		executeClickOnElement(Click_Select_From_Dropdown);
	    sleep(2000);
	    selectOptionByText(By.xpath("//label[text()='Select Make']/parent::div//select"), "ktm");
	    verifyByContains(By.xpath("//label[text()='Select Make']/parent::div//select"), "Ktm");
	    selectOptionByText(By.xpath("//label[text()='Select Model']/parent::div//select"), "duke");
	    verifyByContains(By.xpath("//label[text()='Select Model']/parent::div//select"), "Duke");
	    selectOptionByText(By.xpath("//label[text()='Select Trim']/parent::div//select"), "200CC ABS");
	    verifyByContains(By.xpath("//label[text()='Select Trim']/parent::div//select"), "200CC ABS");
	    selectOptionByText(By.xpath("//label[text()='Select Year']/parent::div//select"), "2020");
	    verifyByContains(By.xpath("//label[text()='Select Year']/parent::div//select"), "2020");
	    verifyByContains(Click_Continue_After_Selecting_Model, "Continue");
	    executeClickOnElement(Click_Continue_After_Selecting_Model);
	    enterBuyerDetails(firstName, phoneNumber, email);
	    selectOptionByText(By.xpath("//select[@name='body_type']"), "sports");
	    verifyByContains(By.xpath("//select[@name='body_type']"), "Sports");
	    selectOptionByText(By.xpath("//select[@name='fuel_type']"), "petrol");
	    verifyByContains(By.xpath("//select[@name='fuel_type']"), "Petrol");
	    selectOptionByText(By.xpath("//select[@name='transmission_type']"), "manual");
	    verifyByContains(By.xpath("//select[@name='transmission_type']"), "Manual");
	    verifyByContains(Click_Continue_Two, "Continue");
	    executeClickOnElement(Click_Continue_Two);
	    submitReq();
	    executeClickOnElement(Click_Continue_Three);
	    howQuicklyPopup();
	}
	public void buyVehicleAsScooter(String firstName,String phoneNumber,String email) throws Exception
	{
		buyRequirementForVehicles();
		selectOptionByText(Select_Category, "Scooter");
	    verifyByContains(Select_Category, "Scooter");
	    verifyByContains(Click_Select_From_Dropdown, "Select From");
		executeClickOnElement(Click_Select_From_Dropdown);
	    sleep(2000);
	    selectOptionByText(By.xpath("//label[text()='Select Make']/parent::div//select"), "yamaha");
	    verifyByContains(By.xpath("//label[text()='Select Make']/parent::div//select"), "Yamaha");
	    selectOptionByText(By.xpath("//label[text()='Select Model']/parent::div//select"), "fascino");
	    verifyByContains(By.xpath("//label[text()='Select Model']/parent::div//select"), "Fascino");
	    selectOptionByText(By.xpath("//label[text()='Select Trim']/parent::div//select"), "110CC");
	    verifyByContains(By.xpath("//label[text()='Select Trim']/parent::div//select"), "110CC");
	    selectOptionByText(By.xpath("//label[text()='Select Year']/parent::div//select"), "2018");
	    verifyByContains(By.xpath("//label[text()='Select Year']/parent::div//select"), "2018");
	    verifyByContains(Click_Continue_After_Selecting_Model, "Continue");
	    executeClickOnElement(Click_Continue_After_Selecting_Model);
	    enterBuyerDetails(firstName, phoneNumber, email);
	    selectOptionByText(By.xpath("//select[@name='body_type']"), "commuter");
	    verifyByContains(By.xpath("//select[@name='body_type']"), "Commuter");
	    selectOptionByText(By.xpath("//select[@name='fuel_type']"), "petrol");
	    verifyByContains(By.xpath("//select[@name='fuel_type']"), "Petrol");
	    selectOptionByText(By.xpath("//select[@name='transmission_type']"), "manual");
	    verifyByContains(By.xpath("//select[@name='transmission_type']"), "Manual");
	    verifyByContains(Click_Continue_Two, "Continue");
	    executeClickOnElement(Click_Continue_Two);
	    submitReq();
	    executeClickOnElement(Click_Continue_Three);
	    howQuicklyPopup();
	}
	public void buyVehicleAsTaxi(String firstName,String phoneNumber,String email) throws Exception
	{
		buyRequirementForVehicles();
		selectOptionByText(Select_Category, "Taxi");
	    verifyByContains(Select_Category, "Taxi");
	    verifyByContains(Click_Select_From_Dropdown, "Select From");
		executeClickOnElement(Click_Select_From_Dropdown);
	    sleep(2000);
	    selectOptionByText(By.xpath("//label[text()='Select Make']/parent::div//select"), "skoda");
	    verifyByContains(By.xpath("//label[text()='Select Make']/parent::div//select"), "Skoda");
	    selectOptionByText(By.xpath("//label[text()='Select Model']/parent::div//select"), "rapid");
	    verifyByContains(By.xpath("//label[text()='Select Model']/parent::div//select"), "Rapid");
	    selectOptionByText(By.xpath("//label[text()='Select Trim']/parent::div//select"), "1.5 TDI ACTIVE MT");
	    verifyByContains(By.xpath("//label[text()='Select Trim']/parent::div//select"), "1.5 TDI ACTIVE MT");
	    selectOptionByText(By.xpath("//label[text()='Select Year']/parent::div//select"), "2020");
	    verifyByContains(By.xpath("//label[text()='Select Year']/parent::div//select"), "2020");
	    verifyByContains(Click_Continue_After_Selecting_Model, "Continue");
	    executeClickOnElement(Click_Continue_After_Selecting_Model);
	    enterBuyerDetails(firstName, phoneNumber, email);
	    selectOptionByText(By.xpath("//select[@name='body_type']"), "suv");
	    verifyByContains(By.xpath("//select[@name='body_type']"), "Suv");
	    selectOptionByText(By.xpath("//select[@name='fuel_type']"), "petrol");
	    verifyByContains(By.xpath("//select[@name='fuel_type']"), "Petrol");
	    selectOptionByText(By.xpath("//select[@name='transmission_type']"), "manual");
	    verifyByContains(By.xpath("//select[@name='transmission_type']"), "Manual");
	    verifyByContains(Click_Continue_Two, "Continue");
	    executeClickOnElement(Click_Continue_Two);
	    submitReq();
	    executeClickOnElement(Click_Continue_Three);
	    howQuicklyPopup();
	}
}
