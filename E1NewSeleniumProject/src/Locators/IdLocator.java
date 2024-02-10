package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//launch the browser
		driver.manage().window().maximize();//maxmaize the browser window
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement usnTextbox = driver.findElement(By.id("email"));
		usnTextbox.sendKeys("9011302409");
		Thread.sleep(2000);
		WebElement passTextbox = driver.findElement(By.id("pass"));
		passTextbox.sendKeys("megha12345");
		Thread.sleep(2000);
		WebElement loginbutton = driver.findElement(By.tagName("button"));
		loginbutton.click();
		Thread.sleep(2000);
		
	}
}
