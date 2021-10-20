
Feature: HomePage

  Scenario: Register with a valid user
    Given I open the homepage
    And I click the account button
    And I click the register button
    And I type in the First Name field
    And I type in the Last Name field
    And I type in the Email Address
    And I type in the Password field
    And I type in the Confirm Password field
    And I click on the register button
    Then I should see Create an account

  Scenario: Create account
    Given I open the homepage
    And I click the account button
    And I click the Log in link
    And I type in the Email Address account
    And I type in the Password account
    And I click on the Login button
    Then I should see Welcome, Remus Vescan!

  Scenario: Add to cart
    Given I open the homepage
    And I click the account button
    And I click the Log in link
    And I type in the Email Address account
    And I type in the Password account
    And I click on the Login button
    And I click on the Men link
    And I click on the Basic-Indoor
    And I click on the Add To Cart
    And I click on the Proceed to checkout
    And I type in the Address field
    And I type in the City field


