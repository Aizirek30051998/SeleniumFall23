package com.fall23.helper;

import org.openqa.selenium.WebDriver;

public class BrowserManager {
    private WebDriver driver;

    public BrowserManager(WebDriver driver) {
        this.driver = driver;
    }
    public void openByNavigate(final String url){
        //remember the pages navigate.to
        driver.navigate().to(url);

    }
    public void openByGet(final String url){
        driver.get(url);
    }
    public void goBack(){
        driver.navigate().back();
    }
    public void goForward(){
        driver.navigate().forward();
    }
    public void refresh(){
        driver.navigate().refresh();
    }

    //todo move all methods like: frame,window
}
