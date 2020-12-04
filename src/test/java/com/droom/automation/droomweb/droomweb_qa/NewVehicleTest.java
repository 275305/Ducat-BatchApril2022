package com.droom.automation.droomweb.droomweb_qa;

import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.page.droomweb.NewVehiclePage;

public class NewVehicleTest extends AbstractBaseTest
{
	ExcelUtilities eu;
	
	public NewVehicleTest()
	{
		this.eu=new ExcelUtilities("C:/Users/Honey Maurya/Desktop/QA Automation TestData.xlsx");
	}
	
	@Test
	public void validateCarAsHatchback()
	{
		String username = eu.readData("New Vehicle", 1, 1);
		String password = eu.readData("New Vehicle", 1, 2);
		NewVehiclePage.carAsHatchback(username, password);
	}

}
