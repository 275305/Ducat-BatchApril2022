package com.droom.automation.droomweb.droomweb_prod;

import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.lib.DataBaseDemo;
import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.lib.JavaLibrary;
import com.droom.automation.page.droomweb.FranchisePage;
import com.droom.automation.page.droomweb.PaymentPage;

public class FranchiseTest extends AbstractBaseTest
{
	
	String filepath;
	ExcelUtilities eu;
	FranchisePage franchisepage;
	PaymentPage paymentpage;
	DataBaseDemo db;
	
	public FranchiseTest()
	{
		this.filepath="C:/Users/Honey/Desktop/DroomAutomation TestData.xlsx";
		this.eu=new ExcelUtilities(filepath);
		franchisepage=new FranchisePage();
		paymentpage=new PaymentPage();
		db=new DataBaseDemo();
	}
	
	@Test(priority = 1)
	public void registerForFranchise() throws Exception
	{
		String fullName = eu.readData("FranchiseSheet", 1, 1);
		String contactNumber = eu.readData("FranchiseSheet", 1, 2);
	//	String mailId = eu.readData("FranchiseSheet", 1, 3);
		String mailId = JavaLibrary.dynamicUsername();
		String franchiseName = eu.readData("FranchiseSheet", 1, 4);
		String password = eu.readData("FranchiseSheet", 1, 5);
		String franchiseAddress = eu.readData("FranchiseSheet", 1, 6);
		String zipCode = eu.readData("FranchiseSheet", 1, 7);
		franchisepage.registerAsFranchise(fullName, contactNumber, mailId, franchiseName, password, franchiseAddress, zipCode);
		DataBaseDemo.deleteMailID("DELETE FROM `cscart_new`.`users` where email = '"+mailId+"';");
	}
	
	@Test(priority = 2)
	public void paymentAmountForSignUpAsFranchise() throws Exception
	{
		String fullName = eu.readData("FranchiseSheet", 2, 1);
		String contactNumber = eu.readData("FranchiseSheet", 2, 2);
		//String mailId = eu.readData("FranchiseSheet", 2, 3);
		String mailId = JavaLibrary.dynamicUsername();
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
		DataBaseDemo.deleteMailID("DELETE FROM `cscart_new`.`users` where email = '"+mailId+"';");
		
	}
	
	@Test(priority = 3)
	public void paymentAmountForBookingCityAsFranchise() throws Exception
	{
		String fullName = eu.readData("FranchiseSheet", 3, 1);
		String contactNumber = eu.readData("FranchiseSheet", 3, 2);
	//	String mailId = eu.readData("FranchiseSheet", 3, 3);
		String mailId = JavaLibrary.dynamicUsername();
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
		DataBaseDemo.deleteMailID("DELETE FROM `cscart_new`.`users` where email = '"+mailId+"';");
	}

	
	@Test(priority = 4)
	public void getSiteFranchiseAsUpFrontPaymentForOneMonth() throws Exception
	{
		String fullName = eu.readData("FranchiseSheet", 5, 1);
		String contactNumber = eu.readData("FranchiseSheet", 5, 2);
	//	String mailId = eu.readData("FranchiseSheet", 5, 3);
		String mailId = JavaLibrary.dynamicUsername();
		String franchiseName = eu.readData("FranchiseSheet", 5, 4);
		String password = eu.readData("FranchiseSheet", 5, 5);
		String franchiseAddress = eu.readData("FranchiseSheet", 5, 6);
		String zipCode = eu.readData("FranchiseSheet", 5, 7);
		String year = eu.readData("FranchiseSheet", 5, 8);
		String empCount = eu.readData("FranchiseSheet", 5, 9);
		String index = eu.readData("FranchiseSheet", 5, 10);
		String businessName = eu.readData("FranchiseSheet", 5, 11);
		String gstNumber = eu.readData("FranchiseSheet", 5, 12);
		String businessPan = eu.readData("FranchiseSheet", 5, 13);
		String businessAddress = eu.readData("FranchiseSheet", 5, 14);
		String fileUploadPath = eu.readData("FranchiseSheet", 5, 15);
		String fileName = eu.readData("FranchiseSheet", 5, 16);
		franchisepage.registerAsFranchise(fullName, contactNumber, mailId, franchiseName, password, franchiseAddress, zipCode);
		franchisepage.signUp(year, empCount, index);
		paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		franchisepage.franchiseEvaluation(businessName, gstNumber, businessPan, businessAddress, fileUploadPath, fileName);
        franchisepage.kycWithProceedToContinue();
        franchisepage.selectAsSiteFranchise();
        franchisepage.selectForOneMonths();
        franchisepage.selectForUpfrontPayment();
        franchisepage.proceedWithUpfrontPaymentAfterProvidingDeatils();
        paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		DataBaseDemo.deleteMailID("DELETE FROM `cscart_new`.`users` where email = '"+mailId+"';");
	}
	
