package org.example.StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.Hooks;
import org.example.PageObject.HomePage;
import org.example.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;

public class RegisterUserSteps extends TestBase {

    private HomePage homePage = PageFactory.initElements(driver, HomePage.class);


    @And("I click the account button")
    public void iClickTheAccountButton() {
        homePage.getCreateAccount().click();
    }

    @And("I click the register button")
    public void iClickTheRegisterButton() {
        homePage.getRegisterButton().click();

    }

    @And("I type in the First Name field")
    public void iTypeInTheFirstNameField() {
        homePage.getFirstName().sendKeys("Remus");
    }

    @And("I type in the Last Name field")
    public void iTypeInTheLastNameField() {
        homePage.getLastName().sendKeys("Vescan");
    }

    @And("I type in the Email Address")
    public void iTypeInTheEmailAddress() {
        homePage.getEmailAddress().sendKeys("remus.vescan@freshbyteinc.com");
    }

    @And("I type in the Password field")
    public void iTypeInThePasswordField() {
        homePage.getPassword().sendKeys("Persida1");
    }

    @And("I type in the Confirm Password field")
    public void iTypeInTheConfirmPasswordField() {
        homePage.getConfirmationPassword().sendKeys("Persida1");
    }

    @And("I click on the register button")
    public void iClickOnTheRegisterButton() throws InterruptedException {
        homePage.getFinalRegister().click();
        Thread.sleep(1000);
    }

    @Then("I should see Create an account")
    public void iShouldSeeCreateAnAccount() {
        boolean elementExists = !driver.findElements(By.xpath("//a[text()='click here']")).isEmpty();
        assertThat("You are not registered.", elementExists);
    }

    @And("I click the Log in link")
    public void iClickTheLogInLink() {
        homePage.getLogInLink().click();

    }

    @And("I type in the Email Address account")
    public void iTypeInTheEmailAddressAccount() {
        homePage.getEmailField().sendKeys("remus.vescan@freshbyteinc.com");
    }

    @And("I type in the Password account")
    public void iTypeInThePasswordAccount() {
        homePage.getPassField().sendKeys("Persida1");
    }

    @And("I click on the Login button")
    public void iClickOnTheLoginButton() {
        homePage.getLoginButton().click();
    }

    @Then("I should see Welcome, Remus Vescan!")
    public void iShouldSeeWelcomeRemusVescan() {
        boolean elementExists = !driver.findElements(By.xpath("//p[@class='welcome-msg']")).isEmpty();
        assertThat("You are not registered.", elementExists);

    }

    @And("I click on the Men link")
    public void iClickOnTheMenLink() {
        homePage.getMenLink().click();

    }

    @And("I click on the Basic-Indoor")
    public void iClickOnTheBasicIndoor() {
        homePage.getBasicIndoor().click();
    }

    @And("I click on the Add To Cart")
    public void iClickOnTheAddToCart() {
        homePage.getAddToCart().click();
    }

    @And("I click on the Proceed to checkout")
    public void iClickOnTheProceedToCheckout() throws InterruptedException {
        homePage.getProceedToCheckout().click();
        Thread.sleep(1000);
    }

    @And("I type in the Address field")
    public void iTypeInTheAddressField() {
        homePage.getAddress().sendKeys("Street Number 6");
    }

    @And("I type in the City field")
    public void iTypeInTheCityField() {
        homePage.getCity().clear();
        homePage.getCity().sendKeys("Hollywood");
    }

    @And("I select the State or Province")
    public void iSelectTheStateOrProvince() {
        homePage.getStateID().sendKeys("Colorado" + Keys.ENTER);

    }


    @And("I type in the ZipPostal Code")
    public void iTypeInTheZipPostalCode() {
        homePage.getZipCode().clear();
        homePage.getZipCode().sendKeys("90011");
    }

    @And("I select the country")
    public void iSelectTheCountry() {
        homePage.getCountry().sendKeys("Statele Unite ale Americii");

    }

    @And("I type in the Telephone field")
    public void iTypeInTheTelephoneField() {
        homePage.getTelephone().clear();
        homePage.getTelephone().sendKeys("0771173993");

    }

    @And("I click the Continue button")
    public void iClickTheContinueButton() {
        homePage.getContinueButton().click();


    }

    @And("I click the radio button Free Shipping")
    public void iClickTheRadioButtonFreeShipping() throws InterruptedException {
        homePage.getFreeShipping().click();
        Thread.sleep(3000);

    }

    @And("I click the Continue button from checkout")
    public void iClickTheContinueButtonFromCheckout() throws InterruptedException {
        Thread.sleep(1000);
        homePage.getContinueButt().click();

    }

    @And("I click the next Continue button")
    public void iClickTheNextContinueButton() {
        homePage.getNextButton().click();

    }

    @And("I click on the Place Order button")
    public void iClickOnThePlaceOrderButton() {
        homePage.getPlaceOrder().click();
    }


    @And("I click on the Continue Checkout button")
    public void iClickOnTheContinueCheckoutButton() {
        homePage.getContinueCheckout().click();
    }

