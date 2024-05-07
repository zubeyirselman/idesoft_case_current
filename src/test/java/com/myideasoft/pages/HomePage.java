package com.myideasoft.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchBox;

    public void searchingProduct(String product){
        searchBox.sendKeys(product+ Keys.ENTER);
    }
}
