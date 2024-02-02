package com.fall23;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

import static com.fall23.WebDriverManager.driver;
import static com.fall23.WebDriverManager.openTheSite;
import static com.fall23.WebElementManager.findByXpath;
import static com.fall23.WebElementManager.scrollBy600;

public class Nambafood extends BaseTest{

    @Test
    void sendKey() throws InterruptedException {
        openTheSite("https://nambafood.kg/?language=en");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        WebElement search=findByXpath("//input[@id='query']");

        //for checking SEARCH
        search.sendKeys("Пицца", Keys.ENTER);

        Actions action=new Actions(driver);

        scrollBy600();
        Thread.sleep(5000);
    }
}
