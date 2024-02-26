package com.fall23.helper;

import com.fall23.ui.drivers.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
        waitForButtonToBeClickAble(element);
        scrollToElement(element);
        highlightElement(element);
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
        js.executeScript("window.scrollBy(0, 400)");

    }

    public void clickCaptcha(WebDriver driver) {
        WebElement captchaElement = driver.findElement(By.className("recaptcha-checkbox-border"));
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", captchaElement);


    }

    public WebElementHelper sendKeysWithEnter(WebElement element, String txt) {
        waitForElementToBeDisplayed(element);
        element.sendKeys(txt);
        element.sendKeys(Keys.ENTER);
        return this;

    }

    public WebElementHelper scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        return this;
    }

    public WebElementHelper pause(int milSec) {
        try {
            TimeUnit.MILLISECONDS.sleep(milSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public WebElementHelper highlightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
        return this;
    }

    public WebElement waitForElementToBeClickableByFluentWait(WebDriver driver, WebElement element, int timeOutInSec, int pollingEveryInSec) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeOutInSec))
                .pollingEvery(Duration.ofSeconds(pollingEveryInSec))
                .ignoring(NoSuchElementException.class);

        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public List<WebElement> waitForListElementsFluentWait(WebDriver driver, List<WebElement> elements, int timeOutInSec, int pollingEveryInSec) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeOutInSec))
                .pollingEvery(Duration.ofSeconds(pollingEveryInSec))
                .ignoring(NoSuchElementException.class);

        return wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }



}
