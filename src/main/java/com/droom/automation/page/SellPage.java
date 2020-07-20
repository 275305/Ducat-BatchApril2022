package com.droom.automation.page;

import org.openqa.selenium.By;

import com.droom.automation.lib.SeleniumWrapper;

public class SellPage extends SeleniumWrapper
{
	private final static By Select_Catogory=By.xpath("//select[@id='wizard_category_id']");
	private final static By Click_Location=By.xpath("//input[@id='location_plugin']");
	private final static By Enter_City=By.xpath("//div[@id='main_header_location']//label/following-sibling::input");
	private final static By Select_City_Name=By.xpath("//li[text()='Delhi'])[3]");
	private final static By Select_Make=By.xpath("//select[@id='make']");
	private final static By Select_Model=By.xpath("//select[@id='model']");
	private final static By Select_Year=By.xpath("//select[@id='year']");
	private final static By Select_Trim=By.xpath("//select[@id='trim']");
	private final static By Click_Create_Listing_Now=By.xpath("//button[@id='old_listing']");
	private final static By Login_To_Continue=By.xpath("//a[@id='login-widget-btn']");
//	private final static By Login_To_Continue=By.xpath("");
//	private final static By Login_To_Continue=By.xpath("");
//	private final static By Login_To_Continue=By.xpath("");
	

	
	public void createYourListing()
	{
		HomePage hp=new HomePage();
		hp.enterSell();
		
	}
	
	
}
