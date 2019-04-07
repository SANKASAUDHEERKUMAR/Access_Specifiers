package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calander_selection {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver ssk=new ChromeDriver();
		ssk.get("http://localhost/orangehrm-2.6/");
		ssk.findElement(By.name("txtUserName")).sendKeys("admin");
		ssk.findElement(By.name("txtPassword")).sendKeys("admin");
		ssk.findElement(By.name("Submit")).click();
		WebElement WE=ssk.findElement(By.linkText("Time"));
		Actions action=new Actions(ssk);
		action.moveToElement(WE).perform();
		WebElement WE1=ssk.findElement(By.linkText("Timesheets"));
		action.moveToElement(WE1).perform();
		ssk.findElement(By.linkText("Print Timesheets")).click();
		ssk.switchTo().frame("rightMenu");
		ssk.findElement(By.xpath("//input[@id='btnStartDate']")).click();
		Thread.sleep(2000);
		ssk.findElement(By.xpath("//td[@id='cal1_cell8']/a")).click();
		ssk.switchTo().defaultContent();
		
		
		//*[@id="btnStartDate"]
		//*[@id="cal1_cell8"]/a
	}

}
