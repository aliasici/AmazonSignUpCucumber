package com.amazon.stepdefinitions;

import com.amazon.pages.*;
import com.amazon.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC09Steps {

    TC03 tc03 = new TC03();
    TC09 tc09 = new TC09();
    AutoBids autoBids = new AutoBids();
    AutoBidsBasePage autoBidsBasePage = new AutoBids();

    @Then("User should be select to {string} in box")
    public void user_should_be_select_to_in_box(String cities) {
        autoBids.login();
        BrowserUtils.wait(2);
        tc03.sellYourVehicle.click();
        BrowserUtils.wait(2);

       // tc09.locations.click();
        BrowserUtils.clickOnElement(tc09.locations);
        BrowserUtils.wait(2);

        List<WebElement> locations = tc09.allLocations;

        for (int i = 0; i < locations.size(); i++){
            if(locations.get(i).getText().equals(cities)){
                BrowserUtils.clickOnElement(locations.get(i));
                BrowserUtils.wait(5);
                break;

            }
        }

    }

    @Then("User should be click the submit button")
    public void user_should_be_click_the_submit_button() {
        BrowserUtils.wait(2);

        BrowserUtils.clickOnElement(tc09.submitButton);
        BrowserUtils.wait(2);

    }


}
