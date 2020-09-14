package com.droom.automation.droomweb.droomweb_qa;

import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.lib.JavaLibrary;
import com.droom.automation.page.droomweb.SubmitRequirementPage;

public class SubmitRequirementTest extends AbstractBaseTest
{
	SubmitRequirementPage submitreq;
	String filepath;
	ExcelUtilities eu;
	String firstName = "Rahul Sharma";
	String phoneNumber = "7289183692";
	String email = "ra01.sh01@gmail.com";
	
	public SubmitRequirementTest()
	{
		submitreq=new SubmitRequirementPage();
		this.filepath="C:/Users/Honey/Desktop/QA Automation TestData.xlsx";
		this.eu=new ExcelUtilities(filepath);
	}
	         // TEST SCRIPT FOR VALIDATING BUY AS VEHICLES
	@Test(priority = 1)
	public void validatSubmitRequirementAsBuyWithVehicleAsNewCar() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 1, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		System.out.println(phoneNumber);
		String email = JavaLibrary.dynamicUsername();
		String searchingFor = eu.readData("Submit Requirements", 1, 12);
		String selectCatogery = eu.readData("Submit Requirements", 1, 4);
		String Make = eu.readData("Submit Requirements", 1, 5);
		String Model = eu.readData("Submit Requirements", 1, 6);
		String Trim = eu.readData("Submit Requirements", 1, 7);
		String Year = eu.readData("Submit Requirements", 1, 8);
		String bodytype = eu.readData("Submit Requirements", 1, 9);
		String fueltype = eu.readData("Submit Requirements", 1, 10);
		String transmissiontype = eu.readData("Submit Requirements", 1, 11);
		String SelectRequirement = eu.readData("Submit Requirements", 1, 11);
	//	submitreq.selectRequirement(SelectRequirement);
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectCategory(selectCatogery);
		submitreq.selectConditionAsNew();
		submitreq.clickOnDropDown();
		submitreq.buyVehicleAsCar(firstName, phoneNumber, email, Make, Model, Trim, Year);
		submitreq.continueToOtpPopup(phoneNumber);
		submitreq.commonMethodForCarBikeScootyTaxi(bodytype, fueltype, transmissiontype);
	}
	
	@Test(priority = 2)
	public void validatSubmitRequirementAsBuyWithVehicleAsNewMotorCycleOrBike() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 2, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		System.out.println(phoneNumber);
		String email = JavaLibrary.dynamicUsername();
		String searchingFor = eu.readData("Submit Requirements", 1, 12);
		String selectCatogery = eu.readData("Submit Requirements", 2, 4);
		String Make = eu.readData("Submit Requirements", 2, 5);
		String Model = eu.readData("Submit Requirements", 2, 6);
		String Trim = eu.readData("Submit Requirements", 2, 7);
		String Year = eu.readData("Submit Requirements", 2, 8);
		String bodytype = eu.readData("Submit Requirements", 2, 9);
		String fueltype = eu.readData("Submit Requirements", 2, 10);
		String transmissiontype = eu.readData("Submit Requirements", 2, 11);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectCategory(selectCatogery);
		submitreq.selectConditionAsNew();
		submitreq.clickOnDropDown();
		submitreq.buyVehicleAsMotorCycleOrBike(firstName, phoneNumber, email, Make, Model, Trim, Year);
		submitreq.continueToOtpPopup(phoneNumber);
		submitreq.commonMethodForCarBikeScootyTaxi(bodytype, fueltype, transmissiontype);
	}
	
	@Test(priority = 3)
	public void validatSubmitRequirementAsBuyWithVehicleAsNewScooter() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 3, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String searchingFor = eu.readData("Submit Requirements", 1, 12);
		String selectCatogery = eu.readData("Submit Requirements", 3, 4);
		String Make = eu.readData("Submit Requirements", 3, 5);
		String Model = eu.readData("Submit Requirements", 3, 6);
		String Trim = eu.readData("Submit Requirements", 3, 7);
		String Year = eu.readData("Submit Requirements", 3, 8);
		String bodytype = eu.readData("Submit Requirements", 3, 9);
		String fueltype = eu.readData("Submit Requirements", 3, 10);
		String transmissiontype = eu.readData("Submit Requirements", 3, 11);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectCategory(selectCatogery);
		submitreq.selectConditionAsNew();
		submitreq.clickOnDropDown();
		submitreq.buyVehicleAsScooter(firstName, phoneNumber, email, Make, Model, Trim, Year);
		submitreq.continueToOtpPopup(phoneNumber);
		submitreq.commonMethodForCarBikeScootyTaxi(bodytype, fueltype, transmissiontype);
	}
	
	@Test(priority = 4)
	public void validatSubmitRequirementAsBuyWithVehicleAsNewTaxi() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 4, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String searchingFor = eu.readData("Submit Requirements", 1, 12);
		String selectCatogery = eu.readData("Submit Requirements", 4, 4);
		String Make = eu.readData("Submit Requirements", 4, 5);
		String Model = eu.readData("Submit Requirements", 4, 6);
		String Trim = eu.readData("Submit Requirements", 4, 7);
		String Year = eu.readData("Submit Requirements", 4, 8);
		String bodytype = eu.readData("Submit Requirements", 4, 9);
		String fueltype = eu.readData("Submit Requirements", 4, 10);
		String transmissiontype = eu.readData("Submit Requirements", 4, 11);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectCategory(selectCatogery);
		submitreq.selectConditionAsNew();
		submitreq.clickOnDropDown();
		submitreq.buyVehicleAsTaxi(firstName, phoneNumber, email, Make, Model, Trim, Year);
		submitreq.continueToOtpPopup(phoneNumber);
		submitreq.commonMethodForCarBikeScootyTaxi(bodytype, fueltype, transmissiontype);
	}
	
	@Test(priority = 5)
	public void validatSubmitRequirementAsBuyWithVehicleAsUsedCar() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 5, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String searchingFor = eu.readData("Submit Requirements", 1, 12);
		String selectCatogery = eu.readData("Submit Requirements", 5, 4);
		String Make = eu.readData("Submit Requirements", 5, 5);
		String Model = eu.readData("Submit Requirements", 5, 6);
		String Trim = eu.readData("Submit Requirements", 5, 7);
		String Year = eu.readData("Submit Requirements", 5, 8);
		String bodytype = eu.readData("Submit Requirements", 5, 9);
		String fueltype = eu.readData("Submit Requirements", 5, 10);
		String transmissiontype = eu.readData("Submit Requirements", 5, 11);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectCategory(selectCatogery);
		submitreq.selectConditionAsUsed();
		submitreq.clickOnDropDown();
		submitreq.buyVehicleAsCar(firstName, phoneNumber, email, Make, Model, Trim, Year);
		submitreq.continueToOtpPopup(phoneNumber);
		submitreq.commonMethodForCarBikeScootyTaxi(bodytype, fueltype, transmissiontype);
	}
	
	@Test(priority = 6)
	public void validatSubmitRequirementAsBuyWithVehicleAsUsedMotorCycleOrBike() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 2, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		System.out.println(phoneNumber);
		String email = JavaLibrary.dynamicUsername();
		String searchingFor = eu.readData("Submit Requirements", 1, 12);
		String selectCatogery = eu.readData("Submit Requirements", 2, 4);
		String Make = eu.readData("Submit Requirements", 2, 5);
		String Model = eu.readData("Submit Requirements", 2, 6);
		String Trim = eu.readData("Submit Requirements", 2, 7);
		String Year = eu.readData("Submit Requirements", 2, 8);
		String bodytype = eu.readData("Submit Requirements", 2, 9);
		String fueltype = eu.readData("Submit Requirements", 2, 10);
		String transmissiontype = eu.readData("Submit Requirements", 2, 11);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectCategory(selectCatogery);
		submitreq.selectConditionAsUsed();
		submitreq.clickOnDropDown();
		submitreq.buyVehicleAsMotorCycleOrBike(firstName, phoneNumber, email, Make, Model, Trim, Year);
		submitreq.continueToOtpPopup(phoneNumber);
		submitreq.commonMethodForCarBikeScootyTaxi(bodytype, fueltype, transmissiontype);
	}
	
	@Test(priority = 7)
	public void validatSubmitRequirementAsBuyWithVehicleAsUsedScooter() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 3, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String searchingFor = eu.readData("Submit Requirements", 1, 12);
		String selectCatogery = eu.readData("Submit Requirements", 3, 4);
		String Make = eu.readData("Submit Requirements", 3, 5);
		String Model = eu.readData("Submit Requirements", 3, 6);
		String Trim = eu.readData("Submit Requirements", 3, 7);
		String Year = eu.readData("Submit Requirements", 3, 8);
		String bodytype = eu.readData("Submit Requirements", 3, 9);
		String fueltype = eu.readData("Submit Requirements", 3, 10);
		String transmissiontype = eu.readData("Submit Requirements", 3, 11);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectCategory(selectCatogery);
		submitreq.selectConditionAsUsed();
		submitreq.clickOnDropDown();
		submitreq.buyVehicleAsScooter(firstName, phoneNumber, email, Make, Model, Trim, Year);
		submitreq.continueToOtpPopup(phoneNumber);
		submitreq.commonMethodForCarBikeScootyTaxi(bodytype, fueltype, transmissiontype);
	}
	
	@Test(priority = 8)
	public void validatSubmitRequirementAsBuyWithVehicleAsUsedTaxi() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 4, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String searchingFor = eu.readData("Submit Requirements", 1, 12);
		String selectCatogery = eu.readData("Submit Requirements", 4, 4);
		String Make = eu.readData("Submit Requirements", 4, 5);
		String Model = eu.readData("Submit Requirements", 4, 6);
		String Trim = eu.readData("Submit Requirements", 4, 7);
		String Year = eu.readData("Submit Requirements", 4, 8);
		String bodytype = eu.readData("Submit Requirements", 4, 9);
		String fueltype = eu.readData("Submit Requirements", 4, 10);
		String transmissiontype = eu.readData("Submit Requirements", 4, 11);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectCategory(selectCatogery);
		submitreq.selectConditionAsUsed();
		submitreq.clickOnDropDown();
		submitreq.buyVehicleAsTaxi(firstName, phoneNumber, email, Make, Model, Trim, Year);
		submitreq.continueToOtpPopup(phoneNumber);
		submitreq.commonMethodForCarBikeScootyTaxi(bodytype, fueltype, transmissiontype);
	}
	
	@Test(priority = 9)
	public void validatAlreadyRegisteredBuyerAsNewCar() throws Exception
	{
		String searchingFor = eu.readData("Submit Requirements", 1, 12);
		String selectCatogery = eu.readData("Submit Requirements", 1, 4);
		String Make = eu.readData("Submit Requirements", 1, 5);
		String Model = eu.readData("Submit Requirements", 1, 6);
		String Trim = eu.readData("Submit Requirements", 1, 7);
		String Year = eu.readData("Submit Requirements", 1, 8);
		String bodytype = eu.readData("Submit Requirements", 1, 9);
		String fueltype = eu.readData("Submit Requirements", 1, 10);
		String transmissiontype = eu.readData("Submit Requirements", 1, 11);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectCategory(selectCatogery);
		submitreq.selectConditionAsNew();
		submitreq.clickOnDropDown();
		submitreq.buyVehicleAsCar(firstName, phoneNumber, email, Make, Model, Trim, Year);
		Thread.sleep(8000);
		submitreq.commonMethodForCarBikeScootyTaxi(bodytype, fueltype, transmissiontype);
	}
	
	@Test(priority = 10)
	public void validatAlreadyRegisteredBuyerAsNewMotorCycleOrBike() throws Exception
	{
		String searchingFor = eu.readData("Submit Requirements", 1, 12);
		String selectCatogery = eu.readData("Submit Requirements", 2, 4);
		String Make = eu.readData("Submit Requirements", 2, 5);
		String Model = eu.readData("Submit Requirements", 2, 6);
		String Trim = eu.readData("Submit Requirements", 2, 7);
		String Year = eu.readData("Submit Requirements", 2, 8);
		String bodytype = eu.readData("Submit Requirements", 2, 9);
		String fueltype = eu.readData("Submit Requirements", 2, 10);
		String transmissiontype = eu.readData("Submit Requirements", 2, 11);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectCategory(selectCatogery);
		submitreq.selectConditionAsNew();
		submitreq.clickOnDropDown();
		submitreq.buyVehicleAsMotorCycleOrBike(firstName, phoneNumber, email, Make, Model, Trim, Year);
		Thread.sleep(8000);
		submitreq.commonMethodForCarBikeScootyTaxi(bodytype, fueltype, transmissiontype);
	}
	
	@Test(priority = 11)
	public void validatAlreadyRegisteredBuyerAsNewScooter() throws Exception
	{
		String searchingFor = eu.readData("Submit Requirements", 1, 12);
		String selectCatogery = eu.readData("Submit Requirements", 3, 4);
		String Make = eu.readData("Submit Requirements", 3, 5);
		String Model = eu.readData("Submit Requirements", 3, 6);
		String Trim = eu.readData("Submit Requirements", 3, 7);
		String Year = eu.readData("Submit Requirements", 3, 8);
		String bodytype = eu.readData("Submit Requirements", 3, 9);
		String fueltype = eu.readData("Submit Requirements", 3, 10);
		String transmissiontype = eu.readData("Submit Requirements", 3, 11);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectCategory(selectCatogery);
		submitreq.selectConditionAsNew();
		submitreq.clickOnDropDown();
		submitreq.buyVehicleAsScooter(firstName, phoneNumber, email, Make, Model, Trim, Year);
		Thread.sleep(8000);
		submitreq.commonMethodForCarBikeScootyTaxi(bodytype, fueltype, transmissiontype);
	}
	
	@Test(priority = 12)
	public void validatAlreadyRegisteredBuyerAsNewTaxi() throws Exception
	{
		String searchingFor = eu.readData("Submit Requirements", 1, 12);
		String selectCatogery = eu.readData("Submit Requirements", 4, 4);
		String Make = eu.readData("Submit Requirements", 4, 5);
		String Model = eu.readData("Submit Requirements", 4, 6);
		String Trim = eu.readData("Submit Requirements", 4, 7);
		String Year = eu.readData("Submit Requirements", 4, 8);
		String bodytype = eu.readData("Submit Requirements", 4, 9);
		String fueltype = eu.readData("Submit Requirements", 4, 10);
		String transmissiontype = eu.readData("Submit Requirements", 4, 11);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectCategory(selectCatogery);
		submitreq.selectConditionAsNew();
		submitreq.clickOnDropDown();
		submitreq.buyVehicleAsTaxi(firstName, phoneNumber, email, Make, Model, Trim, Year);
		Thread.sleep(8000);
		submitreq.commonMethodForCarBikeScootyTaxi(bodytype, fueltype, transmissiontype);
	}
	
	@Test(priority = 13)
	public void validatAlreadyRegisteredBuyerAsUsedCar() throws Exception
	{
		String searchingFor = eu.readData("Submit Requirements", 1, 12);
		String selectCatogery = eu.readData("Submit Requirements", 5, 4);
		String Make = eu.readData("Submit Requirements", 5, 5);
		String Model = eu.readData("Submit Requirements", 5, 6);
		String Trim = eu.readData("Submit Requirements", 5, 7);
		String Year = eu.readData("Submit Requirements", 5, 8);
		String bodytype = eu.readData("Submit Requirements", 5, 9);
		String fueltype = eu.readData("Submit Requirements", 5, 10);
		String transmissiontype = eu.readData("Submit Requirements", 5, 11);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectCategory(selectCatogery);
		submitreq.selectConditionAsUsed();
		submitreq.clickOnDropDown();
		submitreq.buyVehicleAsCar(firstName, phoneNumber, email, Make, Model, Trim, Year);
		Thread.sleep(8000);
		submitreq.commonMethodForCarBikeScootyTaxi(bodytype, fueltype, transmissiontype);
	}
	
	@Test(priority = 14)
	public void validatAlreadyRegisteredBuyerAsUsedMotorCycleOrBike() throws Exception
	{
		String searchingFor = eu.readData("Submit Requirements", 1, 12);
		String selectCatogery = eu.readData("Submit Requirements", 2, 4);
		String Make = eu.readData("Submit Requirements", 2, 5);
		String Model = eu.readData("Submit Requirements", 2, 6);
		String Trim = eu.readData("Submit Requirements", 2, 7);
		String Year = eu.readData("Submit Requirements", 2, 8);
		String bodytype = eu.readData("Submit Requirements", 2, 9);
		String fueltype = eu.readData("Submit Requirements", 2, 10);
		String transmissiontype = eu.readData("Submit Requirements", 2, 11);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectCategory(selectCatogery);
		submitreq.selectConditionAsUsed();
		submitreq.clickOnDropDown();
		submitreq.buyVehicleAsMotorCycleOrBike(firstName, phoneNumber, email, Make, Model, Trim, Year);
		Thread.sleep(8000);
		submitreq.commonMethodForCarBikeScootyTaxi(bodytype, fueltype, transmissiontype);
	}
	
	@Test(priority = 15)
	public void validatAlreadyRegisteredBuyerAsUsedScooter() throws Exception
	{
		String searchingFor = eu.readData("Submit Requirements", 1, 12);
		String selectCatogery = eu.readData("Submit Requirements", 3, 4);
		String Make = eu.readData("Submit Requirements", 3, 5);
		String Model = eu.readData("Submit Requirements", 3, 6);
		String Trim = eu.readData("Submit Requirements", 3, 7);
		String Year = eu.readData("Submit Requirements", 3, 8);
		String bodytype = eu.readData("Submit Requirements", 3, 9);
		String fueltype = eu.readData("Submit Requirements", 3, 10);
		String transmissiontype = eu.readData("Submit Requirements", 3, 11);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectCategory(selectCatogery);
		submitreq.selectConditionAsUsed();
		submitreq.clickOnDropDown();
		submitreq.buyVehicleAsScooter(firstName, phoneNumber, email, Make, Model, Trim, Year);
		Thread.sleep(8000);
		submitreq.commonMethodForCarBikeScootyTaxi(bodytype, fueltype, transmissiontype);
	}
	
	@Test(priority = 16)
	public void validatAlreadyRegisteredBuyerAsUsedTaxi() throws Exception
	{
		String searchingFor = eu.readData("Submit Requirements", 1, 12);
		String selectCatogery = eu.readData("Submit Requirements", 4, 4);
		String Make = eu.readData("Submit Requirements", 4, 5);
		String Model = eu.readData("Submit Requirements", 4, 6);
		String Trim = eu.readData("Submit Requirements", 4, 7);
		String Year = eu.readData("Submit Requirements", 4, 8);
		String bodytype = eu.readData("Submit Requirements", 4, 9);
		String fueltype = eu.readData("Submit Requirements", 4, 10);
		String transmissiontype = eu.readData("Submit Requirements", 4, 11);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectCategory(selectCatogery);
		submitreq.selectConditionAsUsed();
		submitreq.clickOnDropDown();
		submitreq.buyVehicleAsTaxi(firstName, phoneNumber, email, Make, Model, Trim, Year);
		Thread.sleep(8000);
		submitreq.commonMethodForCarBikeScootyTaxi(bodytype, fueltype, transmissiontype);
	}
	
                 	// TEST SCRIPT FOR VALIDATING BUY AS LOAN AND INSURANCE
	
	@Test(priority = 17)
	public void validatSubmitRequirementAsBuyWithLoanAndInsuranceWithAutoloanAsCar() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 5, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
     	String selectCategory = eu.readData("Submit Requirements", 5, 4);
		submitreq.selectForBuy();
		submitreq.selectSearchingAsLoanAndInsurance();
		submitreq.selectServiceUnderLoanAndInsuranceAsAutoloan();
  	    submitreq.selectCategoryAfterLoanAndInsurance(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
  	    submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
	}
	
	@Test(priority = 18)
	public void validatSubmitRequirementAsBuyWithLoanAndInsuranceWithAutoloanAsMotorCycleOrBike() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 6, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String selectCategory = eu.readData("Submit Requirements", 6, 4);
		submitreq.selectForBuy();
		submitreq.selectSearchingAsLoanAndInsurance();
		submitreq.selectServiceUnderLoanAndInsuranceAsAutoloan();
		submitreq.selectCategoryAfterLoanAndInsurance(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	    submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
	}
	
	@Test(priority = 19)
	public void validatSubmitRequirementAsBuyWithLoanAndInsuranceWithAutoloanAsScooter() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 7, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String selectCategory = eu.readData("Submit Requirements", 7, 4);
		submitreq.selectForBuy();
		submitreq.selectSearchingAsLoanAndInsurance();
		submitreq.selectServiceUnderLoanAndInsuranceAsAutoloan();
		submitreq.selectCategoryAfterLoanAndInsurance(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	    submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
	}
	
	@Test(priority = 20)
	public void validatSubmitRequirementAsBuyWithLoanAndInsuranceWithAutoloanAsTaxi() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 8, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String selectCategory = eu.readData("Submit Requirements", 8, 4);
		submitreq.selectForBuy();
		submitreq.selectSearchingAsLoanAndInsurance();
		submitreq.selectServiceUnderLoanAndInsuranceAsAutoloan();
		submitreq.selectCategoryAfterLoanAndInsurance(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	    submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
	}
	
	@Test(priority = 21)
	public void validatSubmitRequirementAsBuyWithLoanAndInsuranceWithoutAutoloanAsCar() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 5, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
     	String selectCategory = eu.readData("Submit Requirements", 5, 4);
		submitreq.selectForBuy();
		submitreq.selectSearchingAsLoanAndInsurance();
		submitreq.selectServiceUnderLoanAndInsuranceAsInsurance();
  	    submitreq.selectCategoryAfterLoanAndInsurance(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	    submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
	}
	
	@Test(priority = 22)
	public void validatSubmitRequirementAsBuyWithLoanAndInsuranceWithoutAutoloanAsMotorCycleOrBike() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 6, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String selectCategory = eu.readData("Submit Requirements", 6, 4);
		submitreq.selectForBuy();
		submitreq.selectSearchingAsLoanAndInsurance();
		submitreq.selectServiceUnderLoanAndInsuranceAsInsurance();
		submitreq.selectCategoryAfterLoanAndInsurance(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	    submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
	}
	
	@Test(priority = 23)
	public void validatSubmitRequirementAsBuyWithLoanAndInsuranceWithoutAutoloanAsScooter() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 7, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String selectCategory = eu.readData("Submit Requirements", 7, 4);
		submitreq.selectForBuy();
		submitreq.selectSearchingAsLoanAndInsurance();
		submitreq.selectServiceUnderLoanAndInsuranceAsInsurance();
		submitreq.selectCategoryAfterLoanAndInsurance(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	    submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
	}
	
	@Test(priority = 24)
	public void validatSubmitRequirementAsBuyWithLoanAndInsuranceWithoutAutoloanAsTaxi() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 8, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String selectCategory = eu.readData("Submit Requirements", 8, 4);
		submitreq.selectForBuy();
		submitreq.selectSearchingAsLoanAndInsurance();
		submitreq.selectServiceUnderLoanAndInsuranceAsInsurance();
		submitreq.selectCategoryAfterLoanAndInsurance(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	    submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
	}
	
	             // TEST SCRIPT FOR VALIDATING BUY AS CERTIFICATION SERVICES
	
	@Test(priority = 25)
	public void validatSubmitRequirementAsBuyWithCertificationServicesAsCar() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 13, 1);
		System.out.println(firstName);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
     	String selectCategory = eu.readData("Submit Requirements", 13, 4);
     	System.out.println(selectCategory);
		submitreq.selectForBuy();
		submitreq.selectSearchingAsCertificationServices();
  	    submitreq.selectCategoryAfterCertificationServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	    submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
	}
	
	@Test(priority = 26)
	public void validatSubmitRequirementAsBuyWithCertificationServicesAsMotorCycleOrBike() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 14, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String selectCategory = eu.readData("Submit Requirements", 14, 4);
		submitreq.selectForBuy();
		submitreq.selectSearchingAsCertificationServices();
		submitreq.selectCategoryAfterCertificationServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	    submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
	}
	
	@Test(priority = 27)
	public void validatSubmitRequirementAsBuyWithCertificationServicesAsScooter() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 15, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String selectCategory = eu.readData("Submit Requirements", 15, 4);
		submitreq.selectForBuy();
		submitreq.selectSearchingAsCertificationServices();
		submitreq.selectCategoryAfterCertificationServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	    submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
	}
	
	@Test(priority = 28)
	public void validatSubmitRequirementAsBuyWithCertificationServicesAsTaxi() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 16, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String selectCategory = eu.readData("Submit Requirements", 16, 4);
		submitreq.selectForBuy();
		submitreq.selectSearchingAsCertificationServices();
		submitreq.selectCategoryAfterCertificationServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	    submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
	}
	
	// TEST SCRIPT FOR VALIDATING BUY AS AUTOMOBILE SERVICES WITH REGISTRATION TRANSFER SERVICE
	
	@Test(priority=29)
	public void validateSubmitRequirementWithBuyAutomobileServicesAsRegistrationTransferServiceAsCar()
	{
		String searchingFor = eu.readData("Submit Requirements", 17, 12);
		String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 17, 13);
		String selectCategory = eu.readData("Submit Requirements", 17, 4);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
		submitreq.selectCategoryAfterAutomobileServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.msgAsThankYou();
	}
	@Test(priority=30)
	public void validateSubmitRequirementWithBuyAutomobileServicesAsRegistrationTransferServiceAsMotorCycleOrBike()
	{
		String searchingFor = eu.readData("Submit Requirements", 17, 12);
		String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 17, 13);
		System.out.println(searchingFor);
		System.out.println(selectCatogeryUnderAutoService);
		String selectCategory = eu.readData("Submit Requirements", 18, 4);
		System.out.println(selectCategory);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
		submitreq.selectCategoryAfterAutomobileServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.msgAsThankYou();
	}
	@Test(priority=31)
	public void validateSubmitRequirementWithBuyAutomobileServicesAsRegistrationTransferServiceAsScooter()
	{
		String searchingFor = eu.readData("Submit Requirements", 17, 12);
		String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 17, 13);
		System.out.println(searchingFor);
		System.out.println(selectCatogeryUnderAutoService);
		String selectCategory = eu.readData("Submit Requirements", 19, 4);
		System.out.println(selectCategory);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
		submitreq.selectCategoryAfterAutomobileServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.msgAsThankYou();
	}
	@Test(priority=32)
	public void validateSubmitRequirementWithBuyAutomobileServicesAsRegistrationTransferServiceAsTaxi()
	{
		String searchingFor = eu.readData("Submit Requirements", 17, 12);
		String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 17, 13);
		System.out.println(searchingFor);
		System.out.println(selectCatogeryUnderAutoService);
		String selectCategory = eu.readData("Submit Requirements", 20, 4);
		System.out.println(selectCategory);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
		submitreq.selectCategoryAfterAutomobileServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.msgAsThankYou();
	}
	
	// TEST SCRIPT FOR VALIDATING BUY AS AUTOMOBILE SERVICES WITH REPAIR AND MAINTENANCE 
	
	@Test(priority=33)
	public void validateSubmitRequirementWithBuyAutomobileServicesAsRepairAndMaintenanceAsCar()
	{
		String searchingFor = eu.readData("Submit Requirements", 17, 12);
		String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 18, 13);
		System.out.println(searchingFor);
		System.out.println(selectCatogeryUnderAutoService);
		String selectCategory = eu.readData("Submit Requirements", 17, 4);
		System.out.println(selectCategory);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
		submitreq.selectCategoryAfterAutomobileServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.msgAsThankYou();
	}
	@Test(priority=34)
	public void validateSubmitRequirementWithBuyAutomobileServicesAsRepairAndMaintenanceAsMotorCycleOrBike()
	{
		String searchingFor = eu.readData("Submit Requirements", 17, 12);
		String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 18, 13);
		System.out.println(searchingFor);
		System.out.println(selectCatogeryUnderAutoService);
		String selectCategory = eu.readData("Submit Requirements", 18, 4);
		System.out.println(selectCategory);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
		submitreq.selectCategoryAfterAutomobileServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.msgAsThankYou();
	}
	@Test(priority=35)
	public void validateSubmitRequirementWithBuyAutomobileServicesAsRepairAndMaintenanceAsScooter()
	{
		String searchingFor = eu.readData("Submit Requirements", 17, 12);
		String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 18, 13);
		System.out.println(searchingFor);
		System.out.println(selectCatogeryUnderAutoService);
		String selectCategory = eu.readData("Submit Requirements", 19, 4);
		System.out.println(selectCategory);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
		submitreq.selectCategoryAfterAutomobileServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.msgAsThankYou();
	}
	@Test(priority=36)
	public void validateSubmitRequirementWithBuyAutomobileServicesAsRepairAndMaintenanceAsTaxi()
	{
		String searchingFor = eu.readData("Submit Requirements", 17, 12);
		String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 18, 13);
		System.out.println(searchingFor);
		System.out.println(selectCatogeryUnderAutoService);
		String selectCategory = eu.readData("Submit Requirements", 20, 4);
		System.out.println(selectCategory);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
		submitreq.selectCategoryAfterAutomobileServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.msgAsThankYou();
	}
	
	// TEST SCRIPT FOR VALIDATING BUY AS AUTOMOBILE SERVICES WITH WARRANTY
	
	@Test(priority=37)
	public void validateSubmitRequirementWithBuyAutomobileServicesAsWarrantyAsCar()
	{
		String searchingFor = eu.readData("Submit Requirements", 17, 12);
		String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 19, 13);
		String selectCategory = eu.readData("Submit Requirements", 17, 4);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
		submitreq.selectCategoryAfterAutomobileServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.msgAsThankYou();
	}
	@Test(priority=38)
	public void validateSubmitRequirementWithBuyAutomobileServicesAsWarrantyAsMotorCycleOrBike()
	{
		String searchingFor = eu.readData("Submit Requirements", 17, 12);
		String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 19, 13);
		String selectCategory = eu.readData("Submit Requirements", 18, 4);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
		submitreq.selectCategoryAfterAutomobileServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.msgAsThankYou();
	}
	@Test(priority=39)
	public void validateSubmitRequirementWithBuyAutomobileServicesAsWarrantyAsScooter()
	{
		String searchingFor = eu.readData("Submit Requirements", 17, 12);
		String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 19, 13);
		String selectCategory = eu.readData("Submit Requirements", 19, 4);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
		submitreq.selectCategoryAfterAutomobileServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.msgAsThankYou();
	}
	@Test(priority=40)
	public void validateSubmitRequirementWithBuyAutomobileServicesAsWarrantyAsTaxi()
	{
		String searchingFor = eu.readData("Submit Requirements", 17, 12);
		String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 20, 13);
		String selectCategory = eu.readData("Submit Requirements", 20, 4);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
		submitreq.selectCategoryAfterAutomobileServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.msgAsThankYou();
	}
	
	// TEST SCRIPT FOR VALIDATING BUY AS AUTOMOBILE SERVICES WITH ROAD SIDE ASSISTANCE
	
	@Test(priority=41)
	public void validateSubmitRequirementWithBuyAutomobileServicesAsRoadSideAssistanceAsCar()
	{
		String searchingFor = eu.readData("Submit Requirements", 17, 12);
		String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 20, 13);
		String selectCategory = eu.readData("Submit Requirements", 17, 4);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
		submitreq.selectCategoryAfterAutomobileServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.msgAsThankYou();
	}
	@Test(priority=42)
	public void validateSubmitRequirementWithBuyAutomobileServicesAsRoadSideAssistanceAsMotorCycleOrBike()
	{
		String searchingFor = eu.readData("Submit Requirements", 17, 12);
		String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 20, 13);
		String selectCategory = eu.readData("Submit Requirements", 18, 4);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
		submitreq.selectCategoryAfterAutomobileServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.msgAsThankYou();
	}
	@Test(priority=43)
	public void validateSubmitRequirementWithBuyAutomobileServicesAsRoadSideAssistanceAsScooter()
	{
		String searchingFor = eu.readData("Submit Requirements", 17, 12);
		String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 20, 13);
		String selectCategory = eu.readData("Submit Requirements", 19, 4);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
		submitreq.selectCategoryAfterAutomobileServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.msgAsThankYou();
	}
	@Test(priority=44)
	public void validateSubmitRequirementWithBuyAutomobileServicesAsRoadSideAssistanceAsTaxi()
	{
		String searchingFor = eu.readData("Submit Requirements", 17, 12);
		String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 20, 13);
		String selectCategory = eu.readData("Submit Requirements", 20, 4);
		submitreq.selectForBuy();
		submitreq.selectWhatAreYouSearchingFor(searchingFor);
		submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
		submitreq.selectCategoryAfterAutomobileServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.msgAsThankYou();
	}
	
	// TEST SCRIPT FOR VALIDATING BUY AS AUTOMOBILE SERVICES WITH DENTING AND PAINTING
	
		@Test(priority=45)
		public void validateSubmitRequirementWithBuyAutomobileServicesAsDentingAndPaintingAsCar()
		{
			String searchingFor = eu.readData("Submit Requirements", 17, 12);
			String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 21, 13);
			String selectCategory = eu.readData("Submit Requirements", 17, 4);
			submitreq.selectForBuy();
			submitreq.selectWhatAreYouSearchingFor(searchingFor);
			submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
			submitreq.selectCategoryAfterAutomobileServices(selectCategory);
			submitreq.selectLocationForOtherPopup();
			submitreq.enterBuyerDetails(firstName, phoneNumber, email);
			submitreq.clickSubmitAfterBuyerDetails();
			submitreq.msgAsThankYou();
		}
		@Test(priority=46)
		public void validateSubmitRequirementWithBuyAutomobileServicesAsDentingAndPaintingAsMotorCycleOrBike()
		{
			String searchingFor = eu.readData("Submit Requirements", 17, 12);
			String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 21, 13);
			String selectCategory = eu.readData("Submit Requirements", 18, 4);
			submitreq.selectForBuy();
			submitreq.selectWhatAreYouSearchingFor(searchingFor);
			submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
			submitreq.selectCategoryAfterAutomobileServices(selectCategory);
			submitreq.selectLocationForOtherPopup();
			submitreq.enterBuyerDetails(firstName, phoneNumber, email);
			submitreq.clickSubmitAfterBuyerDetails();
			submitreq.msgAsThankYou();
		}
		@Test(priority=47)
		public void validateSubmitRequirementWithBuyAutomobileServicesAsDentingAndPaintingAsScooter()
		{
			String searchingFor = eu.readData("Submit Requirements", 17, 12);
			String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 21, 13);
			String selectCategory = eu.readData("Submit Requirements", 19, 4);
			submitreq.selectForBuy();
			submitreq.selectWhatAreYouSearchingFor(searchingFor);
			submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
			submitreq.selectCategoryAfterAutomobileServices(selectCategory);
			submitreq.selectLocationForOtherPopup();
			submitreq.enterBuyerDetails(firstName, phoneNumber, email);
			submitreq.clickSubmitAfterBuyerDetails();
			submitreq.msgAsThankYou();
		}
		@Test(priority=48)
		public void validateSubmitRequirementWithBuyAutomobileServicesAsDentingAndPaintingAsTaxi()
		{
			String searchingFor = eu.readData("Submit Requirements", 17, 12);
			String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 21, 13);
			String selectCategory = eu.readData("Submit Requirements", 20, 4);
			submitreq.selectForBuy();
			submitreq.selectWhatAreYouSearchingFor(searchingFor);
			submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
			submitreq.selectCategoryAfterAutomobileServices(selectCategory);
			submitreq.selectLocationForOtherPopup();
			submitreq.enterBuyerDetails(firstName, phoneNumber, email);
			submitreq.clickSubmitAfterBuyerDetails();
			submitreq.msgAsThankYou();
		}
		
		// TEST SCRIPT FOR VALIDATING BUY AS AUTOMOBILE SERVICES WITH CAR CARE & DETAILING
		
		@Test(priority=49)
		public void validateSubmitRequirementWithBuyAutomobileServicesAsCarCareAndDetailingAsCar()
		{
			String searchingFor = eu.readData("Submit Requirements", 17, 12);
			String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 22, 13);
			String selectCategory = eu.readData("Submit Requirements", 17, 4);
			submitreq.selectForBuy();
			submitreq.selectWhatAreYouSearchingFor(searchingFor);
			submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
			submitreq.selectCategoryAfterAutomobileServices(selectCategory);
			submitreq.selectLocationForOtherPopup();
			submitreq.enterBuyerDetails(firstName, phoneNumber, email);
			submitreq.clickSubmitAfterBuyerDetails();
			submitreq.msgAsThankYou();
		}
		@Test(priority=50)
		public void validateSubmitRequirementWithBuyAutomobileServicesAsCarCareAndDetailingAsMotorCycleOrBike()
		{
			String searchingFor = eu.readData("Submit Requirements", 17, 12);
			String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 22, 13);
			String selectCategory = eu.readData("Submit Requirements", 18, 4);
			submitreq.selectForBuy();
			submitreq.selectWhatAreYouSearchingFor(searchingFor);
			submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
			submitreq.selectCategoryAfterAutomobileServices(selectCategory);
			submitreq.selectLocationForOtherPopup();
			submitreq.enterBuyerDetails(firstName, phoneNumber, email);
			submitreq.clickSubmitAfterBuyerDetails();
			submitreq.msgAsThankYou();
		}
		@Test(priority=51)
		public void validateSubmitRequirementWithBuyAutomobileServicesAsCarCareAndDetailingAsScooter()
		{
			String searchingFor = eu.readData("Submit Requirements", 17, 12);
			String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 22, 13);
			String selectCategory = eu.readData("Submit Requirements", 19, 4);
			submitreq.selectForBuy();
			submitreq.selectWhatAreYouSearchingFor(searchingFor);
			submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
			submitreq.selectCategoryAfterAutomobileServices(selectCategory);
			submitreq.selectLocationForOtherPopup();
			submitreq.enterBuyerDetails(firstName, phoneNumber, email);
			submitreq.clickSubmitAfterBuyerDetails();
			submitreq.msgAsThankYou();
		}
		@Test(priority=52)
		public void validateSubmitRequirementWithBuyAutomobileServicesAsCarCareAndDetailingAsTaxi()
		{
			String searchingFor = eu.readData("Submit Requirements", 17, 12);
			String selectCatogeryUnderAutoService = eu.readData("Submit Requirements", 22, 13);
			String selectCategory = eu.readData("Submit Requirements", 20, 4);
			submitreq.selectForBuy();
			submitreq.selectWhatAreYouSearchingFor(searchingFor);
			submitreq.selectServiceAfterAutomobileService(selectCatogeryUnderAutoService);
			submitreq.selectCategoryAfterAutomobileServices(selectCategory);
			submitreq.selectLocationForOtherPopup();
			submitreq.enterBuyerDetails(firstName, phoneNumber, email);
			submitreq.clickSubmitAfterBuyerDetails();
			submitreq.msgAsThankYou();
		}
		
		// --------------------FOR BUY FEATURE---------------->>>>>>>>>>>>>>>>>>>>>>
		
		@Test(priority = 53)
		public void validateSellWithVehiclesAsBus()
		{
			String enterCategory = eu.readData("Submit Requirements For Sell", 1, 1);
			String firstName = eu.readData("Submit Requirements For Sell", 1, 2);
			String lastName = eu.readData("Submit Requirements For Sell", 1, 3);
			String phoneNumber = eu.readData("Submit Requirements For Sell", 1, 4);
			String email = eu.readData("Submit Requirements For Sell", 1, 5);
			String enterSellCategory = eu.readData("Submit Requirements For Sell", 1, 6);
			String enterPincode = eu.readData("Submit Requirements For Sell", 1, 7);
			String enterKmDriver = eu.readData("Submit Requirements For Sell", 1, 8);
			String Make = eu.readData("Submit Requirements For Sell", 1, 9);
			String Model = eu.readData("Submit Requirements For Sell", 1, 10);
			String Trim = eu.readData("Submit Requirements For Sell", 1,11);
			String Year = eu.readData("Submit Requirements For Sell", 1, 12);
			submitreq.selectForSell();
			submitreq.selectCategoryAfterSell(enterCategory);
			submitreq.enterSellerDetails(firstName, lastName, phoneNumber, email);
			submitreq.enterSellerDeatilsAfterNumber(enterSellCategory, enterPincode, enterKmDriver, Make, Model, Trim, Year);
		}
		
		@Test(priority = 54)
		public void validateSellWithVehiclesAsCar()
		{
			String enterCategory = eu.readData("Submit Requirements For Sell", 1, 1);
			String firstName = eu.readData("Submit Requirements For Sell", 1, 2);
			String lastName = eu.readData("Submit Requirements For Sell", 1, 3);
			String phoneNumber = eu.readData("Submit Requirements For Sell", 1, 4);
			String email = eu.readData("Submit Requirements For Sell", 1, 5);
			String enterSellCategory = eu.readData("Submit Requirements For Sell", 2, 6);
			String enterPincode = eu.readData("Submit Requirements For Sell", 1, 7);
			String enterKmDriver = eu.readData("Submit Requirements For Sell", 1, 8);
			String Make = eu.readData("Submit Requirements For Sell", 2, 9);
			String Model = eu.readData("Submit Requirements For Sell", 2, 10);
			String Trim = eu.readData("Submit Requirements For Sell", 2,11);
			String Year = eu.readData("Submit Requirements For Sell", 2, 12);
			submitreq.selectForSell();
			submitreq.enterSellerDetails(firstName, lastName, phoneNumber, email);
			submitreq.enterSellerDeatilsAfterNumber(enterSellCategory, enterPincode, enterKmDriver, Make, Model, Trim, Year);
		}
		
		@Test(priority = 55)
		public void validateSellWithVehiclesAsMotorcycle_Bike()
		{
			String enterCategory = eu.readData("Submit Requirements For Sell", 1, 1);
			String firstName = eu.readData("Submit Requirements For Sell", 1, 2);
			String lastName = eu.readData("Submit Requirements For Sell", 1, 3);
			String phoneNumber = eu.readData("Submit Requirements For Sell", 1, 4);
			String email = eu.readData("Submit Requirements For Sell", 1, 5);
			String enterSellCategory = eu.readData("Submit Requirements For Sell", 3, 6);
			String enterPincode = eu.readData("Submit Requirements For Sell", 1, 7);
			String enterKmDriver = eu.readData("Submit Requirements For Sell", 1, 8);
			String Make = eu.readData("Submit Requirements For Sell", 3, 9);
			String Model = eu.readData("Submit Requirements For Sell", 3, 10);
			String Trim = eu.readData("Submit Requirements For Sell", 3,11);
			String Year = eu.readData("Submit Requirements For Sell", 3, 12);
			submitreq.selectForSell();
			submitreq.enterSellerDetails(firstName, lastName, phoneNumber, email);
			submitreq.enterSellerDeatilsAfterNumber(enterSellCategory, enterPincode, enterKmDriver, Make, Model, Trim, Year);
		}
		
		@Test(priority = 56)
		public void validateSellWithVehiclesAsPremium_SuperCar()
		{
			String enterCategory = eu.readData("Submit Requirements For Sell", 1, 1);
			String firstName = eu.readData("Submit Requirements For Sell", 1, 2);
			String lastName = eu.readData("Submit Requirements For Sell", 1, 3);
			String phoneNumber = eu.readData("Submit Requirements For Sell", 1, 4);
			String email = eu.readData("Submit Requirements For Sell", 1, 5);
			String enterSellCategory = eu.readData("Submit Requirements For Sell", 4, 6);
			String enterPincode = eu.readData("Submit Requirements For Sell", 1, 7);
			String enterKmDriver = eu.readData("Submit Requirements For Sell", 1, 8);
			String Make = eu.readData("Submit Requirements For Sell", 4, 9);
			String Model = eu.readData("Submit Requirements For Sell", 4, 10);
			String Trim = eu.readData("Submit Requirements For Sell", 4,11);
			String Year = eu.readData("Submit Requirements For Sell", 4, 12);
			submitreq.selectForSell();
			submitreq.enterSellerDetails(firstName, lastName, phoneNumber, email);
			submitreq.enterSellerDeatilsAfterNumber(enterSellCategory, enterPincode, enterKmDriver, Make, Model, Trim, Year);
		}
		
		@Test(priority = 57)
		public void validateSellWithVehiclesAsScooter()
		{
			String enterCategory = eu.readData("Submit Requirements For Sell", 1, 1);
			String firstName = eu.readData("Submit Requirements For Sell", 1, 2);
			String lastName = eu.readData("Submit Requirements For Sell", 1, 3);
			String phoneNumber = eu.readData("Submit Requirements For Sell", 1, 4);
			String email = eu.readData("Submit Requirements For Sell", 1, 5);
			String enterSellCategory = eu.readData("Submit Requirements For Sell", 5, 6);
			String enterPincode = eu.readData("Submit Requirements For Sell", 1, 7);
			String enterKmDriver = eu.readData("Submit Requirements For Sell", 1, 8);
			String Make = eu.readData("Submit Requirements For Sell", 5, 9);
			String Model = eu.readData("Submit Requirements For Sell", 5, 10);
			String Trim = eu.readData("Submit Requirements For Sell", 5,11);
			String Year = eu.readData("Submit Requirements For Sell", 5, 12);
			submitreq.selectForSell();
			submitreq.enterSellerDetails(firstName, lastName, phoneNumber, email);
			submitreq.enterSellerDeatilsAfterNumber(enterSellCategory, enterPincode, enterKmDriver, Make, Model, Trim, Year);
		}
		
		@Test(priority = 58)
		public void validateSellWithVehiclesAsTaxi()
		{
			String enterCategory = eu.readData("Submit Requirements For Sell", 1, 1);
			String firstName = eu.readData("Submit Requirements For Sell", 1, 2);
			String lastName = eu.readData("Submit Requirements For Sell", 1, 3);
			String phoneNumber = eu.readData("Submit Requirements For Sell", 1, 4);
			String email = eu.readData("Submit Requirements For Sell", 1, 5);
			String enterSellCategory = eu.readData("Submit Requirements For Sell", 6, 6);
			String enterPincode = eu.readData("Submit Requirements For Sell", 1, 7);
			String enterKmDriver = eu.readData("Submit Requirements For Sell", 1, 8);
			String Make = eu.readData("Submit Requirements For Sell", 6, 9);
			String Model = eu.readData("Submit Requirements For Sell", 6, 10);
			String Trim = eu.readData("Submit Requirements For Sell", 6,11);
			String Year = eu.readData("Submit Requirements For Sell", 6, 12);
			submitreq.selectForSell();
			submitreq.enterSellerDetails(firstName, lastName, phoneNumber, email);
			submitreq.enterSellerDeatilsAfterNumber(enterSellCategory, enterPincode, enterKmDriver, Make, Model, Trim, Year);
		}
		
		//----------------------FOR BUY FEATURE AS LOGGED IN USER---------------->>>>>>>>
		
		@Test(priority = 53)
		public void validateSellAsLoggedInUserWithVehiclesAsBus()
		{
			String enterCategory = eu.readData("Submit Requirements For Sell", 1, 1);
			String firstName = eu.readData("Submit Requirements For Sell", 1, 2);
			String lastName = eu.readData("Submit Requirements For Sell", 1, 3);
			String phoneNumber = eu.readData("Submit Requirements For Sell", 1, 4);
			String email = eu.readData("Submit Requirements For Sell", 1, 5);
			String enterSellCategory = eu.readData("Submit Requirements For Sell", 1, 6);
			String enterPincode = eu.readData("Submit Requirements For Sell", 1, 7);
			String enterKmDriver = eu.readData("Submit Requirements For Sell", 1, 8);
			String Make = eu.readData("Submit Requirements For Sell", 1, 9);
			String Model = eu.readData("Submit Requirements For Sell", 1, 10);
			String Trim = eu.readData("Submit Requirements For Sell", 1,11);
			String Year = eu.readData("Submit Requirements For Sell", 1, 12);
			String username = eu.readData("Submit Requirements For Sell", 1,13);
			String password = eu.readData("Submit Requirements For Sell", 1, 14);
			submitreq.submitReqAsIndividualLoggedInUser(username, password);
			submitreq.selectForSell();
			submitreq.selectCategoryAfterSell(enterCategory);
			submitreq.enterSellerDeatilsAfterNumber(enterSellCategory, enterPincode, enterKmDriver, Make, Model, Trim, Year);
		}
		
		@Test(priority = 54)
		public void validateSellAsLoggedInUserWithVehiclesAsCar()
		{
			String enterCategory = eu.readData("Submit Requirements For Sell", 1, 1);
			String firstName = eu.readData("Submit Requirements For Sell", 1, 2);
			String lastName = eu.readData("Submit Requirements For Sell", 1, 3);
			String phoneNumber = eu.readData("Submit Requirements For Sell", 1, 4);
			String email = eu.readData("Submit Requirements For Sell", 1, 5);
			String enterSellCategory = eu.readData("Submit Requirements For Sell", 2, 6);
			String enterPincode = eu.readData("Submit Requirements For Sell", 1, 7);
			String enterKmDriver = eu.readData("Submit Requirements For Sell", 1, 8);
			String Make = eu.readData("Submit Requirements For Sell", 2, 9);
			String Model = eu.readData("Submit Requirements For Sell", 2, 10);
			String Trim = eu.readData("Submit Requirements For Sell", 2,11);
			String Year = eu.readData("Submit Requirements For Sell", 2, 12);
			String username = eu.readData("Submit Requirements For Sell", 1,13);
			String password = eu.readData("Submit Requirements For Sell", 1, 14);
			submitreq.submitReqAsIndividualLoggedInUser(username, password);
			submitreq.selectForSell();
			submitreq.selectCategoryAfterSell(enterCategory);
			submitreq.enterSellerDeatilsAfterNumber(enterSellCategory, enterPincode, enterKmDriver, Make, Model, Trim, Year);
		}
		
		@Test(priority = 55)
		public void validateSellAsLoggedInUserWithVehiclesAsMotorcycle_Bike()
		{
			String enterCategory = eu.readData("Submit Requirements For Sell", 1, 1);
			String firstName = eu.readData("Submit Requirements For Sell", 1, 2);
			String lastName = eu.readData("Submit Requirements For Sell", 1, 3);
			String phoneNumber = eu.readData("Submit Requirements For Sell", 1, 4);
			String email = eu.readData("Submit Requirements For Sell", 1, 5);
			String enterSellCategory = eu.readData("Submit Requirements For Sell", 3, 6);
			String enterPincode = eu.readData("Submit Requirements For Sell", 1, 7);
			String enterKmDriver = eu.readData("Submit Requirements For Sell", 1, 8);
			String Make = eu.readData("Submit Requirements For Sell", 3, 9);
			String Model = eu.readData("Submit Requirements For Sell", 3, 10);
			String Trim = eu.readData("Submit Requirements For Sell", 3,11);
			String Year = eu.readData("Submit Requirements For Sell", 3, 12);
			String username = eu.readData("Submit Requirements For Sell", 1,13);
			String password = eu.readData("Submit Requirements For Sell", 1, 14);
			submitreq.submitReqAsIndividualLoggedInUser(username, password);
			submitreq.selectForSell();
			submitreq.selectCategoryAfterSell(enterCategory);
			submitreq.enterSellerDeatilsAfterNumber(enterSellCategory, enterPincode, enterKmDriver, Make, Model, Trim, Year);
		}
		
		@Test(priority = 56)
		public void validateSellAsLoggedInUserWithVehiclesAsPremium_SuperCar()
		{
			String enterCategory = eu.readData("Submit Requirements For Sell", 1, 1);
			String firstName = eu.readData("Submit Requirements For Sell", 1, 2);
			String lastName = eu.readData("Submit Requirements For Sell", 1, 3);
			String phoneNumber = eu.readData("Submit Requirements For Sell", 1, 4);
			String email = eu.readData("Submit Requirements For Sell", 1, 5);
			String enterSellCategory = eu.readData("Submit Requirements For Sell", 4, 6);
			String enterPincode = eu.readData("Submit Requirements For Sell", 1, 7);
			String enterKmDriver = eu.readData("Submit Requirements For Sell", 1, 8);
			String Make = eu.readData("Submit Requirements For Sell", 4, 9);
			String Model = eu.readData("Submit Requirements For Sell", 4, 10);
			String Trim = eu.readData("Submit Requirements For Sell", 4,11);
			String Year = eu.readData("Submit Requirements For Sell", 4, 12);
			String username = eu.readData("Submit Requirements For Sell", 1,13);
			String password = eu.readData("Submit Requirements For Sell", 1, 14);
			submitreq.submitReqAsIndividualLoggedInUser(username, password);
			submitreq.selectForSell();
			submitreq.selectCategoryAfterSell(enterCategory);
			submitreq.enterSellerDeatilsAfterNumber(enterSellCategory, enterPincode, enterKmDriver, Make, Model, Trim, Year);
		}
		
		@Test(priority = 57)
		public void validateSellAsLoggedInUserWithVehiclesAsScooter()
		{
			String enterCategory = eu.readData("Submit Requirements For Sell", 1, 1);
			String firstName = eu.readData("Submit Requirements For Sell", 1, 2);
			String lastName = eu.readData("Submit Requirements For Sell", 1, 3);
			String phoneNumber = eu.readData("Submit Requirements For Sell", 1, 4);
			String email = eu.readData("Submit Requirements For Sell", 1, 5);
			String enterSellCategory = eu.readData("Submit Requirements For Sell", 5, 6);
			String enterPincode = eu.readData("Submit Requirements For Sell", 1, 7);
			String enterKmDriver = eu.readData("Submit Requirements For Sell", 1, 8);
			String Make = eu.readData("Submit Requirements For Sell", 5, 9);
			String Model = eu.readData("Submit Requirements For Sell", 5, 10);
			String Trim = eu.readData("Submit Requirements For Sell", 5,11);
			String Year = eu.readData("Submit Requirements For Sell", 5, 12);
			String username = eu.readData("Submit Requirements For Sell", 1,13);
			String password = eu.readData("Submit Requirements For Sell", 1, 14);
			submitreq.submitReqAsIndividualLoggedInUser(username, password);
			submitreq.selectForSell();
			submitreq.selectCategoryAfterSell(enterCategory);
			submitreq.enterSellerDeatilsAfterNumber(enterSellCategory, enterPincode, enterKmDriver, Make, Model, Trim, Year);
		}
		
		@Test(priority = 58)
		public void validateSellAsLoggedInUserWithVehiclesAsTaxi()
		{
			String enterCategory = eu.readData("Submit Requirements For Sell", 1, 1);
			String firstName = eu.readData("Submit Requirements For Sell", 1, 2);
			String lastName = eu.readData("Submit Requirements For Sell", 1, 3);
			String phoneNumber = eu.readData("Submit Requirements For Sell", 1, 4);
			String email = eu.readData("Submit Requirements For Sell", 1, 5);
			String enterSellCategory = eu.readData("Submit Requirements For Sell", 6, 6);
			String enterPincode = eu.readData("Submit Requirements For Sell", 1, 7);
			String enterKmDriver = eu.readData("Submit Requirements For Sell", 1, 8);
			String Make = eu.readData("Submit Requirements For Sell", 6, 9);
			String Model = eu.readData("Submit Requirements For Sell", 6, 10);
			String Trim = eu.readData("Submit Requirements For Sell", 6,11);
			String Year = eu.readData("Submit Requirements For Sell", 6, 12);
			String username = eu.readData("Submit Requirements For Sell", 1,13);
			String password = eu.readData("Submit Requirements For Sell", 1, 14);
			submitreq.submitReqAsIndividualLoggedInUser(username, password);
			submitreq.selectForSell();
			submitreq.selectCategoryAfterSell(enterCategory);
			submitreq.enterSellerDeatilsAfterNumber(enterSellCategory, enterPincode, enterKmDriver, Make, Model, Trim, Year);
		}
		
	 //-------------------OTHER SERVICES------------>>>>>>>>>>>
	
		@Test(priority = 59)
		public void validateLoanAndInsuranceAsLoggedInUser()
		{
			String enterCategory = eu.readData("Submit Requirements For Sell", 7, 1);
			String username = eu.readData("Submit Requirements For Sell", 7,13);
			String password = eu.readData("Submit Requirements For Sell", 7, 14);
			submitreq.submitReqAsProSellerLoggedInUser(username, password);
			submitreq.selectForSell();
			submitreq.selectCategoryAfterSell(enterCategory);
		}
		@Test(priority = 60)
		public void validateCertifactionServicesAsLoggedInUser()
		{
			String enterCategory = eu.readData("Submit Requirements For Sell", 8, 1);
			String username = eu.readData("Submit Requirements For Sell", 7,13);
			String password = eu.readData("Submit Requirements For Sell", 7, 14);
			submitreq.submitReqAsProSellerLoggedInUser(username, password);
			submitreq.selectForSell();
			submitreq.selectCategoryAfterSell(enterCategory);
		}
		@Test(priority = 61)
		public void validateAutomobileServicesAsLoggedInUser()
		{
			String enterCategory = eu.readData("Submit Requirements For Sell", 9, 1);
			String username = eu.readData("Submit Requirements For Sell", 7,13);
			String password = eu.readData("Submit Requirements For Sell", 7, 14);
			submitreq.submitReqAsProSellerLoggedInUser(username, password);
			submitreq.selectForSell();
			submitreq.selectCategoryAfterSell(enterCategory);
		}
		@Test(priority = 62)
		public void validateEverythingElseAsLoggedInUser()
		{
			String enterCategory = eu.readData("Submit Requirements For Sell", 10, 1);
			String username = eu.readData("Submit Requirements For Sell", 7,13);
			String password = eu.readData("Submit Requirements For Sell", 7, 14);
			submitreq.submitReqAsProSellerLoggedInUser(username, password);
			submitreq.selectForSell();
			submitreq.selectCategoryAfterSell(enterCategory);
		}
		//-----------------------EXCHANGE FEATURE AS ALREADY REGISTERED INDIVIDUAL---------------->>>>>>>>>>>>>>>>>>>>
		
		@Test(priority = 63)
		public void validateSubmitRequirementAsExchangeWithNewCar()
		{
		String selectCategory = eu.readData("Submit Requirements", 17, 4);
		submitreq.selectForExchange();
		submitreq.selectCategoryForExchange(selectCategory);
		submitreq.selectConditionAsNew();
		submitreq.selectLocation();
		submitreq.clickContinueAfterSelectingLocation();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		}
		@Test(priority = 64)
		public void validateSubmitRequirementAsExchangeWithNewMotercycle_Bike()
		{
		String selectCategory = eu.readData("Submit Requirements", 18, 4);
		submitreq.selectForExchange();
		submitreq.selectCategoryForExchange(selectCategory);
		submitreq.selectConditionAsNew();
		submitreq.selectLocation();
		submitreq.clickContinueAfterSelectingLocation();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		}
		@Test(priority = 65)
		public void validateSubmitRequirementAsExchangeWithNewScooter()
		{
		String selectCategory = eu.readData("Submit Requirements", 19, 4);
		submitreq.selectForExchange();
		submitreq.selectCategoryForExchange(selectCategory);
		submitreq.selectConditionAsNew();
		submitreq.selectLocation();
		submitreq.clickContinueAfterSelectingLocation();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		}
		@Test(priority = 66)
		public void validateSubmitRequirementAsExchangeWithNewTaxi()
		{
		String selectCategory = eu.readData("Submit Requirements", 20, 4);
		submitreq.selectForExchange();
		submitreq.selectCategoryForExchange(selectCategory);
		submitreq.selectConditionAsNew();
		submitreq.selectLocation();
		submitreq.clickContinueAfterSelectingLocation();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		}
		@Test(priority = 67)
		public void validateSubmitRequirementAsExchangeWithUsedCar()
		{
		String selectCategory = eu.readData("Submit Requirements", 17, 4);
		submitreq.selectForExchange();
		submitreq.selectCategoryForExchange(selectCategory);
		submitreq.selectConditionAsUsed();
		submitreq.selectLocation();
		submitreq.clickContinueAfterSelectingLocation();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		}
		@Test(priority = 68)
		public void validateSubmitRequirementAsExchangeWithUsedMotercycle_Bike()
		{
		String selectCategory = eu.readData("Submit Requirements", 18, 4);
		submitreq.selectForExchange();
		submitreq.selectCategoryForExchange(selectCategory);
		submitreq.selectConditionAsUsed();
		submitreq.selectLocation();
		submitreq.clickContinueAfterSelectingLocation();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		}
		@Test(priority = 69)
		public void validateSubmitRequirementAsExchangeWithUsedScooter()
		{
		String selectCategory = eu.readData("Submit Requirements", 19, 4);
		submitreq.selectForExchange();
		submitreq.selectCategoryForExchange(selectCategory);
		submitreq.selectConditionAsUsed();
		submitreq.selectLocation();
		submitreq.clickContinueAfterSelectingLocation();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		}
		@Test(priority = 70)
		public void validateSubmitRequirementAsExchangeWithUsedTaxi()
		{
		String selectCategory = eu.readData("Submit Requirements", 20, 4);
		submitreq.selectForExchange();
		submitreq.selectCategoryForExchange(selectCategory);
		submitreq.selectConditionAsUsed();
		submitreq.selectLocation();
		submitreq.clickContinueAfterSelectingLocation();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		}
		
		//-----------------------EXCHANGE FEATURE BY REGISTRING INDIVIDUAL---------------->>>>>>>>>>>>>>>>>>>>
		
		@Test(priority = 71)
		public void validateSubmitRequirementAsExchangeByRegisteringWithNewCar()
		{
		String firstName = eu.readData("Submit Requirements", 6, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String selectCategory = eu.readData("Submit Requirements", 17, 4);
		submitreq.selectForExchange();
		submitreq.selectCategoryForExchange(selectCategory);
		submitreq.selectConditionAsNew();
		submitreq.selectLocation();
		submitreq.clickContinueAfterSelectingLocation();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
		}
		@Test(priority = 72)
		public void validateSubmitRequirementAsExchangeByRegisteringWithNewMotercycle_Bike()
		{
		String firstName = eu.readData("Submit Requirements", 6, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String selectCategory = eu.readData("Submit Requirements", 18, 4);
		submitreq.selectForExchange();
		submitreq.selectCategoryForExchange(selectCategory);
		submitreq.selectConditionAsNew();
		submitreq.selectLocation();
		submitreq.clickContinueAfterSelectingLocation();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
		}
		@Test(priority = 73)
		public void validateSubmitRequirementAsExchangeByRegisteringWithNewScooter()
		{
		String firstName = eu.readData("Submit Requirements", 6, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String selectCategory = eu.readData("Submit Requirements", 19, 4);
		submitreq.selectForExchange();
		submitreq.selectCategoryForExchange(selectCategory);
		submitreq.selectConditionAsNew();
		submitreq.selectLocation();
		submitreq.clickContinueAfterSelectingLocation();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
		}
		@Test(priority = 74)
		public void validateSubmitRequirementAsExchangeByRegisteringWithNewTaxi()
		{
		String firstName = eu.readData("Submit Requirements", 6, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String selectCategory = eu.readData("Submit Requirements", 20, 4);
		submitreq.selectForExchange();
		submitreq.selectCategoryForExchange(selectCategory);
		submitreq.selectConditionAsNew();
		submitreq.selectLocation();
		submitreq.clickContinueAfterSelectingLocation();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
		}
		@Test(priority = 75)
		public void validateSubmitRequirementAsExchangeByRegisteringWithUsedCar()
		{
		String firstName = eu.readData("Submit Requirements", 6, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String selectCategory = eu.readData("Submit Requirements", 17, 4);
		submitreq.selectForExchange();
		submitreq.selectCategoryForExchange(selectCategory);
		submitreq.selectConditionAsUsed();
		submitreq.selectLocation();
		submitreq.clickContinueAfterSelectingLocation();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
		}
		@Test(priority = 76)
		public void validateSubmitRequirementAsExchangeByRegisteringWithUsedMotercycle_Bike()
		{
		String firstName = eu.readData("Submit Requirements", 6, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String selectCategory = eu.readData("Submit Requirements", 18, 4);
		submitreq.selectForExchange();
		submitreq.selectCategoryForExchange(selectCategory);
		submitreq.selectConditionAsUsed();
		submitreq.selectLocation();
		submitreq.clickContinueAfterSelectingLocation();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
		}
		@Test(priority = 77)
		public void validateSubmitRequirementAsExchangeByRegisteringWithUsedScooter()
		{
		String firstName = eu.readData("Submit Requirements", 6, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String selectCategory = eu.readData("Submit Requirements", 19, 4);
		submitreq.selectForExchange();
		submitreq.selectCategoryForExchange(selectCategory);
		submitreq.selectConditionAsUsed();
		submitreq.selectLocation();
		submitreq.clickContinueAfterSelectingLocation();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
		}
		@Test(priority = 78)
		public void validateSubmitRequirementAsExchangeByRegisteringWithUsedTaxi()
		{
		String firstName = eu.readData("Submit Requirements", 6, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String selectCategory = eu.readData("Submit Requirements", 20, 4);
		submitreq.selectForExchange();
		submitreq.selectCategoryForExchange(selectCategory);
		submitreq.selectConditionAsUsed();
		submitreq.selectLocation();
		submitreq.clickContinueAfterSelectingLocation();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
		submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
		}
	
	//-----------------------RENTAL FEATURE BY ALREADY REGISTERED INDIVIDUAL---------------->>>>>>>>>>>>>>>>>>>>
	
	@Test(priority = 71)
	public void validateSubmitRequirementAsRentalWithBikeRentals()
	{
	String selectCategory = eu.readData("Submit Requirements", 21, 4);
	submitreq.selectForRental();
	submitreq.selectCategoryForRental(selectCategory);
	submitreq.selectLocation();
	submitreq.clickContinueAfterSelectingLocation();
	submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	submitreq.clickSubmitAfterBuyerDetails();
	}
	@Test(priority = 71)
	public void validateSubmitRequirementAsRentalWithCarRentals()
	{
	String selectCategory = eu.readData("Submit Requirements", 22, 4);
	submitreq.selectForRental();
	submitreq.selectCategoryForRental(selectCategory);
	submitreq.selectLocation();
	submitreq.clickContinueAfterSelectingLocation();
	submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	submitreq.clickSubmitAfterBuyerDetails();
	}
	@Test(priority = 71)
	public void validateSubmitRequirementAsRentalWithAerialRentals()
	{
	String selectCategory = eu.readData("Submit Requirements", 23, 4);
	submitreq.selectForRental();
	submitreq.selectCategoryForRental(selectCategory);
	submitreq.selectLocation();
	submitreq.clickContinueAfterSelectingLocation();
	submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	submitreq.clickSubmitAfterBuyerDetails();
	}
	@Test(priority = 71)
	public void validateSubmitRequirementAsRentalWithYatchRentals()
	{
	String selectCategory = eu.readData("Submit Requirements", 24, 4);
	submitreq.selectForRental();
	submitreq.selectCategoryForRental(selectCategory);
	submitreq.selectLocation();
	submitreq.clickContinueAfterSelectingLocation();
	submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	submitreq.clickSubmitAfterBuyerDetails();
	}
	
	//-----------------------RENTAL FEATURE BY REGISTRING INDIVIDUAL---------------->>>>>>>>>>>>>>>>>>>>
	
	@Test(priority = 71)
	public void validateSubmitRequirementAsRentalByRegisteringWithBikeRentals()
	{
	String firstName = eu.readData("Submit Requirements", 6, 1);
	String phoneNumber = JavaLibrary.dynamicPhoneNumber();
	String email = JavaLibrary.dynamicUsername();
	String selectCategory = eu.readData("Submit Requirements", 21, 4);
	submitreq.selectForRental();
	submitreq.selectCategoryForRental(selectCategory);
	submitreq.selectLocation();
	submitreq.clickContinueAfterSelectingLocation();
	submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	submitreq.clickSubmitAfterBuyerDetails();
	submitreq.continueToOtpPopup(phoneNumber);
	}
	@Test(priority = 71)
	public void validateSubmitRequirementAsRentalByRegisteringWithCarRentals()
	{
	String firstName = eu.readData("Submit Requirements", 6, 1);
	String phoneNumber = JavaLibrary.dynamicPhoneNumber();
	String email = JavaLibrary.dynamicUsername();
	String selectCategory = eu.readData("Submit Requirements", 22, 4);
	submitreq.selectForRental();
	submitreq.selectCategoryForRental(selectCategory);
	submitreq.selectLocation();
	submitreq.clickContinueAfterSelectingLocation();
	submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	submitreq.clickSubmitAfterBuyerDetails();
	submitreq.continueToOtpPopup(phoneNumber);
	}
	@Test(priority = 71)
	public void validateSubmitRequirementAsRentalByRegisteringWithAerialRentals()
	{
	String firstName = eu.readData("Submit Requirements", 6, 1);
	String phoneNumber = JavaLibrary.dynamicPhoneNumber();
	String email = JavaLibrary.dynamicUsername();
	String selectCategory = eu.readData("Submit Requirements", 23, 4);
	submitreq.selectForRental();
	submitreq.selectCategoryForRental(selectCategory);
	submitreq.selectLocation();
	submitreq.clickContinueAfterSelectingLocation();
	submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	submitreq.clickSubmitAfterBuyerDetails();
	submitreq.continueToOtpPopup(phoneNumber);
	}
	@Test(priority = 71)
	public void validateSubmitRequirementAsRentalByRegisteringWithYatchRentals()
	{
	String firstName = eu.readData("Submit Requirements", 6, 1);
	String phoneNumber = JavaLibrary.dynamicPhoneNumber();
	String email = JavaLibrary.dynamicUsername();
	String selectCategory = eu.readData("Submit Requirements", 24, 4);
	submitreq.selectForRental();
	submitreq.selectCategoryForRental(selectCategory);
	submitreq.selectLocation();
	submitreq.clickContinueAfterSelectingLocation();
	submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	submitreq.clickSubmitAfterBuyerDetails();
	submitreq.continueToOtpPopup(phoneNumber);
	}
}
