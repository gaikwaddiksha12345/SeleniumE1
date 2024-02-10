package methodOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 driver.get("http://www.google.co.in/");
		 
		 WebElement active = driver.switchTo().activeElement();
		 active.sendKeys("Bikes");
		 
		   List<WebElement> bikeops = driver.findElements(By.xpath(""));
		   
		   for(int i=0;i<bikeops.size();i++)
		   {
			   String ops = bikeops.get(i).getTagName();
			   System.out.println(ops);
			   Thread.sleep(2000);
		   }
		  
		 
		 
		 
	}

}
