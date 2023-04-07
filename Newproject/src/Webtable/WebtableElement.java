package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableElement 

{
   public static void main(String[] args) throws InterruptedException 
   
   {
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.w3schools.com/html/html_tables.asp");
	 
	 Thread.sleep(1000);
	 
	List<WebElement> noOfRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
	 
	 System.out.println(noOfRows.size());
   
    List<WebElement> noOfCells = driver.findElements(By.xpath("//table[@id='customers']//tr[\"+(i+1)+\"]//td"));
   
	 System.out.println(noOfCells.size());

   
   }
   
 }
