package com.fall23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHomeWork {

    WebDriver driver = new ChromeDriver();

    @BeforeTest
    void openTheBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    @Test
    void checkInvalidLoginandPassword() {

        String actuaLogin = "Admin";
        String expLog = "Admin";
        String actualPassw = "4545a";      //expected INVALID CREDENTIALS
        String expPassw = "admin123";
        WebElement findUsername = driver.findElement(By.name("username"));
        WebElement findPassword = driver.findElement(By.name("password"));
        findUsername.sendKeys(actuaLogin);
        findPassword.sendKeys(actualPassw);
        WebElement clickBtn = driver.findElement(By.tagName("button"));
        clickBtn.click();

//Test for checking the forgot password

        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.className("orangehrm-login-forgot-header"))));
        WebElement forgotPassw = driver.findElement(By.className("orangehrm-login-forgot-header"));
        forgotPassw.click();
//Test for checking reset
        WebElement inputUsername = driver.findElement(By.name("username"));
        String username = "Admin";
        inputUsername.sendKeys(username);
        String resetBoard = driver.findElement(By.tagName("h6")).getText();
        String resetPass = "Reset Password";
        Assert.assertEquals(resetBoard, resetPass);
        WebElement element1 = (new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.className("orangehrm-forgot-password-button--reset"))));
        WebElement clickBtn1 = driver.findElement(By.className("orangehrm-forgot-password-button--reset"));
        clickBtn1.click();

    }

    @AfterTest
    void closeTheBrowser() {
        if (driver == null) {
            driver.quit();
        }
    }
}