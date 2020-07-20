package com.droom.automation.page;

import org.openqa.selenium.By;

import com.droom.automation.lib.DataBaseDemo;
import com.droom.automation.lib.SeleniumDataBaseTest;
import com.droom.automation.lib.SeleniumWrapper;

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
	
	
	public void EnterIconPopup()
	{
		executeClickOnElement(Login_Icon);
	}
	
	public void EnterLoginPage()
	{
		executeClickOnElement(Login_Icon);
		executeClickOnElement(Login_Button);
	}

	public void LoginValidation()
	{
		enterTextboxDetails(findElement(Enter_MAIL_ID), "honey.maurya@droom.in");
		sleep(3000);
		executeClickOnElement(Login_Via_Password);
		sleep(3000);
		enterTextboxDetails(findElement(Enter_Password), "India@123");
		executeClickOnElement(Login_Button_To_Home);
	}
	
	public void LoginValidationByOTP() throws Exception
	{
		enterTextboxDetails(findElement(Enter_MAIL_ID), "honey.maurya@droom.in");
		sleep(3000);
		executeClickOnElement(Login_Via_OTP);
		sleep(3000);
		executeClickOnElement(Click_Via_MobileOTP_Radio_Button);
		executeClickOnElement(Click_SendOTP_Button);
		sleep(3000);
		int otp = DataBaseDemo.getotp("SELECT * FROM cscart_new.otp_verification where phone='9599946816' order by id desc limit 1;");
		String otpValue = Integer.toString(otp);
		enterTextboxDetails(findElement(Enter_OTP), otpValue);
		executeClickOnElement(Click_Login_ViaOTP);
		
	}
	
	public void LoginValidationByForgotYourPassword()
	{
		EnterLoginPage();
		executeClickOnElement(Click_On_Forgot_Your_Password);
		enterTextboxDetails(findElement(Enter_Forgot_MailID), "superhoney1558maurya@gmail.com");
		enterTextboxDetails(findElement(Enter_Captcha_Value), "");
		executeClickOnElement(Click_Reset_Password);
		sleep(3000);
	}
	
	
	
}
