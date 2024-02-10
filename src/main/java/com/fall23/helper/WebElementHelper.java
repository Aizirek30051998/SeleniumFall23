package com.fall23.helper;

import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.NestedFramePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

import static com.fall23.demoqa.WebDriverManager.driver;

public class WebElementHelper {
private Select select;

    public WebElementHelper waitForButtonToBeClickAble(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public WebElementHelper waitForElementToBeDisplayed(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public WebElementHelper click(WebElement element) {
        waitForButtonToBeClickAble(element);
        element.click();
        return this;
    }

    public WebElementHelper sendKeys(WebElement element, String txt) {
        waitForElementToBeDisplayed(element);
        element.sendKeys(txt);
        return this;
    }

    public void scrollToDown() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 200)");

    }

    public void clickCaptcha(WebDriver driver) {
        WebElement captchaElement = driver.findElement(By.className("recaptcha-checkbox-border"));
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", captchaElement);


    }
    public WebElementHelper sendKeysWithEnter(WebElement element, String txt){
            waitForElementToBeDisplayed(element);
            element.sendKeys(txt);
            element.sendKeys(Keys.ENTER);
            return this;

        }
    }


