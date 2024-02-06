package com.fall23.demoqa;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LinkTextTest extends BaseTest {

    @Test
    void test123() throws InterruptedException{

    WebDriverManager.openTheSite("https://demoqa.com/links");

       // WebElement home=driver.findElement(By.linkText("Home"));
        WebElement home= WebElementManager.byLinkText("Home");
        home.click();
        Thread.sleep(5000);

    }
}
