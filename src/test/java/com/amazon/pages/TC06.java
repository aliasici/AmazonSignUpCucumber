package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC06 {

    public TC06(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//textarea[@placeholder='Highlight Information']")
    public WebElement description;
}
