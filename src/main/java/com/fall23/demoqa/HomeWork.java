package com.fall23.demoqa;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork extends BaseTest {

    @Test
    void checkBoxes() throws InterruptedException {
        WebDriverManager.openTheSite("https://demoqa.com/checkbox");

        String actTxtHome=driver.findElement(By.xpath("(//span[@class='rct-title'])[1]")).getText();
        String expTxtHome="Home";
        Assert.assertEquals(actTxtHome,expTxtHome);

        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[@aria-label='Toggle'])[1]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Home']")).click();

        String actDesktopTxt= WebElementManager.findByXpath("//span[text()='Desktop']").getText();
        String expDesktopTxt="Desktop";
        Assert.assertEquals(actDesktopTxt,expDesktopTxt);

        Thread.sleep(1000);
        driver.findElement(By.xpath(("(//button[@aria-label='Toggle'])[2]"))).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Desktop']")).click();

        String actNotesTxt= WebElementManager.findByXpath("//span[text()='Notes']").getText();
        String expNotesTxt="Notes";
        Assert.assertEquals(actNotesTxt,expNotesTxt);

        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Notes']")).click();

        String actCommandsTxt= driver.findElement(By.xpath("//span[text()='Commands']")).getText();
        String expCommandsTxt="Commands";
        Assert.assertEquals(actCommandsTxt,expCommandsTxt);

        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Commands']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[@aria-label='Toggle'])[3]")).click();

        String actDocumentsTxt= WebElementManager.findByXpath("//span[text()='Documents']").getText();
        Assert.assertEquals(actDocumentsTxt,"Documents");

        Thread.sleep(1000);
        WebElementManager.findByXpath("//span[text()='Documents']").click();

        Thread.sleep(1000);
        WebElementManager.findByXpath("(//button[@aria-label='Toggle'])[4]").click();

        String actWorkSpaceTxt= WebElementManager.findByXpath("//span[text()='WorkSpace']").getText();
        Assert.assertEquals(actWorkSpaceTxt,"WorkSpace");

        Thread.sleep(1000);
        WebElementManager.findByXpath("//span[text()='WorkSpace']").click();

        String  actReactTxt= WebElementManager.findByXpath("//span[text()='React']").getText();
        Assert.assertEquals(actReactTxt,"React");

        Thread.sleep(1000);
        WebElementManager.findByXpath("//span[text()='React']").click();

        String actAngular= WebElementManager.findByXpath("//span[text()='Angular']").getText();
        Assert.assertEquals(actAngular,"Angular");


        Thread.sleep(1000);
        WebElementManager.findByXpath("//span[text()='Angular']").click();

        String actVeuTxt= WebElementManager.findByXpath("//span[text()='Veu']").getText();
        Assert.assertEquals(actVeuTxt,"Veu");

        Thread.sleep(1000);
        WebElementManager.findByXpath("//span[text()='Veu']").click();

        Thread.sleep(1000);
        WebElementManager.findByXpath("(//button[@aria-label='Toggle'])[5]").click();

        String actOfficeTxt= WebElementManager.findByXpath("//span[text()='Office']").getText();
        Assert.assertEquals(actOfficeTxt,"Office");

        Thread.sleep(1000);
        WebElementManager.findByXpath("//span[text()='Office']").click();

        WebElementManager.scrollBy400();

        String actPublicTxt= WebElementManager.findByXpath("//span[text()='Public']").getText();
        Assert.assertEquals(actPublicTxt,"Public");

        Thread.sleep(1000);
        WebElementManager.findByXpath("//span[text()='Public']").click();

        String actPrivateTxt= WebElementManager.findByXpath("//span[text()='Private']").getText();
        Assert.assertEquals(actPrivateTxt,"Private");

        Thread.sleep(1000);
        WebElementManager.findByXpath("//span[text()='Private']").click();

        String actClassifiedTxt= WebElementManager.findByXpath("//span[text()='Classified']").getText();
        Assert.assertEquals(actClassifiedTxt,"Classified");

        Thread.sleep(1000);
        WebElementManager.findByXpath("//span[text()='Classified']").click();

        String actGeneralTxt= WebElementManager.findByXpath("//span[text()='General']").getText();
        Assert.assertEquals(actGeneralTxt,"General");

        Thread.sleep(1000);
        WebElementManager.findByXpath("//span[text()='General']").click();

        String actDownloadsTxt= WebElementManager.findByXpath("//span[text()='Downloads']").getText();
        Assert.assertEquals(actDownloadsTxt,"Downloads");

        Thread.sleep(1000);
        WebElementManager.findByXpath("(//button[@aria-label='Toggle'])[6]").click();

        Thread.sleep(1000);
        WebElementManager.findByXpath("//span[text()='Downloads']").click();

        String actWordFileTxt= WebElementManager.findByXpath("//span[text()='Word File.doc']").getText();
        Assert.assertEquals(actWordFileTxt,"Word File.doc");

        Thread.sleep(1000);
        WebElementManager.findByXpath("//span[text()='Word File.doc']").click();

        String actExcelFileTxt= WebElementManager.findByXpath("//span[text()='Excel File.doc']").getText();
        Assert.assertEquals(actExcelFileTxt,"Excel File.doc");

        Thread.sleep(1000);
        WebElementManager.findByXpath("//span[text()='Excel File.doc']").click();

        Thread.sleep(1000);
        WebElementManager.findByXpath("(//button[@aria-label='Toggle'])[6]").click();


        Thread.sleep(1000);
        WebElementManager.findByXpath("(//button[@aria-label='Toggle'])[3]").click();

        Thread.sleep(1000);
        WebElementManager.findByXpath("(//button[@aria-label='Toggle'])[2]").click();

        Thread.sleep(1000);
        WebElementManager.findByXpath("(//button[@aria-label='Toggle'])[1]").click();

        String actRadioBtn= WebElementManager.findByXpath("//span[text()='Radio Button']").getText();
        Assert.assertEquals(actRadioBtn,"Radio Button");

        Thread.sleep(1000);
        WebElementManager.findByXpath("//span[text()='Radio Button']").click();

        String actDoYouLikeTxt= WebElementManager.findByXpath("//div[@class='mb-3']").getText();
        Assert.assertEquals(actDoYouLikeTxt,"Do you like the site?");

        String actYesBtn= WebElementManager.findByCss("label[for='yesRadio']").getText();
        Assert.assertEquals(actYesBtn,"Yes");
        Thread.sleep(1000);
        WebElementManager.findByCss("label[for='yesRadio']").click();

        Thread.sleep(3000);
    }
}
