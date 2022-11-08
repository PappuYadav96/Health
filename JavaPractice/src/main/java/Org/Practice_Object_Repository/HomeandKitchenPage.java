package Org.Practice_Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeandKitchenPage {

		
	@FindBy(xpath="//a[text()='HOME AND KITCHEN']")
	private WebElement HomeandKitchenClick;
	
	
	@FindBy(xpath="//span[text()='brands']")
	private WebElement BrandsClick;
	
	@FindBy(xpath="//span[text()='brands']/following::div[text()='MORE']")
	private WebElement MoreClick;
	
	
	public HomeandKitchenPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	//business library 
	//public void HomeandKitchenPage (String sc) throws InterruptedException
//	{
//		SubCategoryTextField.sendKeys(sc);
//		Thread.sleep(2000);
//		CreateButton.click();
//		Thread.sleep(2000);
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
