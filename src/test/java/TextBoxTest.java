import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.TextBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
        String actFullName=driver.findElement(By.cssSelector("p[id='name']")).getText();
        Assert.assertEquals(actFullName,"Name:John Doe");
        String actEmail=driver.findElement(By.cssSelector("p[id='email']")).getText();
        Assert.assertEquals(actEmail,"Email:john@gmail.com");
        String actCurrentAddress=driver.findElement(By.cssSelector("p[id='currentAddress']")).getText();
        Assert.assertEquals(actCurrentAddress,"Current Address :Mira 123");
        String actPermanentAddress=driver.findElement(By.cssSelector("p[id='permanentAddress']")).getText();
        Assert.assertEquals(actPermanentAddress,"Permananet Address :Sovet 123");

        //TODO add the assertions

    }

    @AfterTest
    void closeBrow() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
