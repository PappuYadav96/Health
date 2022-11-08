package Java;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest {

	public void Gridest() throws InterruptedException, MalformedURLException {
		//Url----Java Class
		//DesiredCapabilities------>selenium remote
		//RemoteWebdriver

		URL url = new URL("http://192.168.209.237:4444/wd/hub");
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("chrome");
		WebDriver driver = new RemoteWebDriver(url, cap);
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		driver.quit();
	}	
}
