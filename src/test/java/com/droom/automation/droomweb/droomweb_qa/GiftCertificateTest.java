package com.droom.automation.droomweb.droomweb_qa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.page.droomweb.BuyPage;
import com.droom.automation.page.droomweb.GiftCertificatePage;
import com.droom.automation.page.droomweb.LoginPage;
import com.droom.automation.page.droomweb.PaymentPage;

public class GiftCertificateTest extends AbstractBaseTest {
	WebDriver driver;
	String filepath;
	ExcelUtilities eu;
	BuyPage buypage;

	public GiftCertificateTest() {
		this.filepath = "D:/QA Automation TestData.xlsx";
		this.eu = new ExcelUtilities(filepath);

	}

	@Test(priority = 1)
	public void buyCarAsLoggedInUser() {

		GiftCertificatePage.closePopUpatHomePage();
		LoginPage.enterLoginPage();

		String username = ExcelUtilities.readData("CreateListingSheet", 2, 1);
		String password = ExcelUtilities.readData("CreateListingSheet", 2, 2);

		LoginPage.loginValidationForIndividualAccount(username, password);
		GiftCertificatePage.droomIconHomePage();
		GiftCertificatePage.scrollDownCategory();
		GiftCertificatePage.categoryDropdown();
		GiftCertificatePage.carDropdown();
		GiftCertificatePage.searchButton();

		GiftCertificatePage.carImageHomePage();

		GiftCertificatePage.switchToTheNextWindow();
		GiftCertificatePage.scrollDownTokenAmount();

		GiftCertificatePage.tokenAmmount();
		GiftCertificatePage.proceedButton();

		GiftCertificatePage.payNowButton();
		GiftCertificatePage.scrollDown();

		GiftCertificatePage.proceedCheckOutButton();
		/* need to login again */
		// LoginPage.loginValidationForIndividualAccount(username, password);

		GiftCertificatePage.continueToAddressButton();
		GiftCertificatePage.useThisAddressButton();
		GiftCertificatePage.ContinueToPaymentButton();
		// GiftCertificatePage.Debit_CardLink();
		GiftCertificatePage.netBankingLink();
		// click on gift card check box
	    GiftCertificatePage.giftCard_CheckBox();
		GiftCertificatePage.ContinueToPayLink();
		// GiftCertificatePage.SBILink();

		PaymentPage.paymendMethod();

		/*
		 * //Read input from excel BankPaymentSheet String cardNumber =
		 * ExcelUtilities.readData("BankPaymentSheet", 1, 1); String cardName =
		 * ExcelUtilities.readData("BankPaymentSheet", 1, 2); String cardCVV =
		 * ExcelUtilities.readData("BankPaymentSheet", 1, 3); String cardExpiry
		 * = ExcelUtilities.readData("BankPaymentSheet", 1, 4);
		 * 
		 * GiftCertificatePage.paymentDetailsForBank(cardNumber,
		 * cardName,cardCVV,cardExpiry);
		 */

		/*
		 * GiftCertificatePage.CardNumberText();
		 * GiftCertificatePage.card_NameText();
		 * GiftCertificatePage.Card_CVVText(); GiftCertificatePage.expiryDate();
		 */

	}

}
