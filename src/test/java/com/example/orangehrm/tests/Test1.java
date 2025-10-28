package com.example.orangehrm.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.time.Duration;

public class Test1 
{
    WebDriver driver;


    @BeforeClass
    public void setUp() 
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.get("https://www.nseindia.com/");
        try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement modalCloseBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@class='btn-close']")));
        modalCloseBtn.click();
        System.out.println("Modal closed.");
    } catch (Exception e) {
        System.out.println("No modal popup appeared.");
    }
}
    @Test
    public void verifyTitle() throws InterruptedException
     {
        Thread.sleep(3000); // Optional; only for demo
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        String expectedTitle = "NSE - National Stock Exchange of India Ltd: Live Share/Stock Market News & Updates, Quotes- Nseindia.com";
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
    }

    @AfterClass
    public void tearDown() 
    {
        driver.quit();  // Don't forget this
    }
}
