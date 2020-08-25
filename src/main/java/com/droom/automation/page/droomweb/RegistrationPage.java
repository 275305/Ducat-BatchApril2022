package com.droom.automation.page.droomweb;
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
	private final static By Verify_OTP_Button=By.xpath("//input[@value='Verify OTP']");
	private final static By Enter_First_Name =By.xpath("//input[@id='first_name']");
	private final static By Enter_Last_Name=By.xpath("//input[@id='last_name']");
	private final static By Enter_ProEmail_Address=By.xpath("//input[@id='email']");
	private final static By Enter_ProMobile_No=By.xpath("//input[@id='mobile_phone']");
	private final static By Click_SendOTP=By.xpath("//input[@id='validateEmailAndPhone']");
	private final static By Enter_ProOTP=By.xpath("//input[@id='signupotp']");
	private final static By Enter_Business_Name=By.xpath("//input[@id='handle_name']");
	private final static By Enter_Pro_Password=By.xpath("//input[@id='password']");
	private final static By Enter_Pro_Confirm_Password=By.xpath("//input[@id='password_confirmation']");
	private final static By Create_Pro_Seller_Account=By.xpath("//input[@value='Create  Pro-Seller  Account']");
	private final static By Enter_Confirm_Casual_Password =By.xpath("//input[@id='confirm_password']");
	private final static By Enter_Creat_Individual_Button=By.xpath("//input[@value='Continue']");
	private final static By Click_Proceed=By.xpath("//a[text()='Proceed']");
	private final static By Verify_Text_As_Registered_As_ProSeller=By.xpath("//div[text()='Register As a Pro-Seller']");
	
	//error msgs webelements for individual account
	private final static By Verify_MailId_Error_Massage=By.xpath("//small[text()='Please enter valid Email Address']");
	private final static By Verify_MobileNumber_Error_Massage=By.xpath("//small[text()='Please enter valid Mobile Number']");
	private final static By Verify_Declaration_Error_Massage=By.xpath("//small[text()='Please accept Terms & Conditions']");
	private final static By Verify_MailId_Error_Massage_As_Empty_Fill=By.xpath("//small[text()='The email field is required']");
	private final static By Verify_Declaration_Error_Massage_As_Empty_Fill=By.xpath("//small[text()='The mobile number field is required']");
	private final static By Verify_first_name_Error_Massage=By.xpath("//small[text()='Please enter first name']");
	private final static By Verify_last_name_Error_Massage=By.xpath("//small[text()='Please enter last name']");
	private final static By Verify_enter_password_Error_Massage=By.xpath("//small[text()='Please enter password']");
	private final static By Verify_re_enter_password_Error_Massage=By.xpath("//small[text()='Please re-enter password']");
	private final static By Verify_Minimun_characters_Error_Massage=By.xpath("//small[text()='Password should have at least 6 characters']");
	private final static By Verify_re_enter_password_Not_Matching_Error_Massage=By.xpath("//small[text()='Re-entered Password is not matching with Password.']");
	
	// error msgs webelements for proseller account
	private final static By Verify_first_name_Error_Massage_For_ProSeller=By.xpath("//small[text()='The first name field is required']");
	private final static By Verify_last_name_Error_Massage_For_ProSeller=By.xpath("//small[text()='The last name field is required']");
	private final static By Verify_MailId_Error_Massage_As_Empty_Fill_For_ProSeller=By.xpath("//small[text()='The email field is required']");
	private final static By Verify_MobileNumber_Error_Massage_For_ProSeller=By.xpath("//small[text()='The mobile number field is required']");
	private final static By Verify_OTP_Error_Massage_For_ProSeller=By.xpath("//small[text()='The OTP field is required']");
	private final static By Verify_Empty_Error_Massage_For_Business_Name=By.xpath("//small[text()='The business name field is required']");
	private final static By Verify_enter_password_Error_Massage_For_ProSeller=By.xpath("//small[text()='Please enter password']");
	private final static By Verify_Declaration_Error_Massage_As_Empty_Fill_For_ProSeller=By.xpath("//small[text()='Please re-enter password']");
	
	//error msgs for already in use for proseller account
	private final static By Email_Already_In_Use=By.xpath("//small[text()='This Email ID is already in use.']");
	private final static By Mobile_Number_Already_In_Use=By.xpath("//small[text()='This phone number is already associated with another verified droom account']");
	private final static By Business_Name_Already_In_Use=By.xpath("//small[text()='This business name has already been taken']");
	
	//error msgs for invalid input for proseller account
	private final static By Verify_MailId_Error_Massage_As_Invalid_Input_For_ProSeller=By.xpath("//small[text()='Please enter valid Email Address']");
	private final static By Verify_MobileNumber_Error_Massage_As_Invalid_Input_For_ProSeller=By.xpath("//small[text()='Please enter valid Mobile Number']");
	private final static By Verify_OTP_Error_Massage_As_Invalid_Input_For_ProSeller=By.xpath("//small[text()='OTP must have 4 digits']");
