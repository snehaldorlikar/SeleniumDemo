package com.keyboardmouse;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlinKBMouse {
	public static void usingRobotClass() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\jar\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/contact-us");
		Robot robo = new Robot();
		// Thread.sleep(5000);
		robo.keyPress(KeyEvent.VK_SHIFT);
		// Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='contactName']")).sendKeys("snehal");
		robo.keyRelease(KeyEvent.VK_SHIFT);
	}

	public static void usingRobotClass1() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\jar\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shutterfly.com/");
		driver.manage().window().maximize();
		Robot robo = new Robot();

		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}
	public static void usingRobotClass2() throws AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\jar\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shutterfly.com/");
		driver.manage().window().maximize();
		Robot robo = new Robot();
		robo.mouseMove(435, 908);//movsehover,mousemove,mouseover
		//robo.keyPress(MouseEvent.BUTTON_Left);
		//robo.keyRelease(MouseEvent.BUTTON_Left);
		
		
	}

	public static void screenShot() throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\jar\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/contact-us");
		Robot robot = new Robot();
		Rectangle rect = new Rectangle();
		rect.setSize(1366, 768);
		BufferedImage img = robot.createScreenCapture(rect);

		File file = new File("firstscreenshot.jpg");
		ImageIO.write(img, "jpg", file);

	}

	public static void main(String[] args) throws Exception {
		// usingRobotClass();
		// screenShot();
		//usingRobotClass1();
		usingRobotClass2();

	}
}
