package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();//launch the browser
		driver.manage().window().maximize();//maxmaize the browser window
		driver.get("https://app.fireflink.com/signin");
		Thread.sleep(2000);
		
		
		
		WebElement email = driver.findElement(By.xpath("//input[@name='emailId']"));
		email.sendKeys("Qspider@gmail.com");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='mui-2']"));
		password.sendKeys("password");
		Thread.sleep(1000);
	}

}
