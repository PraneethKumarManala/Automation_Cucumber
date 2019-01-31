package stepDefinationNew;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class MakeMyTripDocString {

	WebDriver driver;
	
	@Before("@MakeMyTrip")
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		
		
	}
	
	@After("@MakeMyTrip")
	public void tearDown() {
		
		driver.close();
	}
	
		
	@Given("^scroll down to text and getTextData:$")
	public void scroll_down_to_text_and_getTextData(String getTextData)  {
	  
		WebElement ele=driver.findElement(By.xpath("//section[@class='cfoot__container']//p[2]"));
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		
		String TextData=driver.findElement(By.xpath("//section[@class='cfoot__container']//p[2]")).getText();
		
		System.out.println("The Data is :"+getTextData);
		
		if(TextData.equalsIgnoreCase(getTextData)) {
			
			System.out.println("Test case is passed");
			
		}
		else {
			System.out.println("Test case is failed");
		}
	}
}
