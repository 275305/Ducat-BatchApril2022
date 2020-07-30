package com.droom.automation.page.credit;

import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends SeleniumWrapper {

	private static final By SIGNUP_BUTTON = By.className("userSignIn");
	private static final By SEARCH = By.xpath("//input[@title='Search']");
	private static final By SIGNUP_AS_BORROWER_LINK = By.linkText("Sign Up As Borrower");
	private static final By SIGNUP_AS_LENDER_LINK = By. cssSelector(".userLogin li:nth-child(1) > a");

	public void clickSignUpAsBorrower() 
	{
		executeClickOnElement(SIGNUP_AS_BORROWER_LINK);
		sleep(2000);
		}
	
	public void clickSignUpAsLender()
	{
		executeClickOnElement(SIGNUP_AS_LENDER_LINK);
		sleep(2000);
		}
	
	public String getTitle()
	{
		return WebDriverFactory.getDriver().getTitle();                     
	}
	
	public void clickSignUp() 
	{
		executeClickOnElement(SIGNUP_BUTTON);
		}
	
	public void enterSearch(String text) 
	{
        enterTextboxDetails(findElement(SEARCH), text);
        sleep(2000);
    }
}
