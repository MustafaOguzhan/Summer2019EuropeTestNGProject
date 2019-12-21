package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage{

    //no ned to explicitly write constructors, because it will use its parents constructor.
    //this constructor is making our page to page object model page(pom)
    //by its help we can use @FindBy and others
    public DashboardPage(){
        PageFactory.initElements(Driver.get(),this);
    }




}