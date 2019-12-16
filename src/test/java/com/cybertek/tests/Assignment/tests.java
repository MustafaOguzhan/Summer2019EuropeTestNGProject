package com.cybertek.tests.Assignment;

import com.cybertek.utilities.WebDriverFactory;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cybertek.utilities.VerifyClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tests {
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
    public void Testcse1(){

        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.name("birthday")).click();
        driver.findElement(By.name("birthday")).sendKeys("11111111");
        String expectedResult= "The date of birth is not valid";
        String actualResult=driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/form/div[8]/div/small[2]")).getText();
        VerifyClass.verify(expectedResult,actualResult);

    }
    @Test
    public void TestCase2(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();
        String expectedLanguage1="c++";
        String expectedLanguage2="java";
        String expectedLanguage3="JavaScript";
        String actualLanguage1=driver.findElement(By.xpath("//label[.='C++']")).getText();
        String actualLanguage2=driver.findElement(By.xpath("//label[.='Java']")).getText();
        String actualLanguage3=driver.findElement(By.xpath("//label[.='JavaScript']")).getText();
        driver.findElement(By.xpath("//label[.='C++']")).isDisplayed();
        driver.findElement(By.xpath("//label[.='Java']")).isDisplayed();
        driver.findElement(By.xpath("//label[.='JavaScript']")).isDisplayed();

        VerifyClass.verify(expectedLanguage1,actualLanguage1);
        VerifyClass.verify(expectedLanguage2,actualLanguage2);
        VerifyClass.verify(expectedLanguage3,actualLanguage3);
    }

    @Test
    public void TestCase3(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.name("firstname")).sendKeys("M");
        String actualMessage= driver.findElement(By.xpath("//small[contains(text(),'first name must be more than 2 and')]")).getText();
        String expectedMessage="first name must be more than 2 and less than 64 characters long";

        VerifyClass.verify(expectedMessage,actualMessage);

    }
    @Test
    public void TestCase4() {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.name("lastname")).sendKeys("O");
        System.out.println("Verify that warning message is displayed: "+driver.findElement(By.xpath("//small[contains(text(),'The last name must be more than 2 and less than 64 characters long')]")).isDisplayed());

    }
    @Test
    public void TestCase5(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.xpath("(//div/input)[1]")).sendKeys("Mustafa");
        driver.findElement(By.xpath("(//div/input)[2]")).sendKeys("Onal");
        driver.findElement(By.xpath("(//div/input)[3]")).sendKeys("MustafaOnal");
        driver.findElement(By.xpath("(//div/input)[4]")).sendKeys("xyz@hotmail.com");
        driver.findElement(By.xpath("(//div/input)[5]")).sendKeys("Mustafa_Mustafa");
        driver.findElement(By.xpath("(//div/input)[6]")).sendKeys("571-000-0000");
        driver.findElement(By.xpath("(//label/input)[1]")).click();
        driver.findElement(By.xpath("(//div/input)[7]")).sendKeys("01/01/2012");
        WebElement engineer= driver.findElement(By.xpath("//select[@name='department']"));
        Select department = new Select(engineer);
        System.out.println(department.getFirstSelectedOption().getText());
        department.selectByVisibleText("Department of Engineering");

        WebElement jobTitle = driver.findElement(By.xpath("//select[@name='job_title']"));
        Select title = new Select(jobTitle);
        System.out.println(title.getFirstSelectedOption().getText());
        title.selectByVisibleText("SDET");
         driver.findElement(By.id("inlineCheckbox2")).click();
         driver.findElement(By.id("wooden_spoon")).click();
         String actualMessage= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/p")).getText();
         String expectedMessage="You've successfully completed registration!";

         VerifyClass.verify(expectedMessage,actualMessage);

    }
    @Test
    public void TestCase6() throws InterruptedException {
        driver.get("https://www.tempmailaddress.com/");
        String email=driver.findElement(By.id("email")).getText();
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Mailing List')]")).click();
        driver.findElement(By.name("full_name")).sendKeys("Mustafa");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("wooden_spoon")).click();
        String message =driver.findElement(By.name("signup_message")).getText();
        System.out.println("message = " + message);
        driver.navigate().to("https://www.tempmailaddress.com");
        WebElement donotreplaymssge = driver.findElement(By.cssSelector("#schranka>tr"));
        System.out.println("is new message displayed :" +donotreplaymssge.isDisplayed());
        System.out.println(donotreplaymssge.getText());
        donotreplaymssge.click();
        //System.out.println(driver.findElement(By.xpath("(//span[@class='predmet pull-left'])[1]")).getText());

        //WebDriverWait wait = new WebDriverWait(driver,50);
        // wait.until(ExpectedConditions.elementToBeClickable(replyMessage));





}
}


























































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































