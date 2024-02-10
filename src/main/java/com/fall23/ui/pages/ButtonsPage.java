package com.fall23.ui.pages;

import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.fall23.demoqa.WebDriverManager.driver;

public class ButtonsPage {
    WebDriver driver;
    Actions actions;

    public ButtonsPage(){
        driver=Driver.getDriver();
        actions=new Actions(driver);
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//button[@id='doubleClickBtn']")
    public WebElement doubleClickBtn;

    @FindBy(id="rightClickBtn")
    public WebElement rightClickBtn;

    @FindBy(xpath = "//button[text()='Click Me']")
    public WebElement clickMeBtn;

    WebElementHelper helper=new WebElementHelper();

    public ButtonsPage clickDoubleButton() throws InterruptedException {
        Thread.sleep(1000);
        actions.doubleClick(doubleClickBtn).perform();
        return this;
    }
    public ButtonsPage clickRightButton() throws InterruptedException {
        Thread.sleep(1000);
        actions.contextClick(rightClickBtn).perform();
        return this;
    }
    public ButtonsPage clickMeButton() throws InterruptedException {
        Thread.sleep(1000);
        helper.waitForButtonToBeClickAble(clickMeBtn);
        helper.click(clickMeBtn);
        return this;
    }
}
