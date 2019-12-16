package com.cybertek.tests.Assignment;

import com.cybertek.utilities.WebDriverFactory;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Training2 {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        //   driver.quit();
    }
    @Test
    public void test7(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("File Upload")).click();
        driver.findElement(By.id("file-upload")).sendKeys("C:\\fakepath\\test.txt");
       // driver.findElement(By.id("file-submit")).click();



        /*driver.findElement(By.xpath("//li[.='File Upload']/a")).click();
        driver.findElement(By.id("file-upload")).click();
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\oguzhan_onal\\Desktop\\test.txt");
*/




    }
}
