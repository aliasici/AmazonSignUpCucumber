package com.amazon.stepdefinitions;

import com.amazon.pages.EtsyDropdown;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;

import java.util.Set;

public class EtsySptepsDefinitions {

    EtsyDropdown etsyDropdown = new EtsyDropdown();



    @Given("User should be able to go to Etsy.com")
    public void user_should_be_able_to_go_to_Etsy_com() {
        Driver.getDriver().get("https://www.etsy.com/?ref=lgo");
        BrowserUtils.wait(2);
    }

    @Then("User should be able to search what user wants")
    public void user_should_be_able_to_search_what_user_wants() {
      etsyDropdown.searchBox.sendKeys("party decor");
        BrowserUtils.wait(2);
        etsyDropdown.searchButton.click();
    }

    @Then("User should be able to click Big Leo Energy")
    public void user_should_be_able_to_click_Big_Leo_Energy() {
       etsyDropdown.giftItem.click();
        BrowserUtils.wait(3);
    }

    @Then("User should be able to choose gold")
    public void user_should_be_able_to_choose_gold() {

        Set<String> list = Driver.getDriver().getWindowHandles();

        ArrayList<String> windowList = new ArrayList<>(list);
        System.out.println("list = " + list);

        BrowserUtils.wait(2);

        Driver.getDriver().switchTo().window(windowList.get(1));

        BrowserUtils.wait(2);
        Select select = new Select(Driver.getDriver().findElement(By.id("variation-select-0")));

        BrowserUtils.wait(2);


        select.selectByValue("2100265339");

        BrowserUtils.wait(3);
    }


    @Then("User should be able to click add to cart button")
    public void user_should_be_able_to_click_add_to_cart_button() {
        etsyDropdown.button.click();
        BrowserUtils.wait(3);
    }

    @Then("User should be able to check item info of the cart")
    public void user_should_be_able_to_check_item_info_of_the_cart() {
      String itemInfo =  etsyDropdown.itemText.getText();

        Assert.assertEquals(itemInfo,"1 item in your cart\n");
        BrowserUtils.wait(3);
    }

    @When("User searches {string} in the search box")
    public void userSearchesInTheSearchBox(String searchValue) {
        etsyDropdown.searchBox.sendKeys("wooden spoon");

    }

    @And("User clicks to search button")
    public void userClicksToSearchButton() {
        etsyDropdown.searchButton.click();
    }

    @Then("User should see {string} in the Etsy title")
    public void userShouldSeeInTheEtsyTitle(String exceptedInTitle) {
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(exceptedInTitle));

        Assert.assertEquals(actualTitle,"Wooden spoon | Etsy");
    }

    @Given("User should see the title as excepted")
    public void userShouldSeeTheTitleAsExcepted() {
       String actualEtsyTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualEtsyTitle.contains("Etsy - Shop"));
    }

}
