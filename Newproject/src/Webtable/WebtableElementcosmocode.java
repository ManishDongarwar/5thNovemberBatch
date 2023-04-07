package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableElementcosmocode 

{
    public static void main(String[] args) throws InterruptedException 
    
    {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		List<WebElement> noOfRows = driver.findElements(By.xpath("//table[@id='countries']//tr"));
		//System.out.println(noOfRows.size());
		for(int i=1;i<noOfRows.size();i++)
		{
	      List<WebElement> noOfCells = driver.findElements(By.xpath("//table[@id='countries']//tr["+(i+1)+"]//td"));
	      //System.out.println(noOfCells.size());
		   for(int cell=0;cell<noOfCells.size();cell++) 
		    {
			 System.out.print(noOfCells.get(cell).getText()+"  ");
			}
		   System.out.println();
		
	   }
		
  }
    
}
