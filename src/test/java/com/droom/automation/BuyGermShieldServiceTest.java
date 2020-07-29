package com.droom.automation;

import org.testng.annotations.Test;

import com.droom.automation.germshield.page.GermShieldAntimicrobialCoatingPage;
import com.droom.automation.germshield.page.GermShieldForAutomobile;
import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.lib.ExcelUtilities;

public class BuyGermShieldServiceTest extends AbstractBaseTest
{
	
	String filepath;
	ExcelUtilities eu;
	GermShieldAntimicrobialCoatingPage germshield;
	GermShieldForAutomobile automobilegermshield;
	
	public BuyGermShieldServiceTest()
	{
		this.filepath="C:/Users/Honey/Desktop/DroomAutomation TestData.xlsx";
		this.eu=new ExcelUtilities(filepath);
		germshield=new GermShieldAntimicrobialCoatingPage();
		automobilegermshield=new GermShieldForAutomobile();
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
	
	@Test(priority = 4)
	public void buyGermShieldForAutomobileAsHatchback()
	{
		String username = eu.readData("GermShieldSheet", 1, 1);
		String password = eu.readData("GermShieldSheet", 1, 2);
		automobilegermshield.germShieldValidationForCarAsHatchback(username, password);
	}
	
	@Test(priority = 5)
	public void buyGermShieldForAutomobileAsSedan()
	{
		String username = eu.readData("GermShieldSheet", 1, 1);
		String password = eu.readData("GermShieldSheet", 1, 2);
		automobilegermshield.germShieldValidationForCarAsSedan(username, password);
	}
	
	@Test(priority = 6)
	public void buyGermShieldForAutomobileAsBike()
	{
		String username = eu.readData("GermShieldSheet", 1, 1);
		String password = eu.readData("GermShieldSheet", 1, 2);
		automobilegermshield.germShieldValidationForBike(username, password);
	}
	
	@Test(priority = 7)
	public void buyGermShieldForAutomobileAsScooter()
	{
		String username = eu.readData("GermShieldSheet", 1, 1);
		String password = eu.readData("GermShieldSheet", 1, 2);
		automobilegermshield.germShieldValidationForScooter(username, password);
	}
	
}
