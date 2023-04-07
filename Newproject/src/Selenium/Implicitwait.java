package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait 

{
   public static void main(String[] args) 
   
   {
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.facebook.com/login.php");
	 
	 //driver.manage().window().maximize();
	 
	 //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //deprecated method
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mandog.cool@gmail.com");
	 
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manish@12345");
	 
	 driver.findElement(By.xpath("//button[@name='login']")).click();
	 
	 
   }
}