	@Test(priority = 5)
	public void getSiteFranchiseAsUpFrontPaymentForThreeMonth() throws Exception
	{
		String fullName = eu.readData("FranchiseSheet", 6, 1);
		String contactNumber = eu.readData("FranchiseSheet", 6, 2);
	//	String mailId = eu.readData("FranchiseSheet", 6, 3);
		String mailId = JavaLibrary.dynamicUsername();
		String franchiseName = eu.readData("FranchiseSheet", 6, 4);
		String password = eu.readData("FranchiseSheet", 6, 5);
		String franchiseAddress = eu.readData("FranchiseSheet", 6, 6);
		String zipCode = eu.readData("FranchiseSheet", 6, 7);
		String year = eu.readData("FranchiseSheet", 6, 8);
		String empCount = eu.readData("FranchiseSheet", 6, 9);
		String index = eu.readData("FranchiseSheet", 6, 10);
		String businessName = eu.readData("FranchiseSheet", 6, 11);
		String gstNumber = eu.readData("FranchiseSheet", 6, 12);
		String businessPan = eu.readData("FranchiseSheet", 6, 13);
		String businessAddress = eu.readData("FranchiseSheet", 6, 14);
		String fileUploadPath = eu.readData("FranchiseSheet", 6, 15);
		String fileName = eu.readData("FranchiseSheet", 6, 16);
		franchisepage.registerAsFranchise(fullName, contactNumber, mailId, franchiseName, password, franchiseAddress, zipCode);
		franchisepage.signUp(year, empCount, index);
		paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		franchisepage.franchiseEvaluation(businessName, gstNumber, businessPan, businessAddress, fileUploadPath, fileName);
        franchisepage.kycWithProceedToContinue();
        franchisepage.selectAsSiteFranchise();
        franchisepage.selectForThreeMonths();
        franchisepage.selectForUpfrontPayment();
        franchisepage.proceedWithUpfrontPaymentAfterProvidingDeatils();
        paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		DataBaseDemo.deleteMailID("DELETE FROM `cscart_new`.`users` where email = '"+mailId+"';");
	}
	
