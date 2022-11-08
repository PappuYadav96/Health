package SeleniumProgramSelfPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationForwardAndBackwardConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// get(): it is used to launch the url
		//navigate().to(): it is used to launch external url page

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.navigate().to("https://www.makemytrip.com/");

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(3000);

		driver.navigate().back();

		driver.navigate().refresh();  // to refresh the page
	}

}
