package com.droom.automation.page.credit;

import com.droom.automation.lib.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LendersPage extends SeleniumWrapper {

	private static final By PPT_TnC = By.id("tncppt");
	private static final By PPT_GETSTARTED = By.cssSelector(".btn-green");
	private static final By PPL_GETSTARTED = By.cssSelector(".btn-orange");
	private static final By TnC_LINK = By.linkText ("Terms & Conditions");
	public final By PPT_TnC_ERROR = By.id("errorppt");
	private static final By PPL_TnC = By.id("tncppl");
	public final By PPL_TnC_ERROR = By.id("errorppl");
	
	public void clickPptGetStarted() {
		executeClickOnElement(PPT_GETSTARTED);
		sleep(2000);
		}
	
	public void clickPplGetStarted() {
		executeClickOnElement(PPL_GETSTARTED);
		sleep(2000);
		}
	
	public void clickPplTnc() {
		executeClickOnElement(PPT_TnC);
		}
	
	public void clickPptTncLink() {
		executeClickOnElement(TnC_LINK);
		}
	
	public void clickPptTnc() {
		executeClickOnElement(PPT_TnC);
		}
}
