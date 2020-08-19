package com.droom.automation.droomweb;

import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.page.droomweb.SubmitRequirement;

public class SubmitRequirementTest extends AbstractBaseTest
{
	SubmitRequirement submitreq;
	String filepath;
	ExcelUtilities eu;
	
	public SubmitRequirementTest()
	{
		submitreq=new SubmitRequirement();
		this.filepath="C:/Users/Honey/Desktop/DroomAutomation TestData.xlsx";
		this.eu=new ExcelUtilities(filepath);
	}
	
	@Test
	public void validatSubmitRequirementAsBuyWithVehicleAsCar() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 1, 1);
		String phoneNumber = eu.readData("Submit Requirements", 1, 2);
		String email = eu.readData("Submit Requirements", 1, 3);
		submitreq.buyVehicleAsCar(firstName, phoneNumber, email);
	}
	
	@Test
	public void validatSubmitRequirementAsBuyWithVehicleAsMotorCycleOrBike() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 2, 1);
		String phoneNumber = eu.readData("Submit Requirements", 2, 2);
		String email = eu.readData("Submit Requirements", 2, 3);
		submitreq.buyVehicleAsMotorCycleOrBike(firstName, phoneNumber, email);
	}
	
	@Test
	public void validatSubmitRequirementAsBuyWithVehicleAsScooter() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 3, 1);
		String phoneNumber = eu.readData("Submit Requirements", 3, 2);
		String email = eu.readData("Submit Requirements", 3, 3);
		submitreq.buyVehicleAsScooter(firstName, phoneNumber, email);
	}
	
	@Test
	public void validatSubmitRequirementAsBuyWithVehicleAsTaxi() throws Exception
	{
		String firstName = eu.readData("Submit Requirements", 4, 1);
		String phoneNumber = eu.readData("Submit Requirements", 4, 2);
		String email = eu.readData("Submit Requirements", 4, 3);
		submitreq.buyVehicleAsTaxi(firstName, phoneNumber, email);
	}

}
