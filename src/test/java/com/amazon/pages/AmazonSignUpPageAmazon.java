package com.amazon.pages;

import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignUpPageAmazon extends AmazonBasePage {

    public AmazonSignUpPageAmazon(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

//    @FindBy(id = "nav-orders")
//    public WebElement signIn;
//
//    @FindBy(id = "createAccountSubmit")
//    public WebElement createAccount;

//    @FindBy( id = "createAccountSubmit") //xpath = "//a[@id='createAccountSubmit']"
//    public WebElement createAccount;

//    @FindBy(linkText = "https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26gclid%3DCj0KCQjwub-HBhCyARIsAPctr7zZQXMUeV2zDJ5CXux-BCDnoYzWXtoGtYPMVAGz6FfzmU_zGbBnstYaAt5uEALw_wcB%26hvadid%3D381823327672%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9031526%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3De%26hvrand%3D17721272960083246575%26hvtargid%3Dkwd-10573980%26hydadcr%3D28883_11845445%26ref%3Dpd_sl_7j18redljs_e%26tag%3Damazusnavi-20%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&")
//    public WebElement clickAccount;

    @FindBy(id ="ap_customer_name")
    public WebElement userName;

    @FindBy(id="ap_email")
    public WebElement emailValue;

    @FindBy(id="ap_password")
    public WebElement firstPassword;

    @FindBy(id="ap_password_check")
    public WebElement ReEnterPassword;


    public void signUp(String usernameValue, String email,String passwordValue, String check) {
        userName.sendKeys(usernameValue);
        emailValue.sendKeys(email);
        firstPassword.sendKeys(passwordValue);
        ReEnterPassword.sendKeys(check, Keys.ENTER);

    }
    public void signUp() {
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
