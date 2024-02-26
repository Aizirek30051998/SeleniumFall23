package com.fall23.ui.pages;

import com.fall23.entity.User;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UserTablePage extends BasePage {

    public UserTablePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void open() {
        browserManager.openByNavigate("https://app.talentlms.com/login");
        driver.findElement(By.xpath("(//input[@name='domain'])[1]")).sendKeys("aizirekfall23");
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Aizirek98");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("7878@Aizi");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        //  driver.findElement(By.xpath("//b[text()='Administrator dashboard']")).click();
        driver.findElement(By.xpath("(//a[@href='https://aizirekfall23.talentlms.com/user/index/gridPref:reset'])[2]")).click();

    }

    public List<User> users() {
        return List.of(

                new User("A. Nadyrbek kyzy", "aizire4ka98@gmail.com", "SuperAdmin", "13/02/2024"),
                new User("B. Harris", "dallas.rippin@gmail.com", "SuperAdmin", "9 minutes ago"),
                new User("D. Jacobi", "andera.padberg@gmail.com", "SuperAdmin", "8 minutes ago"),
                new User("H. Mraz", "alejandro.jerde@gmail.com", "SuperAdmin", "8 minutes ago")
        );
    }

    public void deleteBycheckBoxes() {
        List<WebElement> rows = driver.findElements(By.xpath("//tr[position()>1]"));
        //    List<WebElement>checkboxes=driver.findElements(By.xpath("td[class='tl-align-center tl-grid-checkbox-wrapper hidden-phone']"));
        for (int i = 0; i < rows.size(); i++) {
            actions.moveToElement(rows.get(i)).perform();
            WebElement checkboxes = rows.get(i).findElement(By.cssSelector("input[aria-checked='unchecked']"));
            checkboxes.click();
        }
        WebElement dropDown = driver.findElement(By.xpath("//a[@class='btn dropdown-toggle']"));
        dropDown.click();
        driver.findElement(By.xpath("//a[@data-mode='delete']")).click();
        driver.findElement(By.xpath("//a[@id='submit-mass-action']")).click();
    }
}


