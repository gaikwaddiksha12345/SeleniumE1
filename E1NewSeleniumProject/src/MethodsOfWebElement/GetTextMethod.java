package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("http://laptop-0eoivkcu/login.do");
		WebElement link = driver.findElement(By.id("licenseLink"));
		String linkText = link.getText();
		System.out.println(linkText);
		
		
		

	}

}
