package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed 
{
  public static void main(String[] args) 
  
  {
	  System.setProperty("webdriver.chrome.driver","c:\\Users\\manis\\Dropbox\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   
		WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.Facebook.com/reg"); 
    
    
           WebElement customgen = driver.findElement(By.xpath("(//input[@name='sex'])[3]"));
    
    
           customgen.click();
           
           boolean result = customgen.isSelected();
           
           System.out.println(result);
           
           if (result == true)
           {
           System.out.println("Given Element is Displayed");
           }
           else
           {
        	   System.out.println("Given Element is Not Displayed"); 
           }
   
    
    
  }
  
  
}
