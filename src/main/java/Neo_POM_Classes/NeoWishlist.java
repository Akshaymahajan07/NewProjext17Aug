package Neo_POM_Classes;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoWishlist 
{
	
	@FindBy(xpath = "//input[@id='txt_instruments1']")private WebElement search;
	
	@FindBy(xpath = "//div[@id='ui-id-79']")private WebElement sharename;
	
	@FindBy(xpath = "//div[@class='d-flex px-2 pt-2 pb-0 bg-main']")private WebElement clickonshare;
	
	@FindBy(xpath = "//i[@class='fa fa-trash-alt']")private WebElement removeshare;
	
	//Constructor for NeoWishlist class
	public NeoWishlist(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Method for search
	public void search(String NameofShare) throws InterruptedException
	{
		Thread.sleep(500);
		search.sendKeys(NameofShare);
		Reporter.log("Entering share name in search box ", true);
		
	}
	
	//Method for sharename
	public void sharename()
	{
		sharename.click();
		Reporter.log("Adding share into wishlist", true);
	}
	
	//Method for click on share
	public void clickonshare()
	{
		clickonshare.click();
		Reporter.log("Clicking on share" ,true);
	}
	
	//Method for remove share
	public void removeshare()
	{
		removeshare.click();
		Reporter.log("Removing share from Wishlist", true);
	}

}
