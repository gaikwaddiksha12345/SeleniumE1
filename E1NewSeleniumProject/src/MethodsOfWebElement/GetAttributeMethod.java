package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("http://laptop-0eoivkcu/login.do");
		  WebElement password = driver.findElement(By.name("pwd"));
		  String attributevalue = password.getAttribute("class");
		  System.out.println(attributevalue);
		  
	}
}
