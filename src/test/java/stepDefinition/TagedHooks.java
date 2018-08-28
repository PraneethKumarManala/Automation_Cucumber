/*package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TagedHooks {

	

	//Global Hooks
	@Before(order=0)
	public void setUp() {
		
		System.out.println("Lanching the Firefox Browser");
		System.out.println("Enter URL of the application");
	}
	
	@After(order=0)
	public void tearDown() {
		
		System.out.println("Close the browser");
	}
	
	
	@Before("@First")
	public void beforeFirst() {
		
		System.out.println("Before only first scenario");
	}
	@After("@First")
	public void afterFirst() {
		
		System.out.println("After only first scenario");
	}
	
	
	@Before("@Second")
	public void beforeSecond() {
		
		System.out.println("Before only second scenario");
	}
	@After("@Second")
	public void afterSecond() {
		
		System.out.println("After only second scenario");
	}
	
	@Before("@Third")
	public void beforeThird() {
		
		System.out.println("Before only Third scenario");
	}
	@After("@Third")
	public void afterThird() {
		
		System.out.println("After only Third scenario");
	}
	
	@Given("^user is an deal page$")
	public void user_is_an_deal_page() throws Throwable {
	   
		System.out.println("user is an deal page");
	}

	@When("^user fills the deal form$")
	public void user_fills_the_deal_form() throws Throwable {
	 System.out.println("user fills the deal form");  
	}

	@Then("^deal is created$")
	public void deal_is_created() throws Throwable {
	   System.out.println("deal is created");
	}

}
*/