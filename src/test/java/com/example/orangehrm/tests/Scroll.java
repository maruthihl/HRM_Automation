package com.example.orangehrm.tests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Scroll 
{
     WebDriver driver;
     JavascriptExecutor js;
    @BeforeClass
    public void setUp() 
    {
      driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.nseindia.com/");

    }
    @Test
    public void testScroll() throws InterruptedException
    {
       js= (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,5000)");
       Thread.sleep(3000);
         
    }
}
   
