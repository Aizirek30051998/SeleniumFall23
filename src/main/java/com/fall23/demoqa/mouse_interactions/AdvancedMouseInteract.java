package com.fall23.demoqa.mouse_interactions;

import com.fall23.demoqa.BaseTest;
import com.fall23.demoqa.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AdvancedMouseInteract extends BaseTest {


    @Test
    void demo() throws InterruptedException {
        WebDriverManager.openTheSite("https://demoqa.com/buttons");

        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));

        actions.doubleClick(doubleClickBtn).perform();

        String actDoubClickMessage = driver.findElement(By.id("doubleClickMessage")).getText();
        String expDoubleMessage = "You have done a double click";
        Assert.assertEquals(actDoubClickMessage, expDoubleMessage);
        Thread.sleep(3000);

    }
        @Test
           void demo2() throws InterruptedException {
        WebDriverManager.openTheSite("https://demoqa.com/buttons");
            WebElement rightClickBtn=driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickBtn).perform();
            String actualContextMesage=driver.findElement(By.id("rightClickMessage")).getText();
            Assert.assertEquals(actualContextMesage,"You have done a right click");
        Thread.sleep(3000);
    }
    @Test
    void demo3() throws InterruptedException {
        WebDriverManager.openTheSite("https://demoqa.com/buttons");
        WebElement ClickBtn=driver.findElement(By.xpath("//button[@id='46BKH']"));
        actions.click(ClickBtn).perform();
        String actualContextMesage=driver.findElement(By.id("ClickMessage")).getText();
        Assert.assertEquals(actualContextMesage,"You have done a click");
        Thread.sleep(3000);
    }

    }

