package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Basicselenium4 

{
    public static void main(String[]args) throws InterruptedException 
    
    {
      
    	//System.setProperty("webdriver.chrome.driver","c:\\Users\\manis\\Dropbox\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
   
    	WebDriver driver = new EdgeDriver();
    	
    	driver.get("https://www.flipkart.com/");
    	
    	Thread.sleep(3000);
    	
        Dimension D = new Dimension(200,300);
        driver.manage().window().setSize(D);
        
        
        Point P = new Point(300,400);
        driver.manage().window().setPosition(P);
    
    
    }
    
    
 }

    	
    	