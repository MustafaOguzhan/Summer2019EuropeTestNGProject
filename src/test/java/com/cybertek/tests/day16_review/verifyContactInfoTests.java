package com.cybertek.tests.day16_review;

import com.cybertek.pages.BasePage;
import com.cybertek.pages.ContactInfoPage;
import com.cybertek.pages.ContactsPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyContactInfoTests extends TestBase{

    @Test
    public void contactDetailsTest(){
        extentLogger= report.createTest("contactDetailsTest");
        LoginPage loginPage = new LoginPage();
        String username= ConfigurationReader.get("salesmanager_username");
        String password= ConfigurationReader.get("salesmanager_password");
        extentLogger.info("username: "+username);
        extentLogger.info("password: "+ password);
        loginPage.login(username,password);

        ContactsPage contactsPage= new ContactsPage();
        extentLogger.info("Navigate to Custumoer -- Contacts Page");
        contactsPage.navigateToModule("Customers", "Contacts");
        BrowserUtils.waitFor(5);


        contactsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitFor(15);
        extentLogger.info("Click on mbrackstone9@example.com email");
        contactsPage.getContactEmail("mbrackstone9@example.com").click();

        ContactInfoPage contactInfoPage = new ContactInfoPage();

        String actualFullname= contactInfoPage.fullname.getText();
        String expectedFullname= "Ms Mariam Brackstone";

        extentLogger.info("Verify fullname is "+expectedFullname);
        Assert.assertEquals(actualFullname,expectedFullname,"Verify fullnames");

        String actualEmail= contactInfoPage.email.getText();
        String expectedEmail= "mbrackstone9@example.com";

        extentLogger.info("Verify email is mbracstone9@example.com");
        Assert.assertEquals(actualEmail,expectedEmail,"Verify email");

        String actualPhone = contactInfoPage.phone.getText();
        String expectedPhone = "+18982323434";

        extentLogger.info("Verify contact phone is: " +expectedPhone);
        Assert.assertEquals(actualPhone,expectedPhone,"verify phone");

        //instead of that 3 lines of code String actual-expected and Assert...... we can do this also
        Assert.assertEquals(contactInfoPage.phone.getText(),"+18982323434");
        //we can apply this for verify email and name also







    }

}
