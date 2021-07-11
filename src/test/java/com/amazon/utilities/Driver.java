package com.amazon.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    static WebDriver driver;

    private Driver(){

    }

    public static WebDriver getDriver(){

        if (driver == null){
          // String browser = ConfigurationReader.getProperty("browser");

            switch (ConfigurationReader.getProperty("browser")){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
//
//                case "edge":
//                    WebDriverManager.edgedriver().setup();
//                    break;
//
//                case "safari":
//                    WebDriverManager.getInstance(SafariDriver.class).setup();
//                    break;

            }


        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;

    }

    public static void closeDriver(){

        if (driver != null){
            driver.quit();
            driver = null;
        }
    }


}
