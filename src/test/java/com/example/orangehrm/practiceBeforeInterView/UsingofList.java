package com.example.orangehrm.practiceBeforeInterView;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Set;
public class UsingofList 
{
    public static void main(String[] args) 
    {
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.flipkart.com/");
      List<WebElement> links = driver.findElements(By.tagName("a"));
      System.out.println(links.size());
      for(WebElement link:links)
      {
    	  System.out.println(link.getText());
      }
     Set<String> allWindow = driver.getWindowHandles();
      System.out.println(allWindow.size());
      for(String window:allWindow)
      {
    	  System.out.println(window);
      }

    }
}
