package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Basic {
	public static WebDriver ssk;
	
	public static void Openapp(){
		log.info("***********Open Browser************");
		Reporter.log("Open Browser");
		System.setProperty("webdriver.chrome.driver", "E:/drivers/chromedriver_win32/chromedriver.exe");
		ssk=new ChromeDriver();
		Reporter.log("Browser Opened");
		log.info("***********Browser Opened**************");
		log.info("****************Enter URL***************");
		Reporter.log("Enter URL");
		ssk.get("http://localhost/orangehrm-2.6/login.php");
		log.info("************URL Opened**************");
		Reporter.log("URL Opened");
		
	}
	public static void Closeapp(){
		log.info("**********Click the Close Button************");
		Reporter.log("Click the Close Button");
		ssk.quit();
		log.info("***********Browser Closed***************");
		Reporter.log("Browser Closed");
	}
}
	