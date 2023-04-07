package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframebasic 

{
	
     public static void main(String[] args) 
     
     {
	
     WebDriver driver = new ChromeDriver();   //Upcasting
     
    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
     
      //driver.findElement(By.xpath("//button[@type='button']")).click();
   
     WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
     
     driver.switchTo().frame(iframe); // Changed Focus From main Page to Iframe
     
     driver.findElement(By.xpath("//button[@type='button']")).click();
     
     
     
     driver.switchTo().defaultContent(); // Changed Focus From Iframe to Main Page
     
    // driver.switchTo().parentFrame();
     
     driver.findElement(By.xpath("//a[@id='tryhome']")).click();

     
     }
     
     
     
}
