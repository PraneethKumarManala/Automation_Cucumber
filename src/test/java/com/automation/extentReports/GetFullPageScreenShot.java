package com.automation.extentReports;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class GetFullPageScreenShot {

	
	
	
	public static  String captureFullPage(WebDriver driver,String screenshotName) throws IOException {
		
		
		Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		String dest=System.getProperty("user.dir")+"/ExtentReportScreenShot/FullPageScreenshot.png";
		ImageIO.write(screenshot.getImage(), "PNG", new File(dest));
		
		return dest;
	}
}
