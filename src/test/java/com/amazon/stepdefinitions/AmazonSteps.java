package com.amazon.stepdefinitions;

import com.amazon.pages.AmazonSignUpPage;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AmazonSteps {

    AmazonSignUpPage page = new AmazonSignUpPage();

    @Given("User should be able to go Amazon main page")
    public void user_should_be_able_to_go_Amazon_main_page() {
        Driver.getDriver().get("https://www.amazon.com/");


    }

    @Given("User should be able to click Sign In functionality")
    public void user_should_be_able_to_click_Sign_In_functionality() {
        page.signIn.click();

    }

    @Given("User should be able to click create your Amazon account button")
    public void user_should_be_able_to_click_create_your_Amazon_account_button() {
        page.createAccount.click();

    }

    @Then("User should be able to enter all credentials and click create your Amazon account button")
    public void user_should_be_able_to_enter_all_credentials_and_click_create_your_Amazon_account_button() {
        page.SignUp("Abuziddin","cebotal733@eyeremind.com","Kilkuyruk1","Kilkuyruk1");


    }


}
