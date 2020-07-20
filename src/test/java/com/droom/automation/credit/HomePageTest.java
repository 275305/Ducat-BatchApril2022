package com.droom.automation.credit;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.page.credit.HomePage;

import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;


public class HomePageTest extends AbstractBaseTest {

    @Test
    public void sighUpAsBorrower(){

        new HomePage().clickSignUp();
        
        new HomePage().clickSignUpAsBorrower();
     }


}
