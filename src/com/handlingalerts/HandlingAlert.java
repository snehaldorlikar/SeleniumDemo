package com.handlingalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {
	private static final CharSequence ShiftKeys = null;

	public static void handlingSimpleAlerts() {
		System.setProperty("webdriver.chrome.driver", "E:\\jar\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/assignments/simple-alert");
		driver.findElement(By.xpath("//input[@name='YourName']")).sendKeys("VIVAAN KALE");
		driver.findElement(By.xpath("//button[@class='alert-btn']")).click();
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println("message is:" + msg);
	}

	public static void main(String[] args) {
		handlingSimpleAlerts();
	}
}