package org.example.runners;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;


import org.junit.runner.RunWith;



    @CucumberOptions(
            plugin = {"html:target/cucumber.html", "json:target/json-reports/login.json"},
            glue = {"org.example"},
            features = {"src/test/resources/features/HomePage.feature"}
    )
    @RunWith(Cucumber.class)
    public class LoginRunner {
    }



