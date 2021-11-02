package com.amazon.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/wikipedia",
        glue = "com/amazon/stepdefinitions", // test adımlarının bulunduğu klasör
        tags = "@wiki",
        dryRun = false,
        plugin = {"json:target/cucumber.json", "html:target/default-cucumber-reports"},
        // html:target/default-html-reports
        strict = true
        // true ise sadece eksik olan methodları söyle
        // false ise direk teste başla

)

public class RestApiTest {
}
