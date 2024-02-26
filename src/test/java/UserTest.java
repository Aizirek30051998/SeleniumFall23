import com.fall23.helper.WebElementHelper;
import com.fall23.ui.pages.CertificatePage;
import com.fall23.ui.pages.UserPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {

    @BeforeTest
    void open(){

        userPage.setTheLogin();
    }
    @Test
    void fillTheForm() throws InterruptedException {
        userPage.fillFullName();
        Thread.sleep(2000);
        userPage.selectType();
        userPage.closeTarget.click();
        Thread.sleep(1000);
        userPage.selectTimeZone();
        Thread.sleep(1000);
        userPage.selectLanguage();
        helper.scrollToDown();
        userPage.checkBoxes();
       // userPage.uploadPhoto();
        helper.scrollToDown();
        userPage.addBtn();
    }
}
