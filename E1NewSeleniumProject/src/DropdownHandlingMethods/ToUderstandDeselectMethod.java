package DropdownHandlingMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUderstandDeselectMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/LENOVO/Desktop/web%20elements/multiselectdropdown.html");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 Thread.sleep(1000);
		 
		WebElement  multiSelectDD = driver.findElement(By.id("menu"));
		Select sel = new Select(multiSelectDD);
		Thread.sleep(1000);
		sel.selectByIndex(3);
		sel.deselectByIndex(3);
		
		Thread.sleep(1000);
		sel.selectByValue("v2");
		sel.deselectByValue("v2");
		
		Thread.sleep(1000);
		sel.selectByVisibleText("Samosa");
		sel.deselectByVisibleText("Samosa");
		
		//to select all the options
		
		for(int i=0;i<=6;i++) 
		{
		 sel.selectByIndex(i);
		 Thread.sleep(1000);
		}
		sel.deselectAll();
		//to deselect all options
		
	//	for()int j=0;j<=6;j++)
     //   {
      //
		//sel.deselectByIndex(j);
        //	Thread.sleep(1000);
	//}
	}

}
