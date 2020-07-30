package com.droom.automation.lib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Random;

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
	
	public String generateRandomNumber()
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
	

	public void splitOtp1(int opt)
	
	{
	     
		
		String r1,r2,r3,r4;
	
		//r1=opt%10;opt=opt/10;
		r1=Integer.toString(opt%10);opt=opt/10;
		r2=Integer.toString(opt%10);opt=opt/10;
		r3=Integer.toString(opt%10);opt=opt/10;
		r4=Integer.toString(opt%10);opt=opt/10;
		
		String[] otpvalue= {r1,r2,r3,r4};
		
	}
}
