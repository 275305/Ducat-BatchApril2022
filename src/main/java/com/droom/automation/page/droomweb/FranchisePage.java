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
	private static final By Click_My_Order=By.xpath("//a[text()='  My Orders']");
    private static final By Click_Buy_Now=By.xpath("//button[@id='facilities-gs-book']");
    private static final By Click_On_Next_After_Cart=By.xpath("(//button[@id='movetostep3'])[1]");
    private static final By Click_Submit_After_Selecting_Mode=By.xpath("//button[@id='place_order']");
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
                          
                           //Script for dashborad and placing orders with already registered number
    
    public void enterPlaceAnOrder(String username, String password)
    {
    	loginpage.franchiseLoginValidation(username, password);
    	verifyByContains(Click_My_Order, "My Orders");
    	executeClickOnElement(Click_My_Order);
    	verifyByContains(By.xpath("//div[@id='orders']//div[@class='row']//div[@class='row actions']//button[@id='singlePlaceOrder']"), "Place An Order");
    	executeClickOnElement(By.xpath("//div[@id='orders']//div[@class='row']//div[@class='row actions']//button[@id='singlePlaceOrder']"));
    }
    public void selectYourProductViaRegisteredNumber()
    {
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
    }
    
    public void franchiseMyOrdersAsAutomobileGermShield()
    {
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
    
    public void franchiseMyOrdersAsFacilityGermShield(String enterCatogory,String enterArea,String enterAddress,String enterPincode)
    {
    	sleep(2000);
    	verifyByContains(By.xpath("//label[text()='Facility']"), "Facility");
    	executeClickOnElement(By.xpath("//label[text()='Facility']"));
    	sleep(2000);
    	selectOptionByText(By.xpath("//select[@id='facilities-category']"), enterCatogory);
    	verifyByContains(By.xpath("//select[@id='facilities-category']"), enterCatogory);
    	enterTextboxDetails(findElement(By.xpath("//input[@id='facilities-builtup']")), enterArea);
    	verifyByAttribute(By.xpath("//input[@id='facilities-builtup']"), enterArea);
    	verifyByContains(By.xpath("//span[text()='(₹"+calculatedAmountAsPerArea(enterArea)+" Incl. GST)']"), "(₹"+calculatedAmountAsPerArea(enterArea)+" Incl. GST)");
    	enterTextboxDetails(findElement(By.xpath("//input[@id='facilities-address']")), enterAddress);
    	verifyByAttribute(By.xpath("//input[@id='facilities-address']"), enterAddress);
    	enterTextboxDetails(findElement(By.xpath("//input[@id='facilities-pincode']")), enterPincode);
    	verifyByAttribute(By.xpath("//input[@id='facilities-pincode']"), enterPincode);
    	executeClickOnElement(By.xpath("//input[@id='facilities-date']"));
    	verifyByContains(By.xpath("//button[@id='facilities-gs-submit']"), "Buy Now");
    	executeClickOnElement(By.xpath("//button[@id='facilities-gs-submit']"));
    	verifyByContains(Click_Buy_Now, "Buy Now");
    	executeClickOnElement(Click_Buy_Now);
    	sleep(2000);
    	verifyByContains(By.xpath("(//td[text()='"+addingCommaToInt(calculatedAmountAsPerArea(enterArea))+"'and@class='strong'])[1]"), addingCommaToInt(calculatedAmountAsPerArea(enterArea)));
    	verifyByContains(Click_On_Next_After_Cart, "Next");
    	executeClickOnElement(Click_On_Next_After_Cart);
    	waitForPageLoad();
    	verifyByContains(Click_Submit_After_Selecting_Mode, "Submit");
    	executeClickOnElement(Click_Submit_After_Selecting_Mode);
    }
    
    public void franchiseMyOrdersAsElevatorGermShield(String enterCatogory,String packageType,String enterAddress,String enterPincode)
    {
    	sleep(2000);
    	verifyByContains(By.xpath("//label[text()='Elevator']"), "Elevator");
    	executeClickOnElement(By.xpath("//label[text()='Elevator']"));
    	selectOptionByText(By.xpath("//select[@id='elevator-category']"), enterCatogory);
    	verifyByContains(By.xpath("//select[@id='elevator-category']"), enterCatogory);
    	selectOptionByText(By.xpath("//select[@id='elevator-package-type']"), packageType);
    	verifyByContains(By.xpath("//select[@id='elevator-package-type']"), packageType);
    	enterTextboxDetails(findElement(By.xpath("//input[@id='elevator-address']")), enterAddress);
    	verifyByAttribute(By.xpath("//input[@id='elevator-address']"), enterAddress);
    	enterTextboxDetails(findElement(By.xpath("//input[@id='elevator-pincode']")), enterPincode);
    	verifyByAttribute(By.xpath("//input[@id='elevator-pincode']"), enterPincode);
    	executeClickOnElement(By.xpath("//input[@id='elevator-date']"));
    	verifyByContains(By.xpath("//button[@id='elevator-gs-submit']"), "Buy Now");
    	executeClickOnElement(By.xpath("//button[@id='elevator-gs-submit']"));
    	sleep(2000);
    	verifyByContains(Click_On_Next_After_Cart, "Next");
    	executeClickOnElement(Click_On_Next_After_Cart);
    	waitForPageLoad();
    	verifyByContains(Click_Submit_After_Selecting_Mode, "Submit");
    	executeClickOnElement(Click_Submit_After_Selecting_Mode);
    }
    
    public void franchiseMyOrdersAsJumpstartService(String enterCatogory,String enterAddress,String enterPincode)
    {
    	sleep(2000);
    	verifyByContains(By.xpath("//label[text()='Jumpstart']"), "Jumpstart");
    	executeClickOnElement(By.xpath("//label[text()='Jumpstart']"));
    	selectOptionByText(By.xpath("//select[@id='jumpstart-category']"), enterCatogory);
    	verifyByContains(By.xpath("//select[@id='jumpstart-category']"), enterCatogory);
    	enterTextboxDetails(findElement(By.xpath("//input[@id='jumpstart-address']")), enterAddress);
    	verifyByAttribute(By.xpath("//input[@id='jumpstart-address']"), enterAddress);
    	enterTextboxDetails(findElement(By.xpath("//input[@id='jumpstart-pincode']")), enterPincode);
    	verifyByAttribute(By.xpath("//input[@id='jumpstart-pincode']"), enterPincode);
    	executeClickOnElement(By.xpath("//input[@id='jumpstart-date']"));
    	verifyByContains(By.xpath("//button[@id='jumpstart_book_now']"), "Buy Now");
    	executeClickOnElement(By.xpath("//button[@id='jumpstart_book_now']"));
    	sleep(2000);
    	verifyByContains(Click_On_Next_After_Cart, "Next");
    	executeClickOnElement(Click_On_Next_After_Cart);
    	waitForPageLoad();
    	verifyByContains(Click_Submit_After_Selecting_Mode, "Submit");
    	executeClickOnElement(Click_Submit_After_Selecting_Mode);
    }
    
    public void franchiseMyOrdersAsBigTransport(String enterCatogory,String enterArea,String enterAddress,String enterPincode)
    {
    	sleep(2000);
    	verifyByContains(By.xpath("//label[text()='Big Transport']"), "Big Transport");
    	executeClickOnElement(By.xpath("//label[text()='Big Transport']"));
    	sleep(2000);
//    	selectOptionByText(By.xpath("//select[@id='big-transport-category']"), enterCatogory);
//    	verifyByContains(By.xpath("//select[@id='big-transport-category']"), enterCatogory);
    	enterTextboxDetails(findElement(By.xpath("//input[@id='big-transport-builtup']")), enterArea);
    	verifyByAttribute(By.xpath("//input[@id='big-transport-builtup']"), enterArea);
    	verifyByContains(By.xpath("//span[text()='(₹"+calculatedAmountAsPerArea(enterArea)+" Incl. GST)']"), "(₹"+calculatedAmountAsPerArea(enterArea)+" Incl. GST)");
    	enterTextboxDetails(findElement(By.xpath("//input[@id='big-transport-address']")), enterAddress);
    	verifyByAttribute(By.xpath("//input[@id='big-transport-address']"), enterAddress);
    	enterTextboxDetails(findElement(By.xpath("//input[@id='big-transport-pincode']")), enterPincode);
    	verifyByAttribute(By.xpath("//input[@id='big-transport-pincode']"), enterPincode);
    	executeClickOnElement(By.xpath("//input[@id='big-transport-date']"));
    	verifyByContains(By.xpath("//button[@id='big-transport-gs-submit']"), "Buy Now");
    	executeClickOnElement(By.xpath("//button[@id='big-transport-gs-submit']"));
    	sleep(2000);
    	verifyByContains(By.xpath("(//td[text()='"+addingCommaToInt(calculatedAmountAsPerArea(enterArea))+"'and@class='strong'])[1]"), addingCommaToInt(calculatedAmountAsPerArea(enterArea)));
    	verifyByContains(Click_On_Next_After_Cart, "Next");
    	executeClickOnElement(Click_On_Next_After_Cart);
    	waitForPageLoad();
    	verifyByContains(Click_Submit_After_Selecting_Mode, "Submit");
    	executeClickOnElement(Click_Submit_After_Selecting_Mode);
    }
    
    public void selectYourProductWithRegisteringNewNumber(String firstName, String lastName,String mailID, String GSTIN,String enterCity,String buyersNumber)
    {
    	enterTextboxDetails(findElement(By.xpath("//input[@id='mobile_no']")), buyersNumber);
    	verifyByContains(By.xpath("//button[@id='search_users']"), "Search");
    	executeClickOnElement(By.xpath("//button[@id='search_users']"));
    	sleep(2000);
    	verifyByContains(By.xpath("//div[@id='buyer-missing']"), "Buyer information is not available with us. Please provide additional information");
    	enterTextboxDetails(findElement(By.xpath("//input[@id='user_first_name']")),firstName );
    	verifyByAttribute(By.xpath("//input[@id='user_first_name']"),firstName );
    	enterTextboxDetails(findElement(By.xpath("//input[@id='user_last_name']")), lastName);
    	verifyByAttribute(By.xpath("//input[@id='user_last_name']"), lastName);
    	enterTextboxDetails(findElement(By.xpath("//input[@id='user_email']")), mailID);
    	verifyByAttribute(By.xpath("//input[@id='user_email']"), mailID);
    	selectOptionByText(By.xpath("//select[@id='city']"), enterCity);
    	verifyByContains(By.xpath("//select[@id='city']"), enterCity);
    	enterTextboxDetails(findElement(By.xpath("//input[@id='user_gstin']")), GSTIN);
    	verifyByAttribute(By.xpath("//input[@id='user_gstin']"), GSTIN);
    	verifyByContains(By.xpath("//button[@id='registerUser']"), "Register");
    	executeClickOnElement(By.xpath("//button[@id='registerUser']"));
    	sleep(2000);
    	verifyByContains(By.xpath("//button[@id='movetostep2']"), "Next");
    	executeClickOnElement(By.xpath("//button[@id='movetostep2']"));
    }
}
