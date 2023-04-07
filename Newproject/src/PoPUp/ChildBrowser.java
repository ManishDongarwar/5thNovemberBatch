package PoPUp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser 

{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(1500);
		
		  driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		  
		Set<String> id = driver.getWindowHandles();
		  
		   ArrayList<String> al = new ArrayList<String>(id);
		  
		     String cbaddress = al.get(1);
		     
		     driver.switchTo().window(cbaddress);
		     
		     Thread.sleep(1500);
		     
		     driver.findElement(By.xpath("(//span[@class='menu-text'])[1]")).click();
		     
		     driver.switchTo().window(al.get(0));
		     
		     driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		      
		    
		     

		     
		     
		     

		     
		     
		     

		     
		     
		    
		     
		     

		     
		     

		     
		     
		
	}

}
