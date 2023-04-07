package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Basic 

{
public static void main(String[] args) throws InterruptedException

    {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\Dropbox\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	
	    
	     
		 WebDriver driver = new ChromeDriver(); // upcasting
		 driver.get("https://www.Myntra.com/");
		
		Thread.sleep(3000);
		
		//driver.close();
		
		//driver.quit();
		
		String title = driver.getCurrentUrl();
		System.out.println(title);
		
		
		String expUrl = ("https://www.Myntra.com/");
		
		if(title.equalsIgnoreCase(expUrl)) 
		{
			System.out.println ("Navigate to Correct Page");
		}
		else 
		{
			System.out.println("Navigate to invalid Page");

		}
   
   }


}
