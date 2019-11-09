package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {
    /**
     * •	open browser
     * •	go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
     * •	enter any email
     * •	verify that email is displayed in the input box
     * •	click on Retrieve password
     * •	verify that confirmation message says 'Your e-mail's been sent!'
     */


    public static void main(String[] args) throws InterruptedException {
        //open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //open / navigate to website
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //where do u ant to enter an email (inside which web element)
        WebElement emailInputbox= driver.findElement(By.name("email"));

        //which email u want to send.Create as an object.
        String  expectedEmail= "test@gmail.com";

        //send expected email
        emailInputbox.sendKeys(expectedEmail);

        //1.after u sent that email above,then verify that email is displayed
        //in the input box
        //2.Than get that text from from webelement whıch named emailInputbox
        //u can use getText(); method for getting text from webelement
        //emailInputbox.getText();  will be our actual email thats why
        // we assign this to String actualEmail
        //if getText() doesn't work use getAttribute("value"); -->get value of attributes
        String actualEmail = emailInputbox.getAttribute("value");

            if(actualEmail.equals(expectedEmail)){
                System.out.println("PASS");
        }else {
                System.out.println("FAIL");
                System.out.println("expectedEmail: "+expectedEmail);
                System.out.println("actualEmail : "+ actualEmail);
            }

            WebElement retrievePasswordButton= driver.findElement(By.id("form_submit"));
            retrievePasswordButton.click();

            //verify that confirmation message says "Your e-mail's been sent!"
             String expectedMessage="Your e-mail's been sent!";

             WebElement messageElement = driver.findElement(By.name("confirmation_message"));

             String actualMessage=messageElement.getText();

             System.out.println(actualMessage);

             if(expectedMessage.equals(actualMessage)){
                 System.out.println("PASS");
             }else {
                 System.out.println("FAIL");
                 System.out.println("expectedMessage =" + expectedMessage);
                 System.out.println("actualMessage = " +actualMessage);
             }
             Thread.sleep(3000);
             driver.quit();


    }

}
