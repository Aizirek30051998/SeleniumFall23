package com.fall23.ui.pages;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class AccountSettingsUsersFieldPage extends BasePage {

    public AccountSettingsUsersFieldPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void open() {
        browserManager.openByNavigate("https://app.talentlms.com/login");
        driver.findElement(By.xpath("(//input[@name='domain'])[1]")).sendKeys("aizirekfall23");
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Aizirek98");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("7878@Aizi");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        driver.findElement(By.cssSelector("a[href='https://aizirekfall23.talentlms.com/account/users_index']")).click();
        driver.findElement(By.cssSelector("div[aria-label='Close']")).click();
    }

    public void signUpSelect() {
        WebElement signup = helper.waitForElementToBeClickableByFluentWait(driver,
                driver.findElement(By.cssSelector("select[name='signup']")), 20, 2);
        Select select = new Select(signup);
        List<WebElement> list = select.getOptions();
        int random = new Random().nextInt(list.size());
        select.selectByIndex(random);
    }

    public void defaultType() {
        WebElement type = helper.waitForElementToBeClickableByFluentWait(driver,
                driver.findElement(By.cssSelector("select[name='default_type']")), 20, 2);
        Select select = new Select(type);
        List<WebElement> list = select.getOptions();
        int random = new Random().nextInt(list.size());
        select.selectByIndex(random);
    }

  /*  public void defaultGroup(){
        WebElement group= helper.waitForElementToBeClickableByFluentWait(driver,
                driver.findElement(By.cssSelector("select[name='default_group']")), 20,2);
        Select select=new Select(group);
        List<WebElement>list=select.getOptions();
        int random=new Random().nextInt(list.size());
        select.selectByIndex(random);
    }*/

    public void passwordSettings() {
        helper.waitForElementToBeClickableByFluentWait(
                driver, driver.findElement(By.cssSelector("input[name='password_change_x_days']")), 20, 2).click();
        WebElement inputTxt = driver.findElement(By.cssSelector("input[name='password_change_days']"));
        inputTxt.clear();
        inputTxt.sendKeys(faker.number().digit(), Keys.TAB);
        helper.waitForElementToBeClickableByFluentWait(driver,
                driver.findElement(By.cssSelector("input[name='password_change']")), 20, 2).click();
        helper.scrollToDown();
        helper.waitForElementToBeClickableByFluentWait(driver,
                driver.findElement(By.cssSelector("input[name='lock_login_retries']")), 20, 2).click();
        WebElement input1 = driver.findElement(By.cssSelector("input[name='lock_login_retry_attempts']"));
        input1.clear();
        input1.sendKeys(faker.number().digit(), Keys.TAB);
        WebElement input2 = driver.findElement(By.cssSelector("input[name='lock_login_retry_minutes']"));
        input2.clear();
        input2.sendKeys(faker.number().digit(), Keys.TAB);

    }

    public void terms() {
        helper.waitForElementToBeClickableByFluentWait(driver,
                driver.findElement(By.cssSelector("a[id='show-license-note']")), 20, 2).click();
        WebElement text = driver.findElement(By.cssSelector("textarea[name='license_note']"));
        text.sendKeys("String", Keys.TAB);
        helper.waitForElementToBeClickableByFluentWait(driver,
                driver.findElement(By.cssSelector("a[id='show-visible-user-format']")), 20, 2).click();
        WebElement selectName = driver.findElement(By.cssSelector("select[name='user_format']"));
        Select select = new Select(selectName);
        List<WebElement> options = select.getOptions();
        int random = new Random().nextInt(options.size());
        select.selectByIndex(random);
    }

    public void socialOptions() {
        helper.waitForElementToBeClickableByFluentWait(driver,
                driver.findElement(By.cssSelector("a[id='show-social-media']")), 20, 2).click();
        List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='controls tl-outer-control-group well']/label"));
        for (int i = 0; i < checkboxes.size(); i++) {
            checkboxes.get(i).click();
        }
    }

    public void singleOOn() {
        actions.moveToElement(driver.findElement(By.cssSelector("a[id='show-sso-integration']"))).perform();
        helper.waitForElementToBeClickableByFluentWait(driver,
                driver.findElement(By.cssSelector("a[target='blank']")), 20, 2).click();
    }

    public void back(){
        Set<String> window=driver.getWindowHandles();
        String originalHandle=window.iterator().next();
        driver.switchTo().window(originalHandle);
    }

    public void save(){
        driver.findElement(By.cssSelector("input[name='submit_users']")).click();
    }
}

