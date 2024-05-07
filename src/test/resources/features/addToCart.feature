@regression
@smoke
Feature: US_001 Add To Cart
  @wip
  Scenario: Adding products to cart
    Given The user navigates to home page
    When The user types in "ürün" to the search bar and hits enter
    Then The user validates that searching results are displayed
    When The user cliks on the product and navigates to product details page
    Then The user validates that product details page is displayed
    When The user adds 5 products to the cart
    Then The user validates that the "SEPETİNİZE EKLENMİŞTİR" is displayed
    When The user navigates to cart page
    Then The user validates that the cart page is displayed
    And The user validates that the cart contains 5 products