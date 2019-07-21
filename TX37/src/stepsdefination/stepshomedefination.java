package stepsdefination;

import org.openqa.selenium.WebDriver;

import POM.homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import generic.Basetest;

public class stepshomedefination extends Basetest
{
	@Given("^user needs to enter the URL$")
	public void user_needs_to_enter_the_URL() 
	{
	   Basetest.openapp();
	   System.out.println("url is entered");
	   homepage home=new homepage(driver);
	   System.out.println("888888888888888888888888888888888888");
	   home.closepopup();
	   
	}

	@When("^check that user is on home page$")
	public void check_that_user_is_on_home_page()
	{	
		homepage home=new homepage(driver);
		home.moveonmen(driver);
		System.out.println("homepage displayed");
	}
	
	@Then("^check the Title of the home page$")
	public void check_the_Title()
	{
		Basetest.closeapp();
		System.out.println("title");
	}
}
