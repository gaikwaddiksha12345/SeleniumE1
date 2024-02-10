package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("http://laptop-0eoivkcu/login.do");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		 String cssValue = loginButton.getCssValue("background");
		 System.out.println(cssValue);
	}

}
