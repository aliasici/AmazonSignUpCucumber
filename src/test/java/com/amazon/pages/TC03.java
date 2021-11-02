package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC03 {

    public TC03(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@id='options-menu'])[6]") // (//button[@type='button'])[6]
    public WebElement yearButton;

    ////div[1]//div[7]//div[1]//button[1]
    @FindBy(xpath = "//div[7]//div[1]//button[1]") // //span[.='Used']
    public WebElement itemCondition;

    @FindBy(xpath="//div[8]//div[1]//button[1]")
    public WebElement sellerType;

    @FindBy(xpath = "//span[.=' Get Started. ']")
    public WebElement sellYourVehicle;

    @FindBy(xpath = "//p[@class='text-text-500 dark:text-textdark-500 ms-2']")
    public List<WebElement> year;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]")
    public WebElement year1;

    @FindBy(xpath = "//p[normalize-space()='Used']")
    public WebElement used;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[8]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]")
    public WebElement sellerSelect;

    @FindBy(xpath = "//p[@class='text-text-500 dark:text-textdark-500 ms-2']")
    public List<WebElement> allConditions;

    @FindBy(xpath = "//p[@class='text-text-500 dark:text-textdark-500 ms-2']")
    public List<WebElement> sellers;
}
