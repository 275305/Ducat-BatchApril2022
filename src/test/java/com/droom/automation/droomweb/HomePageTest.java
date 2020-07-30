package com.droom.automation;

import com.droom.automation.lib.AbstractBaseTest;
import com.droom.automation.page.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends AbstractBaseTest {

    @Test
    public void testHomePage() {

        new HomePage().enterSearch("test");

    }

    @Test
    public void testHomePage1() {

        new HomePage().enterSearch("test1");

    }
}
