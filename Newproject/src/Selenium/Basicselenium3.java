package Selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Basicselenium3 

{
   
	public static void main(String[] args) throws InterruptedException 
	
	{
		  
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\Dropbox\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		driver.close();
		
	}
	
}
