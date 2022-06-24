package com.first;

import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\jar\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		//String source = driver.getPageSource();
		//System.out.println(source);
		driver.getCurrentUrl();
		driver.getTitle();
		
	}
}
