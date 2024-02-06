package com.fall23.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMLogin {

    @Test(description="Login with valid username and valid password")
    void logintest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        String actualLoginText=driver.findElement(By.tagName("h5")).getText();
        String expLogTxt="Login";
        Assert.assertEquals(actualLoginText,expLogTxt);

        String username="Admin";
        String password="admin123";
        WebElement usernameInputField=driver.findElement(By.name("username"));
        WebElement passwordInputFiel=driver.findElement(By.name("password"));

        usernameInputField.sendKeys(username);
        passwordInputFiel.sendKeys(password);

        WebElement loginBtn=driver.findElement(By.tagName("button"));

        loginBtn.click();

        String actualDashboardTxt=driver.findElement(By.tagName("h6")).getText();
        String expDashboardTxt="Dashboard";
        Assert.assertEquals(actualDashboardTxt,expDashboardTxt);


    }
    @Test(description="Login with invalid username and password" )
    void invalidLoginandPassword() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

        String actualLoginTxt=driver.findElement(By.tagName("h5")).getText();
        String expLogTxt="Login";
        Assert.assertEquals(actualLoginTxt,expLogTxt);

        String actualUsername="Aizirek98"; //invalid credentials
        String expectedResLog="Admin";
        String actualPassword="7545";      //invalid credentials
        String expectedPassword="admin123";
        WebElement usernameInput= driver.findElement(By.name("username"));
        WebElement passwordInput=driver.findElement(By.name("password"));

        usernameInput.sendKeys(actualUsername);
        passwordInput.sendKeys(actualPassword);

        WebElement clickLog= driver.findElement(By.tagName("button"));

        clickLog.click();

            WebElement clickForgotPassword=driver.findElement(By.tagName("p"));
            String fYp="Forgot your password?";
            Assert.assertEquals(clickForgotPassword,fYp);
            clickForgotPassword.click();
        }

        @Test (description="Check the button Forgot password")
    void checkForgotPassword(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

         //  WebElement clc= driver.findElement(By.xpath("//p[@login-forgot-header]"));
     //   clc.click();




        }

}