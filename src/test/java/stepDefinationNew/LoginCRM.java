package stepDefinationNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginCRM {

	public WebDriver driver;
	
	/*Scenario scenario;
	
	@Before
	public void testSetUp(Scenario scenario) {
		this.scenario=scenario;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Test Environment set Up");
		System.out.println("---------------------------------------------------------");
        System.out.println("Executing Scenario :"+scenario.getName());
    }*/
	
	@Before
	public void testSetUp() {
		
		/*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		driver = new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Drivers/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Test Environment set Up");
		System.out.println("---------------------------------------------------------");
       
    }
	
	@After
	public void tearDown() {
		System.out.println("Test Enviroment Destroyed");
		System.out.println("---------------------------------------------------------");
		driver.close();
	}

	
	@Given("^launch browser initially1$")
	public void launch_browser_initially1() {
		System.out.println("Browser Launched successfully");
	}

	@When("^enter correct url1$")
	public void enter_correct_url1() {
		driver.get("https://www.freecrm.com/index.html");
	}

	@Then("^enter1 \"(.*)\" and \"(.*)\"$")
	public void enter1_and(String username, String password) throws InterruptedException {

		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@type='submit']")).click();
	}

	@Then("^close1 the browser $")
	public void close1_the_browser() {
		System.out.println("Browser Closed Successfully");
	}

}
