package com.automation.accelerators;


import java.io.File;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import com.automation.utilites.Accessories;
import com.automation.utilites.Property;

import cucumber.api.DataTable;
import junit.framework.Assert;

public class Base extends Parameters {

	public static Property configProps=new Property("config.properties");
	
	public static String username = configProps.getProperty("username");
	public static String password = configProps.getProperty("password");
     
	public static String url=configProps.getProperty("url");
	public static String url1=configProps.getProperty("url1");
	public static String url2=configProps.getProperty("url2");
	public static String runScripts=configProps.getProperty("runScripts");
	public static String chromebrowser=configProps.getProperty("chromebrowser");
	public static String firefoxbrowser=configProps.getProperty("firefoxbrowser");
	public static String timeStamp=Accessories.timeStamp().replace(" ", "_").replace(":", "_").replace(".", "_");
	
	public int Response_Status_Code_200=200;
	public int Response_Status_Code_404=404;
	public int Response_Status_Code_201=201;
	
	public static WebDriver driver;
	
	@org.testng.annotations.Parameters({"browser"})
	@BeforeMethod
	public void setUp() {
		if(chromebrowser.equalsIgnoreCase("chrome")) {
			
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		}
		else {
			
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
	}
	
    @AfterMethod
	public void exit() {
		
    	driver.close();
	}

    
    public void enterURL() {
    	
    	driver.get(url);
    	driver.manage().window().maximize();
    }
    
    public void compareTitle() {
    	
    	String actual_title = driver.getTitle();
		System.out.println("The title of the FreeCRM is: " + actual_title);

		String exptect_title = "#1 Free CRM software in the cloud for sales and service";
		Assert.assertEquals(exptect_title, actual_title);
    }
    
    public void enterUnamePass(DataTable credentials) {
    	
    	for(Map<String, String> data:credentials.asMaps(String.class, String.class)) {
    		driver.findElement(By.name("username")).sendKeys(data.get("username"));
    		
    		driver.findElement(By.name("password")).sendKeys(data.get("password"));
    		
    		}
    }
    
    public void clickLoginBtn() throws InterruptedException {
    	
    	Thread.sleep(2000);
    	driver.findElement(By.xpath(".//*[@type='submit']")).click();
    }
    
    public void homePage() {
    	
    	String actHomepage_title=driver.getTitle();
		System.out.println("The Home Page title is:"+actHomepage_title);
		String expHomepage_title="CRMPRO";
		Assert.assertEquals(expHomepage_title, actHomepage_title);
    }
    
   
   
    
    
    public static String filepath() {
    	
    	String strDir="";
    	
    	if(chromebrowser.equalsIgnoreCase("firefox")) {
    		strDir="Firefox/FireFox";
    	}
    	if(chromebrowser.equalsIgnoreCase("chrome")) {
    		strDir="chrome/chrome";
    	}
    	if(strDir!="") {
    	    System.out.println("After Time Stamp:"+timeStamp);
    		new File(configProps.getProperty("screenShotPath")+strDir+"_"+timeStamp).mkdirs();
    	}
    	return configProps.getProperty("screenShotPath")+strDir+"_"+timeStamp+"/";
    }
    
   

}
