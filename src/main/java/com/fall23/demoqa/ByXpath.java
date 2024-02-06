package com.fall23.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.fall23.demoqa.WebElementManager.findByXpath;
import static com.fall23.demoqa.WebElementManager.webDriverWait;

public class ByXpath extends BaseTest {

    @Test
    void demo() throws InterruptedException {
        WebDriverManager.openTheSite("https://demoqa.com/text-box");

        WebElement fullNameInput=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"));
        fullNameInput.sendKeys("John Doe");
      // Thread.sleep(5000);
    }
    @Test
    void demo2() throws InterruptedException {
        WebDriverManager.openTheSite("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String actuaLogin = "Admin";
        String expLog = "Admin";
        String actualPassw = "admin123";
        String expPassw = "admin123";
        WebElement findUsername = driver.findElement(By.name("username"));
        WebElement findPassword = driver.findElement(By.name("password"));

        findUsername.sendKeys(actuaLogin);
        findPassword.sendKeys(actualPassw);

        WebElement clickBtn = driver.findElement(By.tagName("button"));
        clickBtn.click();


        String actDashboard = findByXpath("//h6[text()='Dashboard']").getText();
        String expDashboard = "Dashboard";
        Assert.assertEquals(actDashboard, expDashboard);

        WebElement admin = findByXpath("//span[text()='Admin']");
        admin.click();

        WebElement usernameInputinUserManage = findByXpath("(//input[@class='oxd-input oxd-input--active'])[2]");
        WebElement select = findByXpath("(//div[@class='oxd-select-text-input'])[1]");
        WebElement selectInput = findByXpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");

        webDriverWait();

        usernameInputinUserManage.sendKeys("Adminsha");
        selectInput.click();

        webDriverWait();
            driver.navigate().back();


        Thread.sleep(5000);


    }
}
