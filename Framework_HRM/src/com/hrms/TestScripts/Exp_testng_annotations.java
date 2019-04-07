package com.hrms.TestScripts;

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
		ssk.findElement(By.name("txtUserName")).sendKeys("admin");
		ssk.findElement(By.name("txtpassword")).sendKeys("admin");
		ssk.findElement(By.name("Submit")).click();
		}
	@AfterClass
	public void Logout(){
		ssk.findElement(By.name("Logout")).click();
	}
	@Test(groups="Reg",priority=1)
	public void Addemp(){
		WebElement WE=ssk.findElement(By.xpath("//ul[@id='nav']/li[2]/a/span"));
		Actions action=new Actions(ssk);
		action.moveToElement(WE).perform();
		ssk.findElement(By.xpath("//ul[@id='nav']/li[2]/ul/li[2]/a/span")).click();
	}
	@Test(groups="sanity",priority=2)
	public void deleteemp(){
		ssk.switchTo().frame("rightMenu");
		ssk.findElement(By.xpath("//input[@name='chkLocID[]']")).click();
		ssk.findElement(By.xpath("//input[@value='Delete']")).click();
		ssk.switchTo().defaultContent();
	}
}
