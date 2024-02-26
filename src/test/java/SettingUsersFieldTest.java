import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class SettingUsersFieldTest extends BaseTest {

    @BeforeTest
    void open() {
        accountSettingsUsersFieldPage.open();
    }

    @Test
    void fillTheForm() throws InterruptedException {
        accountSettingsUsersFieldPage.signUpSelect();
        accountSettingsUsersFieldPage.defaultType();
        accountSettingsUsersFieldPage.passwordSettings();
        helper.scrollToDown();
        accountSettingsUsersFieldPage.terms();
        accountSettingsUsersFieldPage.socialOptions();
        helper.scrollToDown();
        accountSettingsUsersFieldPage.singleOOn();
        accountSettingsUsersFieldPage.back();
        accountSettingsUsersFieldPage.save();
    }
}
