package com.droom.automation.droomweb;

import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.page.droomweb.FranchisePage;
import com.droom.automation.page.droomweb.PaymentPage;

public class FranchiseTest extends AbstractBaseTest
{
	
	String filepath;
	ExcelUtilities eu;
	FranchisePage franchisepage;
	PaymentPage paymentpage;
	
	public FranchiseTest()
	{
		this.filepath="C:/Users/Honey/Desktop/DroomAutomation TestData.xlsx";
		this.eu=new ExcelUtilities(filepath);
		franchisepage=new FranchisePage();
		paymentpage=new PaymentPage();
	}
	
	@Test(priority = 1)
	public void registerForFranchise() throws Exception
	{
		String fullName = eu.readData("FranchiseSheet", 1, 1);
		String contactNumber = eu.readData("FranchiseSheet", 1, 2);
		String mailId = eu.readData("FranchiseSheet", 1, 3);
		String franchiseName = eu.readData("FranchiseSheet", 1, 4);
		String password = eu.readData("FranchiseSheet", 1, 5);
		String franchiseAddress = eu.readData("FranchiseSheet", 1, 6);
		String zipCode = eu.readData("FranchiseSheet", 1, 7);
		franchisepage.registerAsFranchise(fullName, contactNumber, mailId, franchiseName, password, franchiseAddress, zipCode);
		
	}
	
	@Test(priority = 2)
	public void paymentAmountForSignUpAsFranchise()
	{
		String fullName = eu.readData("FranchiseSheet", 2, 1);
		String contactNumber = eu.readData("FranchiseSheet", 2, 2);
		String mailId = eu.readData("FranchiseSheet", 2, 3);
		String franchiseName = eu.readData("FranchiseSheet", 2, 4);
		String password = eu.readData("FranchiseSheet", 2, 5);
		String franchiseAddress = eu.readData("FranchiseSheet", 2, 6);
		String zipCode = eu.readData("FranchiseSheet", 2, 7);
		String year = eu.readData("FranchiseSheet", 2, 8);
		String empCount = eu.readData("FranchiseSheet", 2, 9);
		String index = eu.readData("FranchiseSheet", 2, 10);
		franchisepage.registerAsFranchise(fullName, contactNumber, mailId, franchiseName, password, franchiseAddress, zipCode);
		franchisepage.signUp(year, empCount, index);
		paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		
	}
	
	@Test(priority = 3)
	public void paymentAmountAsBookingCityAsFranchise() throws Exception
	{
		String fullName = eu.readData("FranchiseSheet", 3, 1);
		String contactNumber = eu.readData("FranchiseSheet", 3, 2);
		String mailId = eu.readData("FranchiseSheet", 3, 3);
		String franchiseName = eu.readData("FranchiseSheet", 3, 4);
		String password = eu.readData("FranchiseSheet", 3, 5);
		String franchiseAddress = eu.readData("FranchiseSheet", 3, 6);
		String zipCode = eu.readData("FranchiseSheet", 3, 7);
		String year = eu.readData("FranchiseSheet", 3, 8);
		String empCount = eu.readData("FranchiseSheet", 3, 9);
		String index = eu.readData("FranchiseSheet", 3, 10);
		String businessName = eu.readData("FranchiseSheet", 3, 11);
		String gstNumber = eu.readData("FranchiseSheet", 3, 12);
		String businessPan = eu.readData("FranchiseSheet", 3, 13);
		String businessAddress = eu.readData("FranchiseSheet", 3, 14);
		String fileUploadPath = eu.readData("FranchiseSheet", 3, 15);
		String fileName = eu.readData("FranchiseSheet", 3, 16);
		franchisepage.registerAsFranchise(fullName, contactNumber, mailId, franchiseName, password, franchiseAddress, zipCode);
		franchisepage.signUp(year, empCount, index);
		paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		franchisepage.franchiseEvaluation(businessName, gstNumber, businessPan, businessAddress, fileUploadPath, fileName);
        franchisepage.kycWithProceedToPay();
        paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
	}
	
	@Test(priority = 4)
	public void payAmountAsUpFrontPaymentAsFranchise() throws Exception
	{
		String fullName = eu.readData("FranchiseSheet", 4, 1);
		String contactNumber = eu.readData("FranchiseSheet", 4, 2);
		String mailId = eu.readData("FranchiseSheet", 4, 3);
		String franchiseName = eu.readData("FranchiseSheet", 4, 4);
		String password = eu.readData("FranchiseSheet", 4, 5);
		String franchiseAddress = eu.readData("FranchiseSheet", 4, 6);
		String zipCode = eu.readData("FranchiseSheet", 4, 7);
		String year = eu.readData("FranchiseSheet", 4, 8);
		String empCount = eu.readData("FranchiseSheet", 4, 9);
		String index = eu.readData("FranchiseSheet", 4, 10);
		String businessName = eu.readData("FranchiseSheet", 4, 11);
		String gstNumber = eu.readData("FranchiseSheet", 4, 12);
		String businessPan = eu.readData("FranchiseSheet", 4, 13);
		String businessAddress = eu.readData("FranchiseSheet", 4, 14);
		String fileUploadPath = eu.readData("FranchiseSheet", 4, 15);
		String fileName = eu.readData("FranchiseSheet", 4, 16);
		franchisepage.registerAsFranchise(fullName, contactNumber, mailId, franchiseName, password, franchiseAddress, zipCode);
		franchisepage.signUp(year, empCount, index);
		paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		franchisepage.franchiseEvaluation(businessName, gstNumber, businessPan, businessAddress, fileUploadPath, fileName);
        franchisepage.kycWithProceedToContinue();
        paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		
	}

}
