package com.fall23.locators;

import com.fall23.BaseTest;
import com.fall23.WebDriverManager;
import com.fall23.WebElementManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.fall23.WebDriverManager.openTheSite;
import static com.fall23.WebElementManager.byId;

public class ByID extends BaseTest {



    @Test
    void byIdTest() throws InterruptedException {
      openTheSite("https://demoqa.com/text-box");

      /*  WebElement usernameInput=driver.findElement(By.id("userName"));
        WebElement emailInput=driver.findElement(By.id("userEmail"));
        WebElement currentAdressInput=driver.findElement(By.id("currentAddress"));
        WebElement permanentAdressInput=driver.findElement(By.id("permanentAddress"));
        WebElement submitBtn=driver.findElement(By.className("submit"));*/

        WebElement usernameInput=byId("userName");
        WebElement emailInput=byId("userEmail");
        WebElement currentAddressInput=byId("currentAddress");
        WebElement permanentAddressInput=byId("permanentAddress");
        WebElement submitBtn=byId("submit");

        usernameInput.sendKeys("John");
        emailInput.sendKeys("john@gmail.com");
        currentAddressInput.sendKeys("WallStreet 555");
        permanentAddressInput.sendKeys("Sovet 123");
        submitBtn.click();

        Thread.sleep(5000);

    }
}
