package InterviewProgramsPracticeTYSS;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleAutoSuggestionTest {

	public static void main(String[] args) {



		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("PappuYadav");
		List<WebElement> list= driver.findElements(By.xpath("//div[@class='wM6W7d']/ancestor::div[@class='UUbT9']"));	
		ArrayList<WebElement> l= new ArrayList<WebElement>(list);
		WebElement i= l.get(3)	;
		String h= i.getText();
		System.out.println(h);

	}}

