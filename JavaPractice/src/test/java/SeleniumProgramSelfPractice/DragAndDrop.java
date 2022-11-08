package SeleniumProgramSelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// For Drag and Drop I will used Action Class
		driver.get("https://jqueryui.com/droppable/"); 
		driver.switchTo().frame(0);  // this is used to switch to frame.
		Actions action= new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//p[text()='Drag me to my target']")))
		.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
	}
}
