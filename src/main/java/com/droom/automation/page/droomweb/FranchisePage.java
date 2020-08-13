package com.droom.automation.page.droomweb;

import org.openqa.selenium.By;
import com.droom.automation.lib.SeleniumWrapper;
import com.droom.automation.lib.WebDriverFactory;

public class FranchisePage extends SeleniumWrapper
{
	private final static By Enter_Full_Name=By.xpath("//input[@id='name']");
	private final static By Enter_Contact_Number=By.xpath("//input[@id='phone']");
	private final static By Enter_Email_ID=By.xpath("//input[@id='email']");
	private final static By Click_SignUp_Now_Button=By.xpath("//a[@id='signUpFranchise']");
//	  private static final By =By.xpath("");
//    private static final By =By.xpath("");
//    private static final By =By.xpath("");
//    private static final By =By.xpath("");
//    private static final By =By.xpath("");
//    private static final By =By.xpath("");
//    private static final By =By.xpath("");
//    private static final By =By.xpath("");
//    private static final By =By.xpath("");
    
	
	HomePage homepage;
	LoginPage loginpage;
    
    public FranchisePage()
    {
    	homepage=new HomePage();
    	loginpage=new LoginPage();
    }
    
    

    public void registerAsFranchise(String fullName,String contactNumber,String mailId,String franchiseName,String password,String franchiseAddress,String zipCode)
	{
    	homepage.enterDroomFranchise();
		waitForPageLoad();
		enterTextboxDetails(findElement(Enter_Full_Name), fullName);
		verifyByAttribute(Enter_Full_Name, fullName);
		enterTextboxDetails(findElement(Enter_Contact_Number), contactNumber);
		verifyByAttribute(Enter_Contact_Number, contactNumber);
		enterTextboxDetails(findElement(Enter_Email_ID), mailId);
		verifyByAttribute(Enter_Email_ID, mailId);
		verifyByText(Click_SignUp_Now_Button, "Sign Up Now");
		executeClickOnElement(Click_SignUp_Now_Button);
		sleep(5000);
		enterTextboxDetails(findElement(By.xpath("//input[@id='franchiseName']")), franchiseName);
		verifyByAttribute(By.xpath("//input[@id='franchiseName']"),franchiseName );
		enterTextboxDetails(findElement(By.xpath("//input[@id='password']")), password);
		verifyByAttribute(By.xpath("//input[@id='password']"), password);
		enterTextboxDetails(findElement(By.xpath("//input[@id='confirm_password']")), password);
		verifyByAttribute(By.xpath("//input[@id='confirm_password']"), password);
		enterTextboxDetails(findElement(By.xpath("//textarea[@id='franchiseAddress']")),franchiseAddress);
		verifyByAttribute(By.xpath("//textarea[@id='franchiseAddress']"), franchiseAddress);
		enterTextboxDetails(findElement(By.xpath("//input[@id='zip']")), zipCode);
		verifyByAttribute(By.xpath("//input[@id='zip']"),zipCode );
		executeClickOnElement(By.xpath("//input[@id='tnc']"));
		verifyRadioButton(By.xpath("//input[@id='tnc']"));
		verifyByContains(By.xpath("//a[@id='createFranchise']"), "Create a Franchise");
		sleep(4000);
		executeClickOnElement(By.xpath("//a[@id='createFranchise']"));
	}
    
    public void signUp(String year,String empCount,String index)
    {
    	waitForPageLoad();
    	selectOptionByText(By.xpath("//select[@id='business_establish']"), year);
    	sleep(2000);
    	verifyByContains(By.xpath("//select[@id='business_establish']"), year);
    	enterTextboxDetails(findElement(By.xpath("//input[@id='count_emp']")), empCount);
    	sleep(2000);
    	verifyByAttribute(By.xpath("//input[@id='count_emp']"), empCount);
    	executeClickOnElement(By.xpath("//input[@id='itr_yes']"));
    	verifyRadioButton(By.xpath("//input[@id='itr_yes']"));
    	selectOptionByIndex(By.xpath("//select[@id='turnover']"), Integer.parseInt(index));
    	verifyByText(By.xpath("//button[text()='Proceed to Payment']"), "Proceed To Payment");
    	executeClickOnElement(By.xpath("//button[text()='Proceed to Payment']"));
    }
    
    
    
