package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenium6 

{
   public static void main(String[] args) throws InterruptedException 
   
   {
		System.setProperty("webdriver.chrome.driver","c:\\Users\\manis\\Dropbox\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
   
		
        WebDriver driver = new ChromeDriver();
        

        driver.get("https://www.swiggy.com/");
        
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[@class='r2iyh']")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9673797638");

        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Manish Dongarwar");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("manishdongarwar567@gmail.com");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[@class='a-ayg']")).click();



        
        


   }
   
   
}
