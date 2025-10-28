package com.example.orangehrm.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNgAnnotations
{
    //pre-condition annotations--start with @Before
    @BeforeSuite //1
    public void setup()
    {
        System.out.println("Setup system property method executed");
    }
        @BeforeTest //2
    public void launchBrowser()
    {
        System.out.println("Launch browser method executed");
    }
   @BeforeClass //3
    public void login()
    {
        System.out.println(" Login method executed");
    }
    @BeforeMethod //4
    public void enterUrl()
    {
        System.out.println("URL entered");
    }

    //test cases --start with @Test
    @Test //5
    public void titleTest   ()
    {
        System.out.println("Title test executed");
    }
    //post condition annotations --start with @After
    @AfterMethod
    public void logout()
    {
        System.out.println("Logout method executed");
    }
    @AfterTest
    public void deleteAllCookies()
    {
        System.out.println("Delete all cookies");
    }
    @AfterClass
    public void closeBrowser()
    {
        System.out.println("Browser closed");
    }
    @AfterSuite
    public void generateTestReport()
    {
        System.out.println("Test report generated");
    }

}

