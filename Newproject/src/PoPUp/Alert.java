package PoPUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert 

{
   public static void main(String[] args) throws InterruptedException 
   
   {
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	   
	   driver.manage().window().maximize();
	   
	   Thread.sleep(1500);
	   
	  WebElement data = driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
	  
	       data.click();
	       
		   Thread.sleep(1500);

	       
	       driver.switchTo().alert().sendKeys("Yes");
	       
		   Thread.sleep(1500);

	       
	       driver.switchTo().alert().accept();
	       
	       
   }
}
