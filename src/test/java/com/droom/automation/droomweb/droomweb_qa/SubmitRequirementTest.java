package com.droom.automation.droomweb.droomweb_qa;

import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.lib.JavaLibrary;
import com.droom.automation.page.droomweb.SubmitRequirement;

public class SubmitRequirementTest extends AbstractBaseTest
{
	SubmitRequirement submitreq;
	String filepath;
	ExcelUtilities eu;
	String firstName = "Rahul Sharma";
	String phoneNumber = "7289183692";
	String email = "ra01.sh01@gmail.com";
	
	public SubmitRequirementTest()
	{
		submitreq=new SubmitRequirement();
		this.filepath="C:/Users/Honey/Desktop/DroomAutomation TestData.xlsx";
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
		String selectCatogery = eu.readData("Submit Requirements", 1, 4);
		String Make = eu.readData("Submit Requirements", 1, 5);
		String Model = eu.readData("Submit Requirements", 1, 6);
		String Trim = eu.readData("Submit Requirements", 1, 7);
		String Year = eu.readData("Submit Requirements", 1, 8);
		String bodytype = eu.readData("Submit Requirements", 1, 9);
		String fueltype = eu.readData("Submit Requirements", 1, 10);
		String transmissiontype = eu.readData("Submit Requirements", 1, 11);
		submitreq.selectForBuy();
		submitreq.selectForVehicles();
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
		String selectCatogery = eu.readData("Submit Requirements", 2, 4);
		String Make = eu.readData("Submit Requirements", 2, 5);
		String Model = eu.readData("Submit Requirements", 2, 6);
		String Trim = eu.readData("Submit Requirements", 2, 7);
		String Year = eu.readData("Submit Requirements", 2, 8);
		String bodytype = eu.readData("Submit Requirements", 2, 9);
		String fueltype = eu.readData("Submit Requirements", 2, 10);
		String transmissiontype = eu.readData("Submit Requirements", 2, 11);
		submitreq.selectForBuy();
		submitreq.selectForVehicles();
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
		String selectCatogery = eu.readData("Submit Requirements", 3, 4);
		String Make = eu.readData("Submit Requirements", 3, 5);
		String Model = eu.readData("Submit Requirements", 3, 6);
		String Trim = eu.readData("Submit Requirements", 3, 7);
		String Year = eu.readData("Submit Requirements", 3, 8);
		String bodytype = eu.readData("Submit Requirements", 3, 9);
		String fueltype = eu.readData("Submit Requirements", 3, 10);
		String transmissiontype = eu.readData("Submit Requirements", 3, 11);
		submitreq.selectForBuy();
		submitreq.selectForVehicles();
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
		String selectCatogery = eu.readData("Submit Requirements", 4, 4);
		String Make = eu.readData("Submit Requirements", 4, 5);
		String Model = eu.readData("Submit Requirements", 4, 6);
		String Trim = eu.readData("Submit Requirements", 4, 7);
		String Year = eu.readData("Submit Requirements", 4, 8);
		String bodytype = eu.readData("Submit Requirements", 4, 9);
		String fueltype = eu.readData("Submit Requirements", 4, 10);
		String transmissiontype = eu.readData("Submit Requirements", 4, 11);
		submitreq.selectForBuy();
		submitreq.selectForVehicles();
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
		String selectCatogery = eu.readData("Submit Requirements", 5, 4);
		String Make = eu.readData("Submit Requirements", 5, 5);
		String Model = eu.readData("Submit Requirements", 5, 6);
		String Trim = eu.readData("Submit Requirements", 5, 7);
		String Year = eu.readData("Submit Requirements", 5, 8);
		String bodytype = eu.readData("Submit Requirements", 5, 9);
		String fueltype = eu.readData("Submit Requirements", 5, 10);
		String transmissiontype = eu.readData("Submit Requirements", 5, 11);
		submitreq.selectForBuy();
		submitreq.selectForVehicles();
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
		String selectCatogery = eu.readData("Submit Requirements", 2, 4);
		String Make = eu.readData("Submit Requirements", 2, 5);
		String Model = eu.readData("Submit Requirements", 2, 6);
		String Trim = eu.readData("Submit Requirements", 2, 7);
		String Year = eu.readData("Submit Requirements", 2, 8);
		String bodytype = eu.readData("Submit Requirements", 2, 9);
		String fueltype = eu.readData("Submit Requirements", 2, 10);
		String transmissiontype = eu.readData("Submit Requirements", 2, 11);
		submitreq.selectForBuy();
		submitreq.selectForVehicles();
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
		String selectCatogery = eu.readData("Submit Requirements", 3, 4);
		String Make = eu.readData("Submit Requirements", 3, 5);
		String Model = eu.readData("Submit Requirements", 3, 6);
		String Trim = eu.readData("Submit Requirements", 3, 7);
		String Year = eu.readData("Submit Requirements", 3, 8);
		String bodytype = eu.readData("Submit Requirements", 3, 9);
		String fueltype = eu.readData("Submit Requirements", 3, 10);
		String transmissiontype = eu.readData("Submit Requirements", 3, 11);
		submitreq.selectForBuy();
		submitreq.selectForVehicles();
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
		String selectCatogery = eu.readData("Submit Requirements", 4, 4);
		String Make = eu.readData("Submit Requirements", 4, 5);
		String Model = eu.readData("Submit Requirements", 4, 6);
		String Trim = eu.readData("Submit Requirements", 4, 7);
		String Year = eu.readData("Submit Requirements", 4, 8);
		String bodytype = eu.readData("Submit Requirements", 4, 9);
		String fueltype = eu.readData("Submit Requirements", 4, 10);
		String transmissiontype = eu.readData("Submit Requirements", 4, 11);
		submitreq.selectForBuy();
		submitreq.selectForVehicles();
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
		String selectCatogery = eu.readData("Submit Requirements", 1, 4);
		String Make = eu.readData("Submit Requirements", 1, 5);
		String Model = eu.readData("Submit Requirements", 1, 6);
		String Trim = eu.readData("Submit Requirements", 1, 7);
		String Year = eu.readData("Submit Requirements", 1, 8);
		String bodytype = eu.readData("Submit Requirements", 1, 9);
		String fueltype = eu.readData("Submit Requirements", 1, 10);
		String transmissiontype = eu.readData("Submit Requirements", 1, 11);
		submitreq.selectForBuy();
		submitreq.selectForVehicles();
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
		String selectCatogery = eu.readData("Submit Requirements", 2, 4);
		String Make = eu.readData("Submit Requirements", 2, 5);
		String Model = eu.readData("Submit Requirements", 2, 6);
		String Trim = eu.readData("Submit Requirements", 2, 7);
		String Year = eu.readData("Submit Requirements", 2, 8);
		String bodytype = eu.readData("Submit Requirements", 2, 9);
		String fueltype = eu.readData("Submit Requirements", 2, 10);
		String transmissiontype = eu.readData("Submit Requirements", 2, 11);
		submitreq.selectForBuy();
		submitreq.selectForVehicles();
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
		String selectCatogery = eu.readData("Submit Requirements", 3, 4);
		String Make = eu.readData("Submit Requirements", 3, 5);
		String Model = eu.readData("Submit Requirements", 3, 6);
		String Trim = eu.readData("Submit Requirements", 3, 7);
		String Year = eu.readData("Submit Requirements", 3, 8);
		String bodytype = eu.readData("Submit Requirements", 3, 9);
		String fueltype = eu.readData("Submit Requirements", 3, 10);
		String transmissiontype = eu.readData("Submit Requirements", 3, 11);
		submitreq.selectForBuy();
		submitreq.selectForVehicles();
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
		String selectCatogery = eu.readData("Submit Requirements", 4, 4);
		String Make = eu.readData("Submit Requirements", 4, 5);
		String Model = eu.readData("Submit Requirements", 4, 6);
		String Trim = eu.readData("Submit Requirements", 4, 7);
		String Year = eu.readData("Submit Requirements", 4, 8);
		String bodytype = eu.readData("Submit Requirements", 4, 9);
		String fueltype = eu.readData("Submit Requirements", 4, 10);
		String transmissiontype = eu.readData("Submit Requirements", 4, 11);
		submitreq.selectForBuy();
		submitreq.selectForVehicles();
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
		String selectCatogery = eu.readData("Submit Requirements", 5, 4);
		String Make = eu.readData("Submit Requirements", 5, 5);
		String Model = eu.readData("Submit Requirements", 5, 6);
		String Trim = eu.readData("Submit Requirements", 5, 7);
		String Year = eu.readData("Submit Requirements", 5, 8);
		String bodytype = eu.readData("Submit Requirements", 5, 9);
		String fueltype = eu.readData("Submit Requirements", 5, 10);
		String transmissiontype = eu.readData("Submit Requirements", 5, 11);
		submitreq.selectForBuy();
		submitreq.selectForVehicles();
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
		String selectCatogery = eu.readData("Submit Requirements", 2, 4);
		String Make = eu.readData("Submit Requirements", 2, 5);
		String Model = eu.readData("Submit Requirements", 2, 6);
		String Trim = eu.readData("Submit Requirements", 2, 7);
		String Year = eu.readData("Submit Requirements", 2, 8);
		String bodytype = eu.readData("Submit Requirements", 2, 9);
		String fueltype = eu.readData("Submit Requirements", 2, 10);
		String transmissiontype = eu.readData("Submit Requirements", 2, 11);
		submitreq.selectForBuy();
		submitreq.selectForVehicles();
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
		String selectCatogery = eu.readData("Submit Requirements", 3, 4);
		String Make = eu.readData("Submit Requirements", 3, 5);
		String Model = eu.readData("Submit Requirements", 3, 6);
		String Trim = eu.readData("Submit Requirements", 3, 7);
		String Year = eu.readData("Submit Requirements", 3, 8);
		String bodytype = eu.readData("Submit Requirements", 3, 9);
		String fueltype = eu.readData("Submit Requirements", 3, 10);
		String transmissiontype = eu.readData("Submit Requirements", 3, 11);
		submitreq.selectForBuy();
		submitreq.selectForVehicles();
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
		String selectCatogery = eu.readData("Submit Requirements", 4, 4);
		String Make = eu.readData("Submit Requirements", 4, 5);
		String Model = eu.readData("Submit Requirements", 4, 6);
		String Trim = eu.readData("Submit Requirements", 4, 7);
		String Year = eu.readData("Submit Requirements", 4, 8);
		String bodytype = eu.readData("Submit Requirements", 4, 9);
		String fueltype = eu.readData("Submit Requirements", 4, 10);
		String transmissiontype = eu.readData("Submit Requirements", 4, 11);
		submitreq.selectForBuy();
		submitreq.selectForVehicles();
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
	
	             // TEST SCRIPT FOR VALIDATING BUY AS LOAN AND INSURANCE
	
	@Test(priority = 9)
	public void validatSubmitRequirementAsBuyWithCertificationServicesAsCar() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 9, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
     	String selectCategory = eu.readData("Submit Requirements", 9, 4);
		submitreq.selectForBuy();
		submitreq.selectSearchingAsCertificationServices();
  	submitreq.selectCategoryAfterCertificationServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	    submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
	}
	
