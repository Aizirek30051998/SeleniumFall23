package com.fall23.ui.pages;

import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage {

    public ButtonsPage(){
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
        helper.waitForButtonToBeClickAble(doubleClickBtn);
        helper.click(doubleClickBtn);
        return this;
    }
    public ButtonsPage clickRightButton() throws InterruptedException {
        Thread.sleep(1000);
        helper.waitForButtonToBeClickAble(rightClickBtn);
        helper.click(rightClickBtn);
        return this;
    }
    public ButtonsPage clickMeButton() throws InterruptedException {
        Thread.sleep(1000);
        helper.waitForButtonToBeClickAble(clickMeBtn);
        helper.click(clickMeBtn);
        return this;
    }
}
