package com.droom.automation.droomweb;
import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.page.droomweb.GermShieldAntimicrobialCoatingPage;
import com.droom.automation.page.droomweb.GermShieldForAutomobilePage;
import com.droom.automation.page.droomweb.GermShieldForHeavyTransportPage;
import com.droom.automation.page.droomweb.GermShieldForHomePage;
import com.droom.automation.page.droomweb.GermShieldForOfficePage;

public class BuyGermShieldServiceTest extends AbstractBaseTest
{
	
	String filepath;
	ExcelUtilities eu;
	GermShieldAntimicrobialCoatingPage germshield;
	GermShieldForAutomobilePage automobilegermshield;
	GermShieldForHomePage homegermshield;
	GermShieldForOfficePage officegermshiled;
	GermShieldForHeavyTransportPage transportgermshield;
	
	public BuyGermShieldServiceTest()
	{
		this.filepath="C:/Users/Honey/Desktop/DroomAutomation TestData.xlsx";
		this.eu=new ExcelUtilities(filepath);
		germshield=new GermShieldAntimicrobialCoatingPage();
		automobilegermshield=new GermShieldForAutomobilePage();
		homegermshield=new GermShieldForHomePage();
		officegermshiled=new GermShieldForOfficePage();
		transportgermshield=new GermShieldForHeavyTransportPage();
	}
	
	@Test(priority=1)
	public void buyGermShieldServiceViaHomePageAsLoggedInUser()
	{
		germshield.germShieldAntimicrobialCoatingValidation();
	}

	
	@Test(priority = 2)
	public void buyGermShieldElevatorService()
	{
		String username = eu.readData("GermShieldSheet", 1, 1);
		String password = eu.readData("GermShieldSheet", 1, 2);
		germshield.germShieldForElevator(username, password);
	}
	
	@Test(priority = 3)
	public void buyGermShieldForOtherFacility()
	{
		String username = eu.readData("GermShieldSheet", 1, 1);
		String password = eu.readData("GermShieldSheet", 1, 2);
		germshield.germShieldForOtherFacility(username, password);
	}
	
	                    // TEST RUN FOR Automobile
	
	@Test(retryAnalyzer = com.droom.automation.lib.RetryAnalyzer.class)
	public void buyGermShieldForAutomobileAsHatchback()
	{
		String username = eu.readData("GermShieldSheet", 1, 1);
		String password = eu.readData("GermShieldSheet", 1, 2);
		String amount = eu.readData("GermShieldSheet", 1, 3);
		String pincode = eu.readData("GermShieldSheet", 1, 4);
		automobilegermshield.germShieldValidationForCarAsHatchback(username, password, amount, pincode);
	}
	
	@Test(priority = 5)
	public void buyGermShieldForAutomobileAsSedan()
	{
		String username = eu.readData("GermShieldSheet", 2, 1);
		String password = eu.readData("GermShieldSheet", 2, 2);
		String amount = eu.readData("GermShieldSheet", 2, 3);
		String pincode = eu.readData("GermShieldSheet", 2, 4);
		automobilegermshield.germShieldValidationForCarAsSedan(username, password, amount, pincode);
	}
	
	@Test(priority = 6)
	public void buyGermShieldForAutomobileAsBike()
	{
		String username = eu.readData("GermShieldSheet", 3, 1);
		String password = eu.readData("GermShieldSheet", 3, 2);
		String amount = eu.readData("GermShieldSheet", 3, 3);
		String pincode = eu.readData("GermShieldSheet", 3, 4);
		automobilegermshield.germShieldValidationForBike(username, password, amount, pincode);
	}
	
	@Test(priority = 7)
	public void buyGermShieldForAutomobileAsScooter()
	{
		String username = eu.readData("GermShieldSheet", 4, 1);
		String password = eu.readData("GermShieldSheet", 4, 2);
		String amount = eu.readData("GermShieldSheet", 4, 3);
		String pincode = eu.readData("GermShieldSheet", 4, 4);
		automobilegermshield.germShieldValidationForScooter(username, password, amount, pincode);
	}
	
