package com.fall23.ui.pages;

import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage {

    public RadioButtonPage () {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(css = "label[for='yesRadio']")
    public WebElement YesBtn;

    @FindBy(css = "label[for='impressiveRadio']")
    public WebElement ImpressiveBtn;

    @FindBy(css = "label[for='noRadio']")
    public WebElement noBtn;

    WebElementHelper helper=new WebElementHelper();

    public RadioButtonPage clickYesButton() throws InterruptedException {
        Thread.sleep(1000);
        helper.click(YesBtn);
        return this;
    }
    public RadioButtonPage clickImpressiveBtn() throws InterruptedException {
        Thread.sleep(1000);
        helper.click(ImpressiveBtn);
        return this;
    }
    public RadioButtonPage clickNoBtn() throws InterruptedException {
        Thread.sleep(1000);
        helper.click(noBtn);
        return this;
    }

    }
