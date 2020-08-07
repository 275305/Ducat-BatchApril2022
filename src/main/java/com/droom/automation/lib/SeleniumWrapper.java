package com.droom.automation.lib;

import com.droom.automation.constants.UIConstants;
import com.google.common.base.Verify;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumWrapper extends JavaLibrary
{

    private int timeout = 60;
    private static final Logger LOG = LoggerFactory.getLogger(SeleniumWrapper.class);

    public boolean isPageLoadComplete(final WebDriver driverObj) {
        return ((JavascriptExecutor)driverObj).executeScript("return document.readyState").equals("complete");
    }

    public void waitForPageLoad(final WebDriver driver) {

        int timeLimitInSec = timeout;

        while(timeLimitInSec != 0) 
        {
            if (isPageLoadComplete(driver)) 
            {
                System.out.println("Info : Page load completed Successfully ..");
                return;
            }
            timeLimitInSec--;
            try {
                Thread.sleep(1000L);
            }
            catch (final Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }

    public WebDriverWait getWebDriverWait() {
        final WebDriver webDriver = WebDriverFactory.getDriver();
        WebDriverWait wait = new WebDriverWait(webDriver, timeout);
        return wait;
    }

    public void sleep(long milliseconds){
        try {
            Thread.sleep(milliseconds);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public WebElement findElement(final By by) 
    {
        return getWebDriverWait().until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public Boolean isElementInvisible(final By by) {
        return getWebDriverWait().until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public WebElement findVisibleElement(final By by) {
        WebElement element = getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(by));
        return element;
    }

    public Boolean isElementPresent(final By by) {
        WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            WebDriverFactory.getDriver().findElement(by);
            return true;
        }
        catch (Exception e){
            return false;
        }
        finally {
            WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
        }
    }

    public boolean isElementDisplayed(final By by) {
        if (!isElementPresent(by))
            return false;
        else
            return findElement(by).isDisplayed();

    }

    public boolean isAttributePresent(WebElement element, String attribute) {
        Boolean result = false;
        try {
            result = element.getAttribute(attribute) != null ? true : false;
        } catch (Exception e) {
        }
        return result;
    }

    public List<WebElement> findElements(final By by) {
        return WebDriverFactory.getDriver().findElements(by);
    }

    public void waitForElementEnableDisable(final By by, final boolean enableFlag) {

        getWebDriverWait().until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(final WebDriver webDriver) {

                final WebElement element = webDriver.findElement(by);

                if (enableFlag) {
                    return element != null && element.isEnabled();
                } else {
                    return element != null && !element.isEnabled();
                }
            }
        });
    }

    public void waitForElementTobePresent(final By locator) {
        final long startTime = System.currentTimeMillis();
        getWebDriverWait().until(ExpectedConditions.presenceOfElementLocated(locator));
        final long endTime = System.currentTimeMillis();
        LOG.info("TIME TAKEN FOR ELEMENT TO BE PRESENT " + locator + " : " + (endTime - startTime) / UIConstants.NumericValues.ONE + " seconds");
    }

    public void waitForMessagesToAppear(final By by) {

        getWebDriverWait().until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(final WebDriver webDriver) {
                try {
                    Thread.sleep(UIConstants.NumericValues.ONE);
                    return !webDriver.findElement(by).getAttribute("class").contains("ng-hide");
                } catch (final InterruptedException e) {
                    LOG.error("ERROR ENCOUNTERED WAITING FOR SUCCESSFUL MESSAGE");
                }
                return null;

            }
        });
    }

    public void enterTextboxDetails(final WebElement webelement, final String keysToSend) 
    {
        webelement.clear();
        webelement.sendKeys(keysToSend);
    }

    public void selectOptionByText(final By by, final String visibleValue)
    {
        Select select = new Select(WebDriverFactory.getDriver().findElement(by));
        select.selectByVisibleText(visibleValue);
    }

    public boolean isSelectOptionVisible(final By by, final String visibleValue) {
        int flag=0;
        Select drpDwnSel=new Select(findElement(by));
        List<WebElement> drpDwnList=drpDwnSel.getOptions();
        for (WebElement indElem:drpDwnList){
            if(indElem.getText().contains(visibleValue)){
                flag=1;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }

    public void selectOptionByIndex(final By by, final int index) {
        Select select = new Select(WebDriverFactory.getDriver().findElement(by));
        select.selectByIndex(index);
    }

    public List<String> getDropDownOptionText(final By by)
    {
        List<String> optionsText = new ArrayList<>();
        Select select = new Select(WebDriverFactory.getDriver().findElement(by));
        List<WebElement> optionsElement = select.getOptions();
        for (WebElement option : optionsElement){
            optionsText.add(option.getText());
        }
        return optionsText;
    }

    public String getDefaultSelectedOption(final By by) 
    {
        Select select = new Select(WebDriverFactory.getDriver().findElement(by));
        String text = select.getFirstSelectedOption().getText();
        return text;
    }

    public boolean isComboOptionVisible(final By by, final String visibleValue) 
    {
        Select selectPolicy = new Select(findVisibleElement(by));
        return selectPolicy.getFirstSelectedOption().getText().matches(visibleValue);
    }

    public void doPageRefresh() 
    {
        WebDriverFactory.getDriver().navigate().refresh();
    }

    public void waitForAlertPopup() 
    {
        getWebDriverWait().until(ExpectedConditions.alertIsPresent());
    }

    public void dismissAlertPopUp() 
    {
        WebDriverFactory.getDriver().switchTo().alert().dismiss();
    }

    public void acceptBrowserPopUp() 
    {
        waitForAlertPopup();
        WebDriverFactory.getDriver().switchTo().alert().accept();
    }

    public void executeScript(final String javaScript)
    {
        ((JavascriptExecutor)WebDriverFactory.getDriver()).executeScript(javaScript);
    }

    public void executeScript(final String javaScript, final Object... object) 
    {
        ((JavascriptExecutor)WebDriverFactory.getDriver()).executeScript(javaScript, object);
    }

    public void executeScrollUpScript() {
        ((JavascriptExecutor)WebDriverFactory.getDriver()).executeScript("window.scrollBy(0,-2000)", "");
    }

    public void executeScrollUpScript(final int pixels) {
        ((JavascriptExecutor)WebDriverFactory.getDriver()).executeScript("window.scrollBy(0, " + -(pixels) + ")", "");
    }

    public void executeScrollDownScript(final int pixels) {
        ((JavascriptExecutor)WebDriverFactory.getDriver()).executeScript("window.scrollBy(0, " + pixels + ")");
    }

    public void executeScrollIntoViewScript(final WebElement webElement) 
    {
        executeScript("arguments[0].scrollIntoView(true);", webElement);
    }

    public void executeClickOnElement(final By locator)
    {
        ((JavascriptExecutor)WebDriverFactory.getDriver() ).executeScript("arguments[0].click();", findElement(locator));
    }

    public void enterValueByJS(final By by ,String inputvalue)
    {
    	String inputText = inputvalue;
    	WebElement myElement = WebDriverFactory.getDriver().findElement(by);
    	String js = "arguments[0].setAttribute('value','"+inputText+"')";
    	((JavascriptExecutor) WebDriverFactory.getDriver()).executeScript(js, myElement);
    }
    public String openURLInNewWindow(final String url) 
    {
        final WebDriver driver = WebDriverFactory.getDriver();
        final Set<String> windowsBeforeOpen = driver.getWindowHandles();
        executeScript("window.open();");
        final Set<String> windowsAfterOpen = driver.getWindowHandles();
        windowsAfterOpen.removeAll(windowsBeforeOpen);
        final String newWindowHandle = ((String)windowsAfterOpen.toArray()[0]);
        switchToWindowBasedOnHandle(newWindowHandle);
        driver.get(url);
        return newWindowHandle;
    }

    public String getWindowHandle() 
    {
        return WebDriverFactory.getDriver().getWindowHandle();
    }

    public void switchToWindowBasedOnHandle(final String windowHandle)
    {
        WebDriverFactory.getDriver().switchTo().window(windowHandle);
    }

    public void switchToWindow(final String title)
    {
        final WebDriver driver = WebDriverFactory.getDriver();
        for (final String windowHandle : driver.getWindowHandles())
        {
            driver.switchTo().window(windowHandle);
            if (driver.getTitle().equalsIgnoreCase(title))
            {
                return;
            }
        }
    }

    public void waitForPageLoad()
    {
        waitForPageLoad(WebDriverFactory.getDriver());
    }
    
    public String getElementText(final By  by) 
    {
    	return  WebDriverFactory.getDriver().findElement(by).getText();
    }
    
    public void verifyByText(final By by, String text)
	{
		String actual_text = WebDriverFactory.getDriver().findElement(by).getText();
		String expected_Text = text;
		Assert.assertEquals(actual_text, expected_Text);
		System.out.println(actual_text+" is displaying hence verified");
	}
	
	public void verifyByContains(final By by, String text)
	{
		String actual_text = WebDriverFactory.getDriver().findElement(by).getText();
		Assert.assertTrue(actual_text.contains(text));
		System.out.println(actual_text+" is displaying hence verified");
		
	}
	
	public void verifyRadioButton(final By by)
	{
		boolean checked = WebDriverFactory.getDriver().findElement(by).isSelected();
		if (!checked) 
		{
			System.out.println("Declaration is not Selected.");
		}
		else
		{
		System.out.println("Declaration is Selected.");
		}
	}
	
	public void verifyByAttribute(final By by, String text)
	{
		String actual_attribute = WebDriverFactory.getDriver().findElement(by).getAttribute("value");
		//String expected_Text = text;
		Assert.assertTrue(actual_attribute.contains(text));
		System.out.println(actual_attribute+" is displaying hence verified");
	}
	
	public void verifyByAttributeByID(final By by, String text)
	{
		String actual_attribute = WebDriverFactory.getDriver().findElement(by).getAttribute("id");
		//String expected_Text = text;
		Assert.assertTrue(actual_attribute.contains(text));
		System.out.println(actual_attribute+" is displaying hence verified");
	}
	
	public void verifyByWebElements(final By by1,final By by2) throws InterruptedException
	{
		String actual = WebDriverFactory.getDriver().findElement(by1).getText();
		Thread.sleep(3000);
		String expected = WebDriverFactory.getDriver().findElement(by2).getText();
		Assert.assertEquals(actual, expected);
		System.out.println("its matching");
	}
	
	
	
	public void verifyErrorMsgByText(final By by,String text) throws InterruptedException
	{
		String actual_attribute = WebDriverFactory.getDriver().findElement(by).getText();
		String expected_Text = text;
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(actual_attribute, expected_Text);
		System.out.println(actual_attribute+" Error Massage is displaying hence verified");
	}
	
	public void verifyErrormsgByContains(final By by, String text)
	{
		String actual_text = WebDriverFactory.getDriver().findElement(by).getText();
		SoftAssert softassert=new SoftAssert();
		softassert.assertTrue(actual_text.contains(text));
		System.out.println(actual_text+" Error Massage is displaying hence verified");
		
	}
	
	public void verifyErrorMsgByAttribute(final By by, String text)
	{
		String actual_attribute = WebDriverFactory.getDriver().findElement(by).getAttribute("value");
		SoftAssert softassert=new SoftAssert();
		softassert.assertTrue(actual_attribute.contains(text));
		System.out.println(actual_attribute+" Error Massage is displaying hence verified");
	}
	
	public void selectCity() throws InterruptedException
	{
		String jscode="document.getElementsByClassName('form-control floating-control lp-search')[1].setAttribute('value','Delhi')";
		JavascriptExecutor js=(JavascriptExecutor)WebDriverFactory.getDriver();
		js.executeScript(jscode); 
	}
	
	public void scrolling(String path)
	{
		String jsCode = "arguments[0].scrollIntoView";
		String xpath = path;
		JavascriptExecutor je=(JavascriptExecutor) WebDriverFactory.getDriver();
		je.executeScript(jsCode, WebDriverFactory.getDriver().findElement(By.xpath(xpath)));
		WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String jsCode2 = "arguments[0].click()";
		je.executeScript(jsCode2, WebDriverFactory.getDriver().findElement(By.xpath(xpath)));
    }
    
	public void enterKey(final By locator)
	{
		WebDriverFactory.getDriver().findElement(locator).sendKeys(Keys.ENTER);
	}
	
	public void driverClick(final By locator)
	{
		WebDriverFactory.getDriver().findElement(locator).click();
	}
	
	public void CheckImage(final By by) throws Exception
	{
	WebElement ImageFile = WebDriverFactory.getDriver().findElement(by);
	        
    Boolean ImagePresent = (Boolean) ((JavascriptExecutor)WebDriverFactory.getDriver()).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
	        if (!ImagePresent)
	        {
	             System.out.println("Image not displayed.");
	        }
	        else
	        {
	            System.out.println("Image displayed.");
	        }
		}
	
	
	public void elementToBeClickedThenSendData(final By by, String text)
	{
		 final WebDriver webDriver = WebDriverFactory.getDriver();
	   new WebDriverWait(webDriver, 20).until(ExpectedConditions.elementToBeClickable(findElement(by))).sendKeys(text);
	}
	
	public void moveToElementAndClick(final By by)
	{
		new Actions(WebDriverFactory.getDriver()).moveToElement(findElement(by)).click(findElement(by)).perform();
	}
	
	

}
