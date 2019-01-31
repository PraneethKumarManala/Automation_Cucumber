/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Googl {
   
	public WebDriver driver;
	
	@Given("^specify \"(.*)\" and launch \"(.*)\" and \"(.*)\"$")
	public void specify_and_launch_and1(String location, String browser, String url) throws Throwable {
		
		if(location.equalsIgnoreCase("local")) {
			if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		    driver.get(url);
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
				driver= new FirefoxDriver();
			    driver.navigate().to("https://www.freecrm.com/index.html");
				//driver.get(url);
			}
			driver.manage().window().maximize();
			}
	}
	
	@When("^enter \"(.*)\" and \"(.*)\"$")
	public void enter_and(String username, String password) throws Throwable {
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(1000);
	   
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