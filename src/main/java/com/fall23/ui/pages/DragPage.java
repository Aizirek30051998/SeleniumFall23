package com.fall23.ui.pages;

import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DragPage extends BasePage{

    public DragPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void simple() throws InterruptedException {
        WebElement dragMe= driver.findElement(By.cssSelector("div[id='dragBox']"));
        Thread.sleep(1000);
        helper.scrollToDown();
        actions.clickAndHold(dragMe).moveToLocation(100,40).perform();
    }

    public void axisRestricted() throws InterruptedException {
        driver.findElement(By.cssSelector("a[id='draggableExample-tab-axisRestriction']")).click();
        WebElement onlyX= driver.findElement(By.cssSelector("div[id='restrictedX']"));
        WebElement onlyY= driver.findElement(By.cssSelector("div[id='restrictedY']"));

        actions.clickAndHold(onlyX).scrollToElement(onlyY).moveByOffset(100,20);
        Thread.sleep(2000);
        actions.clickAndHold(onlyY).moveByOffset(0,100).perform();
        Thread.sleep(1000);
        actions.clickAndHold(onlyX).moveByOffset(-200,-50).perform();

    }

    public void containerRestricted() throws InterruptedException {
        driver.findElement(By.cssSelector("a[id='draggableExample-tab-containerRestriction']")).click();
        helper.scrollToDown();
        WebElement withinTheBox= driver.findElement(By.xpath("//div[@class='draggable ui-widget-content ui-draggable ui-draggable-handle']"));

        WebElement withinParent=driver.findElement(By.xpath("//span[@class='ui-widget-header ui-draggable ui-draggable-handle']"));
        Thread.sleep(1000);
        actions.clickAndHold(withinTheBox).moveByOffset(100,50).release().perform();
        Thread.sleep(1000);
        actions.clickAndHold(withinParent).moveByOffset(50,20).release().perform();
    }

    public void cursorStyle() throws InterruptedException {
        driver.findElement(By.cssSelector("a[id='draggableExample-tab-cursorStyle']")).click();
        helper.scrollToDown();
        WebElement cursorCenter= driver.findElement(By.id("cursorCenter"));
        WebElement cursorLeftTop=driver.findElement(By.cssSelector("div[id='cursorTopLeft']"));
        WebElement cursorButtom= driver.findElement(By.id("cursorBottom"));

        actions.clickAndHold(cursorCenter).moveToElement(cursorLeftTop).release().build().perform();
        Thread.sleep(1000);
        actions.clickAndHold(cursorLeftTop).moveByOffset(-60,-180).build().perform();
        Thread.sleep(1000);
        actions.clickAndHold(cursorButtom).build().perform();

    }
}
