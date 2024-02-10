package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/signup");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 Thread.sleep(2000);
		 
		 WebElement dayDropdown = driver.findElement(By.id("day"));
		 WebElement monthDropdown = driver.findElement(By.id("month"));
		  WebElement yearDropDown = driver.findElement(By.id("year"));
		  
		  Select dayselect = new Select(dayDropdown);
		  boolean result = dayselect.isMultiple();
		  System.out.println("Day dropDown is multiple?? :"+result);
		  
		  List<WebElement> dayOptions = dayselect.getOptions();
		  for(WebElement we : dayOptions) 
		  {
			 
		  }
		  
	}

}
