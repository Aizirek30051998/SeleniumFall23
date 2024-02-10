package com.fall23.ui.pages;

import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage {

    public SelectPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="oldSelectMenu")
    public WebElement oldStyleMenu;

    @FindBy(id = "react-select-3-input")
    public WebElement selectValueInput;

}
