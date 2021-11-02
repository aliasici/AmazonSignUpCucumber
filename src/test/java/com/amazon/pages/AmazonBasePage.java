package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AmazonBasePage {

    public AmazonBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "nav-orders")
    public WebElement signIn;

    @FindBy(id = "createAccountSubmit")
    public WebElement createAccount;


}