	@Test(priority = 10)
	public void validatSubmitRequirementAsBuyWithCertificationServicesAsMotorCycleOrBike() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 10, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String selectCategory = eu.readData("Submit Requirements", 10, 4);
		submitreq.selectForBuy();
		submitreq.selectSearchingAsCertificationServices();
		submitreq.selectCategoryAfterCertificationServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	    submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
	}
	
	@Test(priority = 11)
	public void validatSubmitRequirementAsBuyWithCertificationServicesAsScooter() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 11, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String selectCategory = eu.readData("Submit Requirements", 11, 4);
		submitreq.selectForBuy();
		submitreq.selectSearchingAsCertificationServices();
		submitreq.selectCategoryAfterCertificationServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	    submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
	}
	
	@Test(priority = 12)
	public void validatSubmitRequirementAsBuyWithCertificationServicesAsTaxi() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 12, 1);
		String phoneNumber = JavaLibrary.dynamicPhoneNumber();
		String email = JavaLibrary.dynamicUsername();
		String selectCategory = eu.readData("Submit Requirements", 12, 4);
		submitreq.selectForBuy();
		submitreq.selectSearchingAsCertificationServices();
		submitreq.selectCategoryAfterCertificationServices(selectCategory);
		submitreq.selectLocationForOtherPopup();
		submitreq.enterBuyerDetails(firstName, phoneNumber, email);
	    submitreq.clickSubmitAfterBuyerDetails();
		submitreq.continueToOtpPopup(phoneNumber);
	}
}
