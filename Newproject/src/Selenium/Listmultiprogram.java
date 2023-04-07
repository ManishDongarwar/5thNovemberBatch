package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listmultiprogram 
{
public static void main(String[] args) 
{
	
	System.setProperty("webdriver.chrome.driver","c:\\Users\\manis\\Dropbox\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   
	WebDriver driver = new ChromeDriver();
  
  driver.get("https://www.Facebook.com/reg"); 
  
    WebElement result = driver.findElement(By.xpath("//select[@title='Year']"));
	
	Select s = new Select(result);
	
      List<WebElement> option = s.getOptions();
	
	   int size = option.size(); // to get size of listbox
	   
	   System.out.println(size);
	   
	   for(int i = 0; i <= option.size()-1; i++) // to print All the options fro Listbox
	   {
		   System.out.println(option.get(i).getText());
	   }
	
	
	
	
	
	
	
	
	
	
}
}
