package com.droom.automation.lib;

import com.droom.automation.constants.UIConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.droom.automation.constants.UIConstants.BROWSERS;

public final class WebDriverFactory {

    private static final ThreadLocal<WebDriver> DRIVER_THREAD_POOL = new ThreadLocal<>();
    private static final ThreadLocal<DriverConfig> DRIVER_CONFIG_POOL = new ThreadLocal<>();
    private static final Logger LOG = LoggerFactory.getLogger(WebDriverFactory.class);

    public WebDriverFactory(){}

    public static WebDriver getDriver() {
        return DRIVER_THREAD_POOL.get();
    }

    public static void initDriverConfig(final String baseUrl, final String browser, final String remoteMachineUrl) {

        if (null == DRIVER_CONFIG_POOL.get()) {
            DRIVER_CONFIG_POOL.set(new DriverConfig(baseUrl, browser, remoteMachineUrl));
        }
        else if (!DRIVER_CONFIG_POOL.get().getBrowser().equals(browser)) {
            DRIVER_CONFIG_POOL.set(new DriverConfig(baseUrl, browser, remoteMachineUrl));
        }
        else {
            LOG.debug("Driver config already initialized ...");
        }
    }

    public static void startDriver() {

        WebDriver driver;

        if(null != DRIVER_CONFIG_POOL.get()) {
            if(null == getDriver()) {
                driver = getWebDriverInstance(DRIVER_CONFIG_POOL.get().getBrowser(), DRIVER_CONFIG_POOL.get().getRemoteUrl());
                DRIVER_THREAD_POOL.set(driver);
            }
            LOG.info("Info : ...... Start opening application in browser .....");
            driver = getDriver();
            driver.navigate().to(DRIVER_CONFIG_POOL.get().getBaseUrl());
            new SeleniumWrapper().waitForPageLoad(driver);
        }
        else{
            LOG.error("ERROR : Driver config is not initialized properly ..");
        }
    }

    private static RemoteWebDriver getWebDriverInstance(String browserName, String remoteServerUrl) {

        RemoteWebDriver driver = null;
        DesiredCapabilities capability;
        String osType, baseDriverPath;
        BROWSERS browser;

        osType = System.getProperty("os.name").toLowerCase();
        baseDriverPath = UIConstants.BASE_FILE_PATH.concat(UIConstants.BASE_DRIVER_PATH);

        try {
            browser = Enum.valueOf(BROWSERS.class, browserName);

            switch (browser)
            {
                case FIREFOX:
                    driver = getFirefoxDriver(osType, baseDriverPath, remoteServerUrl);
                    break;

                case CHROME:
                    driver = getChromeDriver(osType, baseDriverPath, remoteServerUrl);
                    break;
            }

            // configure remote driver with machine ip-address
            LOG.info("configure remote driver with machine ip-address");
            
            if (0 != "localMachine".compareTo(remoteServerUrl))
            {
                capability = DesiredCapabilities.firefox();
                final URL clientURL = new URL(remoteServerUrl);
                LOG.info("Instantiating a RemoteWebDriver to Firefox ===????");
                driver = new RemoteWebDriver(clientURL, capability);
            }

            // set few more property on driver instance
            if (null != driver) {
                driver.manage().timeouts().implicitlyWait(UIConstants.DEFAULT_WAIT_TIME_IN_SECONDS, TimeUnit.SECONDS);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            LOG.error(ex.toString());
        }
        return driver;
    }

    private static RemoteWebDriver getFirefoxDriver(String osType, String baseDriverPath, String remoteServerUrl) throws Exception {

        RemoteWebDriver driver = null;
        String gecko_driver_path;

        LOG.info("BROWSER Chosen in Firefox");

        if(osType.indexOf("win") >= 0){
            gecko_driver_path = baseDriverPath + File.separator + "windows" + File.separator + "geckodriver.exe";
        }
        else if(osType.indexOf("mac") >= 0) {
            gecko_driver_path = baseDriverPath + File.separator + "mac" + File.separator + "geckodriver";
        }
        else if(osType.indexOf("nix") >= 0 || osType.indexOf("nux") >= 0 || osType.indexOf("aix") > 0){
            gecko_driver_path = baseDriverPath + File.separator + "linux" + File.separator + "geckodriver";
        }
        else{
            throw new Exception("OS is not supported: " + osType);
        }
        System.setProperty("webdriver.gecko.driver", gecko_driver_path);
        System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");

        if (0 == "localMachine".compareTo(remoteServerUrl)) {

            FirefoxOptions options = new FirefoxOptions();
            final FirefoxProfile firefoxProfile = new FirefoxProfile();
            firefoxProfile.setPreference("intl.accept_languages", UIConstants.SUPPORTED_LANGUAGE);
            firefoxProfile.setAcceptUntrustedCertificates(true);
            firefoxProfile.setPreference("browser.download.folderList", UIConstants.NumericValues.TWO);
            firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk",
                    "application/msword, application/csv, "
                            + "application/ris, text/csv, data:image/png, image/png, application/pdf, text/html, text/plain, application/zip, "
                            + "application/x-zip, application/x-zip-compressed, application/download, application/octet-stream");
            firefoxProfile.setPreference("browser.download.manager.showWhenStarting", false);
            firefoxProfile.setPreference("browser.download.manager.focusWhenStarting", false);
            firefoxProfile.setPreference("browser.download.dir", UIConstants.DOWNLOAD_PATH);
            firefoxProfile.setPreference("browser.helperApps.alwaysAsk.force", false);
            firefoxProfile.setPreference("browser.download.manager.alertOnEXEOpen", false);
            firefoxProfile.setPreference("browser.download.manager.closeWhenDone", true);
            firefoxProfile.setPreference("browser.download.manager.showAlertOnComplete", false);
            firefoxProfile.setPreference("browser.download.manager.useWindow", false);
            firefoxProfile.setPreference("browser.download.panel.shown", false);
            options.setProfile(firefoxProfile);

            LOG.info("Instantiating a Driver to Firefox");
            Runtime.getRuntime().exec("kill $(pidof firefox)");
            driver = new FirefoxDriver(options);
        }
        return driver;
    }

