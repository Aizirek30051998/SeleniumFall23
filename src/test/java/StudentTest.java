import com.fall23.entity.Student;
import com.fall23.helper.BrowserManager;
import com.fall23.helper.DropDownHelper;
import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.StudentPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class StudentTest {


    @BeforeTest
    void setDriver(){
        BrowserManager browserManager=new BrowserManager(Driver.getDriver());
        browserManager.openByNavigate("https://demoqa.com/automation-practice-form");

    }

    @Test
    void fillUpTheFrom() throws InterruptedException {
        WebElementHelper helper=new WebElementHelper();
        DropDownHelper dropDownHelper=new DropDownHelper();
        StudentPage studentPage=new StudentPage(Driver.getDriver());
        studentPage.fillNameAndLastName();
        Thread.sleep(1000);
        studentPage.randomFillUpGender();
        Thread.sleep(1000);
        studentPage.randomMobileNumber();
       // studentPage.randomMobilePhoneOfKG();
        helper.scrollToDown();
        Thread.sleep(1000);
        studentPage.randomDateOfBirth();
        Thread.sleep(1000);
        studentPage.randomSubjects();
        Thread.sleep(1000);
        studentPage.selectRandomHobbies();
        Thread.sleep(1000);
        studentPage.randomUploadPicture();
       // helper.scrollToDown();
        Thread.sleep(1000);
        studentPage.randomCurrentAddress();
        Thread.sleep(1000);
        studentPage.randomStateAndCity();
        Thread.sleep(1000);
        studentPage.submitBtn();
    }
}
