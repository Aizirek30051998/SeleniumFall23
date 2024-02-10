package com.fall23.helper;

import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {

    private WebDriver driver;

    public Alert getAlert() {

        return driver.switchTo().alert();
    }

    public void acceptAlert() {
        new WebDriverWait((Driver.getDriver()), Duration.ofSeconds(7)).until(ExpectedConditions.alertIsPresent());
        if (!isAlertPresent()) {
            return;
        }
        getAlert().accept();
    }

    public AlertHelper dismissAlert() {
        new WebDriverWait((Driver.getDriver()), Duration.ofSeconds(7)).until(ExpectedConditions.alertIsPresent());
        getAlert().dismiss();
        return this;
    }

    public AlertHelper sendKeys(String txt) {
        getAlert().sendKeys(txt);
        return this;
    }

    public boolean isAlertPresent() {
        try {
            Driver.getDriver().switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
            return false;
        }
    }

    public AlertHelper alertAcceptByJs() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("alert('Book added to your collection.');");
        Driver.getDriver().switchTo().alert().accept();
        return this;
    }


}