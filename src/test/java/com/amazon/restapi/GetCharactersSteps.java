package com.amazon.restapi;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class GetCharactersSteps {
    @Given("^I perform Get Operations for \"([^\"]*)\"$")
    public void iPerformGetOperationsFor(String url) throws Throwable {
    }
    @And("^I perform Get for the Character number \"([^\"]*)\"$")
    public void iPerformGetForTheCharacterNumber(String ch) throws Throwable {
        GetMethods.GetMethodCharacter(ch);
    }
    @Then("^I should see Character's name as \"([^\"]*)\"$")
    public void iShouldSeeCharacterSNameAs(String arg0) throws Throwable {
    }

    @Then("^I should see verify GET parameter$")
    public void ıShouldSeeVerifyGETParameter() {
        GetMethods.CharacterQueryParam();
    }
}