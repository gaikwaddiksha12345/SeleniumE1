package takesScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByUpcatingintoRemotewebDriver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RemoteWebDriver driver = new ChromeDriver();//to store the reference with remotewebdriver class
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.com/");

	

		File src = driver.getScreenshotAs(OutputType.FILE);
 
		File dest = new File("./screenshots/Amazon.png");
 
		Files.copy(src, dest);

	}

}
