package com.fall23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
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
    public static WebElement findByXpath(String locator){
    return driver.findElement(By.xpath(locator));

    }
    public static WebElement findByName(String locator){
    return driver.findElement(By.name(locator));

}
public static WebElement findByCss(String locator){
    return driver.findElement(By.cssSelector(locator));

    }
    public static WebElement findByTagName(String locator){
    return driver.findElement(By.tagName(locator));
    }
    //JavascriptExecutor js = (JavascriptExecutor) driver;
      //  js.executeScript("window.scrollBy(0, 600)");
    public static  void scrollBy600(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600)");

    }
    public static void webDriverWait(){
        WebDriverWait wb=(new WebDriverWait(driver, Duration.ofSeconds(30)));
    }
}

