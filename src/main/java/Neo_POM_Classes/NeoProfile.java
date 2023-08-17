package Neo_POM_Classes;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoProfile
{
	@FindBy(xpath = "//span[@id='lbl_username']")private WebElement username;
	
	@FindBy(xpath = "lbl_curbalancetop")private WebElement accountbalance;
	
	@FindBy(xpath = "//a[@id='navbarDropdown']")private WebElement dropdown;
	
	@FindBy(xpath = "(//span[@class='px-3'])[8]")private WebElement profile;
	
	@FindBy(xpath = "//label[@id='lbl_usermob']")private WebElement mobileno;
	
	@FindBy(xpath = "//input[@id='rad_male']")private WebElement radiobutton;
	
	
	//Cerate Constructor for NeoProfilr
	public NeoProfile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Method for Username
	public void username()
	{
		String name = username.getText();
		Reporter.log("Account holder name is "+name, true);
	}
	
	//Method for accountbalance
	public void accountbalance()
	{
		String balance = accountbalance.getText();
		
		Reporter.log("Available balance in Account is "+balance, true);
	}
	
	//Method for dropdown
	public void dropdown() throws InterruptedException
	{
		dropdown.click();
		
		Reporter.log("Clicking on Dropdown", true);
		Thread.sleep(500);
	}
	
	
	//Method for profile
	public void profile() throws InterruptedException
	{
		profile.click();
		Reporter.log("Clicking on profile button", true);
		Thread.sleep(500);
	}
	
	//Method for mobilenumber
	public void mobileno()
	{
		String mono = mobileno.getText();
		Reporter.log("Accound Holder's mobile number is "+mono, true);
		
	}
	
	//Method for radio button
	public void radiobutton()
	{
		boolean rbutton = radiobutton.isSelected();
		Reporter.log("Radio button is selected "+rbutton, true);
	}

}
