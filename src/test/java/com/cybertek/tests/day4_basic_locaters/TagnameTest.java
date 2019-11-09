package com.cybertek.tests.day4_basic_locaters;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagnameTest {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cybertekschool.com/sign_up");

        //enter full name
        WebElement fullnameInput = driver.findElement(By.tagName("input"));
        fullnameInput.sendKeys("Mike Smith With TagName");

         //enter email
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("mike@gmail.com");

        WebElement signUpButton = driver.findElement(By.tagName("button"));
        signUpButton.click();

        //1st way to get the message as a text
        String retrieveMessage = driver.findElement(By.tagName("h3")).getText();
        System.out.println(retrieveMessage);
        //2nd way
        // String retrieveMessage = driver.findElement(By.tagName("h3"));
        //String message= retrieveMessage.getText();
        // System.out.println(message);
        //3rd way
        System.out.println(driver.findElement(By.tagName("h3")).getText());

    }
}
