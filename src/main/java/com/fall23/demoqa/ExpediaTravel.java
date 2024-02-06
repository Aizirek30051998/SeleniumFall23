package com.fall23.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExpediaTravel {
    WebDriver driver=new ChromeDriver();
    WebDriverWait webDriverWait=new WebDriverWait(driver,Duration.ofSeconds(10));

    @BeforeTest
    void opeNbrowser()  {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        driver.get("https://www.expedia.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }
    @Test
    void checkTheFligths() throws InterruptedException {

        WebElement flightsEl= driver.findElement(By.xpath("//span[text()='Flights']"));
        flightsEl.click();
        WebElement goingToClick= driver.findElement(By.xpath("//button[@aria-label='Going to']"));
        goingToClick.click();
        WebElement wait=webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='destination_select']")));
        WebElement goingInput= driver.findElement(By.xpath("//input[@id='destination_select']"));
        goingInput.sendKeys("Phuket", Keys.ENTER);

        WebElement dateButton= driver.findElement(By.xpath("//button[@data-stid='uitk-date-selector-input1-default']"));
        dateButton.click();
        WebElement dateInput= driver.findElement(By.xpath("//div[@aria-label='Saturday, February 3, 2024']"));
        dateInput.click();
        WebElement doneBtn= driver.findElement(By.name("Done"));
        doneBtn.click();
        
        /*
        WebDriverWait wait4=(new WebDriverWait(driver,Duration.ofSeconds(10)));
        WebElement flexibleDates=driver.findElement(By.xpath("//span[text()='Flexible dates']"));
        flexibleDates.click();
        WebDriverWait wait3=(new WebDriverWait(driver,Duration.ofSeconds(10)));
        WebElement choose= driver.findElement(By.xpath("//span[text()='1 night']"));
        choose.click();
        WebElement when= driver.findElement(By.xpath("//div[@class='uitk-button-toggle uitk-button-toggle-is-checked uitk-button-toggle-is-stacked']"));
        when.click();*/

        Thread.sleep(5000);
        driver.quit();
    }
}
