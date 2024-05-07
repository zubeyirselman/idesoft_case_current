package com.myideasoft.pages;

import com.myideasoft.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchResultsPage extends BasePage {
    @FindBy(css = ".lazyload")
    private WebElement productImage;

    @FindBy(xpath = "//a[text()='Ürün']")
    private WebElement searchedProduct;

    @FindBy(xpath = "(//a[text()='Ürün Bilgisi'])[1]")
    private WebElement productInfo;

    @FindBy(id = "qty-input")
    private WebElement quantityOfProduct;

    @FindBy(xpath = "//span[text()='SEPETE EKLE']")
    private WebElement addToCartButton;

    @FindBy(css = ".shopping-information-cart-inside")
    private WebElement successMessage;

    @FindBy(xpath = "//span[text()='Sepet']")
    private WebElement cartButton;

    public void clickToCartButton(){
        ReusableMethods.scrollToElement(cartButton);
        cartButton.click();
    }

    public void validateSuccessMessage(String expectedMessage){
        String actualMessage = successMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    public void selectQuantity(int quantity){
        ReusableMethods.scrollToElement(quantityOfProduct);
        Select select = new Select(quantityOfProduct);
        select.selectByVisibleText(String.valueOf(quantity));
        addToCartButton.click();
    }

    public void productInfoViewed(){
        ReusableMethods.scrollToElement(productInfo);
        Assert.assertTrue(productInfo.isDisplayed());
    }

    public void productViewed(){
        ReusableMethods.scrollToElement(searchedProduct);
        Assert.assertTrue(searchedProduct.isDisplayed());
    }

    public void navigateToProductDeatails() {
        productImage.click();
    }

}
