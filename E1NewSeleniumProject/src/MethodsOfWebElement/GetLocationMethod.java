package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("http://laptop-0eoivkcu/login.do");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		Point point = loginButton.getLocation();
		int x_axis = point.getX();
		int y_axis = point.getY();
		System.out.println("Xaxis:"+x_axis+" "+"yasix:"+y_axis);

	}

}
