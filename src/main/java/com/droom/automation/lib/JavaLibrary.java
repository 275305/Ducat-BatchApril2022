package com.droom.automation.lib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Random;

import org.testng.annotations.Test;

public class JavaLibrary 
{
	public int selectIndexForMake()
	{
	Random random=new Random();
	int make = random.nextInt(32);
	return make;
	
	}
	
	public int selectIndexForModel()
	{
	Random random=new Random();
	int model = random.nextInt(3);
	return model;
	}
	
	public int selectIndexForTrim()
	{
	Random random=new Random();
	int trim = random.nextInt(2);
	return trim;
	}
	
	public String vehiclesRegistartionRandomNumber()
    {
    	Random random=new Random();
    	int randomNumber = random.nextInt(999);
    	String input="AD31CG4{0}";
    	Object[] obj= {randomNumber};
    	String registrationNumber = MessageFormat.format(input, obj);
		return registrationNumber;
    	
    }
	
	public void fileUpload(String file) throws AWTException
	{
		Robot rb=new Robot();
		StringSelection str=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
    }
	
	public String calculatedAmountAsPerArea(String totalarea)
	{
		int sqrArea = Integer.parseInt(totalarea);
		int totalAmount = sqrArea*15;
		String amtValue = Integer.toString(totalAmount);
		return amtValue;
	}
	
	public String addingCommaToInt(String amount)
	{
		int amtAsInt = Integer.parseInt(amount);
		DecimalFormat IndianCurrencyFormat = new DecimalFormat("##,##,###");
		String formattedAmount = IndianCurrencyFormat.format(amtAsInt);
		return formattedAmount;
	}
	public static String dynamicUsername()
	{
		Random random=new Random();
		int number1 = random.nextInt(999);
		int number2 = random.nextInt(999);
		String dynamicUsername = "honey{0}.maurya{1}@gmail.com";
		Object[] obj= {number1,number2};
		String MyUsername = MessageFormat.format(dynamicUsername, obj);
		return MyUsername;
	}
	
	public static String dynamicPhoneNumber()
	{
		Random random=new Random();
		String firstNumber="9{0}";
		Object[] obj= {Integer.toString(random.nextInt(999999999)).replaceAll(",", "")};
		String phoneNumber = MessageFormat.format(firstNumber, obj);
		return phoneNumber;
	}
	
	public String FirstLetterUpperCase(String value)
	{
		String st=value;
		String output = st.substring(0, 1).toUpperCase() + st.substring(1);
		return output;
	}
	
	
}
