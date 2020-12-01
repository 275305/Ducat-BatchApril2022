package com.droom.automation.lib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class AbstractBaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(AbstractBaseTest.class);
    private static String browser;
    private static String baseUrl;

    @Parameters({ "browser" })
    @BeforeSuite
    public void beforeSuite(@Optional("chrome") String browserType) {
        LOG.info("IN BEFORE SUITE ======>");
        browser = browserType.toUpperCase();

    }

    @BeforeTest(alwaysRun = true)
    public final void beforeTest() throws Exception{
        LOG.info("IN BEFORE TEST ======>");
        baseUrl = "https://www.droom.in/";
        LOG.info("-------------- Before Test -----------------");
        WebDriverFactory.initDriverConfig(baseUrl, browser, "localMachine");
        PageModelFactory.initPageConfig();
    }

    @BeforeMethod(alwaysRun = true)
    public void init() {

        LOG.info("IN BEFORE METHOD ======>");
        WebDriverFactory.startDriver();
        if (!browser.matches("chrome")) {
            WebDriverFactory.getDriver().manage().window().maximize();
        }
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(final ITestResult result) {
        LOG.info("IN AFTER METHOD ======>");
        try {
            LOG.info("QUIT DRIVER");
            WebDriverFactory.closeDriver(browser);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
