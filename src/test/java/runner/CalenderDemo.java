/*package runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderDemo {

	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("praneethmanala");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("praneethmanala");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@type='submit']")).click();
		driver.switchTo().frame("mainpanel");
		
		String date= "31-May-2018";
		String[] sdate=date.split("-");
		String day=sdate[0];
		String month=sdate[1];
		String year=sdate[2];
		
		List<WebElement> months = driver.findElements(By.xpath("//select[@name='slctMonth']"));
		Iterator<WebElement> itr = months.iterator();
		ArrayList<String> lists = new ArrayList<String>();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		 Select select2=new Select(driver.findElement(By.name("slctMonth")));
		 List<WebElement> all = select2.getOptions();
		
		 for(int i=0;i<all.size();i++) {
			 System.out.println(all.get(i).getText());
		 }
		 
		System.out.println(months.size());
		
		for(int i=0;i<months.size();i++) {
			System.out.println(months.get(i).getText());
			
		}
		
		System.out.println("***************************************");
		for(WebElement tlist:months) {
			lists.add(tlist.getText());
		}
		//System.out.println(lists);
		System.out.println("***************************************");
		Select select=new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		
		Select select1=new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);
		
		
		//div[@id='crmcalendar']//table/tbody/tr[2]//td//table/tbody/tr[2]//td[1]
		
		String bxpath="//div[@id='crmcalendar']//table/tbody/tr[2]//td//table/tbody/tr[";
		String axpath="]//td[";
		
		int weekdays=7;
		ArrayList<String> lists = new ArrayList<String>();
		String	nodays=null;
	  boolean flag=false;
		for(int rows=2; rows<=7;rows++) {
			for(int cols=1;cols<=weekdays;cols++) {
		    try {		
			 nodays=driver.findElement(By.xpath(bxpath+rows+axpath+cols+"]")).getText();
		    }
		    catch(NoSuchElementException e) {
		    	System.out.println("Please enter a correct date value");
		    	flag=false;
		    	break;
		    }
			 lists.add(nodays);
			 if(nodays.equals(day)) {
				 driver.findElement(By.xpath(bxpath+rows+axpath+cols+"]")).click();
				 flag=true;
				 break;
			 }
			}
			if(flag) {
				break;
			}
		}
		
				System.out.println(lists);
		
	}
}
*/