import com.fall23.helper.BrowserManager;
import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.CertificatePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CertificateTest {
    WebDriver driver=Driver.getDriver();

@BeforeTest(description = "Open the browser, sign in to the web site, and choose the certificate field")
    void openBrowserAndLogIn() throws InterruptedException {

    BrowserManager browserManager=new BrowserManager(Driver.getDriver());
    browserManager.openByNavigate("https://app.talentlms.com/login");

    driver.findElement(By.xpath("(//input[@name='domain'])[1]")).sendKeys("aizirekfall23");
    driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Aizirek98");
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("7878@Aizi");
    driver.findElement(By.xpath("//input[@value='Log in']")).click();
    driver.findElement(By.xpath("//b[text()='Administrator dashboard']")).click();
    Thread.sleep(1000);

    driver.findElement(By.cssSelector("a[href='https://aizirekfall23.talentlms.com/account/certifications_index']")).click();

}

@Test(description = "check the select fields, preview click button," +
        " uploading the file, update button, save as new button, carousel right clicking button and template")
    void demo1() throws InterruptedException {

    WebElementHelper helper=new WebElementHelper();
    CertificatePage certificatePage=new CertificatePage();

    Thread.sleep(1000);
    certificatePage.selectCertificateRandomly();

    Thread.sleep(5000);
    certificatePage.clickPreviewCertificate();

    Thread.sleep(1000);
    helper.scrollToDown();

    assertEquals(certificatePage.previewTxt.getText(),"Preview");
    Thread.sleep(1000);
    certificatePage.closeCertificate();

    Thread.sleep(1000);
    certificatePage.uploadCertificateFile();

    Thread.sleep(8000);
    certificatePage.updateBtn();
    assertEquals(certificatePage.updateTxt.getText(),"Operation completed successfully");

    Thread.sleep(1000);
    certificatePage.saveAsNewBtn();

    assertEquals(certificatePage.nameTxt.getText(),"This value already exists for 'Name'");
    certificatePage.cancelBtn();

    Thread.sleep(1000);
    certificatePage.CaroselRigthButtons(Driver.getDriver(),7);

    Thread.sleep(1000);
    certificatePage.template();

}

@Test(description = "delete and reset buttons test")
    void demo2() throws InterruptedException {

    CertificatePage certificatePage=new CertificatePage();

    Thread.sleep(1000);
     certificatePage.reset();
     assertEquals(certificatePage.resetTxt.getText(),"Reset to default template");
     assertEquals(certificatePage.resetTxt2.getText(),"Are you sure you want to reset to default template?");
     assertEquals(certificatePage.resetTxt3.getText(),"This action cannot be undone");

     Thread.sleep(1000);
     certificatePage.deleteIMG();
     assertEquals(certificatePage.deleteTxt.getText(),"Delete certificate?");
     assertEquals(certificatePage.deleteTxt2.getText(),"Are you sure you want to delete this certificate?");
     assertEquals(certificatePage.deleteTxt3.getText(),"This action cannot be undone");
     assertEquals(certificatePage.deleteTxt4.getText(),"0 courses will be affected by this action");
     certificatePage.confirmBtn.click();

}
}
