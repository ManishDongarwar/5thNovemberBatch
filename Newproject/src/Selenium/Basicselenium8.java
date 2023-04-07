package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicselenium8 

{
   public static void main(String[] args) throws InterruptedException 
   
   {
	   System.setProperty("webdriver.chrome.driver","c:\\Users\\manis\\Dropbox\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   
		WebDriver driver = new ChromeDriver();
       
       driver.get("https://www.Facebook.com/reg");
       
       driver.manage().window().maximize();
       
       Thread.sleep(2000);

        driver.findElement(By.xpath("//input[contains(@name,'firs')]")).sendKeys("Manish");
       
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//input[contains(@name,'last')]")).sendKeys("Dongarwar");
       
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("manishdongarwar567@gmail.com");
 
        Thread.sleep(2000);
        
       driver.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation')]")).sendKeys("manishdongarwar567@gmail.com");
        
        Thread.sleep(2000);


        driver.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]")).sendKeys("maannnyyyyaaaaa@12345");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//select[@id ='day']")).click();
        
        Thread.sleep(1500);

        
        driver.findElement(By.xpath("//select[@id ='day']")).sendKeys("10");
        
        Thread.sleep(1500);

        driver.findElement(By.xpath("//select[@id ='month']")).click();
        
        Thread.sleep(1500);

         driver.findElement(By.xpath("//select[@id ='month']")).sendKeys("may");
        
        Thread.sleep(1500);

        driver.findElement(By.xpath("//select[@id ='year']")).click();
        
        Thread.sleep(1500);

        driver.findElement(By.xpath("//select[@id ='year']")).sendKeys("1993");
        
        Thread.sleep(1500);
        
        driver.findElement(By.xpath("//input[@value='2')]")).click();
        
     
        
        //driver.findElement(By.xpath("//div[@class='_1lch']")).click();



        

        
        






       
   }
   
   
}
