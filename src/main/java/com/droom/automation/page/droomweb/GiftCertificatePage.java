package com.droom.automation.page.droomweb;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;

public class GiftCertificatePage extends SeleniumWrapper {
	static WebDriver driver;
	private static final Logger LOG = LoggerFactory.getLogger(GiftCertificatePage.class);

	/* xpath for close the what to do popup. */
	private static final By Click_To_Close_To_Do_PopUp = By.xpath("//div[@id='entryModal']//button");
	/* xpath for click at login icon. */
	private static final By Login_Icon = By.xpath("//i[@class='web-g-icon web-g-icon-my-droom d-font-size-30']");
	/* xpath for click at login Button. */
	private static final By Login_Button = By.xpath("//a[text()='Log In']");

	/* xpath for click at droom Icon. */
	private static final By Droom_Icon = By.xpath("(//span[@class='path32'])[1]");

	/* xpath for click at Car Link. */
	private static final By Car_Link = By.xpath("(//a[@href='https://droom.in/cars'])[2]");

	/* xpath for click at Car Image. */
	private static final By Car_Image = By
			.xpath("//img[contains(@src,'https://cdn1.acedms.com/photos/listing/2020-07-08')]");

	/* xpath for token Amount. */
	private static final By Token_Ammount = By.xpath("//button[text()='Pay Now Refundable Token Amount']");

	/* xpath for proceed button. */
	private static final By Proceed_Button = By.xpath("(//button[text()='Proceed'])[2]");

	/* xpath for pay now button. */
	private static final By Pay_Now = By.xpath("//button[@id='add_listing_services_to_cart']");

	/* xpath for category drop down. */
	private static final By Category_DropDown = By.xpath("//span[@id='vehicle_type_span']");

	/* xpath for car drop down. */
	private static final By Car_DropDown = By.xpath("(//a[@data-new-url='cars/new'])[1]");

	/* xpath for car drop down. */
	private static final By Search_Button = By.xpath("//input[@value='Search']");

	/* xpath for car Add to cart. */
	private static final By Add_To_Cart = By.xpath("//a[text()='Add to Cart']");

	/* xpath for car scroll down popup. */
	private static final By Scroll_DownPopUp = By.xpath("//div[@id='one_stop_shop_modal']");

	/* xpath for proceed to checkout. */
	private static final By Proceed_Checkout = By.xpath("//a[@id='proceed-to-checkout']");

	/* xpath for continue to address. */
	private static final By ContinueToAddress = By.xpath("//a[text()='Continue to Addresses']");

	/* xpath for use this address. */
	private static final By UseThisAddress = By.xpath("//button[text()='Use This Address']");

	/* xpath for use this address. */
	private static final By ContinueToPayment = By.xpath("//input[@value='Continue to Payment']");

	private static final By Debit_CardLink = By.xpath("//a[@data-method='debit_card']");

	/* xpath for ContinueToPayLink */
	private static final By ContinueToPayLink = By.xpath("//button[text()='Continue to Pay  ₹ '] ");

	/* xpath for CardNumber */
	private static final By CardNumber = By.xpath("//input[@id='card_number']");

	/* xpath for expiryDate */
	private static final By ExpiryDate = By.xpath("//input[@id='card_expiry']");

	/* xpath for card name */
	private static final By card_Name = By.xpath("//input[@id='card_name']");

	/* xpath for card cvv */
	private static final By Card_CVV = By.xpath("//input[@id='card_cvv']");

	/* xpath for Pay_Button */
	private static final By Pay_Button = By.xpath("//span[contains(text(),'Pay ₹ ')]");

	/* xpath for Net Banking Link */
	private static final By Net_Banking_Link = By.xpath("//a[@data-method='net_banking']");

	/* xpath for Net SBI Link */
	private static final By SBI_Link = By.xpath("//img[@src='https://cdn.razorpay.com/bank/SBIN.gif']");

	/* xpath for Net SBI Link */
	private static final By SuccessButton = By.xpath("//button[text()='Success']");
	
	
	
	/* xpath for Net GiftCard_CheckBox */
	private static final By GiftCard_CheckBox = By.xpath("//input[@name='giftcard_remaining_amount']");

	
	