    public void franchiseEvaluation(String businessName,String gstNumber,String businessPan,String businessAddress,String fileUploadPath,String fileName) throws Exception
    {
    	waitForPageLoad();
    	executeClickOnElement(By.xpath("//button[text()='OK']"));
    	enterTextboxDetails(findElement(By.xpath("//input[@id='business_name']")), businessName);
    	sleep(1000);
    	verifyByAttribute(By.xpath("//input[@id='business_name']"), businessName);
    	enterTextboxDetails(findElement(By.xpath("//input[@id='gst_number']")), gstNumber);
    	sleep(1000);
    	verifyByAttribute(By.xpath("//input[@id='gst_number']"), gstNumber);
    	enterTextboxDetails(findElement(By.xpath("//input[@id='business_pan']")), businessPan);
    	sleep(1000);
    	verifyByAttribute(By.xpath("//input[@id='business_pan']"), businessPan);
    	enterTextboxDetails(findElement(By.xpath("//input[@id='address_proof']")), businessAddress);
    	sleep(1000);
    	verifyByAttribute(By.xpath("//input[@id='address_proof']"), businessAddress);
    	moveToElementAndClick(By.xpath("(//button[text()=' Upload'])[1]"));
    	sleep(2000);
    	fileUpload(fileUploadPath);
    	sleep(3000);
    	verifyByContains(By.xpath("//span[@id='gst_number_file_name']"), fileName+".png");
    	moveToElementAndClick(By.xpath("(//button[text()=' Upload'])[2]"));
    	sleep(2000);
    	fileUpload(fileUploadPath);
    	sleep(3000);
    	verifyByContains(By.xpath("//span[@id='gst_number_file_name']"), fileName+".png");
    	moveToElementAndClick(By.xpath("(//button[text()=' Upload'])[3]"));
    	sleep(2000);
    	fileUpload(fileUploadPath);
    	sleep(3000);
  	 	verifyByContains(By.xpath("//span[@id='gst_number_file_name']"), fileName+".png");
  	 	verifyByContains(By.xpath("//button[@id='submit_franchise_kyc_btn']"), "Save And Continue");
    	executeClickOnElement(By.xpath("//button[@id='submit_franchise_kyc_btn']"));
    	sleep(4000);
    	System.out.println("UFID is "+WebDriverFactory.getDriver().findElement(By.xpath("//span[@id='franchise-ufid']")).getText());
    	executeClickOnElement(By.xpath("//button[@id='kyc_success']"));
    }
    
    
    public void kycWithProceedToPay() throws InterruptedException
    {
    	waitForPageLoad();
    	executeClickOnElement(By.xpath("//input[@class='form-control select-city floating-control']"));
		selectCity();
		scrolling("(//li[text()='Delhi'])[3]");
		verifyByContains(By.xpath("//a[text()=' Pay Now']"), "Pay Now");
		executeClickOnElement(By.xpath("//a[text()=' Pay Now']"));
    }
    
    public void kycWithProceedToContinue()
    {
    	waitForPageLoad();
    	verifyByContains(By.xpath("//a[text()=' Continue ']"), "Continue");
    	executeClickOnElement(By.xpath("//a[text()=' Continue ']"));
    }
    
    public void selectAsSiteFranchise()
    {
    	sleep(3000);
    	verifyByContains(By.xpath("//button[contains(text(),' Select Now')]"), "Select Now");
    	executeClickOnElement(By.xpath("//button[contains(text(),' Select Now')]"));
    }
    
    public void selectAsEnterpriseFranchise()
    {
    	sleep(3000);
    	verifyByContains(By.xpath("//button[@id='enterprise-franchise-otp']"), "Select Now");
    	executeClickOnElement(By.xpath("//button[@id='enterprise-franchise-otp']"));
    }
    
    public void selectForOneMonths()
    {
    	sleep(2000);
    	verifyByAttribute(By.xpath("//input[@value='1'and@type='radio']"), "1");
    	executeClickOnElement(By.xpath("//input[@value='1'and@type='radio']"));
    	verifyByContains(By.xpath("//a[@id='next_one']"), "Next");
    	executeClickOnElement(By.xpath("//a[@id='next_one']"));
    	sleep(2000);
    	verifyByContains(By.xpath("//a[@id='next_two']"), "Next");
    	executeClickOnElement(By.xpath("//a[@id='next_two']"));
    }
    
