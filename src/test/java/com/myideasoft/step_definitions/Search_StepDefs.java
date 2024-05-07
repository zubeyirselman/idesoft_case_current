package com.myideasoft.step_definitions;

import com.myideasoft.pages.SearchResultsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_StepDefs {
    SearchResultsPage searchResultsPage = new SearchResultsPage();

    @Then("The user validates that searching results are displayed")
    public void the_user_validates_that_searching_results_are_displayed() {
        searchResultsPage.productViewed();
    }
    @When("The user cliks on the product and navigates to product details page")
    public void the_user_cliks_on_the_product_and_navigates_to_product_details_page() {
        searchResultsPage.navigateToProductDeatails();
    }
    @Then("The user validates that product details page is displayed")
    public void the_user_validates_that_product_details_page_is_displayed() {
        searchResultsPage.productInfoViewed();
    }
    @When("The user adds {int} products to the cart")
    public void the_user_adds_products_to_the_cart(Integer numberOfProduct) {
        searchResultsPage.selectQuantity(numberOfProduct);
    }
    @Then("The user validates that the {string} is displayed")
    public void the_user_validates_that_the_is_displayed(String expectedMessage) {
       searchResultsPage.validateSuccessMessage(expectedMessage);
    }
    @When("The user navigates to cart page")
    public void the_user_navigates_to_cart_page() {
        searchResultsPage.clickToCartButton();
    }
}
