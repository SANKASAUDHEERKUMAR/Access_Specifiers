package Selenium_practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMT_Test {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver ssk=new ChromeDriver();
		ssk.manage().window().maximize();
		ssk.get("https://www.makemytrip.com/flights/");
		ssk.findElement(By.xpath("//label[text()='round trip']")).click();
		ssk.findElement(By.id("hp-widget__sfrom")).clear();
		ssk.findElement(By.id("hp-widget__sfrom")).sendKeys("Bangalore");
		ssk.findElement(By.id("hp-widget__sTo")).sendKeys("Hyderabad");
		Thread.sleep(3000);
		ssk.findElement(By.xpath("//span[@class='o-i-swap-button']")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);		
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		System.out.println("*****************************");
		String cumonth=ssk.findElement(By.xpath("//*[contains(@id,'dp')]/div/div[1]/div/div/span[1]")).getText();
		System.out.println(cumonth);
		System.out.println("*****************************");
		//ssk.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();
		System.out.println("depart selected");
		Thread.sleep(4000);
		ssk.findElement(By.xpath("html/body/div[2]/div[3]/div[3]/div/div[3]/div/div[2]/div/a/span")).click();
		ssk.findElement(By.xpath("//*[contains(@id,'dp')]/div/div[2]/table/tbody/tr[2]/td[1]")).click();
		Thread.sleep(2000);
		ssk.findElement(By.xpath("//div[@class='dateFilterReturn hasDatepicker']/div/div/table/tbody/tr[2]/td[6]")).click();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		ssk.findElement(By.xpath("//input[@id='hp-widget__paxCounter_pot']")).click();
		ssk.findElement(By.xpath("//ul[@id='js-adult_counter']/li[2]")).click();
		ssk.findElement(By.xpath("//ul[@id='js-child_counter']/li[2]")).click();
		ssk.findElement(By.xpath("//ul[@id='js-infant_counter']/li[2]")).click();
		ssk.findElement(By.xpath("//span[@id='premiumEconomy']")).click();
		Thread.sleep(2000);
		ssk.findElement(By.xpath("//button[@id='searchBtn']")).click();
		
		
	}
}
