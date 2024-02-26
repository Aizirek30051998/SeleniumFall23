package com.fall23.ui.pages;

import com.fall23.entity.User;
import com.fall23.helper.BrowserManager;
import com.fall23.ui.drivers.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class UserPage extends BasePage {
    public UserPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(css = "div[aria-label='Close']")
    public WebElement closeTarget;

    public void setTheLogin(){
        browserManager.openByNavigate("https://app.talentlms.com/login");
        driver.findElement(By.xpath("(//input[@name='domain'])[1]")).sendKeys("aizirekfall23");
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Aizirek98");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("5555@Aizi");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
      //  driver.findElement(By.xpath("//b[text()='Administrator dashboard']")).click();
        driver.findElement(By.xpath("(//a[@href='https://aizirekfall23.talentlms.com/user/create'])[2]")).click();

    }

    public void fillFullName(){

        driver.findElement(By.cssSelector("input[name='name']")).sendKeys(faker.name().firstName());
        driver.findElement(By.cssSelector("input[name='surname']")).sendKeys(faker.name().lastName());
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys(faker.internet().emailAddress());
        driver.findElement(By.cssSelector("input[name='login']")).sendKeys(faker.name().username());
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(faker.bothify("Jack98@@"));
        driver.findElement(By.cssSelector("textarea[name='description']")).sendKeys("Hello, my name is [Your Name], and this is my autobiography, a chronicle of my journey through life's diverse chapters. Born on [Your Birthdate] in [Your Birthplace], I have embarked on a quest for self-discovery, growth, and meaningful experiences.");

    }

    public void uploadPhoto(){

        String []photos={"C:\\Users\\User\\Pictures\\orig.webp","C:\\Users\\User\\Pictures\\1577730308_49.jpg"};
        WebElement images= driver.findElement(By.cssSelector("img[src='pages/images/default_user2x.png'']"));
        List<String>list= Arrays.asList(photos);
        int randomInd=new Random().nextInt(list.size());
        images.sendKeys(list.get(randomInd));

    }

    public void selectType(){

        WebElement types= driver.findElement(By.cssSelector("select[name='acl_user_type_id']"));
        Select select=new Select(types);
        List<WebElement>list=select.getOptions();
        int random=new Random().nextInt(list.size());
        select.selectByIndex(random);

    }

    public void selectTimeZone(){

        WebElement time= driver.findElement(By.cssSelector("select[name='timezone']"));
        Select select=new Select(time);
        List<WebElement>listOfTimeZone=select.getOptions();
        int random=new Random().nextInt(listOfTimeZone.size());
        select.selectByIndex(random);

    }
    public void selectLanguage(){

        WebElement language= driver.findElement(By.cssSelector("select[name='language']"));
        Select select=new Select(language);
        List<WebElement>list=select.getOptions();
        int random=new Random().nextInt(list.size());
        select.selectByIndex(random);

    }

    public  void checkBoxes(){

        List <WebElement> list=driver.findElements(By.cssSelector("label[class='checkbox inline']"));
        int random=new Random().nextInt(list.size());
        list.get(random).click();

        }

        public void addBtn(){

        driver.findElement(By.cssSelector("input[name='submit_personal_details']")).click();

        }
    public static ArrayList<User> getUsersDatas(WebDriver driver){

        List<WebElement> lists=driver.findElements(By.cssSelector("table[id='tl-users-grid']"));

        ArrayList<User>users=new ArrayList<>();
        for(WebElement rows: lists){
            List<WebElement>row=rows.findElements(By.cssSelector("tr[role='row']"));
            String user=row.get(0).getText();
            String email=row.get(1).getText();
            String userType=row.get(2).getText();
            String registration=row.get(3).getText();
            users.add(new User(user,email,userType,registration));
        }
        return users;
    }

    }