	/* xpath for Net SelectBank_DropDown */
	private static final By SelectBank_DropDown = By.xpath("//button[@id='bank-select']");
	
	
	/* xpath for Net ChooseBank_DropDown */
	private static final By ChooseBank_DropDown = By.xpath("//div[text()='Airtel Payments Bank']");

	
	/* method for SelectBank_DroDown. */
	public static void ChooseBank_DropDown() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(ChooseBank_DropDown);
	}
	/* method for SelectBank_DroDown. */
	public static void SelectBank_DropDown() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(SelectBank_DropDown);
	}
	
	/* method for GiftCard_CheckBox. */
	public static void giftCard_CheckBox() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(GiftCard_CheckBox);
	}
	
	/* method for SuccessButton. */
	public static void SuccessButton() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(SuccessButton);
	}

	/* method for Net_Banking_Link. */
	public static void SBILink() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(SBI_Link);
	}

	/* method for Net_Banking_Link. */
	public static void netBankingLink() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(Net_Banking_Link);
	}

	/* method for ExpiryDate. */
	public static void expiryDate() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(ExpiryDate);
	}

	/* method for Pay_Button. */
	public static void Pay_Button() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(Pay_Button);
	}

	/* method for expiryDate. */
	public static void Card_CVVText() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(Card_CVV);
	}

	/* method for expiryDate. */
	public static void card_NameText() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(card_Name);
	}

	/* method for ContinueToPayLink. */
	public static void CardNumberText() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(CardNumber);
	}

	/* method for ContinueToPayLink. */
	public static void ContinueToPayLink() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(ContinueToPayLink);
	}

	/* method for Debit_Card Link. */
	public static void Debit_CardLink() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(Debit_CardLink);
	}

	/* method for ContinueToPayment button. */
	public static void ContinueToPaymentButton() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(ContinueToPayment);
	}

	/* method for use this address button. */
	public static void useThisAddressButton() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(UseThisAddress);
	}

	/* method for car search button. */
	public static void continueToAddressButton() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(ContinueToAddress);
	}

	/* method for car search button. */
	public static void proceedCheckOutButton() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(Proceed_Checkout);
	}

	/* method for car search button. */
	public static void addToCartButton() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(Add_To_Cart);
	}

	/* method for car search button. */
	public static void scrollDownPopUp() {
		waitForPageLoad();
		sleep(2000);
		SeleniumWrapper.executeScrollIntoViewScript(Scroll_DownPopUp);
		// executeClickOnElement();
	}

	/* method for car search button. */
	public static void searchButton() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(Search_Button);
	}

	/* method for car drop down. */
	public static void carDropdown() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(Car_DropDown);
	}

	/* method for category drop down. */
	public static void categoryDropdown() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(Category_DropDown);
	}

	/* method for Pay Now button. */
	public static void payNowButton() {
		sleep(2000);
		executeClickOnElement(Pay_Now);
	}

	/* method for proceed button. */
	public static void proceedButton() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(Proceed_Button);
	}

	/* method for car Image. */
	public static void tokenAmmount() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(Token_Ammount);
	}

	/* method for car Image. */
	public static void carImageHomePage() {
		waitForPageLoad();
		sleep(4000);
		executeClickOnElement(Car_Image);
	}

	/* method for car link. */
	public static void carLinkHomePage() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(Car_Link);
	}

	/* method for close the what to do popup. */
	public static void droomIconHomePage() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(Droom_Icon);
	}

	/* method for close the what to do popup. */
	public static void closePopUpatHomePage() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(Click_To_Close_To_Do_PopUp);
	}

	/* method for close the what to do popup. */
	public static void clickLoginIcon() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(Login_Icon);
	}

	/* method for login button. */
	public static void loginButton() {
		waitForPageLoad();
		sleep(2000);
		executeClickOnElement(Login_Icon);
	}

	public static void switchWindowFocusByTitle(String title) {
		try {
			Set<String> handleValues = driver.getWindowHandles();
			for (String handleValue : handleValues) {
				driver.switchTo().window(handleValue);
				if (driver.getTitle().trim().equalsIgnoreCase(title)) {
					break;
				}
			}
		} catch (Exception e) {
		}

	}

	/* Switch to the next window */
	public static void switchToTheNextWindow() {
		// executeClickOnElement(Click_Fb_Link_At_Checkout);
		sleep(4000);
		String parent = WebDriverFactory.getDriver().getWindowHandle();
		switchToWindow("New Tab");
		sleep(2000);

	}

	/* Scroll down category */
	public static void scrollDownCategory() {
		executeScrollDownScript(300);
	}

	/* Scroll down token amount */
	public static void scrollDownTokenAmount() {
		executeScrollDownScript(150);
	}

	/* Scroll down */
	public static void scrollDown() {
		executeScrollDownScript(500);
	}

	public static void JS() {
		executeScrollDownScript(150);
	}

	public static WebElement findElement(final By by) {
		return getWebDriverWait().until(ExpectedConditions.presenceOfElementLocated(by));
	}

	public static void enterTextboxDetails(final WebElement webelement, final String keysToSend) {
		webelement.clear();
		webelement.sendKeys(keysToSend);
	}

	public static void executeClickOnElement(final By locator) {
		((JavascriptExecutor) WebDriverFactory.getDriver()).executeScript("arguments[0].click();",
				findElement(locator));
	}

	public static void paymentDetailsForBank(String cardNumber, String cardName, String cardCVV, String cardExpiry) {
		enterTextboxDetails(findElement(CardNumber), cardNumber);
		sleep(1000);
		enterTextboxDetails(findElement(card_Name), cardName);
		sleep(1000);
		enterTextboxDetails(findElement(Card_CVV), cardCVV);
		sleep(1000);
		enterTextboxDetails(findElement(ExpiryDate), cardExpiry);

	}
}
