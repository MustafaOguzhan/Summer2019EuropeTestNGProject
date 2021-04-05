package com.cybertek.tests.day1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class basic_navigation {

    int solution(int[] A, int X) {
        
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (A[m] > X) {
                r = m - 1;
            } else {

                l = m;
            }
        }
        if (A[l] == X) {
            return l;
        }
        return -1;
    }











        /*we have to setup webdriver based on the browser that we gonna use
        WebDriverManager.chromedriver().setup();

        //creating object for using selenium driver
        WebDriver driver= new ChromeDriver();

        //open website
        driver.get("http://amazon.com");

        // get the title and print it
        System.out.println(driver.getTitle());*/

    }

