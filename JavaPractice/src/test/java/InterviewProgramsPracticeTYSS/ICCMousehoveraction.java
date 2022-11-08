package InterviewProgramsPracticeTYSS;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICCMousehoveraction {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.icc-cricket.com/");
		driver.findElement(By.xpath("//li[@class='site-tabs__item theme theme-icc']")).click();

		
		System.out.println("parent window title is"+driver.getTitle());
		Set<String>allWindows= driver.getWindowHandles();
		ArrayList<String>tabs = new ArrayList<>(allWindows);
		driver.switchTo().window(tabs.get(1));
		System.out.println("Title is:"+driver.getTitle());
		{
		}
		WebElement e = driver.findElement(By.xpath("//button[@class='linked-list__dropdown-label js-dropdown-btn']/ancestor::div[@class='main-navigation__container js-will-glue']"));
		driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/div[1]/nav/ul/li[3]/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/div[1]/nav/ul/li[3]/ul/li[2]/button ")).click();
		driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/div[1]/nav/ul/li[3]/ul/li[2]/ul/li[3]/a")).click();
	}
}