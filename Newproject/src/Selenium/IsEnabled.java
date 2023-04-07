package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled 
{
  public static void main(String[] args) 
  
  
  {
     System.setProperty("webdriver.chrome.driver","c:\\Users\\manis\\Dropbox\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   
		WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.Facebook.com/reg"); 
     
          WebElement male = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
     
          male.click();
          
          boolean result = male.isSelected();
          
          System.out.println(result);
          
          if (result == true)
          {
          System.out.println("Given Element is Selected");
          }
          else
          {
       	   System.out.println("Given Element is Not Selected"); 
          }
          
          
     
  }
  
  
}
