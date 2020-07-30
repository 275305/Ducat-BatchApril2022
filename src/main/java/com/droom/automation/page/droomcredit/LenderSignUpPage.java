package com.droom.automation.page.droomcredit;
import com.droom.automation.lib.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LenderSignUpPage extends SeleniumWrapper {

	private static final By EMAIL_ID = By.id("email");
	private static final By PASSWORD = By.id("password");
	private static final By CONFIRM_PASSWORD = By.id("confirm_password");
	private static final By SUBMIT_BUTTON = By.xpath("//button[@type='submit']");
	
	public final By EMAIL_ID_ERROR = By.cssSelector("strong:nth-child(2)");
	public final By INCORRECT_EMAIL_ID_ERROR = By.cssSelector("strong:nth-child(2)");
	
	public void inputEmail(String text) {
		enterTextboxDetails(findElement(EMAIL_ID), text);
		
		}
	
	public void inputPassword(String text) {
		enterTextboxDetails(findElement(PASSWORD), text);
		
		}
	
	
	public void inputConfirmPassword(String text) {
		enterTextboxDetails(findElement(CONFIRM_PASSWORD), text);
		
		}
	
	public void clickSubmitButton() {
		executeClickOnElement(SUBMIT_BUTTON);
		
		}
	
	public String getElement1Text() {
		return findElement(EMAIL_ID_ERROR).getText();
		
	}
	
	
}


/*
try{
  	 Class.forName("com.mysql.jdbc.Driver");
  	 Connection con=DriverManager.getConnection("jdbc:mysql://qa1.droom.in:3306/cscart_new","root","$6bK6R=a");
  	//System.out.println("cxn created");
  	 Statement stmt=con.createStatement();
  	//System.out.println("stmt created");
  	 ResultSet rs=stmt.executeQuery("SELECT otp FROM obv.otp_verification_lead where mobile_number=8756774536 order by created_at desc limit 1");
  	//System.out.println("stmt executed");
  	while(rs.next())
  	{
  	System.out.println(rs.getInt(1));
 	 }}
catch(Exception e)
{ System.out.println(e);}*/
