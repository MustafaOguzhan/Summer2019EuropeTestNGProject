package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlchanged {
    /**•	•	open browser
     •	go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
     •	enter any email
     •	click on Retrieve password
     •	verify that url changed to http://practice.cybertekschool.com/email_sent */

    public static void main(String[] args) throws InterruptedException {
        //open the chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
        driver.get("https://practice.cybertekschool.com/forgot_password");
        Thread.sleep(3000);
        //enter any email
        WebElement emailInput = driver.findElement(By.name("email"));

        //send keybord actions to webElement /enter the g'ven text
        emailInput.sendKeys("email@gmail.com");
        Thread.sleep(3000);
        //locate to password button
        WebElement  retrievePasswordButton = driver.findElement(By.id("form_submit"));
        Thread.sleep(3000);
        //click button
        retrievePasswordButton.click();

        String expectedUrl = "http://practice.cybertekschool.com/email_sent";

        String actualUrl = driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("actualUrl ="+ actualUrl );
            System.out.println("expextedUrl = " + expectedUrl);

        }

    Thread.sleep(3000);
        //close
        driver.quit();



    }


     }
