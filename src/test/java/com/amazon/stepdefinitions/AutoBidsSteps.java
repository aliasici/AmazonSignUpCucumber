package com.amazon.stepdefinitions;

import com.amazon.pages.AutoBids;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

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
        autoBids.login(email, password);
        autoBids.submit.click();
        BrowserUtils.wait(3);
    }

    @Then("user verifies that {string} message is displayed")
    public void user_verifies_that_message_is_displayed(String string) {
        String actualResult = autoBids.errorMessage.getText();
        Assert.assertEquals(string, actualResult);

    }

    @Given("User should be able to click checkbox")
    public void userShouldBeAbleToClickCheckbox() {
        autoBids.checkbox.click();
        BrowserUtils.wait(2);

        System.out.println(autoBids.checkbox.isSelected());//true

        autoBids.checkbox.clear();
        BrowserUtils.wait(2);
        System.out.println(autoBids.checkbox.isSelected());//true

        BrowserUtils.wait(2);
        autoBids.checkbox.click();

        BrowserUtils.wait(5);

//        Set<String> list = Driver.getDriver().getWindowHandles();
//        ArrayList<String> windowList = new ArrayList<>(list);
//
//        Driver.getDriver().switchTo().window(windowList.get(1));
//        BrowserUtils.wait(2);

    }

    @And("User should be able to click Accept button")
    public void userShouldBeAbleToClickAcceptButton() {
//        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//        js.executeScript("window.scrollBy(0,250)", "");

        BrowserUtils.wait(2);
        autoBids.accept.click();

        BrowserUtils.wait(2);
    }

    @And("User should be bale to click sign in with phone button")
    public void userShouldBeBaleToClickSignInWithPhoneButton() {
        autoBids.signInPhone.click();
        BrowserUtils.wait(2);

    }

    @And("User should be able to enter user name in field")
    public void userShouldBeAbleToEnterUserNameInField() {
        autoBids.userName.sendKeys("A MARADONA", Keys.ENTER);
        BrowserUtils.wait(3);
    }

    @And("User should be able to enter phone number")
    public void userShouldBeAbleToEnterPhoneNumber() {
        autoBids.phoneNumber.sendKeys("1234567890", Keys.ENTER);
        BrowserUtils.wait(10);
    }


    @When("User can input {string} and {string}")
    public void userCanInputAnd(String emailInput, String password) {
        autoBids.login(emailInput,password);
        BrowserUtils.wait(2);
        autoBids.submit.click();
    }

    @And("User should be able to click Login button")
    public void userShouldBeAbleToClickLoginButton() {

        autoBids.loginButton.click();
    }
}