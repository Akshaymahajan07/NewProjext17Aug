package NeoStoxBaseclass1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import NeoStoxUtilityClass1.NeoUtilityclass;

public class NeoBaseClass1 
{

	protected  static WebDriver driver;
	
    public static void openbrowser() throws IOException, InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    	
    	ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
    	
    	driver = new ChromeDriver(options);
    	
    	driver.manage().window().maximize();
    	
    	Thread.sleep(500);
    	
    	driver.get(NeoUtilityclass.readDataFromFile("url"));
    	
    	
    	
    }
	
}
