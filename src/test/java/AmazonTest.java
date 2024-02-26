import com.fall23.helper.BrowserManager;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.util.List;

import static com.fall23.demoqa.WebDriverManager.driver;

public class AmazonTest {

    @Test()
    void amazonTest1() throws InterruptedException {

        BrowserManager browserManager = new BrowserManager(Driver.getDriver());
        browserManager.openByNavigate("https://www.amazon.com/");

        Thread.sleep(5000);
        browserManager.refresh();
        Thread.sleep(10000);

        WebElement element = driver.findElement(By.xpath("input[id='nav-bb-search'] "));
        element.sendKeys("iphone", Keys.ENTER);
        List<WebElement> brandslist = driver.findElements(By.xpath("//li[starts-with(@id,'p_89')]/span/a/div/label/i"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < brandslist.size(); i++) {
                WebElement brand = brandslist.get(i);
                try {
                    js.executeScript("arguments[0].scrollIntoView(true);", brand);
                    Thread.sleep(1000);
                    brand.click();
                    Thread.sleep(2000);
                } catch (StaleElementReferenceException e) {
                    // Повторное получение списка элементов
                    brandslist = driver.findElements(By.xpath("//li[starts-with(@id,'p_89')]/span/a/div/label/i"));
                    // Обработка ошибки
                    System.out.println("Элемент устарел. Повторно получен список.");
                    // Уменьшение счетчика, чтобы обработать этот же элемент еще раз
                    i--;
                }

        }
    }
}