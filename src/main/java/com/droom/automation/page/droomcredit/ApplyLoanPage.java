package com.droom.automation.page.credit;

import com.droom.automation.lib.SeleniumWrapper;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.FindBy;

public class ApplyLoanPage extends SeleniumWrapper {

	private static final By FIRST_NAME = By.id("first_name");
	private static final By LAST_NAME = By.id("last_name");
	private static final By EMAIL_ID = By.id("email");
	private static final By MOB_NO = By.id("mobile");
	private static final By PIN_CODE = By.id("pincode");
	private static final By LOAN_PARTNER = By.id("partner");
	private static final By VEHICLE_TYPE = By.id("vehicle");
	private static final By VEHICLE_CONDITION = By.id("condition");
	private static final By SUBMIT_BUTTON = By.xpath("//form[@id='register_form']/div[9]/button");

	public final By FIRST_NAME_ERROR = By.xpath("//form[@id='register_form']/div/small");
	public final By LAST_NAME_ERROR = By.xpath("//form[@id='register_form']/div[2]/small");
	public final By EMAIL_ID_ERROR = By.xpath("//form[@id='register_form']/div[3]/div/small");
	public final By MOB_NO_ERROR = By.xpath("//form[@id='register_form']/div[4]/div/small");
	public final By PIN_CODE_ERROR = By.xpath("//form[@id='register_form']/div[5]/div/small");
	public final By LOAN_PARTNER_ERROR = By.xpath("//form[@id='register_form']/div[6]/small");
	public final By VEHICLE_TYPE_ERROR = By.xpath("//form[@id='register_form']/div[7]/small");
	public final By VEHICLE_CONDITION_ERROR = By.xpath("//form[@id='register_form']/div[8]/small");
	
	
	
	public void inputFirstName(String text) {
		enterTextboxDetails(findElement(FIRST_NAME),text);
		
		}
	
	public void inputLastName(String text) {
		enterTextboxDetails(findElement(LAST_NAME), text);
		
		}

	public void inputEmail(String text) {
		enterTextboxDetails(findElement(EMAIL_ID), text);
		
		}

	public void inputMobile(String text) {
		enterTextboxDetails(findElement(MOB_NO), text);
		
		}

	public void inputPin(String text) {
		enterTextboxDetails(findElement(PIN_CODE), text);
		
		}

	public void selectPartner() {
		selectOptionByIndex(LOAN_PARTNER, 2);
		
		}

	public void selectVehicle() {
		selectOptionByIndex(VEHICLE_TYPE, 2);
		
		}
	
	public void selectCondition() {
		selectOptionByIndex(VEHICLE_CONDITION, 2);
		
		}

	public void clickSubmitButton() {
		executeClickOnElement(SUBMIT_BUTTON);
		
		}


    
}
