package com.keyboardmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouse {
public static void mouseMovement() {
	System.setProperty("webdriver.chrome.driver", "E:\\jar\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://testingshastra.com/");
	Actions act = new Actions(driver);
	WebElement assignments=driver.findElement(By.xpath("//a[text()='Assignments']"));
	act.moveToElement(assignments).click();
	
	act.perform();

}
public static void rightClick() {
	System.setProperty("webdriver.chrome.driver", "E:\\jar\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://testingshastra.com/");
	Actions act = new Actions(driver);
	WebElement assignments=driver.findElement(By.xpath("//a[text()='Assignments']"));
	act.moveToElement(assignments).contextClick();
	act.perform();
	
}
public static void dragAndDrop() {
	System.setProperty("webdriver.chrome.driver", "E:\\jar\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://testingshastra.com/assignments/drag-and-drop");
	Actions act = new Actions(driver);
	WebElement src =driver.findElement(By.xpath("//h5[text()='Java full stack Development' ]"));
	act.clickAndHold(src);
	WebElement target = driver.findElement(By.xpath("//div[@id=\"trash\"]"));
	act.dragAndDrop(src, target);
	act.build();
	act.perform();
}
public static void main(String[] args) {
	//mouseMovement();
	//rightClick();
	dragAndDrop();
}
}
