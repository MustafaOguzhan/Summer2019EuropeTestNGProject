package com.cybertek.utilities;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BeforeAndAfter {

    WebDriver driver;
    @Before
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
    }
    @After
    public void tearDown() {
        driver.quit();
    }



}
