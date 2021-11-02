package com.amazon.stepdefinitions;

import com.amazon.pages.AutoBids;
import com.amazon.pages.AutoBidsBasePage;
import com.amazon.pages.TC03;
import com.amazon.pages.TC05;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.plaf.basic.BasicToggleButtonUI;
import java.util.List;

public class TC05Steps {

    AutoBidsBasePage autoBidsBasePage = new AutoBids();
    AutoBids autoBids = new AutoBids();
    TC03 tc03 = new TC03();

    TC05 tc05 = new TC05();

    @Then("User should be able to select title {string} in box")
    public void user_should_be_able_to_select_title_in_box(String verifyTitle) {

        autoBids.login();

        BrowserUtils.wait(2);

        tc03.sellYourVehicle.click();

        BrowserUtils.clickOnElement(tc05.title);

        BrowserUtils.wait(2);

        List<WebElement> titles = tc05.getTitles;

        for (int i = 0; i < titles.size(); i++) {
            if (titles.get(i).getText().equals(verifyTitle)) {
                BrowserUtils.clickOnElement(titles.get(i));
                break;
            }

        }
        BrowserUtils.wait(2);
    }

    @Then("User should be able to select fuel {string} in box")
    public void user_should_be_able_to_select_fuel_in_box(String verifyFuel) {

        BrowserUtils.clickWithJS(tc05.fuelType);


        BrowserUtils.wait(2);

        List<WebElement> fuelTypes = tc05.allFuels;


        for (int i = 0; i < fuelTypes.size(); i++) {
            if (fuelTypes.get(i).getText().equals(verifyFuel)) {
                BrowserUtils.clickWithJS(fuelTypes.get(i));
                break;
            }

        }

    }

    @Then("User should be able to write Vin {string} in box")
    public void user_should_be_able_to_write_Vin_in_box(String vinNum) {

        BrowserUtils.doubleClick(tc05.vinNumber);

        BrowserUtils.enterText(tc05.vinNumber, vinNum);

        BrowserUtils.wait(2);


    }


}
