import com.fall23.entity.User;
import com.fall23.listener.Screenshot;
import com.fall23.ui.drivers.Driver;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.util.List;

import static com.fall23.ui.pages.UserPage.getUsersDatas;

@Listeners(Screenshot.class)
public class UserTableTest extends BaseTest {

            @Test
            void form() throws InterruptedException, FileNotFoundException {
                userTablePage.open();
             //  List<User> users = getUsersDatas(Driver.getDriver());
             //  users.forEach(System.out::println);

                List<User>actualUsers=userTablePage.users();
                List<User>expectedUsers=List.of(
                        new User("A. Nadyrbek kyzy","aizire4ka98@gmail.com","SuperAdmin","13/02/2024"),
                        new User("B. Harris","dallas.rippin@gmail.com","SuperAdmin","9 minutes ago"),
                        new User("D. Jacobi","andera.padberg@gmail.com","SuperAdmin","8 minutes ago"),
                        new User("H. Mraz","alejandro.jerde@gmail.com","SuperAdmin","8 minutes ago")
                );
      //  Assert.assertEquals(actualUsers,expectedUsers,"Don't match");
                userTablePage.deleteBycheckBoxes();

    }

    @AfterTest
    void close() throws InterruptedException {

      //  Driver.getDriver().quit();
    }
}