package InterviewProgramsPracticeTYSS;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemyTripInterview {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/makemytrip1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Makemytrip1");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		String fromCityCode="BLR";
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click(); //popup
		driver.findElement(By.xpath("//span[text()='From']")).click(); 
		driver.findElement(By.xpath("//input[@placeholder ='From']")).sendKeys("BLR"); 
		driver.findElement(By.xpath("//div[text()='BLR']")).click();
		driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
	
	}}
