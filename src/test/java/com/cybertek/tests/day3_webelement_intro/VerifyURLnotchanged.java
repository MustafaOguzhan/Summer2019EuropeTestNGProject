package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLnotchanged {
    public static void main(String[] args) throws InterruptedException {

/**
 * Verify URL not changed
 * open browser
 * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
 * click on Retrieve password
 * verify that url did not change
 */

        //open chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //navıgate to-go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        driver.get("http://practice.cybertekschool.com/forgot_password");

         //save url to String variable
        String expectedUrl = driver.getCurrentUrl();

        //click on Retrieve password
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));

        retrievePasswordButton.click();

        //look for current element
        String actualUrl = driver.getCurrentUrl();

        //verify that url did not change
        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        Thread.sleep(3000);
    //close the browser
        driver.quit();
    }
}
