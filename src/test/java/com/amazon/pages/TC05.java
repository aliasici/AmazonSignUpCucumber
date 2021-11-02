package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC05 {

    public TC05(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@id='options-menu'])[10]") // (//*[@id='options-menu'])[10] (//button[@type='button'])[10]
    public WebElement title;

    @FindBy(xpath = "//p[@class='text-text-500 dark:text-textdark-500 ms-2']")
    public List<WebElement> getTitles;

    @FindBy(xpath = "(//*[@id='options-menu'])[11]") //(//*[@id='options-menu'])[11] (//button[@id='options-menu'])[11]
    public WebElement fuelType;

    @FindBy(xpath = "//p[@class='text-text-500 dark:text-textdark-500 ms-2']")
    public List<WebElement> allFuels;

    @FindBy(xpath = "(//*[@id='options-menu'])[12]")
    public WebElement buildType;

    @FindBy(xpath = "//div[contains(@class,'pt-2 z-30')]//div//div[1]")
    public WebElement suv;

    @FindBy(xpath = "//div[contains(@class,'pt-2 z-30')]//div//div[1]")
    public WebElement bioDiesel;

    @FindBy(xpath = "(//input[@placeholder='VIN Number'])[1]")
    public WebElement vinNumber;

    @FindBy(xpath = "//body//div//div//div//div//div//div//div//div//div//div//div//div//div//div[1]//div[1]")
    public WebElement getFuelTypeDiesel;

    @FindBy(xpath = "//textarea[@placeholder='Highlight Information']")
    public WebElement info;


}
