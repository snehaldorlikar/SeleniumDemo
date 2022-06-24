package com.screenshot;

import java.awt.Robot;

import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotUsingRobot {
	
		
	   public static void screenShot() throws AWTException, IOException {
			System.setProperty("webdriver.chrome.driver", "\"E:\\jar\\chromedriver.exe\"");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://testingshastra.com/contact-us");
			Robot robot = new Robot();
			Rectangle rect = new Rectangle(0, 0, 0, 0);
			((Object) rect).setSize(1366, 768);
			BufferedImage img = robot.createScreenCapture(rect);

			File file = new File("firstscreenshot.jpg");
			ImageIO.write(img, "jpg", file);

		
}
	   }
	   
