package com.amazon.stepdefinitions;

import com.amazon.pages.AutoBids;
import com.amazon.pages.AutoBidsBasePage;
import com.amazon.pages.TC03;
import com.amazon.pages.TC06;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC06Steps {
    TC03 tc03 = new TC03();
    TC06 tc06 = new TC06();
    AutoBids autoBids = new AutoBids();
    AutoBidsBasePage autoBidsBasePage = new AutoBids();

    @Given("User should be write in description in box")
    public void user_should_be_write_in_description_in_box() throws InterruptedException {
        autoBids.login();
        BrowserUtils.wait(2);

        tc03.sellYourVehicle.click();
        BrowserUtils.wait(2);

//        WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 20);
//        wait2.until(ExpectedConditions.elementToBeClickable(tc06.description));
        BrowserUtils.clickOnElement(tc06.description);

       BrowserUtils.wait(2);

        tc06.description.sendKeys("Almost new car engine is ok low millage and good shape"+ Keys.ENTER);
        BrowserUtils.wait(2);
    }
}
