package com.cybertek.tests.day9_popups_tabs_frames;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class PopupsAndAlerts {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
       // driver.quit();
    }
    @Test
    //if pop-up is HTML
    public void test1(){
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

        //locating and clicking  destroy button
        driver.findElement(By.xpath("//*[text()='Destroy the World']"));

        //find and click no button
        driver.findElement(By.xpath("//*[text()='No']"));

    }

    @Test
    public void test2() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        //click for JS alert
        driver.findElement(By.xpath("//button[1]")).click();
        //controlling alert using with alert class
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        //accept alert--> click ok on the alerts
        alert.accept();

        //click JS confirm
        driver.findElement(By.xpath("//button[2]")).click();
        //click x to close,selecting no/cancel
        Thread.sleep(2000);
        alert.dismiss();

        //clicking JS Prompt
        driver.findElement(By.xpath("//button[3]")).click();

        //send some keys
        Thread.sleep(2000);
        alert.sendKeys("Mike Smith");
        Thread.sleep(2000);
        alert.accept();


    }

}