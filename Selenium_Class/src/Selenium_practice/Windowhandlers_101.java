package Selenium_practice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandlers_101 {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver ssk=new ChromeDriver();
		ssk.get("E:/Subject/Selenium/StudentSW/Selenium_Student_SW/HtmlFiles/multiplewindows.html");
		ssk.findElement(By.id("btn1")).click();
		Thread.sleep(2000);
		ssk.findElement(By.id("btn2")).click();
		ArrayList<String> winhand=new ArrayList<String>(ssk.getWindowHandles());
		ssk.switchTo().window(winhand.get(2));
		Thread.sleep(2000);
		ssk.close();
		Thread.sleep(2000);
		ssk.quit();
	}
}
