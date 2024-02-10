package DropdownHandlingMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TounderstandOperationalMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("file:///C:/Users/LENOVO/Desktop/web%20elements/multiselectdropdown.html");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 Thread.sleep(1000);
	 
	WebElement  multiSelectDD = driver.findElement(By.id("menu"));
	Select sel = new Select(multiSelectDD);
	Thread.sleep(1000);
	boolean result = sel.isMultiple();
	System.out.println(result);
	
	System.out.println();
	
	 List<WebElement> options = sel.getOptions();
	 for(int i=0;i<options.size();i++) 
	 {
		String op = options.get(i).getText();
		System.out.println(op);
		
	 }
	 
	 System.out.println();
	 for(int i=2;i<=4;i++)
	 {
		sel.selectByIndex(i);
	 }

	 WebElement fo = sel.getFirstSelectedOption();
	 System.out.println(fo.getText());
	 
	 System.out.println();
	 
	List<WebElement> allselectedop = sel.getAllSelectedOptions();
	 for(WebElement we: allselectedop)
	 {
		String ops = we.getText();
		System.out.println(ops);
	 }
	 System.out.println();
	 
	 WebElement element = sel.getWrappedElement();
	  System.out.println(element.getText());
	 
	 
	 
	}
}
