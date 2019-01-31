package stepDefinationNew;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginCRM2 {
	public WebDriver driver;


	@Given("^launch browser initially$")
	public void launch_browser_initially(){
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@When("^enter correct url$")
	public void enter_correct_url() {
		driver.get("https://www.freecrm.com/index.html");
	}

	@Then("^enter \"(.*)\" and \"(.*)\"$")
	public void Then_enter_username_and_password(String username ,String password) throws InterruptedException {

	
			driver.findElement(By.name("username")).sendKeys(username);
			Thread.sleep(1000);
			driver.findElement(By.name("password")).sendKeys(password);
			Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[@type='submit']")).click();
	}

	@Then("^close the browser$")
	public void close_the_browser() {
		driver.close();
	}
}
