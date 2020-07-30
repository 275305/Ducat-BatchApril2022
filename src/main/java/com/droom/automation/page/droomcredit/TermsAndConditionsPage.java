package com.droom.automation.page.credit;

import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class TermsAndConditionsPage extends SeleniumWrapper {
	//WebDriver driver = new ChromeDriver();
	//driver.ge
	private static final By PPT_GETSTARTED = By.cssSelector(".btn-green");
	private static final By TnC_LINK = By.linkText ("Terms & Conditions");
	public final By PPT_TnC_ERROR = By.id("errorppt");

	
	public void clickPptGetStarted() {
		executeClickOnElement(PPT_GETSTARTED);
		sleep(2000);
		}

	
	public void clickPptTncLink() {
		executeClickOnElement(TnC_LINK);
		}
	
	
	
}