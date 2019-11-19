package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
    public void radioButton(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioButton =driver.findElement(By.id("blue"));
        WebElement redRadioButton = driver.findElement(By.id("red"));

        System.out.println("Is blue selected: "+blueRadioButton.isSelected());
        System.out.println("Is red selected: "+redRadioButton.isSelected());

        //verify that blue button is selected
        Assert.assertTrue(blueRadioButton.isSelected(),"Verify that blue button is selected");

        //verify that red button is selecteed
        Assert.assertFalse(redRadioButton.isSelected(),"Verify that red button is selected");




        redRadioButton.click();
        blueRadioButton.click();
        Assert.assertTrue(redRadioButton.isSelected(),"red button is selected : ");
        Assert.assertFalse(blueRadioButton.isSelected(),"Blue is not selected : ");



    }
}
