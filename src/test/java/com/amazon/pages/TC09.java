package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC09 {

    public TC09(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@id='options-menu'])[13]")
    public WebElement locations;

    @FindBy(xpath ="//button[normalize-space()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='w-56 flex py-4 px-2 hover:bg-primary-100 cursor-pointer items-center']")
    public List<WebElement> allLocations;
}
