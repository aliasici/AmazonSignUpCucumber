package com.amazon.stepdefinitions;

import com.amazon.pages.AmazonSignUpPageAmazon;
import com.amazon.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonStepsDefinitions {

    AmazonSignUpPageAmazon page = new AmazonSignUpPageAmazon();

    @Then("User should be able to enter all credentials and click create your Amazon account button")
    public void user_should_be_able_to_enter_all_credentials_and_click_create_your_Amazon_account_button() {
        page.signUp();
        BrowserUtils.wait(3);


    }

    @When("user enters  {string} username and {string} email and {string} password and {string} reenterpassword")
    public void user_enters_username_and_email_and_password_and_reenterpassword(String string, String string2, String string3, String string4) {
        page.signUp(string, string2,string3,string4);
    }

}
