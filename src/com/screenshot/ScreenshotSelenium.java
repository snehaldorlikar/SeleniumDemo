package com.screenshot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotSelenium {
	
	/*public static void screenShot() throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "\"E:\\jar\\chromedriver.exe\"");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/contact-us");
		Robot robot = new Robot();
		Rectangle rect = new Rectangle();
		rect.setSize(1366, 768);
		BufferedImage img = robot.createScreenCapture(rect);

		File file = new File("firstscreenshot.jpg");
		ImageIO.write(img, "jpg", file);

	}
	
/*public static void screenshotUsingSelenium() {
	
	System.setProperty("webdriver.chrome.driver", "E:\\jar\\chromedriver.exe");
	RemoteWebDriver driver = new ChromeDriver();
	driver.get("https://testingshastra.com/contact-us");
	
	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyHHmmss");  
	   LocalDateTime now = LocalDateTime.now();  
	   String date=dtf.format(now); 
	   File file=driver.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(file, new File("screenshot"+date+".jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}*/
 public static  void usingAShot() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.shutterfly.com");
		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyHHmmss");  
		  LocalDateTime now = LocalDateTime.now();  
		  String date=dtf.format(now); 
		   AShot ashot = new AShot();
		   ashot.shootingStrategy(ShootingStrategies.viewportPasting(500));
          Screenshot sc = ashot.takeScreenshot(driver);
          BufferedImage img =sc.getImage();
          try {
			ImageIO.write(img, "jpg", new File("screenshot_"+date+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();
	 
 }
 
 public static void main(String[] args)  {
	/*try {
		screenShot();
	} catch (AWTException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}*/usingAShot();
}
}
