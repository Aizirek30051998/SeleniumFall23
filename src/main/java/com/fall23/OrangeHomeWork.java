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

import static com.fall23.WebElementManager.findByXpath;

public class OrangeHomeWork {

    WebDriver driver = new ChromeDriver();

    @BeforeTest
    void openTheBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    @Test
    void checkInvalidLoginandPassword() {

        String actuaLogin = "Admin";
        String expLog = "Admin";
        String actualPassw = "admin123";      //expected INVALID CREDENTIALS
        String expPassw = "admin123";
        WebElement findUsername = driver.findElement(By.name("username"));
        WebElement findPassword = driver.findElement(By.name("password"));
        findUsername.sendKeys(actuaLogin);
        findPassword.sendKeys(actualPassw);
        WebElement clickBtn = driver.findElement(By.tagName("button"));
        clickBtn.click();

//Test for checking the forgot password

      // WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.className("orangehrm-login-forgot-header"))));
        //WebElement forgotPassw = driver.findElement(By.className("orangehrm-login-forgot-header"));
        // forgotPassw.click();

        String actDashboard = findByXpath("//h6[text()='Dashboard']").getText();
      String expDashboard = "Dashboard";
      Assert.assertEquals(actDashboard, expDashboard);

    //    WebElement containerSearch = findByXpath("//div[@class='oxd-main-menu-search']");
      //  WebElement searchInput = findByXpath("//input[@placeholder='Search']");
     //   searchInput.sendKeys("Admin");
      //  WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Admin']"))));

       // WebElement admin = findByXpath("//span[text()='Admin']");
    //    admin.click();

        //  String actTextAdmin = findByXpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']").getText();
      //  String expText = "Admin";
      //  Assert.assertEquals(actTextAdmin, expText);

       // String actTxtUserManagement = findByXpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-level']").getText();
      //  String expTxtUserManagement = "User Management";
       // Assert.assertEquals(actTxtUserManagement, expTxtUserManagement);

      //  WebElement usernameInputinUserManage = findByXpath("(//input[@class='oxd-input oxd-input--active'])[2]");
     //   WebElement select = findByXpath("(//div[@class='oxd-select-text-input'])[1]");
      //  WebElement selectInput = findByXpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
      //  usernameInputinUserManage.sendKeys("Adminsha");
      //  selectInput.click();

      //  Thread.sleep(5000);


    }
//Test for checking reset
    //   WebElement inputUsername = driver.findElement(By.name("username"));
    //    String username = "Admin";
    //    inputUsername.sendKeys(username);
    //    String resetBoard = driver.findElement(By.tagName("h6")).getText();
    //  String resetPass = "Reset Password";
    //  Assert.assertEquals(resetBoard, resetPass);
    //   WebElement element1 = (new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.className("orangehrm-forgot-password-button--reset"))));
    //   WebElement clickBtn1 = driver.findElement(By.className("orangehrm-forgot-password-button--reset"));
    //    clickBtn1.click();
    @AfterTest
    void closeTheBrowser() {
        if (driver == null) {
            driver.quit();
        }
    }
}