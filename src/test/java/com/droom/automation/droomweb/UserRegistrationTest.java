package com.droom.automation.droomweb;
import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.lib.ExcelUtilities;
import com.droom.automation.page.droomweb.GermShieldForOfficePage;
import com.droom.automation.page.droomweb.RegistrationPage;

public class UserRegistrationTest extends AbstractBaseTest
{
	
	String filepath;
	ExcelUtilities eu;
	RegistrationPage registrationpage;
	
	
	public UserRegistrationTest()
	{
		filepath="C:/Users/Honey/Desktop/DroomAutomation TestData.xlsx";
		eu=new ExcelUtilities(filepath);
		registrationpage=new RegistrationPage();
	}
	
	//REGISTRATION 
	
	@Test(priority=1)
	public void registerAsIndividualUser() throws Exception
	{
		String username = eu.readData("RegistrationSheet", 1, 1);
		String mobilenumber = eu.readData("RegistrationSheet", 1, 2);
		String firstname = eu.readData("RegistrationSheet", 1, 3);
		String lastname = eu.readData("RegistrationSheet", 1, 4);
		String password = eu.readData("RegistrationSheet", 1, 5);
		registrationpage.creatIndividualAccount(username,mobilenumber,firstname,lastname,password);
	}
	
	@Test(priority=2)
	public void registerAsProSeller() throws Exception
	{
		String username = eu.readData("RegistrationSheet", 2, 1);
		String mobilenumber = eu.readData("RegistrationSheet", 2, 2);
		String firstname = eu.readData("RegistrationSheet", 2, 3);
		String lastname = eu.readData("RegistrationSheet", 2, 4);
		String businessname = eu.readData("RegistrationSheet", 2, 6);
		String password = eu.readData("RegistrationSheet", 2, 5);
		registrationpage.createProSellerAccount(firstname, lastname, username, mobilenumber, businessname, password);
	}
	
	
	//FUNCTIONAL TEST SCRIPT FOR INDIVIDUAL ACCOUNT
	
	@Test(priority=3)
	public void invalidInputErrorMsgVerificationWhileCreatingIndividualAccount() throws Exception
	{
		String username = eu.readData("ErrorMsgForRegistrationSheet", 1, 1);
		String mobilenumber = eu.readData("ErrorMsgForRegistrationSheet", 1, 2);
		registrationpage.invalidErrorMsgVerificationWhileCreatingIndividualAccount(username,mobilenumber);
	}
	
	@Test(priority=4)
	public void emptyErrorMsgVerificationWhileRegisterAsIndividualAccount() throws Exception
	{
		registrationpage.emptyErrorMsgVerificationWhileRegisterAsIndividualAccount();
	}
	
	
	@Test(priority=5)
	public void emptyErrorMsgVerificationWhileFillingFormAsIndividualAccount() throws Exception
	{
		String username = eu.readData("ErrorMsgForRegistrationSheet", 3, 1);
		String mobilenumber = eu.readData("ErrorMsgForRegistrationSheet", 3, 2);
		registrationpage.emptyErrorMsgVerificationWhileFillingFormAsIndividualAccount(username, mobilenumber);
	}
	
	
	@Test(priority=6)
	public void errorMsgVerificationForPasswordWhileRegisterAsIndividualAccount() throws Exception
	{
		String username = eu.readData("ErrorMsgForRegistrationSheet", 4, 1);
		String mobilenumber = eu.readData("ErrorMsgForRegistrationSheet", 4, 2);
		String firstname = eu.readData("ErrorMsgForRegistrationSheet", 4, 3);
		String lastname = eu.readData("ErrorMsgForRegistrationSheet", 4, 4);
		String password1 = eu.readData("ErrorMsgForRegistrationSheet", 4, 5);
		String password2 = eu.readData("ErrorMsgForRegistrationSheet", 4, 7);
		registrationpage.errorMsgVerificationForPasswordWhileFillingFormAsIndividualAccount(username, mobilenumber, firstname, lastname, password1,password2);
	}
	

	
	//FUNCTIONAL TEST SCRIPT FOR PRO-SELLER ACCOUNT
	
	
	@Test(priority=7)
	public void emptyErrorMsgVerificationWhileRegisterAsProSellerAccount() throws InterruptedException
	{
		registrationpage.emptyErrorMsgVerificationWhileRegisterAsProSellerAccount();
	}
	
	
	@Test(priority=8)
	public void allReadyExistErrorMsgVerificationWhileRegisterAsProSellerAccount() throws Exception
	{
		String username = eu.readData("RegistrationSheet", 2, 1);
		String mobilenumber = eu.readData("RegistrationSheet", 2, 2);
		String firstname = eu.readData("RegistrationSheet", 2, 3);
		String lastname = eu.readData("RegistrationSheet", 2, 4);
		String password = eu.readData("RegistrationSheet", 2, 5);
		String businessname = eu.readData("RegistrationSheet", 2, 6);
		registrationpage.allReadyExistErrorMsgVerificationWhileRegisterAsProSellerAccount(firstname, lastname, username, mobilenumber, businessname, password);
	}
	
	@Test(priority=9)
	public void inValidInputErrorMsgVerificationWhileRegisterAsProSellerAccount() throws Exception
	{
		String username = eu.readData("ErrorMsgForRegistrationSheet", 8, 1);
		String mobilenumber = eu.readData("ErrorMsgForRegistrationSheet", 8, 2);
		String firstname = eu.readData("ErrorMsgForRegistrationSheet", 8, 3);
		String lastname = eu.readData("ErrorMsgForRegistrationSheet", 8, 4);
		String password = eu.readData("ErrorMsgForRegistrationSheet", 8, 5);
		String businessname = eu.readData("ErrorMsgForRegistrationSheet", 8, 6);
		String otpValue = eu.readData("ErrorMsgForRegistrationSheet", 8, 8);
		registrationpage.inValidInputErrorMsgVerificationWhileRegisterAsProSellerAccount(firstname, lastname, username, mobilenumber, otpValue, businessname, password);
	}
	
}
