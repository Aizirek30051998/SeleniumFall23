package com.fall23.demoqa;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PartialLinkTextTst extends BaseTest {

    @Test
    void demo() throws InterruptedException {
        WebDriverManager.openTheSite("https://demoqa.com/links");
       // WebElement unauth= driver.findElement(By.partialLinkText("Unauth"));
        WebElement unauth= WebElementManager.byPartialLinkText("Unautho");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600)");

        unauth.click();
        Thread.sleep(5000);
    }
}
