package com.droom.automation.page.droomweb;

import java.awt.AWTException;

import org.openqa.selenium.By;

import com.droom.automation.lib.SeleniumWrapper;

public class FranchisePage extends SeleniumWrapper
{
	private final static By Enter_Full_Name=By.xpath("//input[@id='name']");
	private final static By Enter_Contact_Number=By.xpath("//input[@id='phone']");
	private final static By Enter_Email_ID=By.xpath("//input[@id='email']");
	private final static By Click_SignUp_Now_Button=By.xpath("//a[@id='signUpFranchise']");
//	  private static final By =By.xpath("");
//    private static final By =By.xpath("");
//    private static final By =By.xpath("");
//    private static final By =By.xpath("");
//    private static final By =By.xpath("");
//    private static final By =By.xpath("");
//    private static final By =By.xpath("");
//    private static final By =By.xpath("");
//    private static final By =By.xpath("");
    
	
	HomePage homepage;
    
    public FranchisePage()
    {
    	homepage=new HomePage();
    }
    
    

    public void registerAsFranchise(String fullName,String contactNumber,String mailId,String franchiseName,String password,String franchiseAddress,String zipCode)
	{
    	homepage.enterDroomFranchise();
		waitForPageLoad();
		enterTextboxDetails(findElement(Enter_Full_Name), fullName);
		verifyByAttribute(Enter_Full_Name, fullName);
		enterTextboxDetails(findElement(Enter_Contact_Number), contactNumber);
		verifyByAttribute(Enter_Contact_Number, contactNumber);
		enterTextboxDetails(findElement(Enter_Email_ID), mailId);
		verifyByAttribute(Enter_Email_ID, mailId);
		verifyByText(Click_SignUp_Now_Button, "Sign Up Now");
		executeClickOnElement(Click_SignUp_Now_Button);
		sleep(5000);
		enterTextboxDetails(findElement(By.xpath("//input[@id='franchiseName']")), franchiseName);
		verifyByAttribute(By.xpath("//input[@id='franchiseName']"),franchiseName );
		enterTextboxDetails(findElement(By.xpath("//input[@id='password']")), password);
		verifyByAttribute(By.xpath("//input[@id='password']"), password);
		enterTextboxDetails(findElement(By.xpath("//input[@id='confirm_password']")), password);
		verifyByAttribute(By.xpath("//input[@id='confirm_password']"), password);
		enterTextboxDetails(findElement(By.xpath("//textarea[@id='franchiseAddress']")),franchiseAddress );
		verifyByAttribute(By.xpath("//textarea[@id='franchiseAddress']"), franchiseAddress);
		enterTextboxDetails(findElement(By.xpath("//input[@id='zip']")), zipCode);
		verifyByAttribute(By.xpath("//input[@id='zip']"),zipCode );
		executeClickOnElement(By.xpath("//input[@id='tnc']"));
		verifyRadioButton(By.xpath("//input[@id='tnc']"));
		verifyByContains(By.xpath("//a[@id='createFranchise']"), "Create a Franchise");
		sleep(5000);
		executeClickOnElement(By.xpath("//a[@id='createFranchise']"));
		
	}
    
    public void signUp(String year,String empCount,String index)
    {
    	waitForPageLoad();
    	selectOptionByText(By.xpath("//select[@id='business_establish']"), year);
    	enterTextboxDetails(findElement(By.xpath("//input[@id='count_emp']")), empCount);
    	executeClickOnElement(By.xpath("//input[@id='itr_yes']"));
    	verifyRadioButton(By.xpath("//input[@id='itr_yes']"));
    	selectOptionByIndex(By.xpath("//select[@id='turnover']"), Integer.parseInt(index));
    	executeClickOnElement(By.xpath("//button[@id='saveStep2']"));
    }
    
    public void franchiseEvaluation(String businessName,String gstNumber,String businessPan,String businessAddress,String fileUploadPath,String fileName) throws Exception
    {
    	sleep(5000);
    	enterTextboxDetails(findElement(By.xpath("//input[@id='business_name']")), businessName);
    	enterTextboxDetails(findElement(By.xpath("//input[@id='gst_number']")), gstNumber);
    	enterTextboxDetails(findElement(By.xpath("//input[@id='business_pan']")), businessPan);
    	enterTextboxDetails(findElement(By.xpath("//input[@id='address_proof']")), businessAddress);
    	executeClickOnElement(By.xpath("(//button[text()=' Upload'])[1]"));
    	sleep(2000);
    	fileUpload(fileUploadPath);
    	sleep(5000);
    	verifyByContains(By.xpath("//span[@id='gst_number_file_name']"), fileName+".png");
    	executeClickOnElement(By.xpath("(//button[text()=' Upload'])[2]"));
    	sleep(2000);
    	fileUpload(fileUploadPath);
    	sleep(5000);
    	verifyByContains(By.xpath("//span[@id='gst_number_file_name']"), fileName+".png");
    	executeClickOnElement(By.xpath("(//button[text()=' Upload'])[3]"));
    	sleep(2000);
    	fileUpload(fileUploadPath);
    	sleep(5000);
    	verifyByContains(By.xpath("//span[@id='gst_number_file_name']"), fileName+".png");
    	executeClickOnElement(By.xpath("//button[@id='submit_franchise_kyc_btn']"));
    }
    
}