//	private final static By =By.xpath("");
//	private final static By =By.xpath("");
//	private final static By =By.xpath("");
//	private final static By =By.xpath("");
//	private final static By =By.xpath("");
//	private final static By =By.xpath("");
	
	
	
	LoginPage loginpage;
	
	public RegistrationPage()
	{
		loginpage=new LoginPage();
	}
	
	
	public void creatIndividualAccount(String username,String mobilenumber,String firstname,String lastname,String password) throws Exception
	{
		loginpage.enterIconPopup();
		verifyByContains(Create_Individual_Account, "Create an Individual Account");
		executeClickOnElement(Create_Individual_Account);
		waitForPageLoad();
		enterTextboxDetails(findElement(Enter_Email_Address), username);
		verifyByAttribute(Enter_Email_Address, username);
		enterTextboxDetails(findElement(Enter_Mobile_No), mobilenumber);
		verifyByAttribute(Enter_Mobile_No, mobilenumber);
		executeClickOnElement(Radio_Button);
		verifyRadioButton(Radio_Button);
		verifyByAttributeByID(Create_Account_SendOTP, "createAccountAndSendOtp");
		executeClickOnElement(Create_Account_SendOTP);
		sleep(5000);
		int otp = DataBaseDemo.getotp("SELECT * FROM cscart_new.otp_verification where phone='"+mobilenumber+"' order by id desc limit 1;");
		String otpValue = Integer.toString(otp);
		enterTextboxDetails(findElement(Enter_OTP), otpValue);
		verifyByAttribute(Enter_OTP, otpValue);
		verifyByAttribute(Verify_OTP_Button, "Verify OTP");
		executeClickOnElement(Verify_OTP_Button);
		enterTextboxDetails(findElement(Enter_First_Name), firstname);
		verifyByAttribute(Enter_First_Name, firstname);
		enterTextboxDetails(findElement(Enter_Last_Name), lastname);
		verifyByAttribute(Enter_Last_Name, lastname);
		enterTextboxDetails(findElement(Enter_Pro_Password), password);
		verifyByAttribute(Enter_Pro_Password, password);
		enterTextboxDetails(findElement(Enter_Confirm_Casual_Password), password);
		verifyByAttribute(Enter_Confirm_Casual_Password, password);
		verifyByAttribute(Enter_Creat_Individual_Button, "Continue");
		executeClickOnElement(Enter_Creat_Individual_Button);
		DataBaseDemo.deleteMailID("DELETE FROM `cscart_new`.`users` where email = '"+username+"';");
}
	
	public void getRegistrationFormPage(String username,String mobilenumber) throws Exception
	{
		loginpage.enterIconPopup();
		verifyByContains(Create_Individual_Account, "Create an Individual Account");
		executeClickOnElement(Create_Individual_Account);
		waitForPageLoad();
		enterTextboxDetails(findElement(Enter_Email_Address), username);
		verifyByAttribute(Enter_Email_Address, username);
		enterTextboxDetails(findElement(Enter_Mobile_No), mobilenumber);
		verifyByAttribute(Enter_Mobile_No, mobilenumber);
		executeClickOnElement(Radio_Button);
		verifyRadioButton(Radio_Button);
		verifyByAttributeByID(Create_Account_SendOTP, "createAccountAndSendOtp");
		executeClickOnElement(Create_Account_SendOTP);
		sleep(5000);
		int otp = DataBaseDemo.getotp("SELECT * FROM cscart_new.otp_verification where phone='"+mobilenumber+"' order by id desc limit 1;");
		String otpValue = Integer.toString(otp);
		enterTextboxDetails(findElement(Enter_OTP), otpValue);
		verifyByAttribute(Enter_OTP, otpValue);
		verifyByAttribute(Verify_OTP_Button, "Verify OTP");
		executeClickOnElement(Verify_OTP_Button);
	}
	
	public void invalidErrorMsgVerificationWhileCreatingIndividualAccount(String username,String mobilenumber) throws Exception
	{
		loginpage.enterIconPopup();
		verifyByContains(Create_Individual_Account, "Create an Individual Account");
		executeClickOnElement(Create_Individual_Account);
		waitForPageLoad();
		enterTextboxDetails(findElement(Enter_Email_Address), username);
		enterTextboxDetails(findElement(Enter_Mobile_No), mobilenumber);
		verifyByAttributeByID(Create_Account_SendOTP, "createAccountAndSendOtp");
		executeClickOnElement(Create_Account_SendOTP);
		verifyRadioButton(Radio_Button);
		verifyErrorMsgByText(Verify_MailId_Error_Massage, "Please enter valid Email Address");
		verifyErrorMsgByText(Verify_MobileNumber_Error_Massage, "Please enter valid Mobile Number");
		verifyErrorMsgByText(Verify_Declaration_Error_Massage, "Please accept Terms & Conditions");
	}
	
	public void emptyErrorMsgVerificationWhileRegisterAsIndividualAccount() throws Exception
	{
		loginpage.enterIconPopup();
		verifyByContains(Create_Individual_Account, "Create an Individual Account");
		executeClickOnElement(Create_Individual_Account);
		waitForPageLoad();
		verifyByAttributeByID(Create_Account_SendOTP, "createAccountAndSendOtp");
		executeClickOnElement(Create_Account_SendOTP);
		verifyRadioButton(Radio_Button);
		verifyErrorMsgByText(Verify_MailId_Error_Massage_As_Empty_Fill, "The email field is required");
		verifyErrorMsgByText(Verify_Declaration_Error_Massage_As_Empty_Fill, "The mobile number field is required");
		verifyErrorMsgByText(Verify_Declaration_Error_Massage, "Please accept Terms & Conditions");
	}
	
	public void emptyErrorMsgVerificationWhileFillingFormAsIndividualAccount(String username,String mobilenumber) throws Exception
	{
		getRegistrationFormPage(username, mobilenumber);
		waitForPageLoad();
		sleep(2000);
		verifyByAttribute(Enter_Creat_Individual_Button, "Continue");
		executeClickOnElement(Enter_Creat_Individual_Button);
		verifyErrorMsgByText(Verify_first_name_Error_Massage, "Please enter password");
		verifyErrorMsgByText(Verify_last_name_Error_Massage, "Please enter last name");
		verifyErrorMsgByText(Verify_enter_password_Error_Massage, "Please enter password");
		verifyErrorMsgByText(Verify_re_enter_password_Error_Massage, "Please re-enter password");
	}
	
	
	public void errorMsgVerificationForPasswordWhileFillingFormAsIndividualAccount(String username,String mobilenumber,String firstname,String lastname,String password1,String password2) throws Exception
	{
		getRegistrationFormPage(username, mobilenumber);
		enterTextboxDetails(findElement(Enter_First_Name), firstname);
		verifyByAttribute(Enter_First_Name, firstname);
		enterTextboxDetails(findElement(Enter_Last_Name), lastname);
		verifyByAttribute(Enter_Last_Name, lastname);
		enterTextboxDetails(findElement(Enter_Pro_Password), password1);
		enterTextboxDetails(findElement(Enter_Confirm_Casual_Password), password2);
		verifyByAttribute(Enter_Creat_Individual_Button, "Continue");
		executeClickOnElement(Enter_Creat_Individual_Button);
		verifyErrorMsgByText(Verify_Minimun_characters_Error_Massage, "Password should have at least 6 characters");
		verifyErrorMsgByText(Verify_re_enter_password_Not_Matching_Error_Massage, "Re-entered Password is not matching with Password.");
	}
	

	public void createProSellerAccount(String firstname,String lastname,String username,String mobilenumber,String businessname,String password) throws Exception
	{
		loginpage.enterIconPopup();
		verifyByText(Create_Pro_Account, "Create a Pro-Seller Account");
		executeClickOnElement(Create_Pro_Account);
		waitForPageLoad();
		enterTextboxDetails(findElement(Enter_First_Name),firstname );
		verifyByAttribute(Enter_First_Name, firstname);
		enterTextboxDetails(findElement(Enter_Last_Name), lastname);
		verifyByAttribute(Enter_Last_Name, lastname);
		enterTextboxDetails(findElement(Enter_ProEmail_Address), username);
		verifyByAttribute(Enter_ProEmail_Address, username );
		enterTextboxDetails(findElement(Enter_ProMobile_No), mobilenumber);
		verifyByAttribute(Enter_ProMobile_No, mobilenumber);
		verifyByAttributeByID(Click_SendOTP, "validateEmailAndPhone");
		executeClickOnElement(Click_SendOTP);
		sleep(5000);
		int otp = DataBaseDemo.getotp("SELECT * FROM cscart_new.otp_verification where phone='"+mobilenumber+"' order by id desc limit 1;");
		String otpValue = Integer.toString(otp);
		enterTextboxDetails(findElement(Enter_ProOTP), otpValue);
		verifyByAttribute(Enter_ProOTP, otpValue);
		enterTextboxDetails(findElement(Enter_Business_Name), businessname);
		verifyByAttribute(Enter_Business_Name,businessname );
		enterTextboxDetails(findElement(Enter_Pro_Password), password);
		verifyByAttribute(Enter_Pro_Password, password);
		enterTextboxDetails(findElement(Enter_Pro_Confirm_Password), password);
		verifyByAttribute(Enter_Pro_Confirm_Password, password);
		verifyByAttribute(Create_Pro_Seller_Account, "Create  Pro-Seller  Account");
		executeClickOnElement(Create_Pro_Seller_Account);
		waitForPageLoad();
		sleep(8000);
		verifyByText(Click_Proceed, "Proceed");
		executeClickOnElement(Click_Proceed);
		verifyByText(Verify_Text_As_Registered_As_ProSeller, "Register As a Pro-Seller");
	}
	
	
	public void emptyErrorMsgVerificationWhileRegisterAsProSellerAccount() throws InterruptedException
	{
		loginpage.enterIconPopup();
		verifyByText(Create_Pro_Account, "Create a Pro-Seller Account");
		executeClickOnElement(Create_Pro_Account);
		waitForPageLoad();
		verifyByAttribute(Create_Pro_Seller_Account, "Create  Pro-Seller  Account");
		executeClickOnElement(Create_Pro_Seller_Account);
		verifyErrorMsgByText( Verify_first_name_Error_Massage_For_ProSeller, "The first name field is required");
		verifyErrorMsgByText( Verify_last_name_Error_Massage_For_ProSeller, "The last name field is required");
		verifyErrorMsgByText( Verify_MailId_Error_Massage_As_Empty_Fill_For_ProSeller, "//small[text()='The email field is required']");
		verifyErrorMsgByText( Verify_MobileNumber_Error_Massage_For_ProSeller, "The mobile number field is required");
		verifyErrorMsgByText( Verify_OTP_Error_Massage_For_ProSeller, "The OTP field is required']");
		verifyErrorMsgByText( Verify_Empty_Error_Massage_For_Business_Name, "The business name field is required");
		verifyErrorMsgByText( Verify_enter_password_Error_Massage_For_ProSeller, "Please enter password");
		verifyErrorMsgByText( Verify_Declaration_Error_Massage_As_Empty_Fill_For_ProSeller, "Please re-enter password");
		
	}
	
	
	public void allReadyExistErrorMsgVerificationWhileRegisterAsProSellerAccount(String firstname,String lastname,String username,String mobilenumber,String businessname,String password) throws Exception
	{
		loginpage.enterIconPopup();
		executeClickOnElement(Create_Pro_Account);
		waitForPageLoad();
		enterTextboxDetails(findElement(Enter_First_Name),firstname );
		verifyByAttribute(Enter_First_Name, firstname);
		enterTextboxDetails(findElement(Enter_Last_Name), lastname);
		verifyByAttribute(Enter_Last_Name, lastname);
		enterTextboxDetails(findElement(Enter_ProEmail_Address), username);
		verifyByAttribute(Enter_ProEmail_Address, username );
		enterTextboxDetails(findElement(Enter_ProMobile_No), mobilenumber);
		verifyByAttribute(Enter_ProMobile_No, mobilenumber);
		verifyByAttributeByID(Click_SendOTP, "validateEmailAndPhone");
		executeClickOnElement(Click_SendOTP);
		sleep(5000);
		int otp = DataBaseDemo.getotp("SELECT * FROM cscart_new.otp_verification where phone='"+mobilenumber+"' order by id desc limit 1;");
		String otpValue = Integer.toString(otp);
		enterTextboxDetails(findElement(Enter_ProOTP), otpValue);
		verifyByAttribute(Enter_ProOTP, otpValue);
		enterTextboxDetails(findElement(Enter_Business_Name), businessname);
		verifyByAttribute(Enter_Business_Name,businessname );
		enterTextboxDetails(findElement(Enter_Pro_Password), password);
		verifyByAttribute(Enter_Pro_Password, password);
		enterTextboxDetails(findElement(Enter_Pro_Confirm_Password), password);
		verifyByAttribute(Enter_Pro_Confirm_Password, password);
		verifyByAttribute(Create_Pro_Seller_Account, "Create  Pro-Seller  Account");
		executeClickOnElement(Create_Pro_Seller_Account);
		
		//inserting error msgs verifications
		verifyErrorMsgByText(Email_Already_In_Use, "This Email ID is already in use.");
		verifyErrorMsgByText(Mobile_Number_Already_In_Use, "This phone number is already associated with another verified droom account");
		verifyErrorMsgByText(Business_Name_Already_In_Use, "This business name has already been taken");
		
		
	}
	
	
	public void inValidInputErrorMsgVerificationWhileRegisterAsProSellerAccount(String firstname,String lastname,String username,String mobilenumber,String otpValue,String businessname,String password) throws Exception
	{
		loginpage.enterIconPopup();
		executeClickOnElement(Create_Pro_Account);
		waitForPageLoad();
		enterTextboxDetails(findElement(Enter_First_Name),firstname );
		verifyByAttribute(Enter_First_Name, firstname);
		enterTextboxDetails(findElement(Enter_Last_Name), lastname);
		verifyByAttribute(Enter_Last_Name, lastname);
		enterTextboxDetails(findElement(Enter_ProEmail_Address), username);
		verifyByAttribute(Enter_ProEmail_Address, username );
		enterTextboxDetails(findElement(Enter_ProMobile_No), mobilenumber);
		verifyByAttribute(Enter_ProMobile_No, mobilenumber);
		verifyByAttributeByID(Click_SendOTP, "validateEmailAndPhone");
		executeClickOnElement(Click_SendOTP);
		enterTextboxDetails(findElement(Enter_ProOTP), otpValue);
		verifyByAttribute(Enter_ProOTP, otpValue);
		enterTextboxDetails(findElement(Enter_Business_Name), businessname);
		verifyByAttribute(Enter_Business_Name,businessname );
		enterTextboxDetails(findElement(Enter_Pro_Password), password);
		verifyByAttribute(Enter_Pro_Password, password);
		enterTextboxDetails(findElement(Enter_Pro_Confirm_Password), password);
		verifyByAttribute(Enter_Pro_Confirm_Password, password);
		verifyByAttribute(Create_Pro_Seller_Account, "Create  Pro-Seller  Account");
		executeClickOnElement(Create_Pro_Seller_Account);
		
		//inserting error msgs as invalid
		verifyErrorMsgByText(Verify_MailId_Error_Massage_As_Invalid_Input_For_ProSeller, "Please enter valid Email Address");
		verifyErrorMsgByText(Verify_MobileNumber_Error_Massage_As_Invalid_Input_For_ProSeller, "Please enter valid Mobile Number");
		verifyErrorMsgByText(Verify_OTP_Error_Massage_As_Invalid_Input_For_ProSeller, "OTP must have 4 digits");
	}
}
