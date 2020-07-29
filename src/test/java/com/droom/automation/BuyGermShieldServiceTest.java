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
	
	
	@Test
	public void buyGermShieldServiceViaHomePageAsLoggedInUser()
	{
		germshield.germShieldAntimicrobialCoatingValidation();
	}

	
	@Test
	public void buyGermShieldElevatorService()
	{
		String username = eu.readData("GermShieldSheet", 1, 1);
		String password = eu.readData("GermShieldSheet", 1, 2);
		germshield.germShieldForElevator(username, password);
	}
	
	@Test
	public void buyGermShieldForOtherFacility()
	{
		String username = eu.readData("GermShieldSheet", 1, 1);
		String password = eu.readData("GermShieldSheet", 1, 2);
		germshield.germShieldForOtherFacility(username, password);
	}
	
	@Test
	public void buyGermShieldForAutomobileAsCar()
	{
		String username = eu.readData("GermShieldSheet", 1, 1);
		String password = eu.readData("GermShieldSheet", 1, 2);
		automobilegermshield.germShieldValidationForCar(username, password);
	}
	
	@Test
	public void buyGermShieldForAutomobileAsBike()
	{
		String username = eu.readData("GermShieldSheet", 1, 1);
		String password = eu.readData("GermShieldSheet", 1, 2);
		automobilegermshield.germShieldValidationForBike(username, password);
	}
	
	@Test
	public void buyGermShieldForAutomobileAsScooter()
	{
		String username = eu.readData("GermShieldSheet", 1, 1);
		String password = eu.readData("GermShieldSheet", 1, 2);
		automobilegermshield.germShieldValidationForScooter(username, password);
	}
	
}
