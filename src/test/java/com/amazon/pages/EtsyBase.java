package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class EtsyBase {

    public EtsyBase(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@data-id='search-query']") // [name = "search_query"]
    public WebElement searchBox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement searchButton;
}
