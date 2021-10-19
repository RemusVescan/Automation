package org.example;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setup() {
        String browser = System.getProperty("browser", "chrome");
        DriverFactory.initDriver(browser);
    }



    @After
    public void tearDown(Scenario scenario) {
        DriverFactory.getDriver().quit();
    }
    @AfterStep
    public void doSomethingAfterStep(Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver())
                .getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName() + "_stepsScreenshot.png");
    }

}
