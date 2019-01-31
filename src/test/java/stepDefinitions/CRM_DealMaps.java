package stepDefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CRM_DealMaps {

	
   WebDriver driver;
	
    @Given("^enter valid url$")
    public void enter_valid_url() {
    	
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
    	driver = new ChromeDriver();
    
    	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Drivers/geckodriver.exe");
    	driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
    }
    
	@When("^enter userName and Password$")
	public void enter_userName_and_Password(DataTable dealData) throws InterruptedException {
		
		for(Map<String , String> tdata:dealData.asMaps(String.class, String.class)) {
			
			driver.findElement(By.name("username")).sendKeys(tdata.get("username"));
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys(tdata.get("password"));
			Thread.sleep(2000);
		}
		
		
	}
	
	@Then("^click on Signin button$")
	public void click_on_Signin_button() {
		
		driver.findElement(By.xpath(".//*[@type='submit']")).click();
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
		
		driver.close();
	}
}
