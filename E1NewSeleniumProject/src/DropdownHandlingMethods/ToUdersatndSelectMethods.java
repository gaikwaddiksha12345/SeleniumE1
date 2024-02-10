package DropdownHandlingMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUdersatndSelectMethods {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("file:///C:/Users/LENOVO/Desktop/web%20elements/dropdown.html");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 Thread.sleep(1000);
	 
	 WebElement singleDD = driver.findElement(By.id("menu"));
	 Select sel = new Select(singleDD);
	 sel.selectByIndex(4);
	 
	 Thread.sleep(1000);
	 
	 sel.selectByValue("v3");
	 
	 sel.selectByVisibleText("Samosa");
	 
}
}
