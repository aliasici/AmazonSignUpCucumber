package com.amazon.pages;

import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignUpPage {


    public AmazonSignUpPage(){
        PageFactory.initElements(Driver.getDriver() , this);
    }

    //@FindBy(xpath = "//span[@class='nav-action-inner']")

    @FindBy(id = "nav-orders")
    public WebElement signIn;

    @FindBy(id = "auth-create-account-link")
    public WebElement createAccount;

    @FindBy(id ="ap_customer_name")
    public WebElement userName;

    @FindBy(id="ap_email")
    public WebElement emailValue;

    @FindBy(id="ap_password")
    public WebElement firstPassword;

    @FindBy(id="ap_password_check")
    public WebElement ReEnterPassword;


//    public void SignUp(String usernameValue, String emailValue,String passwordValue, String check) {
//        userName.sendKeys(usernameValue);
//        email.sendKeys(emailValue);
//        password.sendKeys(passwordValue);
//        ReEnterPassword.sendKeys(check, Keys.ENTER);
//
//    }
    public void SignUp() {
        String usernameValue = ConfigurationReader.getProperty("userName");
        String email = ConfigurationReader.getProperty("email");
        String password = ConfigurationReader.getProperty("password");
        String passwordValue = ConfigurationReader.getProperty("ReEnterPassword");

        userName.sendKeys(usernameValue);
        emailValue.sendKeys(email);
        firstPassword.sendKeys(password);
        ReEnterPassword.sendKeys(passwordValue, Keys.ENTER);

    }

}
