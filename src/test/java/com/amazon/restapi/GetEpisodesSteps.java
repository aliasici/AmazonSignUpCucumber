package com.amazon.restapi;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class GetEpisodesSteps {
    @Given("^I perform Get operations for episodes$")
    public void ıPerformGetOperationsForEpisodes() {
        given().contentType(ContentType.JSON);
    }
    @Then("^I should see verify name as \"([^\"]*)\"$")
    public void ıShouldSeeVerifyNameAs(String arg0) throws Throwable {
        GetMethods.Episode();
    }
}