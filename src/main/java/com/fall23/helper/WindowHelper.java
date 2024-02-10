package com.fall23.helper;

import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.Set;

import static com.fall23.demoqa.WebDriverManager.driver;

public class WindowHelper {
    public Set<String> getWindowHandles() {
        return Driver.getDriver().getWindowHandles();
    }

    public void switchToWindow(int index) {
        LinkedList<String> windowsId = new LinkedList<>(
                getWindowHandles()
        );
        if (index < 0 || index > windowsId.size()) {
            throw new IllegalArgumentException("You provide wrong Index " + index);
        }
        Driver.getDriver().switchTo().window(windowsId.get(index));
    }

    public void switchToParent() {
        LinkedList<String> windowsId = new LinkedList<>(
                getWindowHandles()
        );
        Driver.getDriver().switchTo().window(windowsId.get(0));
    }

    public void switchToParentWithChildClose() {
        switchToParent();

        LinkedList<String> windowsId = new LinkedList<>(
                getWindowHandles()
        );

        for (int i = 1; i < windowsId.size(); i++) {
            Driver.getDriver().switchTo().window(windowsId.get(i));
            Driver.getDriver().close();
        }
        switchToParent();
    }

    public WindowHelper switchToPage(String url) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('', '_blank');");
        String currentWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }

        }
        return this;
    }
}



