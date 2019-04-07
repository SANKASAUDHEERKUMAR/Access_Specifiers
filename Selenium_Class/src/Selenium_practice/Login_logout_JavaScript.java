package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_logout_JavaScript {
	public static void main(String argc[]) throws Exception{
		System.setProperty("webdriver.gecko.driver","E:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver ssk=new FirefoxDriver();
		ssk.get("http://localhost/orangehrm-2.6/");
		Thread.sleep(2000);
		ssk.findElement(By.name("txtUserName")).sendKeys("admin");
		ssk.findElement(By.name("txtPassword")).sendKeys("admin");
		WebElement we=ssk.findElement(By.name("Submit"));
		Thread.sleep(2000);
		JavascriptExecutor jse= (JavascriptExecutor)ssk;
		jse.executeScript("arguments[0].click();",we);
		WebElement we1=ssk.findElement(By.xpath("//ul[@id='option-menu']/li[3]/a"));
		jse.executeScript("arguments[0].click();",we1);
		
		ssk.close();
		
	}

}
