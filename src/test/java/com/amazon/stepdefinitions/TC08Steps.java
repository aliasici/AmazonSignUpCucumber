package com.amazon.stepdefinitions;

import com.amazon.pages.AutoBids;
import com.amazon.pages.AutoBidsBasePage;
import com.amazon.pages.TC03;
import com.amazon.pages.TC08;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC08Steps {
    TC03 tc03 = new TC03();
    TC08 tc08 = new TC08();
    AutoBids autoBids = new AutoBids();
    AutoBidsBasePage autoBidsBasePage = new AutoBids();

    @Given("User should be write in description in box")
    public void user_should_be_write_in_description_in_box() throws InterruptedException {
        autoBids.login();
        BrowserUtils.wait(2);

        tc03.sellYourVehicle.click();
        BrowserUtils.wait(2);

        WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 20);
        //  WebElement element = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]")));

        wait2.until(ExpectedConditions.elementToBeClickable(tc08.description));

        Thread.sleep(3);
        tc08.description.click();

        tc08.description.sendKeys("Almost new car engine is ok low millage and good shape"+ Keys.ENTER);

    }
}
