package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("http://laptop-0eoivkcu/login.do");
		  WebElement usnTB = driver.findElement(By.name("username"));
		  Dimension size = usnTB.getSize();
		  int height = size.getHeight();
		  int width = size.getWidth();
		  System.out.println("height is: "+height+" "+"width is"+width);
		  
		  

	}

}
