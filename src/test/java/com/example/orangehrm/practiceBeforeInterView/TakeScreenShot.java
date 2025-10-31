package com.example.orangehrm.practiceBeforeInterView;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
public class TakeScreenShot 
{
    public static void main(String[] args) throws IOException
     {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File("./screenshot/google.png");
        FileUtils.copyFile(srcFile, destFile);
        driver.quit();
    }

}
