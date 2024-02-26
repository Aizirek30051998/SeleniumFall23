package com.fall23.ui.drivers;

import com.fall23.ui.config.ConfigReader;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeWebDriver {

    public static WebDriver loadChromeDriver(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
           ChromeOptions options=new ChromeOptions();
           options.addArguments("--disable-extensions");
           options.addArguments("--window-size-1920,1080");
           options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

           if(Boolean.parseBoolean(ConfigReader.getValue("headless"))){
               options.addArguments("--headless");
        }
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }

}
