package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicselenium2 
{
  public static void main(String[]agrs) throws InterruptedException 
  
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Manual,sql,Automation\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.get("https://www.Myntra.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		
		
  }
  
  

}