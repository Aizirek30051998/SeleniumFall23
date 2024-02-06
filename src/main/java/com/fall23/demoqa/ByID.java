package com.fall23.demoqa;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ByID extends BaseTest {



    @Test
    void byIdTest() throws InterruptedException {
      WebDriverManager.openTheSite("https://demoqa.com/text-box");

      /*  WebElement usernameInput=driver.findElement(By.id("userName"));
        WebElement emailInput=driver.findElement(By.id("userEmail"));
        WebElement currentAdressInput=driver.findElement(By.id("currentAddress"));
        WebElement permanentAdressInput=driver.findElement(By.id("permanentAddress"));
        WebElement submitBtn=driver.findElement(By.className("submit"));*/

        WebElement usernameInput= WebElementManager.byId("userName");
        WebElement emailInput= WebElementManager.byId("userEmail");
        WebElement currentAddressInput= WebElementManager.byId("currentAddress");
        WebElement permanentAddressInput= WebElementManager.byId("permanentAddress");
        WebElement submitBtn= WebElementManager.byId("submit");

        usernameInput.sendKeys("John");
        emailInput.sendKeys("john@gmail.com");
        currentAddressInput.sendKeys("WallStreet 555");
        permanentAddressInput.sendKeys("Sovet 123");

      //  scrollBy600();
       // JavascriptExecutor scroll=scrollBy600("window.scrollBy(0,600)");
       // JavascriptExecutor js = (JavascriptExecutor) driver;
      //  js.executeScript("window.scrollBy(0, 600)");

        submitBtn.click();

        Thread.sleep(5000);

    }
}
