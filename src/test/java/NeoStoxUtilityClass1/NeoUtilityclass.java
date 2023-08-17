package NeoStoxUtilityClass1;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class NeoUtilityclass 
{
	
	public static String readDataFromFile(String key) throws IOException
	{
		Properties prp = new Properties();
		
		FileInputStream myfile = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\Investment_Banking1\\neoStoxProp.properties");
		
		prp.load(myfile);
		
		String value = prp.getProperty(key);
		
		return value;
	}
	
	public static void NeoScreenshot(WebDriver driver, String TestID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dist= new File("E:\\Testing Class\\MyProject\\NeoStox"+TestID+".png");
		
		FileHandler.copy(src, dist);
	
	}

	public static void waits(WebDriver driver, int wiattime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(wiattime));
	}
	
	
}
