package com.popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandle {
	public static void poupHandleExample() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\jar\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://getbootstrap.com/docs/4.0/components/modal/");
	//Thread.sleep(5000);

	driver.findElement(By.xpath("//button [@data-target=\"#exampleModalLive\"]")).click();
	//Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@class=\"bd-example bd-example-modal\"]//button[@class=\"btn btn-secondary\"]")).click();
	
	}

public static void main(String[]args) throws InterruptedException {
poupHandleExample();
	//PopupHandle po =new PopupHandle();
	//po.poupHandleExample();
}
}