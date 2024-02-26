package com.fall23.ui.pages;

import com.fall23.helper.BrowserManager;
import com.fall23.helper.DropDownHelper;
import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public abstract class BasePage {
    WebDriver driver=Driver.getDriver();
    Faker faker=new Faker();
    WebElementHelper helper=new WebElementHelper();
    DropDownHelper dropDownHelper=new DropDownHelper();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
    Random random=new Random();
    Actions actions=new Actions(Driver.getDriver());
    BrowserManager browserManager=new BrowserManager(Driver.getDriver());


}
