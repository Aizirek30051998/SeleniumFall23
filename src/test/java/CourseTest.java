import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.BasePage;
import com.fall23.ui.pages.CertificatePage;
import com.fall23.ui.pages.CoursePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CourseTest extends BaseTest {

    @BeforeTest
    void setUp(){

        coursePage.open();

    }

    @Test
    void fill() throws InterruptedException {

        coursePage.course();
        coursePage.categorySelect();
        coursePage.descriptionCourse();
        coursePage.closeTarget.click();
        coursePage.courseCode();
        coursePage.price();
        helper.scrollToDown();
        coursePage.introVideo();
        coursePage.capacity();
        helper.scrollToDown();
        coursePage.clickDate.click();
        coursePage.startDate();
        coursePage.clickInputEndDate.click();
        coursePage.endDate();
        coursePage.certification();
        helper.scrollToDown();
        coursePage.level();
        coursePage.submit.click();
        helper.scrollToDown();

    }
}
