package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();//launch the browser
		driver.manage().window().maximize();//maxmaize the browser window
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement PassTextBox = driver.findElement(By.className("pass-textbox"));
		PassTextBox.sendKeys("Admin");
	}

}
