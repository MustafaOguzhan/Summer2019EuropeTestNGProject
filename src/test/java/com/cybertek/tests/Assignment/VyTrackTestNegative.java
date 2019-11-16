package com.cybertek.tests.Assignment;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VyTrackTestNegative {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://qa1.vytrack.com/user/login");

        WebElement username =driver.findElement(By.id("prependedInput"));
        username.sendKeys("user24");
        WebElement password =driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser321");
        WebElement loginButton = driver.findElement(By.id("_submit"));
        loginButton.click();
        String actualurl= driver.getCurrentUrl();
        String expectedUrl="https://qa1.vytrack.com/user/login";

        if(expectedUrl.equals(actualurl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Expected Url: " + expectedUrl);
            System.out.println("Actualurl: " + actualurl);

        }
        //driver.quit();





    }
}
