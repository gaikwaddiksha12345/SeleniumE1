package handlingpopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePromptAlertpopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://omayo.blogspot.com/");
	
	driver.findElement(By.id("prompt")).click();
	Thread.sleep(1000);
	Alert promptalert = driver.switchTo().alert();
	Thread.sleep(1000);
	String prmpttext = promptalert.getText();
	System.out.println(prmpttext);
	Thread.sleep(1000);
	promptalert.sendKeys("diksha");
	Thread.sleep(1000);
	
	promptalert.accept();
	
	
}
}
