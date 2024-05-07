package com.myideasoft.step_definitions;

import com.myideasoft.pages.HomePage;
import com.myideasoft.utilities.ConfigurationReader;
import com.myideasoft.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Home_StepDefs {
    HomePage homePage = new HomePage();
    @Given("The user navigates to home page")
    public void the_user_navigates_to_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user types in {string} to the search bar and hits enter")
    public void the_user_types_in_to_the_search_bar_and_hits_enter(String productName) {
       homePage.searchingProduct(productName);
    }
}
