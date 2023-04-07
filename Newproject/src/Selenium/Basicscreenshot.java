package Selenium;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.asn1.x509.Time;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Basicscreenshot 

{

	public static void main(String[] args) throws IOException 
	  
	  {
		   System.setProperty("webdriver.chrome.driver","\"C:\\Users\\manis\\Dropbox\\PC\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\"");
		   
		   WebDriver driver = new ChromeDriver();
		    
		     driver.get("https://www.Facebook.com/reg");
		
		     Calendar cal =  Calendar.getInstance();
			  java.util.Date time = cal.getTime();
			  String timestamp = time.toString().replace(":","").replace(" ", "");
			  System.out.println(time);
			  System.out.println(timestamp);

		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
		 
		 
		
		File destination = new File("C:\\Users\\manis\\OneDrive\\Manual,sql,Automation\\Autoscreenshot\\Sceenbasic"+timestamp+".jpg");
		 
		FileUtils.copyFile(source,destination);
		 FileHandler.copy(source, destination);
		 
		
		  
		  
	    
      }
	
	
}