package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();//launch the browser
		driver.manage().window().maximize();//maxmaize the browser window
		driver.get("file:///C:/Users/LENOVO/Desktop/web%20elements/textbox.html");
		Thread.sleep(2000);
		WebElement textBox = driver.findElement(By.tagName("input"));//find password textfield on the webpage.
		textBox.sendKeys("manager");// to pass the input to passsword textfield.
		
		//note:- inputs are passed to username text field because it is the 1st elements designed with input tag.
	}

}
