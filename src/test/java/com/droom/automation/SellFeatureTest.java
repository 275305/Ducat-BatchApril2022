package com.droom.automation;

import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.page.SellPage;

public class SellFeatureTest extends AbstractBaseTest
{
	@Test
	public void sellFeatureValidation()
	{
		SellPage sp=new SellPage();
		sp.createYourListing();
	}

}
