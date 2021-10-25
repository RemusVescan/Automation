Feature: HomePage

  Scenario: Register with a valid user
    Given I open the homepage
    And I click the account button
    And I click the register button
    And I type in the Register First Name field
    And I type in the Register Last Name field
    And I type in the Register Email Address
    And I type in the Password field
    And I type in the Confirm Password field
    And I click on the register button
    Then I should see Create an account

  Scenario: Login with valid account
    Given I open the homepage
    And I click the account button
    And I click the Log in link
    And I type in the Email Address account
    And I type in the Password account
    And I click on the Login button
    Then I should see Welcome, Remus Vescan!

  Scenario: Add to cart
    Given I open the homepage
    And I click on the Men link
    And I click on the Basic-Indoor
    And I click on the Add To Cart
    And I click on the Proceed to checkout
    And I click on the Continue as a guest
    And I type in the First Name field
    And I type in the Last Name field
    And I type in the Email Address
    And I type in the Address field
    And I type in the City field
    And I type in the ZipPostal Code
    And I select the country
    And I type in the Telephone field
    And I select the State or Province
    And I click the Continue button
    And I click the Continue button from checkout
    And I click the next Continue button
    And I click on the Place Order button
    Then I should see Thank you for your Purchase!

  Scenario: Add to cart Chelsea Tea
    Given I open the homepage
    And I click on the Men link
    And I click on the Chelsea Tee
    And I select color black
    And I select size for Chelsea Tea
    And I click on the Add To Cart
    And I click on the Proceed to checkout
    And I click on the Continue as a guest
    And I type in the First Name field
    And I type in the Last Name field
    And I type in the Email Address
    And I type in the Address field
    And I type in the City field
    And I type in the ZipPostal Code
    And I select the country
    And I type in the Telephone field
    And I select the State or Province
    And I click the Continue button
    And I click the Continue button from checkout
    And I click the next Continue button
    And I click on the Place Order button
    Then I should see Thank you for your Purchase!



  Scenario: Add to cart accessories
    Given I open the homepage
    And I click on the Accessories link
    And I click on the Lord of the Rings link
    And I type in the input of the Quantity
    And I click on the Add To Cart
    And I click on the Proceed to checkout
    And I click on the Continue as a guest
    And I type in the First Name field
    And I type in the Last Name field
    And I type in the Email Address
    And I type in the Address field
    And I type in the City field
    And I type in the ZipPostal Code
    And I select the country
    And I type in the Telephone field
    And I select the State or Province
    And I click the Continue button
    And I click on the Free Shipping
    And I click the Continue button from checkout
    And I click the next Continue button
    And I click on the Place Order button
    Then I should see Thank you for your Purchase!


  Scenario: Checkout for  Home&Decor
    Given I open the homepage
    And I click on the Home&Decor link
    And I click on the Home Parfume
    And I click on the Add To Cart
    And I click on the Proceed to checkout
    And I click on the Continue as a guest
    And I type in the First Name field
    And I type in the Last Name field
    And I type in the Email Address
    And I type in the Address field
    And I type in the City field
    And I type in the ZipPostal Code
    And I select the country
    And I type in the Telephone field
    And I select the State or Province
    And I click the Continue button
    And I click on the Free Shipping
    And I click the Continue button from checkout
    And I click the next Continue button
    And I click on the Place Order button
    Then I should see Thank you for your Purchase!

  Scenario: Checkout for Sale
    Given I open the homepage
    And I click on the Sale link
    And I click on the Kitchen Pasta
    And I click on the Add To Cart
    And I click on the Proceed to checkout
    And I click on the Continue as a guest
    And I type in the First Name field
    And I type in the Last Name field
    And I type in the Email Address
    And I type in the Address field
    And I type in the City field
    And I type in the ZipPostal Code
    And I select the country
    And I type in the Telephone field
    And I select the State or Province
    And I click the Continue button
    And I click on the Free Shipping
    And I click the Continue button from checkout
    And I click the next Continue button
    And I click on the Place Order button
    Then I should see Thank you for your Purchase!

  Scenario: Checkout for book
    Given I open the homepage
    And I click on the book link
    And I select a book
    And I click on the Add To Cart
    And I click on the Proceed to checkout
    And I click on the Continue as a guest
    And I type in the First Name field
    And I type in the Last Name field
    And I type in the Email Address
    And I type in the Address field
    And I type in the City field
    And I type in the ZipPostal Code
    And I select the country
    And I type in the Telephone field
    And I select the State or Province
    And I click the Continue button
    And I click the Continue button from checkout
    And I click the next Continue button
    And I click on the Place Order button
    Then I should see Thank you for your Purchase!

  Scenario: Checkout for Cosplay
    Given I open the homepage
    And I click on the Cosplay
    And I click on the Red dress
    And I click on the Add To Cart
    And I click on the Proceed to checkout
    And I click on the Continue as a guest
    And I type in the First Name field
    And I type in the Last Name field
    And I type in the Email Address
    And I type in the Address field
    And I type in the City field
    And I type in the ZipPostal Code
    And I select the country
    And I type in the Telephone field
    And I select the State or Province
    And I click the Continue button
    And I click the Continue button from checkout
    And I click the next Continue button
    And I click on the Place Order button
    Then I should see Thank you for your Purchase!

  Scenario: Checkout for Little One
    Given I open the homepage
    And I click on the Little One Link
    And I click on the Flower Power
    And I click on the Add To Cart
    And I click on the Proceed to checkout
    And I click on the Continue as a guest
    And I type in the First Name field
    And I type in the Last Name field
    And I type in the Email Address
    And I type in the Address field
    And I type in the City field
    And I type in the ZipPostal Code
    And I select the country
    And I type in the Telephone field
    And I select the State or Province
    And I click the Continue button
    And I click the Continue button from checkout
    And I click the next Continue button
    And I click on the Place Order button
    Then I should see Thank you for your Purchase!

  Scenario: Checkout for Vip
    Given I open the homepage
    And I click on the Vip link
    And I click on the Iphone Pro
    And I click on the Add To Cart
    And I click on the Proceed to checkout
    And I click on the Continue as a guest
    And I type in the First Name field
    And I type in the Last Name field
    And I type in the Email Address
    And I type in the Address field
    And I type in the City field
    And I type in the ZipPostal Code
    And I select the country
    And I type in the Telephone field
    And I select the State or Province
    And I click the Continue button
    And I click the next Continue button
    And I click on the Place Order button
    Then I should see Thank you for your Purchase!

  Scenario: Checkout Sport
    Given I open the homepage
    And I click on the Sport link
    And I click on the Boyfriend Jean
    And I click on the Color
    And I click on the Size
    And I click on the Add To Cart
    And I click on the Proceed to checkout
    And I click on the Continue as a guest
    And I type in the First Name field
    And I type in the Last Name field
    And I type in the Email Address
    And I type in the Address field
    And I type in the City field
    And I type in the ZipPostal Code
    And I select the country
    And I type in the Telephone field
    And I select the State or Province
    And I click the Continue button
    And I click on the Free Shipping
    And I click the Continue button from checkout
    And I click the next Continue button
    And I click on the Place Order button
    Then I should see Thank you for your Purchase!


  Scenario: Checkout for Test Category
    Given I open the homepage
    And I click on the Test Category link
    And I click on the Snowdrop
    And I click on the Add To Cart
    And I click on the Proceed to checkout
    And I click on the Continue as a guest
    And I type in the First Name field
    And I type in the Last Name field
    And I type in the Email Address
    And I type in the Address field
    And I type in the City field
    And I type in the ZipPostal Code
    And I select the country
    And I type in the Telephone field
    And I select the State or Province
    And I click the Continue button
    And I click the Continue button from checkout
    And I click the next Continue button
    And I click on the Place Order button
    Then I should see Thank you for your Purchase!


  Scenario: Checkout for the Plant
    Given I open the homepage
    And I click on the Plant link
    And I click on the Rose
    And I click on the Add To Cart
    And I click on the Proceed to checkout
    And I click on the Continue as a guest
    And I type in the First Name field
    And I type in the Last Name field
    And I type in the Email Address
    And I type in the Address field
    And I type in the City field
    And I type in the ZipPostal Code
    And I select the country
    And I type in the Telephone field
    And I select the State or Province
    And I click the Continue button
    And I click on the Free Shipping
    And I click the Continue button from checkout
    And I click the next Continue button
    And I click on the Place Order button
    Then I should see Thank you for your Purchase!