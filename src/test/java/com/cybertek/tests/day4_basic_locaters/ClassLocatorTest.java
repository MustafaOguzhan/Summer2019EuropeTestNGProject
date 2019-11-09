package com.cybertek.tests.day4_basic_locaters;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cybertekschool.com/sign_up");

        WebElement homeLink = driver.findElement(By.className("nav-link"));
        homeLink.click();


        driver.get("https://practice.cybertekschool.com/multiple_buttons");
        //lazy way
        System.out.println(driver.findElement(By.className("h3")).getText());


    }
}
