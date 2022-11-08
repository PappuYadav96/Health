package SeleniumProgramSelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MousehoverDemo {

	public static void main(String[] args) throws Exception {
//MouseHover Action will be done by Action Class

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); // all the cache or cookies
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement ele=driver.findElement(By.xpath("//button[text()='Automation Tools']"));

		
		Actions act = new Actions(driver);  // Action Class Object Creation
		act.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Appium']")).click();
	}

}
