package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_from_calander {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver ssk=new ChromeDriver();
		ssk.get("https://jqueryui.com/datepicker/");
		ssk.switchTo().frame(0);
		ssk.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(1000);
		ssk.findEement(By.xpath("//div[@id='ui-datepicker-div']/div/a[2]/span")).click();
		//WebElement dateWidget=ssk.findElement(By.)
	}
	

}
