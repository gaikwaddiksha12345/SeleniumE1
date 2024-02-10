package DropdownHandlingMethods;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateOptionsFromDD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/LENOVO/Desktop/web%20elements/multiselectdropdown.html");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 Thread.sleep(1000);
		 
		WebElement  multiSelectDD = driver.findElement(By.id("menu"));
		Select sel = new Select(multiSelectDD);
		Thread.sleep(1000);
		
		TreeSet<String> ts = new TreeSet<String>();
		
	   List<WebElement> options = sel.getOptions();
	   for(WebElement we: options)
	   {
		   String textToInsert = we.getText();
		   ts.add(textToInsert);
	   }
	   for(String t : ts) 
	   {
		  System.out.println(t); 
	   }
	}

}
