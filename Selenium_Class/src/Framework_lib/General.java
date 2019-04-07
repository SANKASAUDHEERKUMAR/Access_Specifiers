package Framework_lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class General extends Global {
	
	@BeforeClass
	public void openapp(){
		System.setProperty(chromedrivername,chromedriverpath);
		ssk=new ChromeDriver();
		Reporter.log("TestCase Steps");
		ssk.get(url);
		Reporter.log("1.Application Opened");
		System.out.println("home page opened");
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void login(){
		Reporter.log("2.Enter Username");
		ssk.findElement(By.name(txt_loginname)).sendKeys(un);
		Reporter.log("3.Enter Password");
		ssk.findElement(By.name(txt_Password)).sendKeys(pwd);
		Reporter.log("4.Click on Login");
		ssk.findElement(By.name(btn_login)).click();
		System.out.println("Before Method");
	}
	@Test(priority=2)
	public void Add(){
		System.out.println("Adding successfully");
	}
	@Test(priority=1)
	public void Delete(){
		System.out.println("Delete Successfully");
	}
	@AfterMethod
	public void logout(){
		ssk.findElement(By.linkText(btn_Logout)).click();
		System.out.println("After Method");
	}
	@AfterClass
	public void close(){
		ssk.quit();
		System.out.println("After Class");
	}
	
	
}
