package PoPUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowersmultipleTabs 

{
   public static void main(String[] args) throws InterruptedException 
   
   
   {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://skpatro.github.io/demo/links/"); // #Parent
	  
	  driver.manage().window().maximize();
	  
	  Thread.sleep(1500);
	  
	  driver.findElement(By.xpath("//input[@name='NewTab']")).click(); // #1stChild
	  
	  driver.findElement(By.xpath("//input[@name='NewTab']")).click(); // #2ndChild
	  
	        Set<String> id = driver.getWindowHandles();
	        
	        ArrayList<String> al = new ArrayList<String>(id);	        
	           
            String cbaddress1 = al.get(1); // #1stchildAddress
                    
            driver.switchTo().window(cbaddress1);
                    
            Thread.sleep(1500);
               
  		    driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();// #Training

            Thread.sleep(1500);
       
            driver.switchTo().window(al.get(0)); // #focusontheParentAgain
               
            driver.switchTo().window(al.get(2)); // #focusonthe2ndChild
            
                  String cbaddress2 = al.get(2);
                  
            driver.switchTo().window(cbaddress2);
  
  		    driver.findElement(By.xpath("(//span[text()='WebdriverIO'])[1]")).click();// #WebdriverIO
         
                    
   }
   
   
}
