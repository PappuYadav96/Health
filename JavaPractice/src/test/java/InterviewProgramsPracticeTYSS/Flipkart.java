package InterviewProgramsPracticeTYSS;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7389379150");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pappu@123");
		driver.findElement(By.xpath("//span[text()='Login']/ancestor::button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("winter heater");

		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//a[@title='Classic ROOM HEATER FOR WINTER 1500-2000 W Fan Room Heater']")).click();

		//Window switching
		System.out.println("parent window title is"+driver.getTitle());
		Set<String>allWindows= driver.getWindowHandles();
		ArrayList<String>tabs = new ArrayList<>(allWindows);
		driver.switchTo().window(tabs.get(1));
		System.out.println("Title is:"+driver.getTitle());

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		String expected="Classic ROOM HEATER FOR WINTER 1500-2000 W Fan Room Heater Price in India";
		String actual=driver.getTitle();
		Assert.assertEquals(actual, expected);
	}

}
