package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();//launch the browser
	driver.manage().window().maximize();//maxmaize the browser window
	driver.get("http://laptop-0eoivkcu/login.do");
	Thread.sleep(2000);
	WebElement usnTextbox = driver.findElement(By.name("username"));
	usnTextbox.sendKeys("Admin");
	Thread.sleep(2000);
	WebElement passTextbox = driver.findElement(By.name("pwd"));
	passTextbox.sendKeys("manager");
	Thread.sleep(2000);
	WebElement loginbutton = driver.findElement(By.id("loginButton"));
	loginbutton.click();
	Thread.sleep(2000);
}
}
