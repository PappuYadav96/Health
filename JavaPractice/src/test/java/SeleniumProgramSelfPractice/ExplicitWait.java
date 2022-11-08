package SeleniumProgramSelfPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);   // pageload wait is for page loading.
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  // we are implictlity giving the wait
		
		driver.get("https://www.google.com/");	
		
		
		

	}

}