	@Test(priority = 6)
	public void getSiteFranchiseAsUpFrontPaymentForSixMonth() throws Exception
	{
		String fullName = eu.readData("FranchiseSheet", 7, 1);
		String contactNumber = eu.readData("FranchiseSheet", 7, 2);
	//	String mailId = eu.readData("FranchiseSheet", 7, 3);
		String mailId = JavaLibrary.dynamicUsername();
		String franchiseName = eu.readData("FranchiseSheet", 7, 4);
		String password = eu.readData("FranchiseSheet", 7, 5);
		String franchiseAddress = eu.readData("FranchiseSheet", 7, 6);
		String zipCode = eu.readData("FranchiseSheet", 7, 7);
		String year = eu.readData("FranchiseSheet", 7, 8);
		String empCount = eu.readData("FranchiseSheet", 7, 9);
		String index = eu.readData("FranchiseSheet", 7, 10);
		String businessName = eu.readData("FranchiseSheet", 7, 11);
		String gstNumber = eu.readData("FranchiseSheet", 7, 12);
		String businessPan = eu.readData("FranchiseSheet", 7, 13);
		String businessAddress = eu.readData("FranchiseSheet", 7, 14);
		String fileUploadPath = eu.readData("FranchiseSheet", 7, 15);
		String fileName = eu.readData("FranchiseSheet", 7, 16);
		franchisepage.registerAsFranchise(fullName, contactNumber, mailId, franchiseName, password, franchiseAddress, zipCode);
		franchisepage.signUp(year, empCount, index);
		paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		franchisepage.franchiseEvaluation(businessName, gstNumber, businessPan, businessAddress, fileUploadPath, fileName);
        franchisepage.kycWithProceedToContinue();
        franchisepage.selectAsSiteFranchise();
        franchisepage.selectForSixMonth();
        franchisepage.selectForUpfrontPayment();
        franchisepage.proceedWithUpfrontPaymentAfterProvidingDeatils();
        paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		DataBaseDemo.deleteMailID("DELETE FROM `cscart_new`.`users` where email = '"+mailId+"';");
	}

	
	@Test(priority = 7)
	public void getSiteFranchiseAsEMIForOneMonth() throws Exception
	{
		String fullName = eu.readData("FranchiseSheet", 8, 1);
		String contactNumber = eu.readData("FranchiseSheet", 8, 2);
	//	String mailId = eu.readData("FranchiseSheet", 8, 3);
		String mailId = JavaLibrary.dynamicUsername();
		String franchiseName = eu.readData("FranchiseSheet", 8, 4);
		String password = eu.readData("FranchiseSheet", 8, 5);
		String franchiseAddress = eu.readData("FranchiseSheet", 8, 6);
		String zipCode = eu.readData("FranchiseSheet", 8, 7);
		String year = eu.readData("FranchiseSheet", 8, 8);
		String empCount = eu.readData("FranchiseSheet", 8, 9);
		String index = eu.readData("FranchiseSheet", 8, 10);
		String businessName = eu.readData("FranchiseSheet", 8, 11);
		String gstNumber = eu.readData("FranchiseSheet", 8, 12);
		String businessPan = eu.readData("FranchiseSheet", 8, 13);
		String businessAddress = eu.readData("FranchiseSheet", 8, 14);
		String fileUploadPath = eu.readData("FranchiseSheet", 8, 15);
		String fileName = eu.readData("FranchiseSheet", 8, 16);
		franchisepage.registerAsFranchise(fullName, contactNumber, mailId, franchiseName, password, franchiseAddress, zipCode);
		franchisepage.signUp(year, empCount, index);
		paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		franchisepage.franchiseEvaluation(businessName, gstNumber, businessPan, businessAddress, fileUploadPath, fileName);
        franchisepage.kycWithProceedToContinue();
        franchisepage.selectAsSiteFranchise();
        franchisepage.selectForOneMonths();
        franchisepage.selectForEMIPayment();
        franchisepage.proceedWithUpfrontPaymentAfterProvidingDeatils();
        paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		DataBaseDemo.deleteMailID("DELETE FROM `cscart_new`.`users` where email = '"+mailId+"';");
	}
	
	@Test(priority = 8)
	public void getSiteFranchiseAsEMIForThreeMonth() throws Exception
	{
		String fullName = eu.readData("FranchiseSheet", 9, 1);
		String contactNumber = eu.readData("FranchiseSheet", 9, 2);
		//String mailId = eu.readData("FranchiseSheet", 5, 3);
		String mailId = JavaLibrary.dynamicUsername();
		String franchiseName = eu.readData("FranchiseSheet", 9, 4);
		String password = eu.readData("FranchiseSheet", 9, 5);
		String franchiseAddress = eu.readData("FranchiseSheet", 9, 6);
		String zipCode = eu.readData("FranchiseSheet", 9, 7);
		String year = eu.readData("FranchiseSheet", 9, 8);
		String empCount = eu.readData("FranchiseSheet", 9, 9);
		String index = eu.readData("FranchiseSheet", 9, 10);
		String businessName = eu.readData("FranchiseSheet", 9, 11);
		String gstNumber = eu.readData("FranchiseSheet", 9, 12);
		String businessPan = eu.readData("FranchiseSheet", 9, 13);
		String businessAddress = eu.readData("FranchiseSheet", 9, 14);
		String fileUploadPath = eu.readData("FranchiseSheet", 9, 15);
		String fileName = eu.readData("FranchiseSheet", 9, 16);
		franchisepage.registerAsFranchise(fullName, contactNumber, mailId, franchiseName, password, franchiseAddress, zipCode);
		franchisepage.signUp(year, empCount, index);
		paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		franchisepage.franchiseEvaluation(businessName, gstNumber, businessPan, businessAddress, fileUploadPath, fileName);
        franchisepage.kycWithProceedToContinue();
        franchisepage.selectAsSiteFranchise();
        franchisepage.selectForThreeMonths();
        franchisepage.selectForEMIPayment();
        franchisepage.proceedWithUpfrontPaymentAfterProvidingDeatils();
        paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		DataBaseDemo.deleteMailID("DELETE FROM `cscart_new`.`users` where email = '"+mailId+"';");
	}
	
