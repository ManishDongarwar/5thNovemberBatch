package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute 

{
  public static void main(String[] args) 
  {
	System.setProperty("webdriver.chrome.driver","c:\\Users\\manis\\Dropbox\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   
	WebDriver driver = new ChromeDriver();
 
     driver.get("https://www.Facebook.com/reg");
     
    WebElement ele = driver.findElement(By.xpath("//input[@type='password']"));
     
     String text = ele.getAttribute("autocomplete");
     System.out.println(text);
     
  
  
  }

}
