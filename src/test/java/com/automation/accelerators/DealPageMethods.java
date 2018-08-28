package com.automation.accelerators;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;

public class DealPageMethods extends Base{

	
	
	 public void dealPage() {
	    	
	    	driver.switchTo().frame("mainpanel");
			Actions action= new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath(".//*[@title='Deals']"))).build().perform();
			driver.findElement(By.xpath(".//*[@title='New Deal']")).click();
	    }
	    
	    
	    public void dealDetails(DataTable dealdata) throws InterruptedException {
	    	
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
	    
	
}
