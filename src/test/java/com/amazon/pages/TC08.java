package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC08 {

    public TC08(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[4]/div[1]/div[1]/textarea[2]")
    public WebElement description;
}
