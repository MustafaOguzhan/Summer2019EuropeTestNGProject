package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage {
    //no need create PageFactory class again because we inherited from BasePage

    //this is not useful when something is dynamic in the locator  (like email)
    @FindBy(xpath = "//td[contains(text(),'mbrackstone9@example.com')][@data-column-label='Email']")
    public WebElement email;

    //create a method that accepts email as a String,and returns webelement based on that email
    //we can use this because email is changeable,it is dynamic
    public WebElement getContactEmail (String email){
        String emailXpath= "//td[contains(text(),'"+email+"')][@data-column-label='Email']";
        return Driver.get().findElement(By.xpath(emailXpath));

    }




}
