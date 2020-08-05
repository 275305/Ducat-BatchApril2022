package com.droom.automation.page.droomweb;
import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;

import org.openqa.selenium.By;

public class HomePage extends SeleniumWrapper {

    private static final By SEARCH = By.xpath("//input[@title='Search']");
    private final static By Select_Top_Panel_Sell=By.xpath("(//span[contains(text(),'Sell ')])[1]");
    private final static By Select_Sell=By.xpath("//span[text()='Sell']");
    private final static By Select_Buy=By.xpath("//i[@class='buy home-icon-checkout-cart d-bg-blue']");
    private static final By Select_Start_Shopping = By.xpath("//a[text()='Start Shopping']");
    private static final By Click_Germ_Shield_Antimicrobial_Coating= By.xpath("//p[text()='Germ Shield Antimicrobial Coating']");
    private static final By Click_Buy_Germ_Shield=By.xpath("(//a[text()='Buy Germ Shield'])[1]");
    private static final By Click_Sell_From_Home_Popup=By.xpath("//h2[text()='Sell from Home']");
    private static final By Click_Create_Listion_Button=By.xpath("//a[text()='Create Listing']");
    private static final By Click_Sell_As_ProSeller_From_Home_Popup=By.xpath("//h2[text()='Sell as ProSeller']");
    private static final By Click_Search_Box=By.xpath("//input[@id='main_search']");
    private static final By Click_To_Close_To_Do_PopUp=By.xpath("//div[@id='entryModal']//button");
    private static final By Click_Droom_Franchise=By.xpath("//a[text()='Droom Franchise']");
//  private static final By =By.xpath("");
//  private static final By =By.xpath("");
//  private static final By =By.xpath("");
//  private static final By =By.xpath("");
//  private static final By =By.xpath("");
    
    public void enterSearch(String text)
    {
        enterTextboxDetails(findElement(SEARCH), text);
        sleep(2000);
    }
    
    public void enterSellByTopPanel()
    {
    	executeClickOnElement(Select_Top_Panel_Sell);
    }
    
    public void enterSell()
    {
    	verifyByText(Select_Sell, "Sell");
    	executeClickOnElement(Select_Sell);
    }
    
    public void createSellListingFromHome()
    {
    	executeClickOnElement(Click_Sell_From_Home_Popup);
    	//verifyByText(Click_Create_Listion_Button, "Create Listing");
    	executeClickOnElement(Click_Create_Listion_Button);
    }
    
    public void createSellListingAsProSellerFromHome()
    {
    	executeClickOnElement(Click_Sell_As_ProSeller_From_Home_Popup);
    	verifyByText(Click_Create_Listion_Button, "Create Listing");
    	executeClickOnElement(Click_Create_Listion_Button);
    }
    
    public void enterBuy()
    {
    	executeClickOnElement(Select_Buy);
    }
    
    public void selectStartShopping()
    {
    	executeClickOnElement(Select_Start_Shopping);
    }
    
    public void enterGermShieldAntimicrobialCoating()
    {
    	executeClickOnElement(Click_Germ_Shield_Antimicrobial_Coating);
    	sleep(4000);
    	//verifyByText(Click_Buy_Germ_Shield, "Buy Germ Shield");
    	executeClickOnElement(Click_Buy_Germ_Shield);
    }
    
    public void enterSearchBox(String searchvalue)
    {
    	verifyByAttributeByID(Click_Search_Box, "main_search");
    	enterTextboxDetails(findElement(Click_Search_Box), searchvalue);
    	verifyByAttribute(Click_Search_Box, searchvalue);
    	enterKey(Click_Search_Box);
    }
    
    public void enterDroomFranchise()
    {
    	waitForPageLoad();
    	sleep(2000);
    	executeClickOnElement(Click_To_Close_To_Do_PopUp);
    	executeScrollDownScript(2600);
    	verifyByContains(Click_Droom_Franchise, "Droom Franchise");
    	executeClickOnElement(Click_Droom_Franchise);
    }
    
}
