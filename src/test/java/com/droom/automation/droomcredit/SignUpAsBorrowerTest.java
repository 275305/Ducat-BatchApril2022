package com.droom.automation.credit;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.page.credit.ApplyLoanPage;
import com.droom.automation.page.credit.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpAsBorrowerTest extends AbstractBaseTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(AbstractBaseTest.class);
	HomePage homePage = new HomePage();
	ApplyLoanPage applyLoan = new ApplyLoanPage();


	 @Test
	    public void sighUpAsBorrowerErrors(){
	    homePage.clickSignUp();
	    applyLoan.waitForPageLoad();
	    homePage.clickSignUpAsBorrower();
	    applyLoan.findElement(By.xpath("//form[@id='register_form']/div[9]/button"));
	    applyLoan.clickSubmitButton();
	    applyLoan.isElementPresent(By.xpath("//form[@id='register_form']/div/small"));
	    
	    Assert.assertEquals(applyLoan.getElementText(applyLoan.FIRST_NAME_ERROR), "This field is required.");
	    System.out.println(applyLoan.getElementText(applyLoan.FIRST_NAME_ERROR) + " -- Found for FIRST_NAME_ERROR");
	    Assert.assertEquals(applyLoan.getElementText(applyLoan.LAST_NAME_ERROR), "This field is required.");
	    System.out.println(applyLoan.getElementText(applyLoan.LAST_NAME_ERROR) + " -- Found for LAST_NAME_ERROR ");
	    Assert.assertEquals(applyLoan.getElementText(applyLoan.EMAIL_ID_ERROR), "This field is required.");
	    System.out.println(applyLoan.getElementText(applyLoan.EMAIL_ID_ERROR) + " -- Found for EMAIL_ID_ERROR");
	    Assert.assertEquals(applyLoan.getElementText(applyLoan.MOB_NO_ERROR), "Please enter a valid mobile number.");
	    System.out.println(applyLoan.getElementText(applyLoan.MOB_NO_ERROR) + " -- Found for MOB_NO_ERROR");
	    Assert.assertEquals(applyLoan.getElementText(applyLoan.PIN_CODE_ERROR), "This field is required.");
	    System.out.println(applyLoan.getElementText(applyLoan.PIN_CODE_ERROR) + " -- Found for PIN_CODE_ERROR");
	    Assert.assertEquals(applyLoan.getElementText(applyLoan.LOAN_PARTNER_ERROR), "This field is required.");
	    System.out.println(applyLoan.getElementText(applyLoan.LOAN_PARTNER_ERROR) + " -- Found for LOAN_PARTNER_ERROR");
	    Assert.assertEquals(applyLoan.getElementText(applyLoan.VEHICLE_TYPE_ERROR), "This field is required.");
	    System.out.println(applyLoan.getElementText(applyLoan.VEHICLE_TYPE_ERROR) + " -- Found for VEHICLE_TYPE_ERROR");
	    Assert.assertEquals(applyLoan.getElementText(applyLoan.VEHICLE_CONDITION_ERROR), "This field is required.");
	    System.out.println(applyLoan.getElementText(applyLoan.VEHICLE_CONDITION_ERROR) + " -- Found for VEHICLE_CONDITION_ERROR");
 	    
	    applyLoan.inputEmail("credqa");
	    //homePage.clickSignUpAsBorrower();
	    Assert.assertEquals(applyLoan.getElementText(applyLoan.EMAIL_ID_ERROR), "Please enter a valid email address.");
	    System.out.println(applyLoan.getElementText(applyLoan.EMAIL_ID_ERROR) + " -- Found for EMAIL_ID_ERROR");
	    
	    
	 }
	
  	@Test
    public void sighUpAsBorrower(){
    
    	homePage.clickSignUp();
    	homePage.clickSignUpAsBorrower();
    	applyLoan.inputFirstName("Cred");
    	applyLoan.inputLastName("QA");
    	applyLoan.inputEmail("credqa@mmm.com");
    	applyLoan.inputMobile("988888444");
    	applyLoan.inputPin("122015");
    	applyLoan.selectPartner();
    	applyLoan.selectVehicle();	
    	applyLoan.selectCondition();
    	
     }
    

	  

}