	@Test(priority = 9)
	public void getSiteFranchiseAsEMIForSixMonth() throws Exception
	{
		String fullName = eu.readData("FranchiseSheet", 10, 1);
		String contactNumber = eu.readData("FranchiseSheet", 10, 2);
		//String mailId = eu.readData("FranchiseSheet", 5, 3);
	    String mailId = JavaLibrary.dynamicUsername();
		String franchiseName = eu.readData("FranchiseSheet", 10, 4);
		String password = eu.readData("FranchiseSheet", 10, 5);
		String franchiseAddress = eu.readData("FranchiseSheet", 10, 6);
		String zipCode = eu.readData("FranchiseSheet", 10, 7);
		String year = eu.readData("FranchiseSheet", 10, 8);
		String empCount = eu.readData("FranchiseSheet", 10, 9);
		String index = eu.readData("FranchiseSheet", 10, 10);
		String businessName = eu.readData("FranchiseSheet", 10, 11);
		String gstNumber = eu.readData("FranchiseSheet", 10, 12);
		String businessPan = eu.readData("FranchiseSheet", 10, 13);
		String businessAddress = eu.readData("FranchiseSheet", 10, 14);
		String fileUploadPath = eu.readData("FranchiseSheet", 10, 15);
		String fileName = eu.readData("FranchiseSheet", 10, 16);
		franchisepage.registerAsFranchise(fullName, contactNumber, mailId, franchiseName, password, franchiseAddress, zipCode);
		franchisepage.signUp(year, empCount, index);
		paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		franchisepage.franchiseEvaluation(businessName, gstNumber, businessPan, businessAddress, fileUploadPath, fileName);
        franchisepage.kycWithProceedToContinue();
        franchisepage.selectAsSiteFranchise();
        franchisepage.selectForSixMonth();
        franchisepage.selectForEMIPayment();
        franchisepage.proceedWithUpfrontPaymentAfterProvidingDeatils();
        paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		DataBaseDemo.deleteMailID("DELETE FROM `cscart_new`.`users` where email = '"+mailId+"';");
	}
	
	
	@Test(priority = 10)
	public void getEnterpriseFranchiseAsUpFrontPaymentForOneMonth() throws Exception
	{
		String fullName = eu.readData("FranchiseSheet", 5, 1);
		String contactNumber = eu.readData("FranchiseSheet", 5, 2);
		//String mailId = eu.readData("FranchiseSheet", 5, 3);
		String mailId = JavaLibrary.dynamicUsername();
		String franchiseName = eu.readData("FranchiseSheet", 5, 4);
		String password = eu.readData("FranchiseSheet", 5, 5);
		String franchiseAddress = eu.readData("FranchiseSheet", 5, 6);
		String zipCode = eu.readData("FranchiseSheet", 5, 7);
		String year = eu.readData("FranchiseSheet", 5, 8);
		String empCount = eu.readData("FranchiseSheet", 5, 9);
		String index = eu.readData("FranchiseSheet", 5, 10);
		String businessName = eu.readData("FranchiseSheet", 5, 11);
		String gstNumber = eu.readData("FranchiseSheet", 5, 12);
		String businessPan = eu.readData("FranchiseSheet", 5, 13);
		String businessAddress = eu.readData("FranchiseSheet", 5, 14);
		String fileUploadPath = eu.readData("FranchiseSheet", 5, 15);
		String fileName = eu.readData("FranchiseSheet", 5, 16);
		franchisepage.registerAsFranchise(fullName, contactNumber, mailId, franchiseName, password, franchiseAddress, zipCode);
		franchisepage.signUp(year, empCount, index);
		paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		franchisepage.franchiseEvaluation(businessName, gstNumber, businessPan, businessAddress, fileUploadPath, fileName);
        franchisepage.kycWithProceedToContinue();
        franchisepage.selectAsEnterpriseFranchise();
        franchisepage.enterNumberOfSitesPopup("9");
        franchisepage.selectForOneMonths();
        franchisepage.selectForUpfrontPayment();
        franchisepage.proceedWithRentalPlanAfterProvidingDeatils();
        paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		DataBaseDemo.deleteMailID("DELETE FROM `cscart_new`.`users` where email = '"+mailId+"';");
	}
	
