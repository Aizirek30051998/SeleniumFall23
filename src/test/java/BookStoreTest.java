import com.fall23.helper.*;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.BookStorePage;
import com.fall23.ui.pages.WebTablePage;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;



public class BookStoreTest {
    WebDriver driver = Driver.getDriver();

    @Test
    void demo() throws InterruptedException {
        BrowserManager browserManager = new BrowserManager(driver);
        browserManager.openByNavigate("https://demoqa.com/login");
        BookStorePage bookStorePage = new BookStorePage();
        bookStorePage.registration();


    }

    @Test
    void demo2() throws InterruptedException {
        WebElementHelper helper = new WebElementHelper();
        BrowserManager browserManager = new BrowserManager(driver);
        BookStorePage bookStorePage = new BookStorePage();
        browserManager.openByNavigate("https://demoqa.com/login");
        bookStorePage.book1();

    }

    @Test
    void demo3() throws InterruptedException {
        BrowserManager browserManager = new BrowserManager(driver);
        AlertHelper alertHelper=new AlertHelper();
        browserManager.openByNavigate("https://demoqa.com/login");
        BookStorePage bookStorePage = new BookStorePage();
        bookStorePage.book2();
        alertHelper.alertAcceptByJs();
    }
    @Test
    void demo4() throws InterruptedException {
        BrowserManager browserManager = new BrowserManager(driver);
        AlertHelper alertHelper=new AlertHelper();
        browserManager.openByNavigate("https://demoqa.com/login");
        BookStorePage bookStorePage = new BookStorePage();
        bookStorePage.book3();
        alertHelper.alertAcceptByJs();
    }
    @Test
    void demo5() throws InterruptedException {
    BrowserManager browserManager = new BrowserManager(driver);
    AlertHelper alertHelper=new AlertHelper();
    browserManager.openByNavigate("https://demoqa.com/login");
    BookStorePage bookStorePage = new BookStorePage();
    bookStorePage.book4();
    alertHelper.alertAcceptByJs();
    }



    //todo assertions

   @AfterTest
    void close() throws InterruptedException {
       Thread.sleep(5000);
       driver.quit();
   }
   }