    public void selectForThreeMonths()
    {
    	sleep(2000);
    	verifyByAttribute(By.xpath("//input[@value='3'and@type='radio']"), "3");
    	executeClickOnElement(By.xpath("//input[@value='3'and@type='radio']"));
    	verifyByContains(By.xpath("//a[@id='next_one']"), "Next");
    	executeClickOnElement(By.xpath("//a[@id='next_one']"));
    	sleep(2000);
    	verifyByContains(By.xpath("//a[@id='next_two']"), "Next");
    	executeClickOnElement(By.xpath("//a[@id='next_two']"));
    	sleep(2000);
    }
    
    public void selectForSixMonth()
    {
    	sleep(2000);
    	verifyByAttribute(By.xpath("//input[@value='6'and@type='radio']"), "6");
    	executeClickOnElement(By.xpath("//input[@value='6'and@type='radio']"));
    	verifyByContains(By.xpath("//a[@id='next_one']"), "Next");
    	executeClickOnElement(By.xpath("//a[@id='next_one']"));
    	sleep(2000);
    	verifyByContains(By.xpath("//a[@id='next_two']"), "Next");
    	executeClickOnElement(By.xpath("//a[@id='next_two']"));
    	sleep(2000);
    }
    
    
    public void selectForUpfrontPayment()
    {
    	sleep(2000);
    	verifyByContains(By.xpath("//span[text()='Upfront Payment']"), "Upfront Payment");
    	executeClickOnElement(By.xpath("//input[@checked='checked'and@name='cost_type']"));
    	verifyByContains(By.xpath("//a[@id='next_three']"), "Next");
    	executeClickOnElement(By.xpath("//a[@id='next_three']"));
    }
    
    public void selectForEMIPayment()
    {
    	sleep(2000);
    	verifyByContains(By.xpath("//span[text()='EMIs']"), "EMIs");
    	executeClickOnElement(By.xpath("//input[@value='emi'and@name='cost_type']"));
    	verifyRadioButton(By.xpath("//input[@value='emi'and@name='cost_type']"));
    	verifyByContains(By.xpath("//a[@id='next_three']"), "Next");
    	executeClickOnElement(By.xpath("//a[@id='next_three']"));
    }
    
    
    public void proceedWithUpfrontPaymentAfterProvidingDeatils()
    {
    	sleep(2000);
    	verifyByContains(By.xpath("//a[@id='continue']"), "Continue");
    	executeClickOnElement(By.xpath("//a[@id='continue']"));
    	sleep(3000);
    	verifyByContains(By.xpath("(//button[contains(text(),'Proceed with Upfront Payment')])[3]"), "Proceed with Upfront Payment");
    	executeClickOnElement(By.xpath("(//button[contains(text(),'Proceed with Upfront Payment')])[3]"));
    }
   
    public void proceedWithRentalPlanAfterProvidingDeatils()
    {
    	sleep(2000);
    	verifyByContains(By.xpath("//a[@id='continue']"), "Continue");
    	executeClickOnElement(By.xpath("//a[@id='continue']"));
    	sleep(3000);
    	String ab = WebDriverFactory.getDriver().findElement(By.xpath("(//button[contains(text(),'Proceed with Rental Plan')])[3]")).getText();
    	System.out.println(ab);
    	verifyByContains(By.xpath("(//button[contains(text(),'Proceed with Rental Plan')])[3]"), "");
    	executeClickOnElement(By.xpath("(//button[contains(text(),'Proceed with Rental Plan')])[3]"));
    }
    
    public void enterNumberOfSitesPopup(String enterNumberOfSites)
    {
    	sleep(3000);
    	WebDriverFactory.getDriver().findElement(By.xpath("//input[@id='ep_sites']")).clear();
    	WebDriverFactory.getDriver().findElement(By.xpath("//input[@id='ep_sites']")).sendKeys(enterNumberOfSites);
    	verifyByContains(By.xpath("//a[@id='next_sites']"), "Next");
    	executeClickOnElement(By.xpath("//a[@id='next_sites']"));
    }
    
