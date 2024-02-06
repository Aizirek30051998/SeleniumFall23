import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.ButtonsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ButtonsTest {

    WebDriver driver;
    ButtonsPage buttonsPage;

    @BeforeClass
    void setDriver(){
        driver= Driver.getDriver();
        buttonsPage=new ButtonsPage();
    }
    @Test
    void checkAllBtns() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        buttonsPage.clickDoubleButton();
        String actDoubleTxt=driver.findElement(By.id("doubleClickMessage")).getText();
        Assert.assertEquals(actDoubleTxt,"You have done a double click");
        buttonsPage.clickRightButton();
        String actRigthClickBtn=driver.findElement(By.id("rightClickMessage")).getText();
        Assert.assertEquals(actRigthClickBtn,"You have done a right click");
        buttonsPage.clickMeButton();
        String actClickMe=driver.findElement(By.id("dynamicClickMessage")).getText();
        Assert.assertEquals(actClickMe,"You have done a dynamic click");

    }
    @AfterTest
    void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
