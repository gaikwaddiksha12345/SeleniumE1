package ActionClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraganddropMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		 Actions act = new Actions(driver);
		 
		 driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		 driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		 driver.findElement(By.partialLinkText("Drag Position")).click();
		 
		 
		 //source elements
		 WebElement mobilec = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		 WebElement laptopc = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		 WebElement mobileco = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		 WebElement laptopco = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		 
		 //target element
		 WebElement ma = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		 WebElement la = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		 act.dragAndDrop(mobilec, ma).perform();
		 act.dragAndDrop(mobileco, ma).perform();
		 act.dragAndDrop(laptopc, la).perform();
		 act.dragAndDrop(laptopco, la).perform();
		 
		 
	}

}
