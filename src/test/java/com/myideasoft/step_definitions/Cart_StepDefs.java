package com.myideasoft.step_definitions;

import com.myideasoft.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cart_StepDefs {
    CartPage cartPage = new CartPage();

    @Then("The user validates that the cart page is displayed")
    public void the_user_validates_that_the_cart_page_is_displayed() {
        cartPage.setCartDeatilsViewed();
    }

    @Then("The user validates that the cart contains {int} products")
    public void the_user_validates_that_the_cart_contains_products(Integer expectedQuantity) {
        cartPage.validateQuantityOfCart(expectedQuantity);
    }
}
