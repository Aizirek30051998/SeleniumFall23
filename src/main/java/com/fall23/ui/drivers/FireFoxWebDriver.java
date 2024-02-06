package com.fall23.ui.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxWebDriver {

    public static WebDriver loadFireFoxDriver(){
        System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geckodriver.exe");
        WebDriver geckodriver=new FirefoxDriver();
        geckodriver.manage().window().maximize();
        geckodriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return geckodriver;
    }

    //todo create method to load firefox webdriver as we do with Chrome
}
