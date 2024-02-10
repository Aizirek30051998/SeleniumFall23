package com.fall23.ui.pages;

import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalDialogsPage {

    public ModalDialogsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
       @FindBy(id="showLargeModal")
        public WebElement largeModal;

        @FindBy(id="showSmallModal")
        public WebElement smallModal;

        @FindBy(id="closeSmallModal")
        public WebElement closeClickSmall;

        @FindBy(id="closeLargeModal")
        public WebElement closeClickLarge;

        WebElementHelper helper=new WebElementHelper();

        public ModalDialogsPage clickSmallModal() throws InterruptedException {
            Thread.sleep(1000);
            helper.click(smallModal);
            return this;
        }
        public ModalDialogsPage clickCloseSmall() throws InterruptedException {
            Thread.sleep(1000);
    helper.click(closeClickSmall);
            return this;
    }
    public  ModalDialogsPage clickLargeModal() throws InterruptedException {
        Thread.sleep(1000);
        helper.click(largeModal);
        return this;
    }
    public ModalDialogsPage clickCloseLarge() throws InterruptedException {
            Thread.sleep(1000);
            helper.click(closeClickLarge);
            return this;
    }
}
