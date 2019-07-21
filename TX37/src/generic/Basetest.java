package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public  class Basetest implements Iautoconstants
{
	 public static WebDriver driver;
	static
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	
	public static void openapp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.skinn.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	
	public static void closeapp()
	{
		driver.close();
	}
	

}
