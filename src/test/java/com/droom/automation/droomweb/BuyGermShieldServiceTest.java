package com.droom.automation.droomweb;
import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.page.droomweb.GermShieldAntimicrobialCoatingPage;
import com.droom.automation.page.droomweb.GermShieldForAutomobile;
import com.droom.automation.page.droomweb.GermShieldForHeavyTransport;
import com.droom.automation.page.droomweb.GermShieldForHome;
import com.droom.automation.page.droomweb.GermShieldForOffice;

public class BuyGermShieldServiceTest extends AbstractBaseTest
{
	
	String filepath;
	ExcelUtilities eu;
	GermShieldAntimicrobialCoatingPage germshield;
	GermShieldForAutomobile automobilegermshield;
	GermShieldForHome homegermshield;
	GermShieldForOffice officegermshiled;
	GermShieldForHeavyTransport transportgermshield;
	
	public BuyGermShieldServiceTest()
	{
		this.filepath="C:/Users/Honey/Desktop/DroomAutomation TestData.xlsx";
		this.eu=new ExcelUtilities(filepath);
		germshield=new GermShieldAntimicrobialCoatingPage();
		automobilegermshield=new GermShieldForAutomobile();
		homegermshield=new GermShieldForHome();
		officegermshiled=new GermShieldForOffice();
		transportgermshield=new GermShieldForHeavyTransport();
	}
	
	
//	@Test(priority=1)
//	public void buyGermShieldServiceViaHomePageAsLoggedInUser()
//	{
//		germshield.germShieldAntimicrobialCoatingValidation();
//	}
//
//	
//	@Test(priority = 2)
//	public void buyGermShieldElevatorService()
//	{
//		String username = eu.readData("GermShieldSheet", 1, 1);
//		String password = eu.readData("GermShieldSheet", 1, 2);
//		germshield.germShieldForElevator(username, password);
//	}
//	
//	@Test(priority = 3)
//	public void buyGermShieldForOtherFacility()
//	{
//		String username = eu.readData("GermShieldSheet", 1, 1);
//		String password = eu.readData("GermShieldSheet", 1, 2);
//		germshield.germShieldForOtherFacility(username, password);
//	}
	
//	@Test(priority = 4)
//	public void buyGermShieldForAutomobileAsHatchback()
//	{
//		String username = eu.readData("GermShieldSheet", 1, 1);
//		String password = eu.readData("GermShieldSheet", 1, 2);
//		automobilegermshield.germShieldValidationForCarAsHatchback(username, password);
//	}
//	
//	@Test(priority = 5)
//	public void buyGermShieldForAutomobileAsSedan()
//	{
//		String username = eu.readData("GermShieldSheet", 1, 1);
//		String password = eu.readData("GermShieldSheet", 1, 2);
//		automobilegermshield.germShieldValidationForCarAsSedan(username, password);
//	}
//	
//	@Test(priority = 6)
//	public void buyGermShieldForAutomobileAsBike()
//	{
//		String username = eu.readData("GermShieldSheet", 1, 1);
//		String password = eu.readData("GermShieldSheet", 1, 2);
//		automobilegermshield.germShieldValidationForBike(username, password);
//	}
//	
//	@Test(priority = 7)
//	public void buyGermShieldForAutomobileAsScooter()
//	{
//		String username = eu.readData("GermShieldSheet", 1, 1);
//		String password = eu.readData("GermShieldSheet", 1, 2);
//		automobilegermshield.germShieldValidationForScooter(username, password);
//	}
	
//	@Test(priority = 7)
//	public void buyGermShieldForAutomobileAsPremiumBike()
//	{
//		String username = eu.readData("GermShieldSheet", 1, 1);
//		String password = eu.readData("GermShieldSheet", 1, 2);
//		automobilegermshield.germShieldValidationForPremiumBike(username, password);
//	}
	
//	@Test(priority = 7)
//	public void buyGermShieldForAutomobileAsBus()
//	{
//		String username = eu.readData("GermShieldSheet", 1, 1);
//		String password = eu.readData("GermShieldSheet", 1, 2);
//		automobilegermshield.germShieldValidationForBus(username, password);
//	}
	
	                                // TEST RUN FOR HOME
//	
//	@Test(priority = 7)
//	public void buyGermShieldForHomeAsIndependent()
//	{
//		String username = eu.readData("GermShieldForHome", 1, 1);
//		String password = eu.readData("GermShieldForHome", 1, 2);
//		String area = eu.readData("GermShieldForHome", 1, 3);
//		String address = eu.readData("GermShieldForHome", 1, 4);
//		String pincode = eu.readData("GermShieldForHome", 1, 5);
//		homegermshield.germShieldValidationForHomeAsIndependent(username, password, area, address, pincode);
//	}
//	
//	@Test(priority = 7)
//	public void buyGermShieldForHomeAsBungalow()
//	{
//		String username = eu.readData("GermShieldForHome", 1, 1);
//		String password = eu.readData("GermShieldForHome", 1, 2);
//		String area = eu.readData("GermShieldForHome", 1, 3);
//		String address = eu.readData("GermShieldForHome", 1, 4);
//		String pincode = eu.readData("GermShieldForHome", 1, 5);
//		homegermshield.germShieldValidationForHomeAsBungalow(username, password, area, address, pincode);
//	}
//	
//	@Test(priority = 7)
//	public void buyGermShieldForHomeAsFlat()
//	{
//		String username = eu.readData("GermShieldForHome", 1, 1);
//		String password = eu.readData("GermShieldForHome", 1, 2);
//		String area = eu.readData("GermShieldForHome", 1, 3);
//		String address = eu.readData("GermShieldForHome", 1, 4);
//		String pincode = eu.readData("GermShieldForHome", 1, 5);
//		homegermshield.germShieldValidationForHomeAsFlat(username, password, area, address, pincode);
//	}
//	
//	@Test(priority = 7)
//	public void buyGermShieldForHomeAsVilla()
//	{
//		String username = eu.readData("GermShieldForHome", 1, 1);
//		String password = eu.readData("GermShieldForHome", 1, 2);
//		String area = eu.readData("GermShieldForHome", 1, 3);
//		String address = eu.readData("GermShieldForHome", 1, 4);
//		String pincode = eu.readData("GermShieldForHome", 1, 5);
//		homegermshield.germShieldValidationForHomeAsVilla(username, password, area, address, pincode);
//	}
	
