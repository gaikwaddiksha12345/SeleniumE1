package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TrelloAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://trello.com/home");
		  driver.findElement(By.partialLinkText("Log in")).click();
		  
		  driver.findElement(By.id("username")).sendKeys("dikshagaikwad3395@gmail.com");
		  driver.findElement(By.xpath("//span[text()='Continue']")).click();
		  driver.findElement(By.id("password")).sendKeys("Megha@12345");
		  driver.findElement(By.id("login-submit")).click();
		  
		  
		  driver.findElement(By.xpath("//div[text()='E1']")).click();
		  Thread.sleep(2000);
		  
		  
		  //source elements
	
		WebElement sqlsrc = driver.findElement(By.xpath("//a[text()='SQL']"));
		 WebElement javasrc = driver.findElement(By.xpath("//a[text()='JAVA']"));
		WebElement selsrc = driver.findElement(By.xpath("//a[text()='Selenium']"));
		  WebElement mansrc = driver.findElement(By.xpath("//a[text()='Manual Testing']"));
		  
		  //target elements
		  WebElement mockgiven = driver.findElement(By.xpath("//h2[text()='mock given']"));
		  WebElement mockpending = driver.findElement(By.xpath("//h2[text()='mock pending']"));
		  WebElement mockshedule = driver.findElement(By.xpath("//h2[text()='mock schedule']"));
		  
		  Actions act = new Actions(driver);
		  
		  act.dragAndDrop(sqlsrc, mockgiven).perform();
		  act.dragAndDrop(javasrc, mockgiven).perform();
		  act.dragAndDrop(mansrc, mockpending).perform();
		  act.dragAndDrop(selsrc, mockshedule).perform();
		  
		  WebElement javasecs = driver.findElement(By.xpath("//a[text()='JAVA']"));
		  act.contextClick(javasecs).perform();
		  List<WebElement> list = driver.findElements(By.xpath("//button[contains(@class,'BppQGb2j7TfyB5')]"));
		  for(int i=0;i<list.size();i++)
		  {
			System.out.println(list.get(i).getText()); 
		  }
          Thread.sleep(1000);
	}

}
