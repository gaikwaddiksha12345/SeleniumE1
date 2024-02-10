package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.instagram.com/");
		 Thread.sleep(1000);
		 
		// driver.findElement(By.name("username")).sendKeys("diksha");
		 //driver.findElement(By.name("password")).sendKeys("diksha");
		 WebElement loginButton = driver.findElement(By.xpath("//div[text()='Log in']"));
		 loginButton.submit();
	}

}