	@Test(priority = 8)
	public void buyGermShieldForAutomobileAsPremiumBike()
	{
		String username = eu.readData("GermShieldSheet", 5, 1);
		String password = eu.readData("GermShieldSheet", 5, 2);
		String amount = eu.readData("GermShieldSheet", 5, 3);
		String pincode = eu.readData("GermShieldSheet", 5, 4);
		automobilegermshield.germShieldValidationForPremiumBike(username, password, amount, pincode);
	}
	
	@Test(priority = 9)
	public void buyGermShieldForAutomobileAsBus()
	{
		String username = eu.readData("GermShieldSheet", 6, 1);
		String password = eu.readData("GermShieldSheet", 6, 2);
		String amount = eu.readData("GermShieldSheet", 6, 3);
		String pincode = eu.readData("GermShieldSheet", 6, 4);
		automobilegermshield.germShieldValidationForBus(username, password, amount, pincode);
	}
	
	                                // TEST RUN FOR HOME
	
	@Test(priority = 10)
	public void buyGermShieldForHomeAsIndependent()
	{
		String username = eu.readData("GermShieldForHome", 1, 1);
		String password = eu.readData("GermShieldForHome", 1, 2);
		String area = eu.readData("GermShieldForHome", 1, 3);
		String address = eu.readData("GermShieldForHome", 1, 4);
		String pincode = eu.readData("GermShieldForHome", 1, 5);
		homegermshield.germShieldValidationForHomeAsIndependent(username, password, area, address, pincode);
	}
	
	@Test(priority = 11)
	public void buyGermShieldForHomeAsBungalow()
	{
		String username = eu.readData("GermShieldForHome", 1, 1);
		String password = eu.readData("GermShieldForHome", 1, 2);
		String area = eu.readData("GermShieldForHome", 1, 3);
		String address = eu.readData("GermShieldForHome", 1, 4);
		String pincode = eu.readData("GermShieldForHome", 1, 5);
		homegermshield.germShieldValidationForHomeAsBungalow(username, password, area, address, pincode);
	}
	
	@Test(priority = 12)
	public void buyGermShieldForHomeAsFlat()
	{
		String username = eu.readData("GermShieldForHome", 1, 1);
		String password = eu.readData("GermShieldForHome", 1, 2);
		String area = eu.readData("GermShieldForHome", 1, 3);
		String address = eu.readData("GermShieldForHome", 1, 4);
		String pincode = eu.readData("GermShieldForHome", 1, 5);
		homegermshield.germShieldValidationForHomeAsFlat(username, password, area, address, pincode);
	}
	
	@Test(priority = 13)
	public void buyGermShieldForHomeAsVilla()
	{
		String username = eu.readData("GermShieldForHome", 1, 1);
		String password = eu.readData("GermShieldForHome", 1, 2);
		String area = eu.readData("GermShieldForHome", 1, 3);
		String address = eu.readData("GermShieldForHome", 1, 4);
		String pincode = eu.readData("GermShieldForHome", 1, 5);
		homegermshield.germShieldValidationForHomeAsVilla(username, password, area, address, pincode);
	}
	
	@Test(priority = 14)
	public void buyGermShieldForHomeAsPenthouse()
	{
		String username = eu.readData("GermShieldForHome", 1, 1);
		String password = eu.readData("GermShieldForHome", 1, 2);
		String area = eu.readData("GermShieldForHome", 1, 3);
		String address = eu.readData("GermShieldForHome", 1, 4);
		String pincode = eu.readData("GermShieldForHome", 1, 5);
		homegermshield.germShieldValidationForHomeAsPenthouse(username, password, area, address, pincode);
	}
	
