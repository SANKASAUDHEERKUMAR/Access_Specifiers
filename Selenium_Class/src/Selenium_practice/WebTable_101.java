package Selenium_practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTable_101 {
	public static String UN="admin";
	public static String PWD="admin";
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver ssk= new ChromeDriver();
		ssk.get("http://localhost/orangehrm-2.6/");
		Thread.sleep(2000);
		ssk.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys(UN);
		ssk.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(PWD);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		int row=ssk.findElements(By.xpath("//form[@name='standardView']/table/tbody/tr")).size();
		int col=ssk.findElements(By.xpath("//form[@name='standardView']/table/tbody/tr[1]/td")).size();
		int rowcol=ssk.findElements(By.xpath("//form[@name='standardView']/table/tbody/tr/td")).size();
			System.out.println(row);
			System.out.println(col);
			System.out.println(rowcol);
	}

}
