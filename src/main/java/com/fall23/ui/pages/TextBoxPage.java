package com.fall23.ui.pages;

import com.fall23.helper.WebElementHelper;
import com.fall23.helper.WindowHelper;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TextBoxPage {

    public TextBoxPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="userName")
    public WebElement fullNameInput;

    @FindBy(id="userEmail")
    public WebElement emailInput;

    @FindBy(id="currentAddress")
    public WebElement currentInput;

    @FindBy(id="permanentAddress")
    public WebElement permanentInput;

    @FindBy(id="submit")
    public WebElement submitBtn;

    WebElementHelper webElementHelper=new WebElementHelper();
    public TextBoxPage fillUpFullName(String fullname) throws InterruptedException {
        Thread.sleep(1000);
       webElementHelper.sendKeys(fullNameInput,fullname);
       return this;
    }
    public TextBoxPage fillUpEmail(String email) throws InterruptedException {
        Thread.sleep(1000);
        webElementHelper.sendKeys(emailInput,email);
        return this;

    }
    public TextBoxPage fillUpCurrentAddress(String currentAddress) throws InterruptedException {
        Thread.sleep(1000);
        webElementHelper.sendKeys(currentInput,currentAddress);
        return this;
    }
    public TextBoxPage fillUpPermAddress(String permAddress) throws InterruptedException {
        Thread.sleep(1000);
        webElementHelper.sendKeys(permanentInput,permAddress);
        webElementHelper.scrollToDown();
        return this;
    }
    public TextBoxPage clickSubmitBtn() throws InterruptedException {
        Thread.sleep(1000);
        webElementHelper.click(submitBtn);
        return this;
    }


}



