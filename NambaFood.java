package com.fall23;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class NambaFood {
    WebDriver driver=new ChromeDriver();
  Faker faker=new Faker();
   // Actions actions = new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @BeforeTest
    void setDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver.get("https://nambafood.kg/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Test
    void checkRegistration() throws InterruptedException {
        if (driver != null) {
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[@id='login--button']")).click();
            Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@aria-controls='registration']")).click();

        String label = driver.findElement(By.xpath("(//label[@for='sign-email'])[1]")).getText();
        String expLabel = "Электронная почта:";
        Assert.assertEquals(label, expLabel);

        Thread.sleep(1000);
       WebElement fakeInput=driver.findElement(By.xpath("(//input[@id='sda_user_registration_form_email'])[1]"));
       String fakeEmail=faker.internet().emailAddress();
       fakeInput.sendKeys(fakeEmail);

        String actNameTxt=driver.findElement(By.xpath("(//label[@for='sign-name'])[1]")).getText();
        String expNameTxt="Имя:";
        Assert.assertEquals(actNameTxt,expNameTxt);

        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='sda_user_registration_form_firstname'])[1]")).sendKeys(faker.name().firstName());

        String actLastNameTxt=driver.findElement(By.xpath("(//label[@for='sign-surname'])[1]")).getText();
        String expLastNameTxt="Фамилия:";
        Assert.assertEquals(actLastNameTxt,expLastNameTxt);

        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='sda_user_registration_form_lastname'])[1]")).sendKeys(faker.name().lastName());

        String actPhone=driver.findElement(By.xpath("(//label[@for='sign-phone'])[1]")).getText();
        String expPhone="Телефон:";
        Assert.assertEquals(actPhone,expPhone);

        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='sda_user_registration_form_phone'])[1]")).sendKeys(faker.phoneNumber().cellPhone());

        String actPasswordTxt=driver.findElement(By.xpath("(//label[@for='sign-password'])[1]")).getText();
        String expPassword="Пароль:";
        Assert.assertEquals(actPasswordTxt,expPassword);

        Thread.sleep(1000);
            WebElement inputPass=driver.findElement(By.xpath("(//input[@id='sda_user_registration_form_plainPassword_first'])[1]"));
        String fakePassword=faker.internet().password();
        Thread.sleep(1000);
        WebElement repeatInputPass=driver.findElement(By.xpath("(//input[@id='sda_user_registration_form_plainPassword_second'])[1]"));
       inputPass.sendKeys(fakePassword);
       repeatInputPass.sendKeys(fakePassword);
        String repeatFakePassw=fakePassword;

        if(fakePassword.equals(repeatFakePassw)){
            System.out.println("Password match");
        }else{
            System.out.println("Don't match");
        }

            String actAgree=driver.findElement(By.xpath("(//label[@for='access-offer'])[1]")).getText();
            String expAgree=" Я согласен с условиями  \n" +
                    "Пользовательского соглашения \n" +
                    " и \n" +
                    "политики конфиденциальности";
            Assert.assertEquals(actAgree,expAgree);


            js.executeScript("window.scrollBy(0, 600)");

            String actBtn=driver.findElement(By.xpath("(//button[@id='_register-submit'])[1]")).getText();
            String expBtn="Зарегистрироваться";
            Assert.assertEquals(actBtn,expBtn);

            Thread.sleep(1000);
            driver.findElement(By.xpath("(//button[@id='_register-submit'])[1]")).click();

            Thread.sleep(2000);
            driver.navigate().back();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[@id='login--button']")).click();

            Thread.sleep(1000);
            String actLogName=driver.findElement(By.xpath("//a[@href='#login']")).getText();
            String expLOgName="Войти";
            Assert.assertEquals(actLogName,expLOgName);

            String actEmailLogTxt=driver.findElement(By.xpath("//label[@for='login-email']")).getText();
            String expEmailLogTxt="Ваша электронная почта:";
            Assert.assertEquals(actEmailLogTxt,expEmailLogTxt);

            Thread.sleep(1000);
            driver.findElement(By.xpath("(//input[@placeholder='Укажите вашу электронную почту'])[1]")).sendKeys(fakeEmail);

            Thread.sleep(1000);
            String actLogPassw=driver.findElement(By.xpath("//label[@for='login-password']")).getText();
            String expLogPassw="Пароль";
            Assert.assertEquals(actLogPassw,expLogPassw);

            driver.findElement(By.xpath("//input[@placeholder='Укажите ваш пароль']")).sendKeys(fakePassword);

            Thread.sleep(1000);
            driver.findElement(By.xpath("//label[@for='remember--me']")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[text()='Войти']")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys("Лагман", Keys.ENTER);

            js.executeScript("window.scrollBy(0, 600)");


            //Check tomorrow and add what need
            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[normalize-space()='Boso Lagman на Токтогула']")).click();

            Thread.sleep(1000);
            String actTitle=driver.findElement(By.xpath("//div[normalize-space()='Босо лагман']")).getText();
            String expTitle="Босо лагман";
            Assert.assertEquals(actTitle,expTitle);

            Thread.sleep(1000);
            driver.findElement(By.xpath("(//button[@class='status active bay_item'])[1]")).click();

            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@class='count']")).click();

            Thread.sleep(3000);

        }
    }
    @AfterTest
    void closeTheBrowser() throws InterruptedException {

        driver.quit();
    }
}