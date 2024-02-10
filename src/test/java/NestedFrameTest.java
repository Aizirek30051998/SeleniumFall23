import com.fall23.helper.FrameHelper;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.NestedFramePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NestedFrameTest {

    WebDriver driver;
    NestedFramePage nestedFramePage;

    @BeforeClass
    void setDriver(){
        driver= Driver.getDriver();
        nestedFramePage=new NestedFramePage();
    }
    @Test
    void checkAllFrames() throws InterruptedException {
        driver.get("https://demoqa.com/nestedframes");
        nestedFramePage.switchToParentFrame();
        String actParentFrame=driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
        Assert.assertEquals(actParentFrame,"Parent frame");
        nestedFramePage.switchToChildFrame();
        String actualChildFrame=driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
        Assert.assertEquals(actualChildFrame,"Child Iframe");

    }
    @AfterTest
    void closeBrows() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
