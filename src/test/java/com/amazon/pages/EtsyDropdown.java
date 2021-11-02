package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EtsyDropdown extends EtsyBase {

    public EtsyDropdown(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath= "(//a[@target='etsy.1025247774'])[2]") //select[@id='inventory-variation-select-0']
    public WebElement giftItem;

    @FindBy(id = "inventory-variation-select-0") //select[@id='inventory-variation-select-0']
    public WebElement dropdown;

    @FindBy(xpath = "//button[@class='wt-btn wt-btn--filled wt-width-full']") ////button[@class='wt-btn wt-btn--filled wt-width-full']
    public WebElement button;

    @FindBy(xpath = "//h1[@class='wt-text-heading-01']")
    public WebElement itemText;

//    public void setDropdown(){
//        Select select = new Select(dropdown);
//        select.selectByVisibleText("Gold");
//
//    }
}
