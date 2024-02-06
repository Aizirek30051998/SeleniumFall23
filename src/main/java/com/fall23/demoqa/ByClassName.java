package com.fall23.demoqa;

import org.testng.annotations.Test;

public class ByClassName extends BaseTest {

    @Test
    void byClassNameTest() throws InterruptedException {
        WebDriverManager.openTheSite("https://demoqa.com/text-box");

       /* WebElement usernameInput=driver.findElement(By.id("userName"));
        WebElement emailInput=driver.findElement(By.id("userEmail"));
        WebElement currentAdressInput=driver.findElement(By.id("currentAddress"));
        WebElement permanentAdressInput=driver.findElement(By.id("permanentAddress"));
        WebElement submitBtn= driver.findElement(By.className("btn-primary"));

     //Dublicates by class names
        WebElement usernameInput=byClassName("mr-sm-2 form-control");
        WebElement currentAdressInput=byClassName("form-control");
        WebElement permanentAdressInput=byClassName("form-control");
        WebElement submitBtn= byClassName("btn-primary");


        usernameInput.sendKeys("John");
        currentAdressInput.sendKeys("WallStreet 555");
        permanentAdressInput.sendKeys("Sovet 123");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600)");
        submitBtn.click();
        Thread.sleep(5000);*/
    }
}
