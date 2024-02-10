package com.fall23.ui.pages;

import com.fall23.helper.FrameHelper;
import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NestedFramePage {

    public NestedFramePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "iframe[id='frame1']")
    public WebElement parentFrameBox;

    @FindBy(xpath = "//iframe[@srcdoc='<p>Child Iframe</p>']")
    public WebElement childFrameBox;

    WebElementHelper helper=new WebElementHelper();
    FrameHelper frameHelper=new FrameHelper(Driver.getDriver());
    public NestedFramePage switchToParentFrame() throws InterruptedException {
        Thread.sleep(1000);
        helper.scrollToDown();
        frameHelper.switchToFrame(parentFrameBox);
        return this;
}
    public NestedFramePage switchToChildFrame() throws InterruptedException {
        Thread.sleep(1000);
        frameHelper.switchToFrame(childFrameBox);
        return this;
    }

}
