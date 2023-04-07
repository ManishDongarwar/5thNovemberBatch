package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Multiplescreenshot 
{
  public static void main(String[] args) throws IOException 
  
  {
	//System.setProperty("webdriver.chrome.driver","c:\\Users\\manis\\Dropbox\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   
	   WebDriver driver = new ChromeDriver(); // Upcasting
	    
	      driver.get("https://www.Facebook.com/reg");
	  for (int i = 0; i <=10; i++)    
	  {
	   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      String random = RandomString.make(2);
	       File destination = new File("C:\\Users\\manis\\OneDrive\\Manual,sql,Automation\\Autoscreenshot\\Test123"+random+".jpg");
	       
	       FileHandler.copy(source, destination);
	  }    
  }
  
}
