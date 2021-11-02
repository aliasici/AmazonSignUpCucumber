package com.amazon.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/autobids/TC05.feature",
        glue = "com/amazon/stepdefinitions",
        tags =  "@wip",
        monochrome = true,
        dryRun = false

        // true ise sadece eksik olan methodları söyle
        // false ise direk teste başla

)
public class AutoBidsRunner {
}
