import com.fall23.helper.BrowserManager;
import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {
    WebDriver driver=Driver.getDriver();
    JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
    AccountSettingsUsersFieldPage accountSettingsUsersFieldPage=new AccountSettingsUsersFieldPage();
    UserPage userPage=new UserPage();
    UserTablePage userTablePage=new UserTablePage();
    CoursePage coursePage=new CoursePage();
    DropPage dropPage=new DropPage();
    DragPage dragPage=new DragPage();
    BrowserManager browserManager=new BrowserManager(Driver.getDriver());
    WebElementHelper helper=new WebElementHelper();

}
