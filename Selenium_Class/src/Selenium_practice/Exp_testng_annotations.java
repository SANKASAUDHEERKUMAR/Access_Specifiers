package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exp_testng_annotations {
	WebDriver ssk;
	@BeforeClass
	public void Login(){
		
		System.setProperty("webdriver.chrome.driver","E:/drivers/chromedriver_win32/chromedriver.exe");
		ssk= new ChromeDriver();
		ssk.navigate().to("http://localhost/orangehrm-2.6/login.php");
		ssk.findElement(By.name("txtUserName")).sendKeys("admin");
		ssk.findElement(By.name("txtPassword")).sendKeys("admin");
		ssk.findElement(By.name("Submit")).click();
		}
	@AfterClass
	public void Logout(){
		ssk.findElement(By.name("Logout")).click();
	}
	@Test(priority=1)
	public void Addemp(){
		WebElement WE=ssk.findElement(By.xpath("//ul[@id='nav']/li[2]/a/span"));
		Actions action=new Actions(ssk);
		action.moveToElement(WE).perform();
		ssk.findElement(By.xpath("//ul[@id='nav']/li[2]/ul/li[2]/a/span")).click();
	}
	@Test(priority=2)
	public void deleteemp(){
		ssk.findElement(By.xpath("//input[@name='chkLocID[]']")).click();
		ssk.findElement(By.xpath("//input[@value='Delete']")).click();
	}
}
