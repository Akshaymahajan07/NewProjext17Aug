package Neo_POM_Classes;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoLogin 
{

	@FindBy(xpath = "(//a[@class='nav-link'])[4]")private WebElement signinpage;
	
	@FindBy(xpath = "//input[@id='MainContent_signinsignup_txt_mobilenumber']")private WebElement userId;
	
	@FindBy(xpath = "//a[@id='lnk_signup1']")private WebElement signinbutton;
	
	@FindBy(xpath = "//input[@id='txt_accesspin']")private WebElement passcode;
	
	@FindBy(xpath = "//a[@id='lnk_submitaccesspin']")private WebElement submitbutton;
	
	@FindBy(xpath = "(//a[@class='btn btn-sm neobutton'])[7]")private WebElement popupclose;
	
	//Constructor for the class
	
	public NeoLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Method for signinpage
	public void signinpage() throws InterruptedException
	{
		signinpage.click();
		Thread.sleep(500);
		Reporter.log("Redairecting to sign in page", true);
	}
	
	
	//Method for userid 
	public void userid(String userid) throws InterruptedException
	{
		userId.sendKeys(userid);
		Reporter.log("Entering userid ", true);
		Thread.sleep(500);
	}
	
	//Method for signinbutton
	public void signinbutton() throws InterruptedException
	{
		signinbutton.click();
		Reporter.log("Clicking on sign in button", true);
		Thread.sleep(500);
	}
	
	//Method for Passcode
	public void passcode(String pass) throws InterruptedException
	{
		passcode.sendKeys(pass);
		Reporter.log("Entering passcode", true);
		Thread.sleep(1000);
		
	}
	
	//Method for SubmitButton
	public void submitbutton() throws InterruptedException
	{
		submitbutton.click();
		Reporter.log("Clicking on submit nutton", true);
		Thread.sleep(1000);
		Reporter.log("Logging in....", true);
	}
	
	//Method for handle popup
	public void popupclose() throws InterruptedException
	{
		Thread.sleep(1000);
		popupclose.click();
	}
	
}
