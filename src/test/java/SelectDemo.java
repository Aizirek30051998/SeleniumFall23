import com.fall23.helper.DropDownHelper;
import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.SelectPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDemo {
    WebDriver driver= Driver.getDriver();

    @Test
        void demo1() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://demoqa.com/select-menu");

        SelectPage selectMenuPage = new SelectPage();
        DropDownHelper dropDownHelper = new DropDownHelper();
        WebElementHelper webElementHelper = new WebElementHelper();

        dropDownHelper.seletByText(selectMenuPage.oldStyleMenu, "Green");

        List<String> list = dropDownHelper.getAllDropDownValues(selectMenuPage.oldStyleMenu);
        list.forEach(System.out::println);

        webElementHelper.sendKeysWithEnter(selectMenuPage.selectValueInput, "Pro");


    }
    @AfterTest
    void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