	@Test(priority = 11)
	public void getEnterpriseFranchiseAsUpFrontPaymentForThreeMonth() throws Exception
	{
		String fullName = eu.readData("FranchiseSheet", 6, 1);
		String contactNumber = eu.readData("FranchiseSheet", 6, 2);
		//String mailId = eu.readData("FranchiseSheet", 5, 3);
		String mailId = JavaLibrary.dynamicUsername();
		String franchiseName = eu.readData("FranchiseSheet", 6, 4);
		String password = eu.readData("FranchiseSheet", 6, 5);
		String franchiseAddress = eu.readData("FranchiseSheet", 6, 6);
		String zipCode = eu.readData("FranchiseSheet", 6, 7);
		String year = eu.readData("FranchiseSheet", 6, 8);
		String empCount = eu.readData("FranchiseSheet", 6, 9);
		String index = eu.readData("FranchiseSheet", 6, 10);
		String businessName = eu.readData("FranchiseSheet", 6, 11);
		String gstNumber = eu.readData("FranchiseSheet", 6, 12);
		String businessPan = eu.readData("FranchiseSheet", 6, 13);
		String businessAddress = eu.readData("FranchiseSheet", 6, 14);
		String fileUploadPath = eu.readData("FranchiseSheet", 6, 15);
		String fileName = eu.readData("FranchiseSheet", 6, 16);
		franchisepage.registerAsFranchise(fullName, contactNumber, mailId, franchiseName, password, franchiseAddress, zipCode);
		franchisepage.signUp(year, empCount, index);
		paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		franchisepage.franchiseEvaluation(businessName, gstNumber, businessPan, businessAddress, fileUploadPath, fileName);
        franchisepage.kycWithProceedToContinue();
        franchisepage.selectAsEnterpriseFranchise();
        franchisepage.enterNumberOfSitesUsingPlusIconPopup(8);
        franchisepage.selectForThreeMonths();
        franchisepage.selectForUpfrontPayment();
        franchisepage.proceedWithRentalPlanAfterProvidingDeatils();
        paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		DataBaseDemo.deleteMailID("DELETE FROM `cscart_new`.`users` where email = '"+mailId+"';");
	}
	