    @And("I click on the Free Shipping")
    public void iClickOnTheFreeShipping() {
        homePage.getFreeShipping().click();
    }

    @And("I click on the Chelsea Tee")
    public void iClickOnTheChelseaTee() {
        homePage.getChelseaTee().click();
    }

    @Then("I should see Thank you for your Purchase!")
    public void iShouldSeeThankYouForYourPurchase() {
        boolean elementExists = !driver.findElements(By.xpath("//div[@class='page-title']")).isEmpty();
        assertThat("Element is not present.", elementExists);
    }

    @And("I select color black")
    public void iSelectColorBlack() {
        homePage.getBlackColor().click();

    }

    @And("I select size")
    public void iSelectSize() {
        homePage.getSize().click();
    }

    @And("I click on the Accessories link")
    public void iClickOnTheAccessoriesLink() {
        homePage.getAccessories().click();
    }

    @And("I click on the Lord of the Rings link")
    public void iClickOnTheLordOfTheRingsLink() {
        homePage.getLordOFTheRings().click();
    }

    @And("I type in the input of the Quantity")
    public void iTypeInTheInputOfTheQuantity() {
        homePage.getQuantity().sendKeys("2");

    }

    @And("I click on the Home&Decor link")
    public void iClickOnTheHomeDecorLink() {
        homePage.getHomeAndDecor().click();


    }

    @And("I click on the Home Parfume")
    public void iClickOnTheHomeParfume() {
        homePage.getHomeParfume().click();
    }

    @And("I click on the Continue as a guest")
    public void iClickOnTheContinueAsAGuest() {
        homePage.getContinueAsAGuest().click();
    }

    @And("I click on the Sale link")
    public void iClickOnTheSaleLink() {
        homePage.getSale().click();
    }

    @And("I click on the Kitchen Pasta")
    public void iClickOnTheKitchenPasta() {
        homePage.getKitchenPasta().click();

    }

    @And("I click on the book link")
    public void iClickOnTheBookLink() {
        homePage.getBooks().click();

    }

    @And("I select a book")
    public void iSelectABook() {
        homePage.getSelectBook().click();

    }

    @And("I click on the Cosplay")
    public void iClickOnTheCosplay() {
        homePage.getCosplay().click();
    }

    @And("I click on the Red dress")
    public void iClickOnTheRedDress() {
        homePage.getRedDress().click();
    }

    @And("I click on the Little One Link")
    public void iClickOnTheLittleOneLink() {
        homePage.getLittleOne().click();
    }

    @And("I click on the Flower Power")
    public void iClickOnTheFlowerPower() {
        homePage.getFlowerPower().click();
    }

    @And("I click on the Vip link")
    public void iClickOnTheVipLink() {
        homePage.getVIP().click();
    }

    @And("I click on the Iphone Pro")
    public void iClickOnTheIphonePro() {
        homePage.getIphonePro().click();
    }

    @And("I click on the Sport link")
    public void iClickOnTheSportLink() {
        homePage.getSport().click();

    }


    @And("I click on the Boyfriend Jean")
    public void iClickOnTheBoyfriendJean() {
        homePage.getJean().click();
    }

    @And("I click on the Color")
    public void iClickOnTheColor() {
        homePage.getColor().click();

    }

    @And("I click on the Size")
    public void iClickOnTheSize() {
        homePage.getSizeForJean().click();
    }

    @And("I type in the Register First Name field")
    public void iTypeInTheRegisterFirstNameField() {
        homePage.getFirstNameRegister().sendKeys("Remus");
    }

    @And("I type in the Register Last Name field")
    public void iTypeInTheRegisterLastNameField() {
        homePage.getLastNameRegister().sendKeys("Vescan");
    }

    @And("I type in the Register Email Address")
    public void iTypeInTheRegisterEmailAddress() {
        homePage.getEmailAddressRegister().sendKeys("remus.vescan@freshbyteinc.com");
    }

    @And("I select size for Chelsea Tea")
    public void iSelectSizeForChelseaTea() {
        homePage.getSizeChelsea().click();

    }

    @And("I click on the Test Category link")
    public void iClickOnTheTestCategoryLink() {
        homePage.getTestCategory().click();
    }

    @And("I click on the Snowdrop")
    public void iClickOnTheSnowdrop() {
        homePage.getSnowDrop().click();

    }

    @And("I click on the Plant link")
    public void iClickOnThePlantLink() {
        homePage.getPlantLink().click();
    }

    @And("I click on the Rose")
    public void iClickOnTheRose() {
        homePage.getRose().click();
    }

    @And("I click on the Skinny Jean")
    public void iClickOnTheSkinnyJean() {
        homePage.getSkinnyJean().click();
    }

    @And("I select the size of the Skinny Jean")
    public void iSelectTheSizeOfTheSkinnyJean() {
        homePage.getSizeJean().click();

    }

    @And("I select the color black")
    public void iSelectTheColorBlack() {
        homePage.getColorJean().click();
    }
}
