package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenium7 

{
    public static void main(String[] args) throws InterruptedException 
    
    {
        System.setProperty("webdriver.chrome.driver","c:\\Users\\manis\\Dropbox\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
   
		WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.naukri.com/");
        
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//a[@title='Jobseeker Register']")).click();
    	
        Thread.sleep(2000);

    	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Manish Dongarwar");
    	
        Thread.sleep(2000);
        
    	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("maannnyyyaaa1@gmail.com");
    	
        Thread.sleep(2000);
        
    	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Manish@123456");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9673797638");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//h2[@class='main-3'])[1]")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
        
        Thread.sleep(2000);
        
        //driver.findElement(By.xpath("(//button[@type='submit']")).click();
        
        
        



        
        




	}
}
