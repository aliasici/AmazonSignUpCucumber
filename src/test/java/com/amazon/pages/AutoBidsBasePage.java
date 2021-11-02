package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AutoBidsBasePage {

    public AutoBidsBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    /*
    Commmon xpaths:
      #1- //tagName[@attribute='value']
      #2- //*[@attribute='value'] --> * means look for all web elements
      #3- //tagName[.='text'] --> returns the web element with given text.

      Example og Login button
      //p[.=' Login ']
     */



    @FindBy(xpath = "//p[text()=' Login ']") // //p[.=' Login '] ==> LIKE #3 ABOVE
    public WebElement login;

}
