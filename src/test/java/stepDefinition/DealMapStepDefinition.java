/*package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealMapStepDefinition {

	WebDriver driver;

	@Given("^User is already in login page$")
	public void user_is_already_in_login_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
	}

	@When("^Title of login page is FreeCRM$")
	public void title_of_login_page_is_FreeCRM() throws Throwable {
		String actual_title = driver.getTitle();
		System.out.println("The title of the FreeCRM is: " + actual_title);
	    String exptect_title = "#1 Free CRM software in the cloud for sales and service";
		Assert.assertEquals(exptect_title, actual_title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) throws Throwable {
		for(Map<String, String> data:credentials.asMaps(String.class, String.class)) {
		driver.findElement(By.name("username")).sendKeys(data.get("username"));
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(data.get("password"));
		Thread.sleep(1000);
		}
	}

	
	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
		
		driver.findElement(By.xpath(".//*[@type='submit']")).click();
	}

	
	
	@Then("^user is an home page$")
	public void user_is_an_home_page() throws Throwable {
	   
		String actHomepage_title=driver.getTitle();
		System.out.println("The Home Page title is:"+actHomepage_title);
		String expHomepage_title="CRMPRO";
		Assert.assertEquals(expHomepage_title, actHomepage_title);
		
	}

	@Then("^moves to new deal page$")
	public void moves_to_new_deal_page() throws Throwable {
	   
		driver.switchTo().frame("mainpanel");
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(".//*[@title='Deals']"))).build().perform();
		driver.findElement(By.xpath(".//*[@title='New Deal']")).click();
		
	}

	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable dealdata) throws Throwable {
		
		for(Map<String, String> ddata:dealdata.asMaps(String.class, String.class)) {
	  Thread.sleep(2000);
	  driver.findElement(By.id("title")).sendKeys(ddata.get("title"));
	  driver.findElement(By.id("amount")).sendKeys(ddata.get("amount"));
	  driver.findElement(By.id("probability")).sendKeys(ddata.get("probobility"));
	  driver.findElement(By.id("commission")).sendKeys(ddata.get("commission"));
	  
	    driver.findElement(By.xpath(".//*[@value='Save']")).click();
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(".//*[@title='Deals']"))).build().perform();
		driver.findElement(By.xpath(".//*[@title='New Deal']")).click();
		
	 }
		
	}
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		
		driver.quit();
	}
	
}
*/