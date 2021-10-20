package org.example.StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.PageObject.HomePage;
import org.example.TestBase;
import org.openqa.selenium.By;
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
        homePage.getAddress().sendKeys("Colonia Breaza nr.6");
    }

    @And("I type in the City field")
    public void iTypeInTheCityField() {
        homePage.getCity().sendKeys("Cluj-Napoca");
    }
}
