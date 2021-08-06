package com.amazon.stepdefinitions;

import com.amazon.pages.AutoBids;
import com.amazon.pages.AutoBidsBasePage;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AutoBidsCommon {

    AutoBidsBasePage autoBidsBasePage = new AutoBids();


    @Given("User should be able to go to main page of AutoBids")
    public void user_should_be_able_to_go_to_main_page_of_AutoBids() {
        Driver.getDriver().get("https://www.theautobids.com/");
        BrowserUtils.wait(3);


    }
    @Then("User should be able to click Login functionality")
    public void user_should_be_able_to_click_Login_functionality() {
        autoBidsBasePage.login.click();
        BrowserUtils.wait(2);

    }
}
