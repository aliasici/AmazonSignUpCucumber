package com.amazon.stepdefinitions;

import com.amazon.pages.AutoBids;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AutoBidsSteps {

    AutoBids autoBids = new AutoBids();




    @Then("User should be able to enter all credentials")
    public void user_should_be_able_to_enter_all_credentials() {
        autoBids.email.sendKeys("ali.asici@theautobids.com");
        BrowserUtils.wait(2);
        autoBids.password.sendKeys("Irvine1130");
        BrowserUtils.wait(2);
    }

    @Then("User should be able to click login button")
    public void user_should_be_able_to_click_login_button() {
        autoBids.submit.click();
        BrowserUtils.wait(2);
        Driver.closeDriver();
        BrowserUtils.wait(2);
    }

    @When("user logs in with {string} email and {string} password")
    public void user_logs_in_with_email_and_password(String email, String password) {
        autoBids.login(email,password);
        autoBids.submit.click();
    }

    @Then("user verifies that {string} message is displayed")
    public void user_verifies_that_message_is_displayed(String string) {
        String actualResult = autoBids.errorMessage.getText();
        Assert.assertEquals(string, actualResult);

    }
}
