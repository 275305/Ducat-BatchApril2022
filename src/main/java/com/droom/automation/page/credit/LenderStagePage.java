package com.droom.automation.page.credit;

import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LenderStagePage extends SeleniumWrapper {

	private static final By STAGE_A_RADIO = By.id("6");
	private static final By STAGE_B_RADIO = By.xpath("//input[@id='8']");
	private static final By STAGE_C_RADIO = By.id("8");
	private static final By STAGE_D_RADIO = By.id("9");
	private static final By STAGE_E_RADIO = By.id("10");
	private static final By SUBMIT_BUTTON = By.cssSelector(".btn-green");

	
	public void clickSubmitButton() {
		executeClickOnElement(SUBMIT_BUTTON);
		
		}

	
	public void clickAStage() {
		executeClickOnElement(STAGE_B_RADIO);
		}
	
}