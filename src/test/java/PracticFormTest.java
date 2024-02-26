import com.fall23.helper.BrowserManager;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.PracticeForm;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PracticFormTest {

    @Test
    void demo123(){
        WebDriver driver=Driver.getDriver();
        BrowserManager browserManager=new BrowserManager(driver);
        browserManager.openByNavigate("https://demoqa.com/automation-practice-form");
        PracticeForm practiceForm=new PracticeForm();
        practiceForm.selectDateMonthYear("5 March 2015");

        Driver.closeDriver();
        Driver.getDriver();

        browserManager=new BrowserManager(driver);
        browserManager.openByNavigate("https://demoqa.com/automation-practice-form");
    }

    @Test
    void demo12(){
        WebDriver driver=Driver.getDriver();
        BrowserManager browserManager=new BrowserManager(driver);
        browserManager.openByNavigate("https://demoqa.com/automation-practice-form");
        PracticeForm practiceForm=new PracticeForm();
        practiceForm.selectDateMonthYear("5 March 2015");

        Driver.closeDriver();

        browserManager.openByNavigate("https://demoqa.com/automation-practice-form");
    }
}


