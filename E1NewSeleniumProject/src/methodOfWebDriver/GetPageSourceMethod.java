package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 Thread.sleep(2000);
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 String pagesource = driver.getPageSource();
		 System.out.println(pagesource);
		 
	}

}
