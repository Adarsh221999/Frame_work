package com.DriverUtils_Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Base {
	public static WebDriver driver;
	
	public static WebDriver getdriver() {
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 return driver;
	 
	}

}
