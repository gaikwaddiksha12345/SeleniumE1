package sychronazation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		WebDriver driver =new ChromeDriver();
   
		driver.manage().window().maximize();//to maximize browser
   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));//for implicit wait
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));//for explicit wait
		
		driver.get("https://www.shoppersstack.com/");//to launch browser
		
		driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 Pro']")).click();//click on product apple iphone
		
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");//write the sendkeys to textfield.
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='Check']"))));
		driver.findElement(By.xpath("//button[@id='Check']")).click();
		
		//WebElement checkButton = driver.findElement(By.xpath("//button[@id='Check']"));
		 
		//wait.until(ExpectedConditions.elementToBeClickable(checkButton));
		//checkButton.click();
		
	}

}
