package com.amazon.stepdefinitions;

import com.amazon.pages.AmazonSignUpPage;
import com.amazon.pages.BasePage;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonCommonSteps {


    BasePage basePage = new AmazonSignUpPage();

    @Given("User should be able to go Amazon main page")
    public void user_should_be_able_to_go_Amazon_main_page() {
        Driver.getDriver().get("https://www.amazon.com/");


    }

    @Given("User should be able to click Sign In functionality")
    public void user_should_be_able_to_click_Sign_In_functionality() {
        basePage.signIn.click();
        BrowserUtils.wait(2);

    }

    @Given("User should be able to click create your Amazon account button")
    public void user_should_be_able_to_click_create_your_Amazon_account_button() {
        basePage.createAccount.click();
        BrowserUtils.wait(2);

    }





}
