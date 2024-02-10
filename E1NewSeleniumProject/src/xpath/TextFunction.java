package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFunction {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();//launch the browser
	driver.manage().window().maximize();//maxmaize the browser window
	driver.get("http://laptop-0eoivkcu/login.do");
	Thread.sleep(2000);
	WebElement loginbutton = driver.findElement(By.xpath("//a[text()='Login']"));
	loginbutton.click();
}
}
