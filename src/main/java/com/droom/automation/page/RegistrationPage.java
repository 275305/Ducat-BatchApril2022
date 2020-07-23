package com.droom.automation.page;

import org.openqa.selenium.By;

import com.droom.automation.lib.DataBaseDemo;
import com.droom.automation.lib.SeleniumWrapper;

public class RegistrationPage extends SeleniumWrapper
{

	private final static By Create_Individual_Account=By.xpath("//a[contains(text(),'Create an Individual Account')]");
	private final static By Create_Pro_Account=By.xpath("//a[text()='Create a Pro-Seller Account']");
	private final static By Enter_Email_Address=By.xpath("//input[@id='email']");
	private final static By Enter_Mobile_No=By.xpath("//input[@id='mobile_phone']");
	private final static By Radio_Button=By.xpath("//input[@id='gst_declartion_signup']");
	private final static By Create_Account_SendOTP=By.xpath("//input[@id='createAccountAndSendOtp']");
	private final static By Enter_OTP=By.xpath("//input[@id='signupotp']");
	private final static By Verify_OTP_Button=By.xpath("//input[@id='signup_otp']");
	private final static By Enter_First_Name =By.xpath("//input[@id='first_name']");
	private final static By Enter_Last_Name=By.xpath("//input[@id='last_name']");
	private final static By Enter_ProEmail_Address=By.xpath("//input[@id='email']");
	private final static By Enter_ProMobile_No=By.xpath("//input[@id='mobile_phone']");
	private final static By Click_SendOTP=By.xpath("//input[@id='validateEmailAndPhone']");
	private final static By Enter_ProOTP=By.xpath("//input[@id='signupotp']");
	private final static By Enter_Business_Name=By.xpath("//input[@id='handle_name']");
	private final static By Enter_Pro_Password=By.xpath("//input[@id='password']");
	private final static By Enter_Pro_Confirm_Password=By.xpath("//input[@id='password_confirmation']");
	private final static By Create_Pro_Seller_Account=By.xpath("//input[@id='createAccountAndSendOtp']");
	private final static By Enter_Confirm_Casual_Password =By.xpath("//input[@id='confirm_password']");
	private final static By Enter_Creat_Individual_Button=By.xpath("//input[@id='signup_info']");
	private final static By Click_Proceed=By.xpath("//a[@id='close-welcome-modal']");
//	private final static By =By.xpath("");
//	private final static By =By.xpath("");
//	private final static By =By.xpath("");
//	private final static By =By.xpath("");
//	private final static By =By.xpath("");
//	private final static By =By.xpath("");
//	private final static By =By.xpath("");
//	private final static By =By.xpath("");
	
	
	public void creatIndividualAccount() throws Exception
	{
		LoginPage loginpage=new LoginPage();
		loginpage.enterIconPopup();
		executeClickOnElement(Create_Individual_Account);
		sleep(3000);
		enterTextboxDetails(findElement(Enter_Email_Address), "honey.maurya6@droom.in");
		//sleep(2000);
		enterTextboxDetails(findElement(Enter_Mobile_No), "9456024687");
		executeClickOnElement(Radio_Button);
		executeClickOnElement(Create_Account_SendOTP);
		int otp = DataBaseDemo.getotp("SELECT * FROM cscart_new.otp_verification where phone='9456024687' order by id desc limit 1;");
		String otpValue = Integer.toString(otp);
		System.out.println(otpValue);
		sleep(3000);
		enterTextboxDetails(findElement(Enter_OTP), otpValue);
		executeClickOnElement(Verify_OTP_Button);
		sleep(2000);
		enterTextboxDetails(findElement(Enter_First_Name), "Honey");
		enterTextboxDetails(findElement(Enter_Last_Name), "Maurya");
		enterTextboxDetails(findElement(Enter_Pro_Password), "India@123");
		enterTextboxDetails(findElement(Enter_Confirm_Casual_Password), "India@123");
		executeClickOnElement(Enter_Creat_Individual_Button);
		
//	    db.deleteDataFromDB("DELETE FROM `cscart_new`.`users` where email = 'honey.maurya@droom.in';");
//	    db.deleteDataFromDB("DELETE FROM `cscart_new`.`otp_verification` where phone='6307641802' order by id desc limit 1;");
		
		
	}
	
	public void createProSellerAccount() throws Exception
	{
		LoginPage loginpage=new LoginPage();
		loginpage.enterIconPopup();
		executeClickOnElement(Create_Pro_Account);
		sleep(3000);
		enterTextboxDetails(findElement(Enter_First_Name), "honey");
		enterTextboxDetails(findElement(Enter_Last_Name), "maurya");
		enterTextboxDetails(findElement(Enter_ProEmail_Address), "honey.maurya7@droom.in");
		enterTextboxDetails(findElement(Enter_ProMobile_No), "9889484649");
		executeClickOnElement(Click_SendOTP);
		sleep(5000);
		int otp = DataBaseDemo.getotp("SELECT * FROM cscart_new.otp_verification where phone='9889484649' order by id desc limit 1;");
		String otpValue = Integer.toString(otp);
		System.out.println(otpValue);
		enterTextboxDetails(findElement(Enter_ProOTP), otpValue);
		enterTextboxDetails(findElement(Enter_Business_Name), "MY personal GARAGE");
		enterTextboxDetails(findElement(Enter_Pro_Password), "India@123");
		enterTextboxDetails(findElement(Enter_Pro_Confirm_Password), "India@123");
		executeClickOnElement(Create_Pro_Seller_Account);
		sleep(5000);
		executeClickOnElement(Click_Proceed);
//		db.deleteDataFromDB("DELETE FROM `cscart_new`.`users` where email = 'superhoney1558maurya@gmail.com';");
//		db.deleteDataFromDB("DELETE FROM `cscart_new`.`otp_verification` where phone='9599946816' order by id desc limit 1;");
		
		
	}
	
	
}
