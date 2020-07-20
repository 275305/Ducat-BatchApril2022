package com.droom.automation.page;

import com.droom.automation.lib.SeleniumWrapper;
import org.openqa.selenium.By;

public class HomePage extends SeleniumWrapper {

    private static final By SEARCH = By.xpath("//input[@title='Search']");
    private final static By Select_Sell=By.xpath("(//span[contains(text(),'Sell ')])[1]");

    public void enterSearch(String text) 
    {
        enterTextboxDetails(findElement(SEARCH), text);
        sleep(2000);
    }
    
    public void enterSell()
    {
    	executeClickOnElement(Select_Sell);
    }
}
