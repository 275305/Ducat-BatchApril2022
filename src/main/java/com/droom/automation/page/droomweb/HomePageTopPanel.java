package com.droom.automation.page;

import org.openqa.selenium.By;

import com.droom.automation.lib.SeleniumWrapper;

public class HomePageTopPanel extends SeleniumWrapper
{
	private static final By Enter_Germ_Shield_Via_Top_Pannel= By.xpath("//span[text()='Germ Shield']");
	private static final By Enter_Germ_Shield_PopUp= By.xpath("//a[text()='Buy Germ Shield']");
	//private static final By = By.xpath("");
	
	public void enterGermShieldViaTopPannel()
	{
		executeClickOnElement(Enter_Germ_Shield_Via_Top_Pannel);
	}
	
	public void enterBuyGermShieldPopUp()
	{
		executeClickOnElement(Enter_Germ_Shield_PopUp);
	}

}
