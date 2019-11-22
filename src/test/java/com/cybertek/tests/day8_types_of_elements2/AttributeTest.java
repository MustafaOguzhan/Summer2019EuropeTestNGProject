package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeTest {

    @Test
    public void test2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement radioButton = driver.findElement(By.id("blue"));
        //get the value of name attribute
        System.out.println(radioButton.getAttribute("name"));
        //get the value of id attribute
        System.out.println(radioButton.getAttribute("id"));
        //get the value of class attribute
        System.out.println(radioButton.getAttribute("class"));
        //try to get the attribute non-exist
        //when we try to get non-exist attribute it will return "null"
        System.out.println(radioButton.getAttribute("href"));

        //attribute without value
        //try to get value of an attribute without value it will return to boolean
        System.out.println(radioButton.getAttribute("checked"));
    }

}
