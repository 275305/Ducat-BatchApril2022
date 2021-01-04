package com.droom.automation.droomweb.droomweb_qa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.page.droomweb.GiftCertificatePage;
import com.droom.automation.page.droomweb.LoginPage;

public class AddGiftCertificateTest extends AbstractBaseTest {
	
	WebDriver driver;
	String filepath;
	ExcelUtilities eu;

	public AddGiftCertificateTest() {
		this.filepath = "D:/QA Automation TestData.xlsx";
		this.eu = new ExcelUtilities(filepath);

	}
	
	@Test(priority=1)
	public void addGiftCertificate() throws Exception{
	
		
		//GiftCertificatePage.closePopUpatHomePage();
		LoginPage.enterLoginPage();

		String username = ExcelUtilities.readData("CreateListingSheet", 2, 1);
		String password = ExcelUtilities.readData("CreateListingSheet", 2, 2);

		LoginPage.loginValidationForIndividualAccount(username, password);
		
	}
	
	

}
