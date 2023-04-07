package ActionClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown 

{
   public static void main(String[] args) throws InterruptedException 
   
   {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.album.alexflueras.ro/index.php");
	  
	  Thread.sleep(1000);
	  
	  driver.manage().window().maximize();
	  
	  JavascriptExecutor scroll = (JavascriptExecutor)driver;
	  
	  scroll.executeScript("window.scrollBy(0,300)");  // Scroll Down
	  
	  Thread.sleep(3000);
	  
	  scroll.executeScript("window.scrollBy(0,-300)");  // Scroll Up

	  Thread.sleep(3000);
	  
	  scroll.executeScript("window.scrollBy(3000,0)");  // Scroll Right

	  Thread.sleep(3000);

	  scroll.executeScript("window.scrollBy(-3000,0)");  // Scroll Left

	  
   }
   
}
