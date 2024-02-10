package com.fall23.ui.pages;

import com.fall23.data.JavaFaker;
import com.fall23.helper.AlertHelper;
import com.fall23.helper.FrameHelper;
import com.fall23.helper.WebElementHelper;
import com.fall23.helper.WindowHelper;
import com.fall23.ui.drivers.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BookStorePage {

    WebDriver driver;
    Faker faker = new Faker();

    public BookStorePage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public BookStorePage registration() throws InterruptedException {
        WebElementHelper webElementHelper = new WebElementHelper();
        Thread.sleep(1000);
        webElementHelper.click(driver.findElement(By.id("newUser")));
        Thread.sleep(1000);
        webElementHelper.sendKeys(driver.findElement(By.cssSelector("input[placeholder='First Name']")), faker.name().firstName());
        Thread.sleep(1000);
        webElementHelper.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Last Name']")), faker.name().lastName());
        Thread.sleep(1000);
        webElementHelper.sendKeys(driver.findElement(By.cssSelector("input[placeholder='UserName']")), faker.bothify("Aizu54"));
        Thread.sleep(1000);
        webElementHelper.scrollToDown();
        webElementHelper.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Password']")), faker.bothify("7878@Aizu"));
        Thread.sleep(1000);
        //create method for captcha with jsExecutor
        WebElement iframe = driver.findElement(By.cssSelector("iframe[title='reCAPTCHA']"));
        driver.switchTo().frame(iframe);
        WebElement captchaClick = driver.findElement(By.className("recaptcha-checkbox-border"));
        captchaClick.click();
        driver.switchTo().defaultContent();
        Thread.sleep(15000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.onload = function() { window.alert = function(msg) { return true; } }");
        webElementHelper.click(driver.findElement(By.xpath("//button[@id='register']")));
        js.executeScript("window.alert('User Register Successfully.')");
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        String expectedMessage = "User Register Successfully.";
        String actualMessage = alert.getText();
        Assert.assertEquals(actualMessage, expectedMessage, "Алерт с неправильным сообщением!");
        alert.accept();
        webElementHelper.click(driver.findElement(By.xpath("//button[@id='gotologin']")));
        Thread.sleep(1000);
        webElementHelper.sendKeys(driver.findElement(By.cssSelector("input[placeholder='UserName']")), "Aizu54");
        webElementHelper.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Password']")), "7878@Aizu");
        webElementHelper.click(driver.findElement(By.cssSelector("button[id='login']")));

        return this;

    }

    public BookStorePage book1() throws InterruptedException {
        WebElementHelper helper = new WebElementHelper();
        AlertHelper alertHelper = new AlertHelper();
        Thread.sleep(1000);
        helper.sendKeys(driver.findElement(By.cssSelector("input[placeholder='UserName']")), "Aizu54")
                .sendKeys(driver.findElement(By.cssSelector("input[placeholder='Password']")), "7878@Aizu")
                .click(driver.findElement(By.cssSelector("button[id='login']")));
        Thread.sleep(1000);
        helper.scrollToDown();
        Thread.sleep(1000);
        helper.click(driver.findElement(By.cssSelector("button[id='gotoStore']")));
        Thread.sleep(1000);
        helper.click(driver.findElement(By.cssSelector("a[href='/books?book=9781449325862']")));
        helper.scrollToDown();
        helper.click(driver.findElement(By.xpath("//button[text()='Add To Your Collection']")));
        Thread.sleep(1000);
        alertHelper.alertAcceptByJs();
        Thread.sleep(1000);
        return this;
    }

    public BookStorePage book2() throws InterruptedException {
        WebElementHelper helper = new WebElementHelper();
        helper.sendKeys(driver.findElement(By.cssSelector("input[placeholder='UserName']")), "Aizu54")
                .sendKeys(driver.findElement(By.cssSelector("input[placeholder='Password']")), "7878@Aizu")
                .click(driver.findElement(By.cssSelector("button[id='login']")));
        Thread.sleep(1000);
        helper.scrollToDown();
        helper.click(driver.findElement(By.cssSelector("button[id='gotoStore']")));
        Thread.sleep(1000);
        helper.click(driver.findElement(By.cssSelector("a[href='/books?book=9781449331818']")));
        Thread.sleep(1000);
        helper.scrollToDown();
        helper.click(driver.findElement(By.xpath("//button[text()='Add To Your Collection']")));

        return this;
    }

    public BookStorePage book3() throws InterruptedException {
        WebElementHelper helper = new WebElementHelper();
        helper.sendKeys(driver.findElement(By.cssSelector("input[placeholder='UserName']")), "Aizu54")
                .sendKeys(driver.findElement(By.cssSelector("input[placeholder='Password']")), "7878@Aizu");
        helper.click(driver.findElement(By.cssSelector("button[id='login']")));
        Thread.sleep(1000);
        helper.scrollToDown();
        helper.click(driver.findElement(By.cssSelector("button[id='gotoStore']")));
        Thread.sleep(1000);
        helper.scrollToDown();
        helper.click(driver.findElement(By.cssSelector("a[href='/books?book=9781449365035']")));
        Thread.sleep(1000);
        helper.scrollToDown();
        helper.click(driver.findElement(By.xpath("//button[text()='Add To Your Collection']")));

        return this;
    }

    public BookStorePage book4() throws InterruptedException {
        WebElementHelper helper = new WebElementHelper();
        helper.sendKeys(driver.findElement(By.cssSelector("input[placeholder='UserName']")), "Aizu54")
                .sendKeys(driver.findElement(By.cssSelector("input[placeholder='Password']")), "7878@Aizu");
        helper.click(driver.findElement(By.cssSelector("button[id='login']")));
        Thread.sleep(1000);
        helper.scrollToDown();
        helper.click(driver.findElement(By.cssSelector("button[id='gotoStore']")));
        Thread.sleep(1000);
        helper.scrollToDown();
        helper.click(driver.findElement(By.cssSelector("a[href='/books?book=9781491904244']")));
        Thread.sleep(1000);
        helper.scrollToDown();
        helper.click(driver.findElement(By.xpath("//button[text()='Add To Your Collection']")));

        return this;
    }
}