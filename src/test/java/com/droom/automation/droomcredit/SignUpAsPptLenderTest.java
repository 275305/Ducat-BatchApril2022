package com.droom.automation.droomcredit;
import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.page.droomcredit.HomePage;
import com.droom.automation.page.droomcredit.LenderSignUpPage;
import com.droom.automation.page.droomcredit.LendersPage;
import com.droom.automation.page.droomcredit.TermsAndConditionsPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpAsPptLenderTest extends AbstractBaseTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(AbstractBaseTest.class);
	HomePage homePage = new HomePage();
	LendersPage lendersPage = new LendersPage();
	LenderSignUpPage lenderSignUpPage = new LenderSignUpPage();
	TermsAndConditionsPage termsAndConditionsPage = new TermsAndConditionsPage();

	 @Test
	    public void sighUpAsLenderErrors(){
	    homePage.clickSignUp();
	    homePage.clickSignUpAsLender();
	    lendersPage.waitForPageLoad();
	    lendersPage.clickPptGetStarted();
	    Assert.assertEquals(lendersPage.getElementText(lendersPage.PPT_TnC_ERROR), "Kindly agree to our terms and conditions");
	    System.out.println(lendersPage.getElementText(lendersPage.PPT_TnC_ERROR) + " -- Found for PPT_TnC_ERROR");
	    lendersPage.clickPptTnc();
	    lendersPage.clickPptGetStarted();
	    lenderSignUpPage.waitForPageLoad();
	    lenderSignUpPage.clickSubmitButton();
	    Assert.assertEquals(lenderSignUpPage.getElement1Text(), "The email field is required.");
	    System.out.println(lenderSignUpPage.getElement1Text() + " -- Found for EMAIL_ID_ERROR");
	    lenderSignUpPage.inputEmail("dsfdsfsdom");
	    lenderSignUpPage.clickSubmitButton();
	    Assert.assertEquals(lenderSignUpPage.getElement1Text(), "The email must be a valid email address.");
	    System.out.println(lenderSignUpPage.getElement1Text() + " -- Found for EMAIL_ID_ERROR");
	    lenderSignUpPage.inputEmail("dsfdsfsd@zdfsd.com");
	    lenderSignUpPage.inputPassword("123456");
	    lenderSignUpPage.inputConfirmPassword("123456");
	    
	 }
	

    

	  

}