	@Test(priority = 12)
	public void getEnterpriseFranchiseAsUpFrontPaymentForSixMonth() throws Exception
	{
		String fullName = eu.readData("FranchiseSheet", 7, 1);
		String contactNumber = eu.readData("FranchiseSheet", 7, 2);
		//String mailId = eu.readData("FranchiseSheet", 5, 3);
		String mailId = JavaLibrary.dynamicUsername();
		String franchiseName = eu.readData("FranchiseSheet", 7, 4);
		String password = eu.readData("FranchiseSheet", 7, 5);
		String franchiseAddress = eu.readData("FranchiseSheet", 7, 6);
		String zipCode = eu.readData("FranchiseSheet", 7, 7);
		String year = eu.readData("FranchiseSheet", 7, 8);
		String empCount = eu.readData("FranchiseSheet", 7, 9);
		String index = eu.readData("FranchiseSheet", 7, 10);
		String businessName = eu.readData("FranchiseSheet", 7, 11);
		String gstNumber = eu.readData("FranchiseSheet", 7, 12);
		String businessPan = eu.readData("FranchiseSheet", 7, 13);
		String businessAddress = eu.readData("FranchiseSheet", 7, 14);
		String fileUploadPath = eu.readData("FranchiseSheet", 7, 15);
		String fileName = eu.readData("FranchiseSheet", 7, 16);
		franchisepage.registerAsFranchise(fullName, contactNumber, mailId, franchiseName, password, franchiseAddress, zipCode);
		franchisepage.signUp(year, empCount, index);
		paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		franchisepage.franchiseEvaluation(businessName, gstNumber, businessPan, businessAddress, fileUploadPath, fileName);
        franchisepage.kycWithProceedToContinue();
        franchisepage.selectAsEnterpriseFranchise();
        franchisepage.enterNumberOfSitesUsingPlusIconPopup(4);
        franchisepage.selectForSixMonth();
        franchisepage.selectForUpfrontPayment();
        franchisepage.proceedWithRentalPlanAfterProvidingDeatils();
        paymentpage.paymentViaNetBanking();
		paymentpage.paymendMethod();
		DataBaseDemo.deleteMailID("DELETE FROM `cscart_new`.`users` where email = '"+mailId+"';");
	}
	
	                  // VALIDATING FACILITY VIA REGISTERED MOBILE NUMBER
	
	@Test(priority = 13)
	public void ValidatingFranchiseDashboard()
	{
		String username = eu.readData("FranchiseSheet", 11, 3);
		String password = eu.readData("FranchiseSheet", 11, 5);
		franchisepage.franchiseDashboard(username, password);
	}
	
	@Test(priority = 14)
	public void ValidatingFranchiseMyOrdersAsAutomobileGermShield()
	{
		String username = eu.readData("FranchiseSheet", 11, 3);
		String password = eu.readData("FranchiseSheet", 11, 5);
		franchisepage.enterPlaceAnOrder(username, password);
		franchisepage.selectYourProductViaRegisteredNumber();
		franchisepage.franchiseMyOrdersAsAutomobileGermShield();
	}
	
	@Test(priority = 15)
	public void ValidatingFranchiseMyOrdersAsFacilityGermShield()
	{
		String username = eu.readData("FranchiseSheet", 11, 3);
		String password = eu.readData("FranchiseSheet", 11, 5);
		String enterCatogory = eu.readData("FranchiseSheet", 11, 17);
		String enterArea = eu.readData("FranchiseSheet", 11, 18);
		String enterAddress = eu.readData("FranchiseSheet", 11, 6);
		String enterPincode = eu.readData("FranchiseSheet", 11, 7);
		franchisepage.enterPlaceAnOrder(username, password);
		franchisepage.selectYourProductViaRegisteredNumber();
		franchisepage.franchiseMyOrdersAsFacilityGermShield(enterCatogory, enterArea, enterAddress, enterPincode);
	}
	
	@Test(priority = 16)
	public void ValidatingFranchiseMyOrdersAsElevatorGermShield()
	{
		String username = eu.readData("FranchiseSheet", 11, 3);
		String password = eu.readData("FranchiseSheet", 11, 5);
		String enterCatogory = eu.readData("FranchiseSheet", 12, 17);
		String packageType = eu.readData("FranchiseSheet", 12, 19);
		String enterAddress = eu.readData("FranchiseSheet", 11, 6);
		String enterPincode = eu.readData("FranchiseSheet", 11, 7);
		franchisepage.enterPlaceAnOrder(username, password);
		franchisepage.selectYourProductViaRegisteredNumber();
		franchisepage.franchiseMyOrdersAsElevatorGermShield(enterCatogory, packageType, enterAddress, enterPincode);
	}
	
