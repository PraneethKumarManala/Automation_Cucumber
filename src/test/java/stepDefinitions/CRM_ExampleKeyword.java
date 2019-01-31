/*package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CRM_ExampleKeyword {

WebDriver driver; 
	 
	
	 
    @Given("^select \"(.*)\" enter valid url$")
    public void select_browser_enter_valid_url(String browser) {
    	
    	if(browser.equals("chrome")) {
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
    	driver = new ChromeDriver();
    	}
    	else if(browser.equals("firefox")){
    	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Drivers/geckodriver.exe");
    	driver= new FirefoxDriver();
    	}
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
    }
    
	@When("^enter \"(.*)\" and \"(.*)\"$")
	public void enter_userName_and_Password(String username,String password) throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(1000);
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
*/