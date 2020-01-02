package com.cybertek.tests.day15_extent_report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtentDemoTest {
    //this class is used for starting and building reports
    ExtentReports report;
    //this class is used to create the HTML report file
    ExtentHtmlReporter htmlReporter;
    //this will define a test, enables adding logs,authors,test steps,we r adding info
    ExtentTest extentLogger;

    @BeforeMethod
    public void setup (){
        //initialize the class
        report = new ExtentReports();

        //create report path //where we gonna keep our report
        String projectPath = System.getProperty("user.dir");
        String path = projectPath+ "/test-output/report.html";

        //initialize the html reporter with the report path
        //means that hey Html reporter this is the  location you gonna put our report
        htmlReporter= new ExtentHtmlReporter(path);

        //attach the html report to the report object
        //means create the html report for us
        report.attachReporter(htmlReporter);

        //ıt will set the report title on the web page
        htmlReporter.config().setReportName("Vytrack smoke test");

        //set environment information
        report.setSystemInfo("Environment","QA");
        report.setSystemInfo("Browser", "chrome");
        report.setSystemInfo("Tester", "Europe+UK testers");

    }
    @Test
    public void test1(){
        //assign your test case name for the current test
        extentLogger = report.createTest("TC342 Login as Driver Test");

        //test steps
        //info()--> write test steps
        extentLogger.info("Open chrome");
        extentLogger.info("go to url");
        extentLogger.info("enter driver info");
        extentLogger.info("click submit");
        extentLogger.info("verify logged in");

        //pass()--> marks the test case passed
        extentLogger.pass("TC342 is passed");

    }
    @AfterMethod
    public void teardown(){
        //this is when the report is actually created
        //at the end of the all tests cases,when you done with the test cases,b4 create another report
        report.flush();

    }


}
