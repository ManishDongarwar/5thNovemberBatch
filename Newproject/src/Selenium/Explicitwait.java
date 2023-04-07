package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait 

{
	public static void main(String[] args) 
	   
	   {
		 WebDriver driver = new ChromeDriver();
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		 
		 driver.get("https://www.facebook.com/login.php");
		 
		 //driver.manage().window().maximize();
		 
		 //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //deprecated method
		 
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mandog.cool@gmail.com");
		 
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manish@12345");
		 
	   
		
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//butt[@name='login']"))).click();
		 
		 //driver.findElement(By.xpath("//button[@name='login']")).click();
		 
		 
	   }
}
