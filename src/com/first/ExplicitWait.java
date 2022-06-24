package com.first;

import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWait {
public static void explicitWait() {
	System.setProperty("webdriver.chrome.driver", "E:\\jar\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	Object chrome;
	//driver.get("file:///C:/Users/Admin/Documents/frm.html");
	FluentWait<WebDriver> wait= new Fluentwait<WebDriver>(chrome);
}
}
