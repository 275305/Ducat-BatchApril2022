package com.droom.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.droom.automation.lib.DataBaseDemo;
import com.droom.automation.lib.SeleniumDataBaseTest;
import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;

public class LoginPage extends SeleniumWrapper
{
	private static final By Login_Icon= By.xpath("//i[@class='web-g-icon web-g-icon-my-droom d-font-size-30']");
	private static final By Login_Button= By.xpath("//a[text()='Log In']");
	private static final By Enter_MAIL_ID= By.xpath("//input[@id='email']");
	private static final By Login_Via_Password= By.xpath("//a[contains(text(),'Login Via Password')]");
	private static final By Login_Via_OTP= By.xpath("//a[contains(text(),'Login Via OTP')]");
	private static final By Click_Via_MobileOTP_Radio_Button= By.xpath("//input[@id='otp_phn']");
	private static final By Click_SendOTP_Button= By.xpath("//button[text()='Send OTP']");
	private static final By Enter_OTP= By.xpath("//input[@id='otp']");
	private static final By Click_Login_ViaOTP= By.xpath("//button[@id='submitOtp']");
	private static final By Click_On_Forgot_Your_Password= By.xpath("//a[text()='Forgot Your Password?']");
	private static final By Enter_Forgot_MailID= By.xpath("//input[@id='email']");
	private static final By Enter_Captcha_Value= By.xpath("//input[@id='captcha_value']");
	private static final By Click_Reset_Password= By.xpath("//input[@value='Reset password']");
	private static final By Enter_Password= By.xpath("//input[@id='password']");
	private static final By Login_Button_To_Home= By.xpath("//input[@value='Login']");
	private final static By Go_To_Home=By.xpath("//a[text()='Home']");
	private final static By Go_To_Buy_Via_My_Account_Page=By.xpath("//a[text()='Buy on Droom']");
	private static final By Click_On_My_Account=By.xpath("(//a[text()='My Account'])[2]");
	private static final By Click_On_PopUp_For_Proseller=By.xpath("//a[@id='close-welcome-modal']");
	private static final By Verify_Text_For_ProSeller_Registration=By.xpath("//div[text()='Register As a Pro-Seller']");
	private final static By Incorrect_Email_or_Password_Error_Massage=By.xpath("//div[text()='Incorrect Email or Password']");
	private final static By Invalid_OTP_Code_Massage=By.xpath("//div[text()='Invalid OTP code.']");
	
	
	public void enterIconPopup()
	{
		executeClickOnElement(Login_Icon);
	}
	
	public void goToHome()
	{
		executeClickOnElement(Go_To_Home);
	}
	
	public void enterLoginPage()
	{
		executeClickOnElement(Login_Icon);
		executeClickOnElement(Login_Button);
	}

	public void loginValidationForIndividualAccount(String username, String password)
	{
		enterTextboxDetails(findElement(Enter_MAIL_ID), username);
		executeClickOnElement(Login_Via_Password);
		sleep(1000);
		enterTextboxDetails(findElement(Enter_Password), password);
		sleep(1000);
		executeClickOnElement(Login_Button_To_Home);
		sleep(3000);
		verifyByText(Click_On_My_Account, "My Account");
	}
	
	public void invalidLoginValidation(String username, String password)
	{
		enterTextboxDetails(findElement(Enter_MAIL_ID), username);
		executeClickOnElement(Login_Via_Password);
		sleep(1000);
		enterTextboxDetails(findElement(Enter_Password), password);
		executeClickOnElement(Login_Button_To_Home);
		verifyByText(Incorrect_Email_or_Password_Error_Massage, "Incorrect Email or Password");
		
	}
	
	
	public void loginValidationByOTPForIndividualAccount(String username) throws Exception
	{
		enterTextboxDetails(findElement(Enter_MAIL_ID), username);
		sleep(3000);
		executeClickOnElement(Login_Via_OTP);
		sleep(3000);
		executeClickOnElement(Click_Via_MobileOTP_Radio_Button);
		executeClickOnElement(Click_SendOTP_Button);
		sleep(3000);
		int otp = DataBaseDemo.getotp("SELECT * FROM cscart_new.otp_verification where phone='6307641802' order by id desc limit 1;");
		String otpValue = Integer.toString(otp);
		enterTextboxDetails(findElement(Enter_OTP), otpValue);
		executeClickOnElement(Click_Login_ViaOTP);
		sleep(3000);
		verifyByText(Click_On_My_Account, "My Account");
		
	}
	
	
	public void invalidOTPloginValidation(String username, String otp)
	{
		enterTextboxDetails(findElement(Enter_MAIL_ID), username);
		sleep(3000);
		executeClickOnElement(Login_Via_OTP);
		sleep(3000);
		executeClickOnElement(Click_Via_MobileOTP_Radio_Button);
		executeClickOnElement(Click_SendOTP_Button);
		enterTextboxDetails(findElement(Enter_OTP), otp);
		executeClickOnElement(Click_Login_ViaOTP);
		sleep(3000);
		verifyByText(Invalid_OTP_Code_Massage, "Invalid OTP code.");
	}
	
	
	public void loginValidationForProSellerAccount(String username, String password)
	{
		enterTextboxDetails(findElement(Enter_MAIL_ID), username);
		executeClickOnElement(Login_Via_Password);
		sleep(2000);
		enterTextboxDetails(findElement(Enter_Password), password);
		executeClickOnElement(Login_Button_To_Home);
		executeClickOnElement(Click_On_PopUp_For_Proseller);
		verifyByText(Verify_Text_For_ProSeller_Registration, "Register As a Pro-Seller");
	}
	
	
	public void loginValidationForProSellerByOTP(String username) throws Exception
	{
		enterTextboxDetails(findElement(Enter_MAIL_ID), username);
		sleep(3000);
		executeClickOnElement(Login_Via_OTP);
		sleep(3000);
		executeClickOnElement(Click_Via_MobileOTP_Radio_Button);
		executeClickOnElement(Click_SendOTP_Button);
		sleep(3000);
		int otp = DataBaseDemo.getotp("SELECT * FROM cscart_new.otp_verification where phone='9889481816' order by id desc limit 1;");
		String otpValue = Integer.toString(otp);
		enterTextboxDetails(findElement(Enter_OTP), otpValue);
		executeClickOnElement(Click_Login_ViaOTP);
		executeClickOnElement(Click_On_PopUp_For_Proseller);
		verifyByText(Verify_Text_For_ProSeller_Registration, "Register As a Pro-Seller");
		
	}
	
	public void loginValidationByForgotYourPassword()
	{
		enterLoginPage();
		executeClickOnElement(Click_On_Forgot_Your_Password);
		enterTextboxDetails(findElement(Enter_Forgot_MailID), "superhoney1558maurya@gmail.com");
		enterTextboxDetails(findElement(Enter_Captcha_Value), "");
		executeClickOnElement(Click_Reset_Password);
		sleep(3000);
	}
	
	public void goToBuyViaMyAccount()
	{
		enterLoginPage();
		//loginValidationForIndividualAccount();
		executeClickOnElement(Go_To_Buy_Via_My_Account_Page);
	}
	
}
