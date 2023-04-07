package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unEnventable 

{
   public static void main(String[] args) throws InterruptedException 
   
   {
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://demo.guru99.com/test/table.html");
	 
	 Thread.sleep(1000);
	 
	 driver.manage().window().maximize();
	 
	 List<WebElement> noOfRows = driver.findElements(By.xpath("//table[@cellpadding='1']"));
		 
	  for(int i=0;i<noOfRows.size();i++) 
	   {
		List<WebElement> noOfCells = driver.findElements(By.xpath("//table[@cellpadding='1']//tr["+i+"]//td"));
		
		for(int j=0;j<noOfCells.size();j++) 
		{
			System.out.println(noOfCells.get(j).getText()+"  ");
		}
		System.out.println();
	 }
	 
	 
   }
   
	 
   }

