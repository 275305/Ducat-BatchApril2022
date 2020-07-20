package com.droom.automation.credit;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;
import com.droom.automation.page.credit.LendersPage;
import com.droom.automation.page.credit.LenderSignUpPage;
import com.droom.automation.page.credit.HomePage;
import com.droom.automation.page.credit.TermsAndConditionsPage;
import com.google.common.base.Verify;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.print.Printable;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;
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
