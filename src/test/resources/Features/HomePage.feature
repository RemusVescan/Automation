
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

  Scenario: Login with a valid user
   Given I open the homepage
   And I click the account button
   And I click the Log in link
   And I type in the Email Address account
