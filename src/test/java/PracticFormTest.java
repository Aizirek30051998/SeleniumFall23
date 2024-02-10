import com.fall23.helper.BrowserManager;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.PracticeForm;
import org.testng.annotations.Test;

public class PracticFormTest {

    @Test
    void demo123(){
        BrowserManager browserManager=new BrowserManager(Driver.getDriver());
        browserManager.openByNavigate("https://demoqa.com/automation-practice-form");
        PracticeForm practiceForm=new PracticeForm();
        practiceForm.selectDateMonthYear("5 March 2015");
    }
}
