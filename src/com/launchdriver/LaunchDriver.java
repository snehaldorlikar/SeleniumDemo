package com.launchdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDriver {
public static void main(String[] args) {
	/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");*/

	ChromeDriver driver = new ChromeDriver();
	driver.get("https://testingshastra.com/");
}
}