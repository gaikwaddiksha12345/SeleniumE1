package ActionClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		 
		 Actions act = new Actions(driver);
		 
		 WebElement button = driver.findElement(By.xpath("//section[text()='Button']"));
		 button.click();
		 driver.findElement(By.partialLinkText("Double Click")).click();
		 
		  WebElement yesbutton = driver.findElement(By.id("btn20"));
		  WebElement nobutton = driver.findElement(By.id("btn23"));
		  WebElement ratingbuton = driver.findElement(By.id("btn28"));
		  
		  act.doubleClick(yesbutton).perform();
		  
		  act.doubleClick(nobutton).perform();
		  
		  act.doubleClick(ratingbuton).perform();
		  
		  
		  
		  
		 
		 
		 
	}

}
