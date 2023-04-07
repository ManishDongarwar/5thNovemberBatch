package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Firstselect 

{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","c:\\Users\\manis\\Dropbox\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   
		WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.Facebook.com/reg"); 
    
	 WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
	
	Select s = new Select(Month);
	
	System.out.println(s.getFirstSelectedOption().getText());
	
	
	
	
	}
	
	
}