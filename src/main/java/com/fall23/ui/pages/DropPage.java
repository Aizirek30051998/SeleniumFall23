package com.fall23.ui.pages;

import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DropPage extends BasePage {

    public DropPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void simpleDrop(){
        WebElement dragMe= driver.findElement(By.cssSelector("div[id='draggable']"));
        WebElement dropHere=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
        actions.dragAndDrop(dragMe,dropHere).perform();

    }

    public void acceptDrop() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[id='droppableExample-tab-accept']")).click();
        WebElement acceptable= driver.findElement(By.cssSelector("div[id='acceptable']"));
        WebElement notAcceptable= driver.findElement(By.cssSelector("div[id='notAcceptable']"));
        WebElement dropHere= driver.findElement(By.xpath("(//div[@id='droppable'])[2]"));

        Thread.sleep(1000);
        actions.dragAndDrop(acceptable,dropHere).build().perform();
        Thread.sleep(1000);

        int xOffset=-200;
        int yOffset=-40;
        actions.dragAndDropBy(acceptable,xOffset,yOffset).build().perform();

        Thread.sleep(1000);
        actions.dragAndDrop(notAcceptable,dropHere).build().perform();
        Thread.sleep(1000);

        int xOffset2=-200;
        int yOffset2=-5;
        actions.dragAndDropBy(notAcceptable,xOffset2,yOffset2).build().perform();

    }

    public void preventPropogationDrop() throws InterruptedException {
        driver.findElement(By.cssSelector("a[id='droppableExample-tab-preventPropogation']")).click();
        Thread.sleep(1000);
        WebElement dragMe= driver.findElement(By.cssSelector("div[id='dragBox']"));
        WebElement innerDrop=driver.findElement(By.cssSelector("div[id='notGreedyInnerDropBox']"));
        WebElement innerDrop2=driver.findElement(By.cssSelector("div[id='greedyDropBoxInner']"));
        actions.dragAndDrop(dragMe,innerDrop).build().perform();
        int xOffset=-200;
        int yOffset=-5;
        Thread.sleep(1000);
        actions.dragAndDropBy(dragMe,xOffset,yOffset).build().perform();
        Thread.sleep(1000);
        actions.dragAndDrop(dragMe,innerDrop2).perform();
        int xOffset2=-200;
        int yOffset2=-40;
        Thread.sleep(2000);
        helper.scrollToDown();
        actions.dragAndDropBy(dragMe,xOffset2,yOffset2).perform();
        Thread.sleep(1000);

    }

    public void revertDraggableDrop() throws InterruptedException {
        driver.findElement(By.cssSelector("a[id='droppableExample-tab-revertable']")).click();
        WebElement drop= driver.findElement(By.xpath("(//div[@id='droppable'])[3]"));
        WebElement willRevert= driver.findElement(By.cssSelector("div[id='revertable']"));
        WebElement notRevert= driver.findElement(By.id("notRevertable"));
        Thread.sleep(1000);
        actions.dragAndDrop(willRevert,drop).perform();
        Thread.sleep(1000);
        actions.dragAndDrop(notRevert,drop).perform();
    }
}
