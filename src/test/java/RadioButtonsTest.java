import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.RadioButtonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RadioButtonsTest {

    WebDriver driver;
    RadioButtonPage radioButtonPage;

    @BeforeClass
    void setDriver() {
        driver = Driver.getDriver();
        radioButtonPage = new RadioButtonPage();

    }
    @Test
    void checkRadioButtons() throws InterruptedException {
        driver.get("https://demoqa.com/radio-button");
        radioButtonPage.clickYesButton();
        String actYesTxt=driver.findElement(By.cssSelector("p[class='mt-3']")).getText();
        Assert.assertEquals(actYesTxt,"You have selected Yes");
        radioButtonPage.clickImpressiveBtn();
        String actImpressiveTxt=driver.findElement(By.cssSelector("p[class='mt-3']")).getText();
        Assert.assertEquals(actImpressiveTxt,"You have selected Impressive");
        radioButtonPage.clickNoBtn();
    }
    @AfterTest
    void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
