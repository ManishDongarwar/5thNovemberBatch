package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop 

{
    public static void main(String[]args) throws InterruptedException 
    
    {
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://demo.guru99.com/test/drag_drop.html");
    	
    	driver.manage().window().maximize();  
    	
    	Thread.sleep(1000);
    	
    	 WebElement source1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
    	
     	Thread.sleep(1000);
     	
     	 WebElement destination1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
     	 
      	Thread.sleep(1000);

      	WebElement source2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
      	
      	Thread.sleep(1000);
      	
    	 WebElement destination2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
    	 
       	Thread.sleep(1000);

    	 WebElement source3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));

        	Thread.sleep(1000);
        
       	 WebElement destination3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));

     	Thread.sleep(1000);
     	
   	    WebElement source4 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));

  	    Thread.sleep(1000);

      	 WebElement destination4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));

         Actions act = new Actions(driver);
     	 
     	 Thread.sleep(2000);
     	 
     	 act.dragAndDrop(source1, destination1).perform();
     	 
     	 Thread.sleep(2000);

     	 act.dragAndDrop(source2, destination2).perform();
     	 
     	 Thread.sleep(2000);
     	 
     	 act.dragAndDrop(source3, destination3).perform();
     	 
     	 Thread.sleep(2000);
     	 
     	 act.dragAndDrop(source4, destination4).perform();






    }
    
    
    
}
