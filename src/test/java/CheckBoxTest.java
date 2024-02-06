import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.CheckBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckBoxTest {

    WebDriver driver;
    CheckBoxPage checkBoxPage;

    @BeforeClass
    void setDriver(){
        driver= Driver.getDriver();
        checkBoxPage=new CheckBoxPage();
    }
    @Test
    void checkAllBoxes() throws InterruptedException {
        driver.get("https://demoqa.com/checkbox");
        checkBoxPage.clickAllElements();
        String actHomeTxt=driver.findElement(By.cssSelector("div[id='result']")).getText();
        Assert.assertEquals(actHomeTxt,"You have selected :\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile");
    }

    @AfterTest
    void closeBrows() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
