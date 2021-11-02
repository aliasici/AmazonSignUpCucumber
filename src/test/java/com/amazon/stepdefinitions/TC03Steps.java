package com.amazon.stepdefinitions;

import com.amazon.pages.AutoBids;
import com.amazon.pages.AutoBidsBasePage;
import com.amazon.pages.TC03;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.stream.Collectors;

public class TC03Steps {

    AutoBidsBasePage autoBidsBasePage = new AutoBids();
    AutoBids autoBids = new AutoBids();

    TC03 tc03 = new TC03();

    @Given("User should be able to click Sell Your Vehicle button")
    public void userShouldBeAbleToClickButton() {

        autoBids.login();
        BrowserUtils.wait(2);

        tc03.sellYourVehicle.click();

    }

    @Then("User should be able to select the Year in box")
    public void user_should_be_able_to_select_the_Year_in_box() {

        tc03.yearButton.click();
        WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
        //  WebElement element = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]")));

        wait2.until(ExpectedConditions.elementToBeClickable(tc03.year1));
        BrowserUtils.wait(3);
        tc03.year1.click();
        BrowserUtils.wait(2);

//        String expected = "2018";
//        String actual = tc03.year.getText();
//
//        assertEquals("Thet are not match", expected, actual);
//
//        BrowserUtils.wait(3);


    }

    @Then("User should be able to select Item Condition")
    public void user_should_be_able_to_select_Item_Condition() {
        WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
        BrowserUtils.wait(3);

        tc03.itemCondition.click();
        BrowserUtils.wait(2);

        wait2.until(ExpectedConditions.elementToBeClickable(tc03.used));
        BrowserUtils.wait(2);

        tc03.used.click();
        BrowserUtils.wait(3);


    }

    @Then("User should be able to select Seller type")
    public void user_should_be_able_to_select_Seller_type() {
        WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
        BrowserUtils.wait(3);
        tc03.sellerType.click();
        BrowserUtils.wait(2);

        wait2.until(ExpectedConditions.elementToBeClickable(tc03.sellerSelect));
        BrowserUtils.wait(2);
        tc03.sellerSelect.click();
        BrowserUtils.wait(2);


    }


    @Then("User should be able to select the {string} in box")
    public void userShouldBeAbleToSelectTheInBox(String yearChoose) {
        autoBids.login();
        BrowserUtils.wait(2);

        tc03.sellYourVehicle.click();
        BrowserUtils.wait(2);

        tc03.yearButton.click();
        BrowserUtils.wait(3);

      //  List<WebElement> list = tc03.year;

        List<WebElement> allYears = Driver.getDriver().findElements(By.xpath("//p[@class='text-text-500 dark:text-textdark-500 ms-2']"));

        for (int i = 0; i < allYears.size(); i++) {
            if (allYears.get(i).getText().contains(yearChoose)) {
                BrowserUtils.clickOnElement(allYears.get(i));
                break;
            }

            // System.out.println("each.getText() = " + each.getText());

        }

        //  System.out.println("allYears = " + allYears);
//         List<String> text = tc03.year.stream().map(WebElement::getText).collect(Collectors.toList());
//        System.out.println("text = " + text); // 2020, 2021


    }

    @Then("User should be able to select {string}")
    public void userShouldBeAbleToSelect(String conditionChoose) {

        BrowserUtils.wait(3);
        BrowserUtils.clickOnElement(tc03.itemCondition);

        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//p[@class='text-text-500 dark:text-textdark-500 ms-2']"));
        BrowserUtils.wait(2);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().contains(conditionChoose)) {
                BrowserUtils.clickOnElement(list.get(i));
                BrowserUtils.wait(2);
                break;
            }

        }

    }

    @And("User should be able to choose a seller {string}")
    public void userShouldBeAbleToChooseASeller(String sellerType) {
        tc03.sellerType.click();
        BrowserUtils.wait(2);

        List<WebElement> seller = Driver.getDriver().findElements(By.xpath("//p[@class='text-text-500 dark:text-textdark-500 ms-2']"));
        BrowserUtils.wait(2);

        for (int i = 0; i < seller.size(); i++) {
            if (seller.get(i).getText().contains(sellerType)) {
                BrowserUtils.clickOnElement(seller.get(i));
                break;

            }

        }
        BrowserUtils.wait(2);

    }
}
