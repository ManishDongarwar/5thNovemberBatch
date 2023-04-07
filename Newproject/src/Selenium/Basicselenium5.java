package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicselenium5 

{
	public static void main(String[] args) throws InterruptedException 
	
	{
		
		System.setProperty("webdriver.chrome.driver","c:\\Users\\manis\\Dropbox\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.facebook.com/login.php");
    	
    	Thread.sleep(3000);
    	
    	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("manishdongarwar567@gmail.com");
    	Thread.sleep(3000);

    	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("manish@123456789");
    	Thread.sleep(3000);

    	driver.findElement(By.xpath("//button[@value='1']")).click();

		
	}

}
