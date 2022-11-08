package InterviewProgramsPracticeTYSS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TutorialsNinja {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://tutorialsninja.com/demo/");

		driver.findElement(By.xpath("//a[text()='Your Store']")).click();


		//MouseOver Action
		WebElement ele=driver.findElement(By.xpath("//a[text()='Components']"));
		Actions act= new Actions(driver);
		WebElement element = null;
		act.moveToElement(ele).perform();

		driver.findElement(By.xpath("//a[text()='Monitors (2)']")).click();
		driver.findElement(By.xpath("//span[@class='price-new']")).click();
		System.out.println("priceShould be print 110");
		driver.findElement(By.xpath("//a[text()='Apple Cinema 30\"']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//h1[text()='Apple Cinema 30\"']/ancestor::div[@class='col-sm-4']/descendant::h2")).getText();
	    JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement element1=driver.findElement(By.xpath("//h3[text()='Available Options']"));
		
		js.executeScript("arguments[0].scrollIntoView()", element1);
		driver.findElement(By.xpath("options[218]")).click();
		driver.findElement(By.xpath("//label[@class='control-label' and text()='Checkbox']/ancestor::div[@class='form-group required ']/descendant::input[@value='10'")).click();
		driver.findElement(By.name("//input[@name='option[208]']")).sendKeys("Selenium4");
		WebElement dropdown= driver.findElement(By.name("//select[@name='option[217]']"));
		Select sel= new Select(dropdown);
		sel.selectByIndex(0);

		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']")).click();


	}}