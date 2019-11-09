package com.cybertek.tests.day4_basic_locaters;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdLocatorTest {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //maximize the browser
        driver.manage().window().maximize();
        //open this web page
        driver.get("https://practice.cybertekschool.com/multiple_buttons");
        //you wanna click dont click button
        WebElement dontClickButton = driver.findElement(By.id("disappearing_button"));
        //click to that button
        dontClickButton.click();

       driver.quit();





    }

}
