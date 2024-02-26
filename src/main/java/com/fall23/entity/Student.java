package com.fall23.entity;

import lombok.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Student {

    public String firstName;
    public String lastName;
    public String email;
    public String gender;
    public int mobileNumber;
    public int dateOfBirth;
    public String subjects;
    public String hobbies;
    public String currentAddress;
    public String state;
    public String city;


    public Student getRandomGender() {
        Random random=new Random();
        int getIndex=random.nextInt();
      //  this.gender=Gender.values()[getIndex].toString();
        return this;
    }

    public Student methodForRandomMobileNumber() {

        return this;
    }

    public  Student methodForRandomDateAndBirth() {

        return this;
    }

    public  Student methodForRandomSubjects() {

        return this;
    }

    public  Student methodForRandomHobbies() {

        return this;
    }

    public  Student methodForRandomPictures() {

        return this;
    }

    public  Student methodForRandomAddress() {

        return this;
    }

    public  Student methodForRandomStateAndCity() {

        return this;
    }
}