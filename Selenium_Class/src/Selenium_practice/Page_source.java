package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Page_source {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:/drivers/chromedriver_win32/chromedriver.exe");
		WebDriver ssk=new ChromeDriver();
		ssk.get("http://localhost/orangehrm-2.6/");
		Thread.sleep(2000);
		WebElement passedData=ssk.findElement(By.name("txtUserName"));
		passedData.sendKeys("admin");
		String user_name=passedData.getAttribute("value");
			System.out.println("Entered User Name is : "+user_name);		
		ssk.findElement(By.name("txtPassword")).sendKeys("admin");
		WebElement we=ssk.findElement(By.name("Submit"));
		we.click();
		String aaaaa=ssk.getCurrentUrl();
		System.out.println(aaaaa);
		//System.out.println(ssk.getCurrentUrl());
	}
}
