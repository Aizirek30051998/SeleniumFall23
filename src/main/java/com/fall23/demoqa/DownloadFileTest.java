package com.fall23.demoqa;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DownloadFileTest extends BaseTest {

    @Test
    void downloadFile() throws InterruptedException {
     WebDriverManager.openTheSite("https://demoqa.com/upload-download");

     driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\User\\Downloads\\512.webp");
    Thread.sleep(3000);

    }



}
