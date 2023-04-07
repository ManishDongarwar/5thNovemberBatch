package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion 

{
   public static void main(String[] args) throws InterruptedException 
   
   {
	    WebDriver driver = new ChromeDriver();
	    
	    
	    
	    driver.get("https://www.google.com/");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Redmi");
	    
	    Thread.sleep(1500);
	    
	    
	        List<WebElement> options = driver.findElements(By.xpath("//div[@class='aajZCb']"));
	        
	        for(int i = 0; i<options.size();i++) 
	        
	        {
	         System.out.println(options.get(i).getText());
	        }
	    
	    
   }
}
