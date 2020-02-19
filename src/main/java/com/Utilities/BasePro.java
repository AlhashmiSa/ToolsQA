package com.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePro {

	public static WebDriver driver;
	
	public static void Intializer() {
		
		
		
		System.setProperty("webdriver.gecko.driver", "C://Users//hashi//Downloads//Drivers//geckodriver.exe");
		 driver = new FirefoxDriver();
		 
//		 driver.manage().window().maximize();
//		 driver.manage().deleteAllCookies();
		
	}
}
