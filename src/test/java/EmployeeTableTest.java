import com.fall23.data.JavaFaker;
import com.fall23.entity.Employee;
import com.fall23.ui.drivers.Driver;
import com.fall23.ui.pages.WebTablePage;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.List;

import static com.fall23.demoqa.WebDriverManager.driver;
import static com.fall23.entity.Employee.getEmployeesFromTable;

public class EmployeeTableTest {

    @Feature("Demoqa webTable") //ok
    @AllureId("123") // no
    @Description("Verify all employee data in webTable") //ok
    @Flaky // depends on functionality
    @Issue("Can not save the data") // no
    @Link("https://www.amazon.com/") // no
    @Owner("Aidanek") // ok
    @Severity(SeverityLevel.CRITICAL) // ok
    @Story("TL-011") // ok
    @TmsLink("")  // no
    @Tag("Smoke") // ok

    @Test
    void test123(){
        WebDriver driver= Driver.getDriver();
        driver.get("https://demoqa.com/webtables");
         Employee randomEmployee = JavaFaker.createNewEmployeeWithFakeData();
         WebTablePage webTablePage = new WebTablePage(driver);
         webTablePage.fillUpTheForm(randomEmployee);
         List<Employee> employees = getEmployeesFromTable(driver);
         employees.forEach(System.out::println);

            // TODO verify all employees data
        }

      /*  //1 method for get total salary we use stream().mapToInt().sum()
        int totalSalaryAmount=employees.stream()
                .mapToInt(Employee::getSalary).sum();
        //the second method
        int total = 0;
        for (Employee employee: employees){
            total+= employee.getSalary();
        }
        System.out.println(totalSalaryAmount);
        System.out.println(total); */
    }

