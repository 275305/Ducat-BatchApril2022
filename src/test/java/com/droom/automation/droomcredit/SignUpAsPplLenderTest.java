package com.droom.automation.droomcredit;
import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.page.droomcredit.HomePage;
import com.droom.automation.page.droomcredit.LenderSignUpPage;
import com.droom.automation.page.droomcredit.LenderStagePage;
import com.droom.automation.page.droomcredit.LendersPage;
import com.droom.automation.page.droomcredit.TermsAndConditionsPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpAsPplLenderTest extends AbstractBaseTest {
	
	private static final Logger LOG = LoggerFactory.getLogger(AbstractBaseTest.class);
	HomePage homePage = new HomePage();
	LendersPage lendersPage = new LendersPage();
	LenderStagePage lenderStagePage = new LenderStagePage();
	LenderSignUpPage lenderSignUpPage = new LenderSignUpPage();
	TermsAndConditionsPage termsAndConditionsPage = new TermsAndConditionsPage();

	 @Test
	    public void sighUpAsLenderErrors(){
		 System.out.println(homePage.getTitle());
	    homePage.clickSignUp();
	    homePage.clickSignUpAsLender();
	    lendersPage.waitForPageLoad();
	    lendersPage.clickPplGetStarted();
	    Assert.assertEquals(lendersPage.getElementText(lendersPage.PPL_TnC_ERROR), "Kindly agree to our terms and conditions");
	    System.out.println(lendersPage.getElementText(lendersPage.PPL_TnC_ERROR) + " -- Found for PPL_TnC_ERROR");
	    
/*	    lendersPage.clickPptTncLink();
	    By sss = By.cssSelector("body");
	    ((WebElement) sss).sendKeys(Keys.CONTROL +"\t");
	    Assert.assertEquals("Droom Credit Terms and Conditions",termsAndConditionsPage.PAGE_TITLE);*/
	   
	    lendersPage.clickPplTnc();
	    lendersPage.clickPplGetStarted();
	    lenderSignUpPage.waitForPageLoad();
	    lenderStagePage.clickAStage();
	    lenderStagePage.clickSubmitButton();
	    lenderSignUpPage.waitForPageLoad();
	    lenderSignUpPage.clickSubmitButton();
	    System.out.println(lenderSignUpPage.getElement1Text());
	    Assert.assertEquals(lenderSignUpPage.getElementText(lenderSignUpPage.EMAIL_ID_ERROR), "The email field is required.");
	    System.out.println(lendersPage.getElementText(lenderSignUpPage.EMAIL_ID_ERROR) + " -- Found for EMAIL_ID_ERROR");
	    lenderSignUpPage.clickSubmitButton();
	    Assert.assertEquals(lenderSignUpPage.getElementText(lenderSignUpPage.INCORRECT_EMAIL_ID_ERROR), "The email must be a valid email address.");
	    System.out.println(lendersPage.getElementText(lenderSignUpPage.INCORRECT_EMAIL_ID_ERROR) + " -- Found for EMAIL_ID_ERROR");
	    lenderSignUpPage.inputEmail("dsfdsfsd@zdfsd.com");
	    lenderSignUpPage.inputPassword("123456");
	    lenderSignUpPage.inputConfirmPassword("123456");
	
	 }
	

    

	  

}
