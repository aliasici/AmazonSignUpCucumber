package com.amazon.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/amazon/stepdefinitions", // test adımlarının bulunduğu klasör
        tags = "",
        dryRun = false // true ise sadece eksik olan methodları söyle
        // false ise direk teste başla

)

public class Cukesunner {
}
