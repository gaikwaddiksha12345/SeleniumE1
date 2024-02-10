package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("http://laptop-0eoivkcu/login.do");
		  WebElement usnTB = driver.findElement(By.name("username"));
		  usnTB.sendKeys("admin");
		  Thread.sleep(1000);
		  usnTB.clear();

	}

}
