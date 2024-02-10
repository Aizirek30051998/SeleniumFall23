import com.fall23.helper.BrowserManager;
import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static com.fall23.demoqa.WebDriverManager.driver;

public class BooksTest {

    WebDriver driver = Driver.getDriver();

    @Test
    void demo() throws InterruptedException {
        WebElementHelper helper = new WebElementHelper();
        BrowserManager browserManager = new BrowserManager(driver);
        browserManager.openByNavigate("https://demoqa.com/login");
        helper.sendKeys(driver.findElement(By.cssSelector("input[placeholder='UserName']")), "Aizu54")
                .sendKeys(driver.findElement(By.cssSelector("input[placeholder='Password']")), "7878@Aizu")
                .click(driver.findElement(By.cssSelector("button[id='login']")));
        Thread.sleep(1000);
        helper.scrollToDown();
        Thread.sleep(2000);
        List<WebElement> row1 = driver.findElements(By.xpath("(//div[@class='rt-tr-group'])[1]"));

        for(WebElement first:row1){
            List<WebElement>cells=first.findElements(By.cssSelector(".rt-td"));
            String title=cells.get(1).getText();
            Assert.assertEquals(title,"Git Pocket Guide");
            String author=cells.get(2).getText();
            Assert.assertEquals(author,"Richard E. Silverman");
            String publisher=cells.get(3).getText();
            Assert.assertEquals(publisher,"O'Reilly Media");
            Thread.sleep(2000);
        }
        List<WebElement>row2=driver.findElements(By.xpath("(//div[@class='rt-tr-group'])[2]"));
        for(WebElement second:row2){
            List<WebElement>cells=second.findElements(By.cssSelector(".rt-td"));
            String title1=cells.get(1).getText();
            Assert.assertEquals(title1,"Learning JavaScript Design Patterns");
            String author2=cells.get(2).getText();
            Assert.assertEquals(author2,"Addy Osmani");
            String publisher2=cells.get(3).getText();
            Assert.assertEquals(publisher2,"O'Reilly Media");
            Thread.sleep(2000);
            }
        List<WebElement>row3=driver.findElements(By.xpath("(//div[@class='rt-tr-group'])[3]"));
        for(WebElement third:row3){
            List<WebElement>cells=third.findElements(By.cssSelector(".rt-td"));
            String title1=cells.get(1).getText();
            Assert.assertEquals(title1,"Speaking JavaScript");
            String author2=cells.get(2).getText();
            Assert.assertEquals(author2,"Axel Rauschmayer");
            String publisher2=cells.get(3).getText();
            Assert.assertEquals(publisher2,"O'Reilly Media");
            Thread.sleep(2000);
        }
        List<WebElement>row4=driver.findElements(By.xpath("(//div[@class='rt-tr-group'])[4]"));
        for(WebElement forth:row4){
            List<WebElement>cells=forth.findElements(By.cssSelector(".rt-td"));
            String title1=cells.get(1).getText();
            Assert.assertEquals(title1,"You Don't Know JS");
            String author2=cells.get(2).getText();
            Assert.assertEquals(author2,"Kyle Simpson");
            String publisher2=cells.get(3).getText();
            Assert.assertEquals(publisher2,"O'Reilly Media");
            Thread.sleep(2000);
        }

        }


    }

