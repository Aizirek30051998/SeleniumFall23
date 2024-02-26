package com.fall23.ui.pages;
import com.fall23.helper.BrowserManager;
import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static org.apache.commons.lang3.StringUtils.split;

public class CoursePage extends BasePage {

    public CoursePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div[aria-label='Close']")
    public WebElement closeTarget;

    @FindBy(css = "a[id='show-time-options']")
    public WebElement clickDate;
    @FindBy(id="start-date")
    public WebElement clickInput;
    @FindBy(id = "expiration-date")
    public WebElement clickInputEndDate;
    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement submit;


    public void open() {

        BrowserManager browserManager = new BrowserManager(Driver.getDriver());
        browserManager.openByNavigate("https://app.talentlms.com/login");
        driver.findElement(By.xpath("(//input[@name='domain'])[1]")).sendKeys("aizirekfall23");
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Aizirek98");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("7878@Aizi");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        //   driver.findElement(By.xpath("//b[text()='Administrator dashboard']")).click();
        driver.findElement(By.xpath("(//a[@href='https://aizirekfall23.talentlms.com/course/create'])[2]")).click();

    }

    public void course() {

        driver.findElement(By.cssSelector("input[placeholder='e.g. Introduction to Accounting']")).sendKeys(faker.educator().course());

    }

    public void categorySelect() {

        String[] categories = {"IT", "Accountant", "Language", "History"};
        WebElement category = driver.findElement(By.xpath("(//input[@class='select2-focusser select2-offscreen'])[1]"));
        List<String> listOfCategories = Arrays.asList(categories);
        int random = new Random().nextInt(listOfCategories.size());
        category.sendKeys(listOfCategories.get(random), Keys.TAB);

    }

    public void descriptionCourse() {

        driver.findElement(By.cssSelector("textarea[name='description']")).sendKeys("This course serves as an introduction to the exciting field of data science, equipping participants with fundamental concepts, tools, and skills necessary to analyze and derive insights from data. The course covers a wide range of topics, from data acquisition and cleaning to exploratory data analysis and basic machine learning.");

    }

    public void courseCode() {

        driver.findElement(By.cssSelector("a[id='show-coursecode']")).click();
        driver.findElement(By.cssSelector("input[name='course_code']")).sendKeys(faker.number().digits(5), Keys.TAB);

    }

    public void price() {

        driver.findElement(By.cssSelector("a[id='show-price']")).click();
        driver.findElement(By.cssSelector("input[name='price']")).sendKeys(faker.number().digits(4), Keys.TAB);

    }

    public void introVideo() {

        //use youtube
        driver.findElement(By.cssSelector("a[id='show-intro-video-url']")).click();
        WebElement element = driver.findElement(By.cssSelector("input[name='intro_video_url']"));
        String[] links = {"https://youtu.be/GpCz-o45nD8?si=LHSVzZbw3B7e79zZ", "https://youtu.be/FP8kbwMqtvk?si=79ZSMqQ8Qlc5mQvO", "https://youtu.be/KOEfDvr4DcQ?si=HnbCHB6sItNxZALl"};
        List<String> stringList = Arrays.asList(links);
        int random = new Random().nextInt(stringList.size());
        element.sendKeys(stringList.get(random), Keys.TAB);

        //use video
        driver.findElement(By.cssSelector("a[data-intro-category='file']")).click();
        String[] videos = {"C:\\Users\\User\\Videos\\Recording (07.10.2023 12-14-27)\\Recording (07.10.2023 12-14-27).screenrec", "C:\\Users\\User\\Videos\\Recording (07.10.2023 12-17-34)\\Recording (07.10.2023 12-17-34).screenrec"};
        WebElement video = driver.findElement(By.xpath("(//a[@class='tl-tool-tip inputbtn'])[3]"));
        List<String> lists = Arrays.asList(videos);
        int random1 = new Random().nextInt(lists.size());
        video.sendKeys(lists.get(random1), Keys.TAB);

    }

    public void capacity() {

        driver.findElement(By.cssSelector("a[id='show-capacity']")).click();
        driver.findElement(By.cssSelector("input[name='capacity']")).sendKeys(faker.number().digit(), Keys.TAB);


    }

    public void startDate() throws InterruptedException {

        helper.click(clickInput);

        WebElement day= helper.waitForElementToBeClickableByFluentWait(driver,driver.findElement(By.xpath("(//td[text()='22'])[1]")),10,2);
        day.click();

    }

    public void endDate() {
        helper.scrollToDown();
            WebElement dayEnd = helper.waitForElementToBeClickableByFluentWait(driver, driver.findElement(By.xpath("(//td[text()='29'])[4]")), 20, 2);
            dayEnd.click();
            driver.findElement(By.cssSelector("input[name='expiration_time']")).click();
            }

    public void certification() {
        driver.findElement(By.cssSelector("a[id='show-certification']")).click();
        WebElement certificate= helper.waitForElementToBeClickableByFluentWait(driver, driver.findElement(By.cssSelector("select[name='certification_id']")),10,2 );
        Select select=new Select(certificate);
        List<WebElement> selectCertificate=select.getOptions();
        int rando=random.nextInt(selectCertificate.size());
        select.selectByIndex(rando);

        WebElement type= wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("select[name='certification_duration_type']"))));
        Select select1=new Select(type);
        List<WebElement>selectType=select1.getOptions();
        int random=new Random().nextInt(selectType.size());
        select1.selectByIndex(random);
    }

    public void level(){
        driver.findElement(By.cssSelector("a[id='show-level']")).click();
        WebElement level=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("select[name='level']"))));
        Select select=new Select(level);
        List<WebElement>listOfLevels=select.getOptions();
        int random=new Random().nextInt(listOfLevels.size());
        select.selectByIndex(random);
    }
}
