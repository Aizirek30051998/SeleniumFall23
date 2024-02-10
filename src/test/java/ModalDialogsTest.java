import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.ModalDialogsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ModalDialogsTest {

    WebDriver driver;
    ModalDialogsPage modalDialogsPage;

    @BeforeTest
    void setDriver(){
        driver= Driver.getDriver();
        modalDialogsPage=new ModalDialogsPage();

    }
    @Test
    void clickAllModals() throws InterruptedException {
        driver.get("https://demoqa.com/modal-dialogs");
        modalDialogsPage.clickSmallModal();
        String actualText1 = driver.findElement(By.xpath("//div [@class='modal-body']")).getText();
        Assert.assertEquals(actualText1,"This is a small modal. It has very less content");
        modalDialogsPage.clickCloseSmall();

        modalDialogsPage.clickLargeModal();
        String actualText2 = driver.findElement(By.xpath("//div [@class='modal-body']")).getText();
        Assert.assertEquals(actualText2,"Lorem Ipsum is simply dummy text of the printing and typesetting industry" +
                ". Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took" +
                " a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries," +
                " but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in " +
                "the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop " +
                "publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        modalDialogsPage.clickCloseLarge();
    }
    @AfterTest
    void closeBrowser() throws InterruptedException {
        Thread.sleep(200);
        driver.quit();
    }
}
