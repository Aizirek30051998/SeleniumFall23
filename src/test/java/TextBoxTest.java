import com.fall23.helper.FrameHelper;
import com.fall23.helper.WindowHelper;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.TextBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextBoxTest {

    WebDriver driver;
    TextBoxPage textBoxPage;

    @BeforeClass
    void setUpDriver() {
        driver = Driver.getDriver();
        textBoxPage = new TextBoxPage();
    }

    @Test
    void fillUpTheFormPositiveTest() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        textBoxPage.fillUpFullName("John Doe")
                .fillUpEmail("john@gmail.com")
                .fillUpCurrentAddress("Mira 123")
                .fillUpPermAddress("Sovet 123")
                .clickSubmitBtn();
        String actFullName = driver.findElement(By.cssSelector("p[id='name']")).getText();
        Assert.assertEquals(actFullName, "Name:John Doe");
        String actEmail = driver.findElement(By.cssSelector("p[id='email']")).getText();
        Assert.assertEquals(actEmail, "Email:john@gmail.com");
        String actCurrentAddress = driver.findElement(By.cssSelector("p[id='currentAddress']")).getText();
        Assert.assertEquals(actCurrentAddress, "Current Address :Mira 123");
        String actPermanentAddress = driver.findElement(By.cssSelector("p[id='permanentAddress']")).getText();
        Assert.assertEquals(actPermanentAddress, "Permananet Address :Sovet 123");

        //TODO add the assertions

    }

    @Test
    void test213() throws InterruptedException {


        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/browser-windows");
        WebElement newTab = driver.findElement(By.id("tabButton"));
        for (int i = 0; i < 6; i++) {
            newTab.click();
            Thread.sleep(1500);
        }
        WindowHelper windowHelper = new WindowHelper();
        windowHelper.switchToParentWithChildClose();


    }
    @Test
    void frameTest(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/frames");
        FrameHelper frameHelper = new FrameHelper(driver);
        WebElement frame1Id = driver.findElement(By.id("frame1"));
        frameHelper.switchToFrame(frame1Id);
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
    }


    @AfterTest
    void closeBrow() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
