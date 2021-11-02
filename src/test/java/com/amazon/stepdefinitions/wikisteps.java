package com.amazon.stepdefinitions;

import com.amazon.pages.WikiPage;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.security.Key;

public class wikisteps {

    WikiPage wikiPage = new WikiPage();

    @When("User on the wikipedia main page")
    public void user_on_the_wikipedia_main_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("User searches {string} in the wiki search page")
    public void user_searches_in_the_wiki_search_page(String string) {
        wikiPage.setSearchBox(string);
        BrowserUtils.wait(2);


       // wikiPage.searchBox.sendKeys(string + Keys.ENTER);

    }

    @Then("User should see {string} in the wiki title")
    public void user_should_see_in_the_wiki_title(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @Then("User should see {string} in the main header")
    public void user_should_see_in_the_main_header(String expected) {
        String actualHeader = wikiPage.firstHeader.getText();
        Assert.assertEquals(actualHeader,expected);
    }
    @Then("User should see {string} in the image header")
    public void user_should_see_in_the_image_header(String expectedImage) {
        String actualImage = wikiPage.imageHeader.getText();
        Assert.assertEquals(actualImage,expectedImage);
    }

}