	@Test(priority = 17)
	public void ValidatingFranchiseMyOrdersAsJumpstartService()
	{
		String username = eu.readData("FranchiseSheet", 11, 3);
		String password = eu.readData("FranchiseSheet", 11, 5);
		String enterCatogory = eu.readData("FranchiseSheet", 13, 17);
		String enterAddress = eu.readData("FranchiseSheet", 11, 6);
		String enterPincode = eu.readData("FranchiseSheet", 11, 7);
		franchisepage.enterPlaceAnOrder(username, password);
		franchisepage.selectYourProductViaRegisteredNumber();
		franchisepage.franchiseMyOrdersAsJumpstartService(enterCatogory, enterAddress, enterPincode);
	}
	
	@Test(priority = 18)
	public void ValidatingFranchiseMyOrdersAsBigTransport()
	{
		String username = eu.readData("FranchiseSheet", 11, 3);
		String password = eu.readData("FranchiseSheet", 11, 5);
		String enterCatogory = eu.readData("FranchiseSheet", 14, 17);
		String enterArea = eu.readData("FranchiseSheet", 11, 18);
		String enterAddress = eu.readData("FranchiseSheet", 11, 6);
		String enterPincode = eu.readData("FranchiseSheet", 11, 7);
		franchisepage.enterPlaceAnOrder(username, password);
		franchisepage.selectYourProductViaRegisteredNumber();
		franchisepage.franchiseMyOrdersAsBigTransport(enterCatogory, enterArea, enterAddress, enterPincode);
	}
	
	               // VALIDATING FACILITY VIA REGISTERED MOBILE NUMBER
	
	
	@Test(priority = 19)
	public void RegisteringBuyerAsAutomobileGermShield()
	{
		String username = eu.readData("FranchiseSheet", 11, 3);
		String password = eu.readData("FranchiseSheet", 11, 5);
		String firstName = eu.readData("FranchiseSheet", 11, 20);
		String lastName = eu.readData("FranchiseSheet", 14, 21);
//		String mailId = eu.readData("FranchiseSheet", 6, 3);
		String mailId = JavaLibrary.dynamicUsername();
		String GSTIN = eu.readData("FranchiseSheet", 6, 12);
		String enterCity = eu.readData("FranchiseSheet", 11, 22);
		String buyersNumber =JavaLibrary.dynamicPhoneNumber();
		//String buyersNumber = eu.readData("FranchiseSheet", 11, 24);
		franchisepage.enterPlaceAnOrder(username, password);
		franchisepage.selectYourProductWithRegisteringNewNumber(firstName, lastName, mailId, GSTIN, enterCity,buyersNumber);
		franchisepage.franchiseMyOrdersAsAutomobileGermShield();
	}
	
	@Test(priority = 20)
	public void RegisteringBuyerAsFacilityGermShield()
	{
		String username = eu.readData("FranchiseSheet", 11, 3);
		String password = eu.readData("FranchiseSheet", 11, 5);
		String enterCatogory = eu.readData("FranchiseSheet", 11, 17);
		String enterArea = eu.readData("FranchiseSheet", 11, 18);
		String enterAddress = eu.readData("FranchiseSheet", 11, 6);
		String enterPincode = eu.readData("FranchiseSheet", 11, 7);
		String firstName = eu.readData("FranchiseSheet", 11, 20);
		String lastName = eu.readData("FranchiseSheet", 14, 21);
//		String mailId = eu.readData("FranchiseSheet", 6, 3);
		String mailId = JavaLibrary.dynamicUsername();
		String GSTIN = eu.readData("FranchiseSheet", 6, 12);
		String enterCity = eu.readData("FranchiseSheet", 11, 22);
		String buyersNumber =JavaLibrary.dynamicPhoneNumber();
//		String buyersNumber = eu.readData("FranchiseSheet", 11, 23);
		franchisepage.enterPlaceAnOrder(username, password);
		franchisepage.selectYourProductWithRegisteringNewNumber(firstName, lastName, mailId, GSTIN, enterCity,buyersNumber);
		franchisepage.franchiseMyOrdersAsFacilityGermShield(enterCatogory, enterArea, enterAddress, enterPincode);
	}
	
