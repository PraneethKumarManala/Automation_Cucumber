/*package stepDefinition;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FreeCRM_Login {

	
	WebDriver driver;
	
	@Given("^specify location and launch browser and url$")
	public void specify_location_and_launch_browser_and_url(DataTable init) throws Throwable {
	  
		for( Map<String , String> data:init.asMaps(String.class, String.class)){
		   String localRemote = data.get("location");
		   String browserCRM=data.get("browser");
		   String urlCRM=data.get("url");
		if(localRemote.equalsIgnoreCase("local")) {
			if(browserCRM.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		    driver.get(urlCRM);
			}
			else if(browserCRM.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
				driver= new FirefoxDriver();
			    //driver.navigate().to("https://www.freecrm.com/index.html");
				driver.get(urlCRM);
			}
			driver.manage().window().maximize();
			}
	            } 
	}

	@When("^enter username and password$")
	public void enter_username_and_password(DataTable credencials) throws Throwable {
	  
		  for(Map<String, String> data:credencials.asMaps(String.class, String.class)) {
		    	
			    driver.findElement(By.name("username")).sendKeys(data.get("username"));
				Thread.sleep(1000);
				driver.findElement(By.name("password")).sendKeys(data.get("password"));
				Thread.sleep(1000);
			  
		      }
		
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.xpath(".//*[@type='submit']")).click();
	}

	@Then("^verify Title of the home page$")
	public void verify_Title_of_the_home_page() throws Throwable {
		String actHomepage_title=driver.getTitle();
		System.out.println("The Home Page title is:"+actHomepage_title);
		String expHomepage_title="CRMPRO";
		Assert.assertEquals(expHomepage_title, actHomepage_title);
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	 driver.close();  
	}
}
*/