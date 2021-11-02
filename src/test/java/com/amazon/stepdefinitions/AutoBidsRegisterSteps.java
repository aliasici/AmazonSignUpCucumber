package com.amazon.stepdefinitions;

import com.amazon.pages.AutoBidsRegister;
import com.amazon.utilities.BrowserUtils;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class AutoBidsRegisterSteps {

    AutoBidsRegister autoBidsRegister = new AutoBidsRegister();



//    @When("user should be able to click register button")
//    public void user_should_be_able_to_click_register_button() {
//        autoBidsRegister.signUp.click();
//
//    }

    @When("user should be able to click signUp button")
    public void userShouldBeAbleToClickSignUpButton() {

        autoBidsRegister.signUp.click();
    }

    @When("User should be able to enter unique user name")
    public void user_should_be_able_to_enter_unique_user_name() {
        Faker faker = new Faker();
        autoBidsRegister.userName.sendKeys(faker.name().fullName());
        BrowserUtils.wait(2);


    }
    @And("User should be able to enter unique email")
    public void userShouldBeAbleToEnterUniqueEmail() {
        Faker faker = new Faker();
        autoBidsRegister.email.sendKeys(faker.internet().emailAddress());
        BrowserUtils.wait(2);
    }
    @When("User should be bale to enter unique password")
    public void user_should_be_bale_to_enter_unique_password() {
        Faker faker = new Faker();

        autoBidsRegister.password.sendKeys(faker.internet().password());

        BrowserUtils.wait(2);

    }
    @When("User should be able to click checkbox for policy")
    public void user_should_be_able_to_click_checkbox_for_policy() {
        autoBidsRegister.policyButton.click();

        BrowserUtils.wait(2);

    }
    @When("User should be able to agree policy clicking by Accept")
    public void user_should_be_able_to_agree_policy_clicking_by_Accept() {
        autoBidsRegister.checkbox.click();

        BrowserUtils.wait(2);

    }


    @And("User should be able to click register button")
    public void userShouldBeAbleToClickRegisterButton() {
        autoBidsRegister.registerButton.click();

        BrowserUtils.wait(15);
    }


}
