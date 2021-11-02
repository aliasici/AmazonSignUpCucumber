package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoBidsRegister {

    public AutoBidsRegister(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//p[.='New Here ? Sign Up']")
    public WebElement signUp;

    @FindBy(xpath = "//input[@placeholder='User Name']")
    public WebElement userName;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement email;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement policyButton;

    @FindBy(xpath = "//button[.='Accept']")
    public WebElement checkbox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement registerButton;


}
