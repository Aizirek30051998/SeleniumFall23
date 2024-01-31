package com.fall23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static com.fall23.WebDriverManager.driver;

public class WebElementManager {
    //create methods for locators not to enter "driver.findElement .."


public static WebElement byLinkText(String locator){
    return driver.findElement(By.linkText(locator));
}
    public static WebElement byId(String locator){
        return driver.findElement(By.id(locator));
    }
    public static WebElement byClassName(String locator){
    return driver.findElement(By.className(locator));
    }
    public static WebElement byPartialLinkText(String locator){
    return driver.findElement(By.partialLinkText(locator));
    }
}

