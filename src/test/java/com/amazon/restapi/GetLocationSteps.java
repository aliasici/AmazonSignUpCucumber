package com.amazon.restapi;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class GetLocationSteps {
    @Given("^I perform Get operations for Location$")
    public void Ä±PerformGetOperationsForLocation() {

        given().contentType(ContentType.JSON);
    }
    @Then("^I should see verify wrong Location$")
    public void Ä±ShouldSeeVerifyWrongLocation() {
        GetMethods.Location();
    }
}