    public void enterNumberOfSitesUsingPlusIconPopup(int numberOfClick)
    {
    	sleep(3000);
    	for (int i = 0; i <=numberOfClick; i++)
    	{
			executeClickOnElement(By.xpath("//i[@id='ep_sites_plus']"));
		}
    	verifyByContains(By.xpath("//a[@id='next_sites']"), "Next");
    	executeClickOnElement(By.xpath("//a[@id='next_sites']"));
    }
    
    public void enterNumberOfSitesUsingMinusIconPopup(int numberOfClick)
    {
    	sleep(3000);
    	for (int i = 0; i <=numberOfClick; i++)
    	{
			executeClickOnElement(By.xpath("//i[@id='ep_sites_minus']"));
		}
    	verifyByContains(By.xpath("//a[@id='next_sites']"), "Next");
    	executeClickOnElement(By.xpath("//a[@id='next_sites']"));
    }
    
     // LOGIN SCRIPT
    
    public void franchiseDashboard(String username, String password)
    {
    	loginpage.franchiseLoginValidation(username, password);
    	verifyByContains(By.xpath("//label[text()='Orders']"), "ORDERS");
    	System.out.println("MY TOTAL ORDERS ARE "+WebDriverFactory.getDriver().findElement(By.xpath("//label[text()='Orders']/parent::div//strong")).getText());
    	verifyByContains(By.xpath("//label[text()='Order Value']"), "ORDER VALUE");
    	System.out.println("MY TOTAL ORDERS ARE "+WebDriverFactory.getDriver().findElement(By.xpath("//label[text()='Order Value']/parent::div//strong")).getText());
    }
    
    public void franchiseMyOrders(String username, String password)
    {
    	loginpage.franchiseLoginValidation(username, password);
    	verifyByContains(By.xpath("//a[text()='  My Orders']"), "My Orders");
    	executeClickOnElement(By.xpath("//a[text()='  My Orders']"));
    	verifyByContains(By.xpath("//div[@id='orders']//div[@class='row']//div[@class='row actions']//button[@id='singlePlaceOrder']"), "Place An Order");
    	executeClickOnElement(By.xpath("//div[@id='orders']//div[@class='row']//div[@class='row actions']//button[@id='singlePlaceOrder']"));
    	enterTextboxDetails(findElement(By.xpath("//input[@id='mobile_no']")), "9599946816");
    	verifyByContains(By.xpath("//button[@id='search_users']"), "Search");
    	executeClickOnElement(By.xpath("//button[@id='search_users']"));
    	sleep(2000);
    	verifyByContains(By.xpath("//div[@id='buyer-found']"), "Buyer details found successfully");
    	System.out.println("The Buyer Name: "+WebDriverFactory.getDriver().findElement(By.xpath("//label[text()='Buyer Name:']/parent::div//span")).getText());
    	System.out.println("The Buyer Phone: "+WebDriverFactory.getDriver().findElement(By.xpath("//label[text()='Buyer Phone:']/parent::div//span")).getText());
    	System.out.println("The Buyer Email: "+WebDriverFactory.getDriver().findElement(By.xpath("//label[text()='Buyer Email:']/parent::div//span")).getText());
    	verifyByContains(By.xpath("//button[@id='movetostep2']"), "Next");
    	executeClickOnElement(By.xpath("//button[@id='movetostep2']"));
    	enterTextboxDetails(findElement(By.xpath("//input[@id='automobile-pincode']")), "110001");
    	verifyByAttribute(By.xpath("//input[@id='automobile-pincode']"), "110001");
    	verifyByContains(By.xpath("//button[@id='auto-gs-submit']"), "Buy Now");
    	executeClickOnElement(By.xpath("//button[@id='auto-gs-submit']"));
    	sleep(2000);
        verifyByContains(By.xpath("//div[@id='cart_details']//button[@id='movetostep3']"), "Next");
        executeClickOnElement(By.xpath("//div[@id='cart_details']//button[@id='movetostep3']"));
        sleep(5000);
        verifyByContains(By.xpath("//button[@id='place_order']"), "Submit");
        executeClickOnElement(By.xpath("//button[@id='place_order']"));
    	
    }
}