	@Test(priority = 7)
	public void buyGermShieldForHomeAsPenthouse()
	{
		String username = eu.readData("GermShieldForHome", 1, 1);
		String password = eu.readData("GermShieldForHome", 1, 2);
		String area = eu.readData("GermShieldForHome", 1, 3);
		String address = eu.readData("GermShieldForHome", 1, 4);
		String pincode = eu.readData("GermShieldForHome", 1, 5);
		homegermshield.germShieldValidationForHomeAsPenthouse(username, password, area, address, pincode);
	}
	
//	@Test(priority = 7)
//	public void buyGermShieldForHomeAsFarmhouse()
//	{
//		String username = eu.readData("GermShieldForHome", 1, 1);
//		String password = eu.readData("GermShieldForHome", 1, 2);
//		String area = eu.readData("GermShieldForHome", 1, 3);
//		String address = eu.readData("GermShieldForHome", 1, 4);
//		String pincode = eu.readData("GermShieldForHome", 1, 5);
//		homegermshield.germShieldValidationForHomeAsFarmhouse(username, password, area, address, pincode);
//	}
	
	                         // TEST RUN FOR OFFICE
//	
//	@Test(priority = 8)
//	public void buyGermShieldForOfficeAsIndependentBuilding()
//	{
//		String username = eu.readData("GermShieldForHome", 4, 1);
//		String password = eu.readData("GermShieldForHome", 4, 2);
//		String area = eu.readData("GermShieldForHome", 4, 3);
//		String address = eu.readData("GermShieldForHome", 4, 4);
//		String pincode = eu.readData("GermShieldForHome", 4, 5);
//		officegermshiled.germShieldValidationForHomeAsIndependentBuilding(username, password, area, address, pincode);
//	}
//	
//	@Test(priority = 9)
//	public void buyGermShieldForOfficeAsHighRiseBuilding()
//	{
//		String username = eu.readData("GermShieldForHome", 4, 1);
//		String password = eu.readData("GermShieldForHome", 4, 2);
//		String area = eu.readData("GermShieldForHome", 4, 3);
//		String address = eu.readData("GermShieldForHome", 4, 4);
//		String pincode = eu.readData("GermShieldForHome", 4, 5);
//		officegermshiled.germShieldValidationForHomeAsHighRiseBuilding(username, password, area, address, pincode);
//	}
//	
//	@Test(priority = 10)
//	public void buyGermShieldForOfficeAsCoWorkingSpace()
//	{
//		String username = eu.readData("GermShieldForHome", 4, 1);
//		String password = eu.readData("GermShieldForHome", 4, 2);
//		String area = eu.readData("GermShieldForHome", 4, 3);
//		String address = eu.readData("GermShieldForHome", 4, 4);
//		String pincode = eu.readData("GermShieldForHome", 4, 5);
//		officegermshiled.germShieldValidationForHomeAsCoWorkingSpace(username, password, area, address, pincode);
//	}
	
	             // TEST RUN FOR HEAVY TRANSPORT
	
//	@Test(priority = 11)
//	public void buyGermShieldForHeavyTransportAsPlane()
//	{
//		String username = eu.readData("GermShieldForHome", 8, 1);
//		String password = eu.readData("GermShieldForHome", 8, 2);
//		String area = eu.readData("GermShieldForHome", 8, 3);
//		String address = eu.readData("GermShieldForHome", 8, 4);
//		String pincode = eu.readData("GermShieldForHome", 8, 5);
//		transportgermshield.germShieldValidationForHeavyTransportAsPlane(username, password, area, address, pincode);
//	}
	
//	@Test(priority = 12)
//	public void buyGermShieldForHeavyTransportAsHelicopter()
//	{
//		String username = eu.readData("GermShieldForHome", 8, 1);
//		String password = eu.readData("GermShieldForHome", 8, 2);
//		String area = eu.readData("GermShieldForHome", 8, 3);
//		String address = eu.readData("GermShieldForHome", 8, 4);
//		String pincode = eu.readData("GermShieldForHome", 8, 5);
//		transportgermshield.germShieldValidationForHeavyTransportAsHelicopter(username, password, area, address, pincode);
//	}
//	
//	@Test(priority = 13)
//	public void buyGermShieldForHeavyTransportAsTrain()
//	{
//		String username = eu.readData("GermShieldForHome", 8, 1);
//		String password = eu.readData("GermShieldForHome", 8, 2);
//		String area = eu.readData("GermShieldForHome", 8, 3);
//		String address = eu.readData("GermShieldForHome", 8, 4);
//		String pincode = eu.readData("GermShieldForHome", 8, 5);
//		transportgermshield.germShieldValidationForHeavyTransportAsTrain(username, password, area, address, pincode);
//	}
}
