package com.fall23.helper;

import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FrameHelper {

        private WebDriver driver;
        private WebDriverWait wait;

        public FrameHelper(WebDriver driver) {
            this.driver = driver;
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        public FrameHelper switchToFrame(WebElement element) {
            try {
                wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
            return this;
        }

        public FrameHelper switchToParentFrame(WebElement element) {
            driver.switchTo().parentFrame();
            return this;
        }

        public FrameHelper switchByIndex(int index){
            driver.switchTo().frame(index);
            return this;
        }

    }