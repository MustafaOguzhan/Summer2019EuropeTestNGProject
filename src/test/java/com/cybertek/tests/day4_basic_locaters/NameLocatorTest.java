package com.cybertek.tests.day4_basic_locaters;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cybertekschool.com/sign_up");
        WebElement fullnameInput = driver.findElement(By.name("full_name"));
        fullnameInput.sendKeys("Mike Smith");
        WebElement Email =driver.findElement(By.name("email"));
        Email.sendKeys("mikesmith@cybertekschool.com");
        //click signup button
        WebElement signUpButton= driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();

        //verify the message"Thank you for signing up. Click the button below to return to the home page.
        WebElement thanksMessage= driver.findElement(By.name("signup_message"));
        String expectedMessage="Thank you for signing up. Click the button below to return to the home page.";
        String actualMessage =thanksMessage.getText();
        if(actualMessage.equals(expectedMessage)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("expectedMessage:"+expectedMessage);
            System.out.println("actualMessage:"+actualMessage);

        }






    }
}
