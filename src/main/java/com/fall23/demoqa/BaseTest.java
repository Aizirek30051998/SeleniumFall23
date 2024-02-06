package com.fall23.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BaseTest {
    public WebDriver driver;
    protected Actions actions;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.initChromeDriver();
        actions=new Actions(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
}
    @AfterClass
    public void tearDown(){
        WebDriverManager.closeDriver();
    }

}
