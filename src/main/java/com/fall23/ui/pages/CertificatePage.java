package com.fall23.ui.pages;

import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.util.List;
import java.util.Random;

public class CertificatePage {
    WebDriver driver;

    public CertificatePage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h3[text()='Preview']")
    public WebElement previewTxt;

    @FindBy(css = "div[id='certificate-name-message']")
    public WebElement nameTxt;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement updateTxt;

    @FindBy(xpath = "(//h3[text()='Delete certificate?'])[2]")
    public WebElement deleteTxt;

    @FindBy(xpath = "//p[text()='Are you sure you want to delete this certificate?']")
    public WebElement deleteTxt2;

    @FindBy(xpath = "//p[text()='This action cannot be undone']")
    public WebElement deleteTxt3;

    @FindBy(xpath = "//p[text()='0 courses will be affected by this action']")
    public WebElement deleteTxt4;

    @FindBy(xpath = "(//h3[text()='Reset to default template'])[2]")
    public WebElement resetTxt;

    @FindBy(xpath = "//p[text()='Are you sure you want to reset to default template?']")
    public WebElement resetTxt2;

    @FindBy(xpath = "//p[text()='This action cannot be undone']")
    public WebElement resetTxt3;

    @FindBy(css = "a[id='tl-confirm-submit']")
    public WebElement confirmBtn;


    public void selectCertificateRandomly() throws InterruptedException {

        WebElement certificateDrop = driver.findElement(By.cssSelector("select[id='select-certificate']"));
        Select select = new Select(certificateDrop);
        List<WebElement> listOptions = select.getOptions();
        int randomIndex = new Random().nextInt(listOptions.size());
        select.selectByIndex(randomIndex);

    }

    public void clickPreviewCertificate() throws InterruptedException {

        driver.findElement(By.xpath("//span[@style='font-weight: lighter; color: #FFF; font-size: 25px;']/..")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[id='preview-button']")).click();
        Thread.sleep(10000);

    }

    public void closeCertificate() {

        driver.findElement(By.xpath("(//a[@data-dismiss='modal'])[1]")).click();

    }

    public void uploadCertificateFile() throws InterruptedException {

        String[] files = {"C:\\Users\\User\\Pictures\\orig.webp", "C:\\Users\\User\\Pictures\\1577730308_49.jpg"};
        Thread.sleep(1000);
        WebElement file = driver.findElement(By.cssSelector("input[name='custom_background']"));
        int randomFile = new Random().nextInt(files.length);
        file.sendKeys(new File(files[randomFile]).getAbsolutePath());

    }

    public void saveAsNewBtn() throws InterruptedException {

        driver.findElement(By.cssSelector("input[value='Save as new']")).click();
        Thread.sleep(1000);
        WebElement name = driver.findElement(By.cssSelector("input[id='certificate_name']"));
        name.sendKeys("Gothica");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Save']")).click();
        Thread.sleep(2000);

    }
    public void cancelBtn(){

        driver.findElement(By.xpath("(//a[text()='Cancel'])[2]")).click();

    }

    public void updateBtn() {

        driver.findElement(By.cssSelector("input[name='update']")).click();

    }

    public void deleteIMG() {

        driver.findElement(By.cssSelector("a[id='delete-button']")).click();

    }

    public void reset(){

        driver.findElement(By.cssSelector("a[id='reset-certification-button']")).click();

}

    public void CaroselRigthButtons(WebDriver driver,int num) throws InterruptedException {

        for(int i=0;i<num;i++){
            Thread.sleep(1000);
            WebElement clickCarosel=driver.findElement(By.xpath("//a[@id='backgrounds-carousel-next']"));
            clickCarosel.click();

        }

    }

    public void template() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='#tab2']")).click();
        Thread.sleep(1000);
        driver.navigate().back();

    }
}
