package com.fall23.locators;

import com.fall23.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.WebDriverManager.openTheSite;
import static com.fall23.WebElementManager.byPartialLinkText;

public class PartialLinkTextTst extends BaseTest {

    @Test
    void demo() throws InterruptedException {
        openTheSite("https://demoqa.com/links");
       // WebElement unauth= driver.findElement(By.partialLinkText("Unauth"));
        WebElement unauth=byPartialLinkText("Unautho");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600)");

        unauth.click();
        Thread.sleep(5000);
    }
}
