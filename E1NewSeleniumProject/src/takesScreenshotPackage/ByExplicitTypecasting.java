package takesScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByExplicitTypecasting {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://www.google.co.in/");
		 
		 TakesScreenshot ts = (TakesScreenshot)driver;//to perform typecsting
		 
		 File src = ts.getScreenshotAs(OutputType.FILE);//to take a screenshot on webpages.
		 
		File dest = new File("./screenshots/google.png");//to specify the location ,name,extension
		Files.copy(src, dest); //to save the scrrenshot into screenshot folder.
	}

}
