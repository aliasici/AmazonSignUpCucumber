package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AutoBids extends AutoBidsBasePage{

    public AutoBids(){

        PageFactory.initElements(Driver.getDriver(),this);
    }



   // @FindBy(xpath = "//input[@type='email']")
    @FindBy(xpath = "//input[@placeholder=\"Email\"]")
    public WebElement email;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//p[text()='Sorry, user does not exist in the system.']")
    public WebElement errorMessage;

    public void login(String string, String string2){
        email.sendKeys(string);
        password.sendKeys(string2);

    }
}