	@Test(priority = 21)
	public void RegisteringBuyerAsElevatorGermShield()
	{
		String username = eu.readData("FranchiseSheet", 11, 3);
		String password = eu.readData("FranchiseSheet", 11, 5);
		String enterCatogory = eu.readData("FranchiseSheet", 12, 17);
		String packageType = eu.readData("FranchiseSheet", 12, 19);
		String enterAddress = eu.readData("FranchiseSheet", 11, 6);
		String enterPincode = eu.readData("FranchiseSheet", 11, 7);
		String firstName = eu.readData("FranchiseSheet", 12, 20);
		String lastName = eu.readData("FranchiseSheet", 12, 21);
//		String mailId = eu.readData("FranchiseSheet", 6, 3);
		String mailId = JavaLibrary.dynamicUsername();
		String GSTIN = eu.readData("FranchiseSheet", 6, 12);
		String enterCity = eu.readData("FranchiseSheet", 12, 22);
		String buyersNumber =JavaLibrary.dynamicPhoneNumber();
//		String buyersNumber = eu.readData("FranchiseSheet", 12, 23);
		franchisepage.enterPlaceAnOrder(username, password);
		franchisepage.selectYourProductWithRegisteringNewNumber(firstName, lastName, mailId, GSTIN, enterCity,buyersNumber);
		franchisepage.franchiseMyOrdersAsElevatorGermShield(enterCatogory, packageType, enterAddress, enterPincode);
	}
	
	@Test(priority = 22)
	public void RegisteringBuyerAsJumpstartService()
	{
		String username = eu.readData("FranchiseSheet", 11, 3);
		String password = eu.readData("FranchiseSheet", 11, 5);
		String enterCatogory = eu.readData("FranchiseSheet", 13, 17);
		String enterAddress = eu.readData("FranchiseSheet", 11, 6);
		String enterPincode = eu.readData("FranchiseSheet", 11, 7);
		String firstName = eu.readData("FranchiseSheet", 13, 20);
		String lastName = eu.readData("FranchiseSheet", 13, 21);
//		String mailId = eu.readData("FranchiseSheet", 6, 3);
		String mailId = JavaLibrary.dynamicUsername();
		String GSTIN = eu.readData("FranchiseSheet", 6, 12);
		String enterCity = eu.readData("FranchiseSheet", 13,22);
		String buyersNumber =JavaLibrary.dynamicPhoneNumber();
//		String buyersNumber = eu.readData("FranchiseSheet", 13, 23);
		franchisepage.enterPlaceAnOrder(username, password);
		franchisepage.selectYourProductWithRegisteringNewNumber(firstName, lastName, mailId, GSTIN, enterCity,buyersNumber);
		franchisepage.franchiseMyOrdersAsJumpstartService(enterCatogory, enterAddress, enterPincode);
	}
	
	@Test(priority = 23)
	public void RegisteringBuyerAsBigTransport()
	{
		String username = eu.readData("FranchiseSheet", 11, 3);
		String password = eu.readData("FranchiseSheet", 11, 5);
		String enterCatogory = eu.readData("FranchiseSheet", 14, 17);
		String enterArea = eu.readData("FranchiseSheet", 11, 18);
		String enterAddress = eu.readData("FranchiseSheet", 11, 6);
		String enterPincode = eu.readData("FranchiseSheet", 11, 7);
		String firstName = eu.readData("FranchiseSheet", 14, 20);
		String lastName = eu.readData("FranchiseSheet", 14, 21);
//		String mailId = eu.readData("FranchiseSheet", 6, 3);
		String mailId = JavaLibrary.dynamicUsername();
		String GSTIN = eu.readData("FranchiseSheet", 6, 12);
		String enterCity = eu.readData("FranchiseSheet", 14, 22);
		String buyersNumber =JavaLibrary.dynamicPhoneNumber();
//		String buyersNumber = eu.readData("FranchiseSheet", 14, 23);
		franchisepage.enterPlaceAnOrder(username, password);
		franchisepage.selectYourProductWithRegisteringNewNumber(firstName, lastName, mailId, GSTIN, enterCity,buyersNumber);
		franchisepage.franchiseMyOrdersAsBigTransport(enterCatogory, enterArea, enterAddress, enterPincode);
	}
}
