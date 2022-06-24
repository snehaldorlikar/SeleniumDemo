package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	static ChromeDriver driver = null;

	private static void launchApp() {
		System.setProperty("webdriver.chrome.driver", "E:\\jar\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Documents/frm.html");

	}

	public static void clearMethod() {
		launchApp();
		driver.findElement(By.xpath("//input[@id='fname']")).clear();
		driver.findElement(By.xpath("//input[@id='lname']")).clear();

	}

	public static void sendKeysMethod() {
		launchApp();
		driver.close();
		clearMethod();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("snehal");

		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(Keys.SHIFT,"kale");
		System.out.println(driver.findElement(By.xpath("//input[@id='lname']")).getAttribute("id"));

		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("kale");
		System.out.println(driver.findElement(By.xpath("//input[@id='lname']")).getTagName());
		System.out.println(driver.findElement(By.xpath("//label[@for='lname']")).getText());
		System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed());
		
		System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).isEnabled());
driver.close();
	}
	//public static void isDisplayed() {
		// TODO Auto-generated method stub
		//launchApp();
		//System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed());

	//}
	public static void main(String[] args) {
		// clearMethod();
		sendKeysMethod();
		//isDisplayed();
		

	}
}