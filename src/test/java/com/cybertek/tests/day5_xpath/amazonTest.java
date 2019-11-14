package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonTest {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Selenium");
        WebElement searchButtonn= driver.findElement(By.xpath("//input[@value='Go']"));
        searchButtonn.click();
        String resultMessage = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();
        System.out.println(resultMessage);


    }
}
