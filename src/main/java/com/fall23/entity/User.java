package com.fall23.entity;

import com.fall23.ui.drivers.Driver;
import lombok.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
@ToString

public class User {

    private String user;
    private String email;
    private String userType;
    public String registration;

}

