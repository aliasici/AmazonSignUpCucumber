package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPage {

    public WikiPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "searchInput")
    public WebElement searchBox;

    @FindBy(id = "firstHeading")
    public WebElement firstHeader;

   // @FindBy(xpath = "//th[@class='infobox-above']")
    @FindBy(className = "fn")
    public WebElement imageHeader;

    public void setSearchBox(String person){
        searchBox.sendKeys(person + Keys.ENTER);
    }


}
