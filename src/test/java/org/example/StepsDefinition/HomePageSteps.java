package org.example.StepsDefinition;

import io.cucumber.java.en.Given;
import org.example.PageObject.HomePage;
import org.example.TestBase;
import org.openqa.selenium.support.PageFactory;


public class HomePageSteps extends TestBase {


    @Given("I open the homepage")
    public void iOpenTheHomepage() {
        openHomepage();

    }
}
