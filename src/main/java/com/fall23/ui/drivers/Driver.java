package com.fall23.ui.drivers;

import com.fall23.ui.config.ConfigReader;
import org.openqa.selenium.WebDriver;

import java.sql.SQLOutput;

public class Driver {

    private Driver() {

    }

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getValue("browser").toLowerCase()) {
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver=FireFoxWebDriver.loadFireFoxDriver();
                    //todo add firefox
                    break;
                case "edge":
                    driver=EdgeWebDriver.loadEdgeWebdriver();
                //todo all drivers
                default:
                    throw new IllegalArgumentException("You provided wrong Driver name");

            }
        }
        return driver;
    }
    public static void closeDriver(){
        try{
            if(driver!=null){
                driver.close();
                driver.quit();
                driver=null;
            }
} catch (Exception e) {
            System.out.println("Error while closing driver");
        }
    }
}