	@Test(priority = 15)
	public void buyGermShieldForHomeAsFarmhouse()
	{
		String username = eu.readData("GermShieldForHome", 1, 1);
		String password = eu.readData("GermShieldForHome", 1, 2);
		String area = eu.readData("GermShieldForHome", 1, 3);
		String address = eu.readData("GermShieldForHome", 1, 4);
		String pincode = eu.readData("GermShieldForHome", 1, 5);
		homegermshield.germShieldValidationForHomeAsFarmhouse(username, password, area, address, pincode);
	}
	
	                         // TEST RUN FOR OFFICE
	
	@Test(priority = 16)
	public void buyGermShieldForOfficeAsIndependentBuilding()
	{
		String username = eu.readData("GermShieldForHome", 4, 1);
		String password = eu.readData("GermShieldForHome", 4, 2);
		String area = eu.readData("GermShieldForHome", 4, 3);
		String address = eu.readData("GermShieldForHome", 4, 4);
		String pincode = eu.readData("GermShieldForHome", 4, 5);
		officegermshiled.germShieldValidationForHomeAsIndependentBuilding(username, password, area, address, pincode);
	}
	
	@Test(priority = 17)
	public void buyGermShieldForOfficeAsHighRiseBuilding()
	{
		String username = eu.readData("GermShieldForHome", 4, 1);
		String password = eu.readData("GermShieldForHome", 4, 2);
		String area = eu.readData("GermShieldForHome", 4, 3);
		String address = eu.readData("GermShieldForHome", 4, 4);
		String pincode = eu.readData("GermShieldForHome", 4, 5);
		officegermshiled.germShieldValidationForHomeAsHighRiseBuilding(username, password, area, address, pincode);
	}
	
	@Test(priority = 18)
	public void buyGermShieldForOfficeAsCoWorkingSpace()
	{
		String username = eu.readData("GermShieldForHome", 4, 1);
		String password = eu.readData("GermShieldForHome", 4, 2);
		String area = eu.readData("GermShieldForHome", 4, 3);
		String address = eu.readData("GermShieldForHome", 4, 4);
		String pincode = eu.readData("GermShieldForHome", 4, 5);
		officegermshiled.germShieldValidationForHomeAsCoWorkingSpace(username, password, area, address, pincode);
	}
	
	             // TEST RUN FOR HEAVY TRANSPORT
	
	@Test(priority = 19)
	public void buyGermShieldForHeavyTransportAsPlane()
	{
		String username = eu.readData("GermShieldForHome", 8, 1);
		String password = eu.readData("GermShieldForHome", 8, 2);
		String area = eu.readData("GermShieldForHome", 8, 3);
		String address = eu.readData("GermShieldForHome", 8, 4);
		String pincode = eu.readData("GermShieldForHome", 8, 5);
		transportgermshield.germShieldValidationForHeavyTransportAsPlane(username, password, area, address, pincode);
	}
	
	@Test(priority = 20)
	public void buyGermShieldForHeavyTransportAsHelicopter()
	{
		String username = eu.readData("GermShieldForHome", 8, 1);
		String password = eu.readData("GermShieldForHome", 8, 2);
		String area = eu.readData("GermShieldForHome", 8, 3);
		String address = eu.readData("GermShieldForHome", 8, 4);
		String pincode = eu.readData("GermShieldForHome", 8, 5);
		transportgermshield.germShieldValidationForHeavyTransportAsHelicopter(username, password, area, address, pincode);
	}
	
	@Test(priority = 21)
	public void buyGermShieldForHeavyTransportAsTrain()
	{
		String username = eu.readData("GermShieldForHome", 8, 1);
		String password = eu.readData("GermShieldForHome", 8, 2);
		String area = eu.readData("GermShieldForHome", 8, 3);
		String address = eu.readData("GermShieldForHome", 8, 4);
		String pincode = eu.readData("GermShieldForHome", 8, 5);
		transportgermshield.germShieldValidationForHeavyTransportAsTrain(username, password, area, address, pincode);
	}
}