    private static RemoteWebDriver getChromeDriver(String osType, String baseDriverPath, String remoteServerUrl) throws Exception {

        RemoteWebDriver driver = null;
        String chrome_driver_path;

        WebDriverManager.chromedriver().setup();
        if(osType.indexOf("win") >= 0){
            chrome_driver_path = baseDriverPath + File.separator + "windows" + File.separator + "chromedriver.exe";
        }
        else if(osType.indexOf("mac") >= 0) {
            chrome_driver_path = baseDriverPath + File.separator + "mac" + File.separator + "chromedriver";
        }
        else if(osType.indexOf("nix") >= 0 || osType.indexOf("nux") >= 0 || osType.indexOf("aix") > 0){
            chrome_driver_path = baseDriverPath + File.separator + "linux" + File.separator + "chromedriver";
        }
        else{
            throw new Exception("OS is not supported: " + osType);
        }
        System.setProperty("webdriver.chrome.driver", chrome_driver_path);
        LOG.info("SET THE DOWNLOAD DIRECTORY");
        final Map<String, Object> preferences = new HashMap<>();
        preferences.put("download.default_directory", UIConstants.DOWNLOAD_PATH);
        preferences.put("profile.default_content_settings.popups", 0);

        LOG.info("SET THE BROWSER CAPABILITIES");
        final ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        options.addArguments("--start-maximized");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.setExperimentalOption("prefs", preferences);
        options.setCapability("minidumpPath","/tmp/");

        LOG.info("Instantiating a Driver to Chrome");
        //git Runtime.getRuntime().exec("pkill chrome");

        if (0 == "localMachine".compareTo(remoteServerUrl)) {
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver(String browser) {
        try {
            LOG.info("Closing browser and application ...");
      //      WebDriverFactory.DRIVER_THREAD_POOL.get().quit();

        } catch (final Exception ex) {
            LOG.warn("WARNING : Failed to close the browser ... \nException : " + ex.getMessage());

        } finally {
            WebDriverFactory.DRIVER_THREAD_POOL.set(null);
            LOG.info("WEBDRIVER SET TO NULL");
        }
    }

    /*private static BROWSERS getBrowser(String browserName) {

        BROWSERS browsers ;

        browsers = Enum.valueOf(BROWSERS.class, browserName);

        if(0 == browserName.compareToIgnoreCase("firefox")){
            browsers = BROWSERS.FIREFOX;
        }
    }*/

    private static class DriverConfig {
        private String baseUrl;
        private String browser;
        private String remoteServerUrl;

        public DriverConfig(final String url, final String browser, final String remoteUrl) {
            this.baseUrl = url;
            this.browser = browser;
            this.remoteServerUrl = remoteUrl;
        }

        public String getBaseUrl() {
            return this.baseUrl;
        }

        public String getBrowser() {
            return this.browser;
        }

        public String getRemoteUrl() {
            return this.remoteServerUrl;
        }
    }
}
