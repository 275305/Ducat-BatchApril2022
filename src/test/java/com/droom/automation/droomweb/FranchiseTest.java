package com.droom.automation.droomweb;

import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.page.droomweb.FranchisePage;

public class FranchiseTest extends AbstractBaseTest
{
	
	String filepath;
	ExcelUtilities eu;
	FranchisePage franchisepage;
	
	public FranchiseTest()
	{
		this.filepath="C:/Users/Honey/Desktop/DroomAutomation TestData.xlsx";
		this.eu=new ExcelUtilities(filepath);
		franchisepage=new FranchisePage();
	}
	
	@Test
	public void registerForFranchise() throws Exception
	{
		String fullName = eu.readData("FranchiseSheet", 1, 1);
		String contactNumber = eu.readData("FranchiseSheet", 1, 2);
		String mailId = eu.readData("FranchiseSheet", 1, 3);
		String franchiseName = eu.readData("FranchiseSheet", 1, 4);
		String password = eu.readData("FranchiseSheet", 1, 5);
		String franchiseAddress = eu.readData("FranchiseSheet", 1, 6);
		String zipCode = eu.readData("FranchiseSheet", 1, 7);
		String year = eu.readData("FranchiseSheet", 1, 8);
		String empCount = eu.readData("FranchiseSheet", 1, 9);
		String index = eu.readData("FranchiseSheet", 1, 10);
		String businessName = eu.readData("FranchiseSheet", 1, 11);
		String gstNumber = eu.readData("FranchiseSheet", 1, 12);
		String businessPan = eu.readData("FranchiseSheet", 1, 13);
		String businessAddress = eu.readData("FranchiseSheet", 1, 14);
		String fileUploadPath = eu.readData("FranchiseSheet", 1, 15);
		String fileName = eu.readData("FranchiseSheet", 1, 16);
		franchisepage.registerAsFranchise(fullName, contactNumber, mailId, franchiseName, password, franchiseAddress, zipCode);
		franchisepage.signUp(year, empCount, index);
		franchisepage.franchiseEvaluation(businessName, gstNumber, businessPan, businessAddress, fileUploadPath, fileName);
	}

}
