package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {

        //setting up to class
        WebDriverManager.chromedriver().setup();

        //import class alt+enter or ctr+space
        //selenium object
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        driver.navigate().to("https://www.facebook.com");

        driver.navigate().back();

        Thread.sleep(3000);


        driver.navigate().forward();


    }


}
