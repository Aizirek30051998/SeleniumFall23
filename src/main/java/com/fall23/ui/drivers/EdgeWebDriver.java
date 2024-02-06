package com.fall23.ui.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeWebDriver {

    public static WebDriver loadEdgeWebdriver(){
        System.setProperty("webdriver.msedge.driver","src/main/resources/drivers/msedgedriver.exe");
        WebDriver edgeDriver=new EdgeDriver();
        edgeDriver.manage().window().maximize();
        edgeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return edgeDriver;
    }
}
