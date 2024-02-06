package com.fall23.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWait extends BaseTest {

    @Test
    void waitForElementToBeClickable(){
        WebDriverManager.openTheSite("https://demoqa.com/dynamic-properties");
        WebElement willEnableAfter5sEcBtn= driver.findElement(By.id("enableAfter"));

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));
    wait.until(ExpectedConditions.elementToBeClickable(willEnableAfter5sEcBtn)).click();

WebElement visibleAter5Sec= WebElementManager.byId("visibleAfter");
wait.until(ExpectedConditions.visibilityOf(visibleAter5Sec)).click();
wait.until(ExpectedConditions.attributeContains(By.id("colorChange"),"class","danger"));


}
}