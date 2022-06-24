package com.windowhadling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static Boolean isExist(ChromeDriver _driver, String loc) {
		try {
			_driver.findElement(By.xpath(loc));
			return true;
		}

		catch (Exception e) {
			return false;
		}

	}

	public static void handlingWindow() {
		System.setProperty("webdriver.chrome.driver", "E:\\jar\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Documents/HandlingMultipleWindows.html");
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		String parent = driver.getWindowHandle();
		// System.out.println(parent);
		Set<String> handles = driver.getWindowHandles();
		// handles.remove(parent);
		for (String handle : handles) {
			// System.out.println(handle);
			driver.switchTo().window(handle);
			// if(driver.getCurrentUrl().contains("Second.html")) {
			if (isExist(driver, "//h2[text()='Welcome to First window']")) {
				driver.findElement(By.xpath("//button[@onclick=\"clickMe()\"]")).click();
				String msg = driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
				System.out.println(msg);
				break;
			}
		}
	}

	public static void handlingwindow1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\jar\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Documents/HandlingMultipleWindows.html");
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		handles.remove(parent);
		for (String handle : handles) {

			driver.switchTo().window(handle);
			// driver.getTitle().contains("Second Window");
			driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
			String msg = driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
			System.out.println(msg);

		}
	}

	public static void main(String[] args) {
		// handlingWindow();
		handlingWindow();
	}
}
