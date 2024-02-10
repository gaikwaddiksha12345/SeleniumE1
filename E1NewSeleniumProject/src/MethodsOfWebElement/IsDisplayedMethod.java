package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
 
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.instagram.com/");
	 Thread.sleep(1000);
	 WebElement loginButton = driver.findElement(By.xpath("//div[text()='Log in']"));
	 boolean result = loginButton.isDisplayed();
	 System.out.println(result);
}
}
