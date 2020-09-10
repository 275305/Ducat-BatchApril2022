package com.droom.automation.droomweb.droomweb_prod;

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
	String firstName = "Honey Maurya";
	String phoneNumber = "9599946816";
	String email = "honey.maurya@rediffmail.com";
	
	public SubmitRequirementTest()
	{
		submitreq=new SubmitRequirementPage();
		this.filepath="C:/Users/Honey/Desktop/Prod Automation Test Data.xlsx";
		this.eu=new ExcelUtilities(filepath);
	}
	         // TEST SCRIPT FOR VALIDATING BUY AS VEHICLES

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
}