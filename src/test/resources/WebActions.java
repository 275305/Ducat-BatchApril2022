package com.droom.automation.page.credit;

import com.droom.automation.lib.SeleniumWrapper;
import org.openqa.selenium.By;

public class WebActions extends SeleniumWrapper {

    public void enterSearch(String text) {
        enterTextboxDetails(findElement(SEARCH), text);
        sleep(2000);
    }
}
