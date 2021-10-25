package org.example;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver initDriver(String browser) {
        WebDriver driver;

        switch (browser) {
            default:
                System.out.println("Using default browser: Chrome.");
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();

                boolean headless = Boolean.parseBoolean(System.getProperty("headless", "false"));

                if (headless) {
                    chromeOptions.addArguments("--no-sandbox");
                    chromeOptions.addArguments("--disable-dev-shm-usage");
                    chromeOptions.addArguments("--headless");
                    chromeOptions.addArguments("--disable-gpu");
                    //      chromeOptions.setBinary("/usr/bin/google-chrome-stable");
                }

                System.setProperty("webdriver.chrome.driver", AppConfig.getChromeDriverPath());
                driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", AppConfig.getChromeDriverPath());
                driver = new FirefoxDriver();
                break;
        }

               driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
               driver.manage().window().maximize();
               DriverFactory.driver = driver;
               Dimension dimension = new Dimension(1400, 1050);
               driver.manage().window().setSize(dimension);
               return driver;
         }


        public static WebDriver getDriver () {
            return driver;
        }
    }

