package com.fall23.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebElementManager {
    //create methods for locators not to enter "driver.findElement .."


    public static WebElement byLinkText(String locator) {

        return WebDriverManager.driver.findElement(By.linkText(locator));
    }

    public static WebElement byId(String locator) {
        return WebDriverManager.driver.findElement(By.id(locator));
    }

    public static WebElement byClassName(String locator) {

        return WebDriverManager.driver.findElement(By.className(locator));
    }

    public static WebElement byPartialLinkText(String locator) {
        return WebDriverManager.driver.findElement(By.partialLinkText(locator));
    }

    public static WebElement findByXpath(String locator) {
        return WebDriverManager.driver.findElement(By.xpath(locator));

    }

    public static WebElement findByName(String locator) {
        return WebDriverManager.driver.findElement(By.name(locator));

    }

    public static WebElement findByCss(String locator) {
        return WebDriverManager.driver.findElement(By.cssSelector(locator));

    }

    public static WebElement findByTagName(String locator) {
        return WebDriverManager.driver.findElement(By.tagName(locator));
    }

    //JavascriptExecutor js = (JavascriptExecutor) driver;
    //  js.executeScript("window.scrollBy(0, 600)");
    public static void scrollBy400() {
        JavascriptExecutor js = (JavascriptExecutor) WebDriverManager.driver;
        js.executeScript("window.scrollBy(0, 400)");

    }
    public static void scrollToTop(){
        JavascriptExecutor js = (JavascriptExecutor) WebDriverManager.driver;
        js.executeScript("window.scrollBy(0, 0");
    }
    public static void webDriverWait(){

    WebDriverWait wb=(new WebDriverWait(WebDriverManager.driver, Duration.ofSeconds(30)));
    }
}

