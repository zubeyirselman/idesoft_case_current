package com.myideasoft.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(xpath = "//h4[text()='SEPET DETAYI']")
    private WebElement cartDeatilsText;

    @FindBy(css = ".product-quantity input")
    private WebElement quantityOfAddedProduct;

    public void validateQuantityOfCart(int expectedQuantity){
        int actualQuantity = Integer.parseInt(quantityOfAddedProduct.getAttribute("value"));
        Assert.assertEquals(expectedQuantity,actualQuantity);
    }

    public void setCartDeatilsViewed(){
        Assert.assertTrue(cartDeatilsText.isDisplayed());
    }
}
