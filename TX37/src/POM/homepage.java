package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basetest;

public class homepage 
{
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='close-icon cookies-close-icon' and @onclick='cookieInfoHide()']")
	  WebElement close1;
	
	
	@FindBy(xpath="//a[.='MEN' and @href='/shop/men']")
	 WebElement Mencategory;
	
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void closepopup()
	{
		System.out.println("**************************************");
		close1.click();
		System.out.println("**************************************");
		
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", close1);
		*/
	}
	
	public void moveonmen(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		action.moveToElement(Mencategory).perform();
		Mencategory.click();
	}

}
