package com.fall23.ui.pages;

import com.fall23.helper.DropDownHelper;
import com.fall23.helper.WebElementHelper;
import com.fall23.ui.drivers.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.*;

import static dev.failsafe.internal.util.Assert.state;

public class StudentPage {
    WebDriver driver;
    Faker faker = new Faker();

    public StudentPage(WebDriver driver) {
        this.driver = Driver.getDriver();

    }

    public StudentPage fillNameAndLastName() throws InterruptedException {
        driver.findElement(By.cssSelector("input[placeholder='First Name']"))
                .sendKeys(faker.name().firstName());
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='Last Name']"))
                .sendKeys(faker.name().lastName());
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[placeholder='name@example.com']"))
                .sendKeys(faker.internet().emailAddress());

        return this;
    }


    public StudentPage randomFillUpGender() throws InterruptedException {
        //  WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        List<WebElement> genderOptions = new ArrayList<>();
        genderOptions.add(driver.findElement(By.cssSelector("label[for='gender-radio-1']")));
        genderOptions.add(driver.findElement(By.cssSelector("label[for='gender-radio-2']")));
        genderOptions.add(driver.findElement(By.cssSelector("label[for='gender-radio-3']")));
        Collections.shuffle(genderOptions);
        int randomIndex = new Random().nextInt(genderOptions.size());
        genderOptions.get(randomIndex).click();
        return this;
    }

    public StudentPage randomMobileNumber() {
        driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"))
                .sendKeys(faker.phoneNumber().subscriberNumber(10));
        return this;
    //todo add random mobile number of KG
}

    public StudentPage randomDateOfBirth() throws InterruptedException {

        WebElementHelper helper = new WebElementHelper();
        helper.click(driver.findElement(By.id("dateOfBirthInput")));
        Thread.sleep(2000);
        randomYear();
        Thread.sleep(1000);
        randomMonth();
        Thread.sleep(1000);
        randomDay();

        return this;
    }

    public void randomDay() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        List<WebElement> dayDrop = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div.react-datepicker__day")));
        int randomIndex = new Random().nextInt(dayDrop.size());
        dayDrop.get(randomIndex).click();

    }

    public void randomMonth() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        WebElement monthDrop = wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("select.react-datepicker__month-select"))));
        Select select = new Select(monthDrop);
        List<WebElement> month = select.getOptions();
        int randomIndMonth = new Random().nextInt(month.size());
        select.selectByIndex(randomIndMonth);
    }

    public void randomYear() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(25));
        WebElement yearDrop = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select.react-datepicker__year-select")));
        Select select2 = new Select(yearDrop);
        List<WebElement> years = select2.getOptions();
        int randomYears = new Random().nextInt(years.size());
        select2.selectByIndex(randomYears);
    }

    public void randomSubjects() throws InterruptedException {
        WebElement subjectInput = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
        String[] arraysOfSubjects = {"Ch", "Comm", "Ma", "Comp", "Ph", "Eng", "Ar"};
        List<String> randomSubjects = Arrays.asList(arraysOfSubjects);
        for (int i = 0; i < 5; i++) {
            int random = new Random().nextInt(randomSubjects.size());
            String selectSub = randomSubjects.get(random);
            subjectInput.sendKeys(selectSub);
            subjectInput.sendKeys(Keys.TAB);

        }
    }

    public StudentPage selectRandomHobbies() {
        List<WebElement> hobbiesOptions = new ArrayList<>();
        hobbiesOptions.add(driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")));
        hobbiesOptions.add(driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")));
        hobbiesOptions.add(driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")));
        Collections.shuffle(hobbiesOptions);
        for (int i = 0; i < 3; i++) {
            int randomInd = new Random().nextInt(hobbiesOptions.size());
            hobbiesOptions.get(randomInd).click();
        }
        return this;
    }

    public void randomUploadPicture(){
        String []pics={"C:\\Users\\User\\Pictures\\1577730308_49.jpg","C:\\Users\\User\\Pictures\\orig.webp","C:\\Users\\User\\Pictures\\1000x745_0xac120003_13731165161562663600.jpg"};
        WebElement picture= driver.findElement(By.cssSelector("input[id='uploadPicture']"));
        int randomPic=new Random().nextInt(pics.length);
        picture.sendKeys(new File(pics[randomPic]).getAbsolutePath());

    }
    public void randomCurrentAddress(){
        String []addresses={"Isanova 42","Bokonbaeva 7","Pravda 45","Asanbay 12"};
        WebElement addressInput= driver.findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        int randomIndex=new Random().nextInt(addresses.length);
        addressInput.sendKeys(addresses [randomIndex]);
    }

    public void randomStateAndCity() throws InterruptedException {
        Thread.sleep(1000);
        WebElement state=driver.findElement(By.id("react-select-3-input"));
        WebElement city= driver.findElement(By.id("react-select-4-input"));
        Map<String, List<String>> statesAndCities = new HashMap<>();
        statesAndCities.put("NCR", Arrays.asList("Delhi", "Gurgaon", "Noida"));
        statesAndCities.put("Raj", Arrays.asList("Jaipur", "Jaisalmer"));
        statesAndCities.put("Utt", Arrays.asList("Agra", "Lucknow", "Meerut"));
        statesAndCities.put("Har", Arrays.asList("Karnal", "Panipat"));
        List<String> states=Arrays.asList("NCR","Raj","Utt","Har");
        int randomInd=new Random().nextInt(states.size());
        String stateRan = states.get(randomInd);

        List<String>cities=statesAndCities.get(stateRan);
        String cityRan = cities.get(faker.random().nextInt(cities.size()));

        state.sendKeys(stateRan);
        state.sendKeys(Keys.TAB);
        city.sendKeys(cityRan);
        city.sendKeys(Keys.TAB);

    }

    public void submitBtn(){
        driver.findElement(By.xpath("//button[@id='submit']")).click();
    }

    }
