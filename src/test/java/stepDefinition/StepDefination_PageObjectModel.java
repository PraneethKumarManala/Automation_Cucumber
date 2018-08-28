package stepDefinition;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.automation.accelerators.Base;
import com.automation.accelerators.DealPageMethods;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefination_PageObjectModel {

    
	WebDriver driver;

	Base base=new Base();
	DealPageMethods dpm=new DealPageMethods();
	
  @Given("^User is already in login page$")
   public void user_is_already_in_login_page() throws Throwable {
	
	base.setUp();
	base.enterURL();
	
  }

	@When("^Title of login page is FreeCRM$")
	public void title_of_login_page_is_FreeCRM() throws Throwable {
		base.compareTitle();
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) throws Throwable {
	
		base.enterUnamePass(credentials);
	}

	
	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
		
	base.clickLoginBtn();
	}

	
	
	@Then("^user is an home page$")
	public void user_is_an_home_page() throws Throwable {
	   
	base.homePage();
		
	}

	@Then("^moves to new deal page$")
	public void moves_to_new_deal_page() throws Throwable {
	   
		dpm.dealPage();
		
	}

	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable dealdata) throws Throwable {
		
		dpm.dealDetails(dealdata);
		
	}
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		
		base.exit();
	}
	

}
