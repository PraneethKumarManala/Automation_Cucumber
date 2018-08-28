/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination {

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

	//3.With Data Driven with example keyword
	
	Scenario Outline: lgoin CRM Test Scenario

        Given User is already in login page
        When Title of login page is FreeCRM
       Then user enters "<username>" and "<password>"
       Then user clicks on Login button
       Then close the browser

       Examples:
          | username            | password        |
          | praneethmanala      | praneethmanala  |
          | praneethmanala      | praneethmanala  |
          | praneethmanala      | praneethmanala  |
          | praneethmanala1     | praneethmanala1  |

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_UserName_and_Password(String username , String password) throws Throwable {
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(1000);
	}
	
	//2.With Data Driven with out using example keyword
	Given User is already in login page
	When Title of login page is FreeCRM
	Then user enters "praneethmanala" and "Praneeth@123"
	Then user clicks on Login button
	//Regular Expression \"(.*)\"
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_UserName_and_Password(String username , String password) throws Throwable {
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(1000);
	}

	
	//1.Without Data Driven
	Given User is already in login page
	When Title of login page is FreeCRM
	Then user enters userName and Password
	Then user clicks on Login button
	
	@Then("^user enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("praneeth");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("Praneeth@1");
		Thread.sleep(1000);
	}
        
	
	
	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement loginbtn = driver.findElement(By.xpath(".//*[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click();", loginbtn);
		driver.findElement(By.xpath(".//*[@type='submit']")).click();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement loginbtn = driver.findElement(By.xpath(".//*[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click();", loginbtn);
		driver.quit();
	}
}
*/