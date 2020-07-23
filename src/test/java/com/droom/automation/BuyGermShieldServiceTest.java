package com.droom.automation;

import org.testng.annotations.Test;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.page.GermShieldAntimicrobialCoatingPage;

public class BuyGermShieldServiceTest extends AbstractBaseTest
{
	@Test
	public void buyGermShieldServiceViaHomePageAsLoggedInUser()
	{
		GermShieldAntimicrobialCoatingPage germshield=new GermShieldAntimicrobialCoatingPage();
		germshield.germShieldAntimicrobialCoatingValidation();
	}

}
