package com.hrms.TestScripts;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrms.lib.Global;

public class Screenshot_webdriver extends Global {
	@BeforeMethod
	public void openapp(){
		System.setProperty(chromedrivername, chromedriverpath);
		ssk=new ChromeDriver();
	}
	@AfterMethod
	public void teardown(){
		ssk.quit();		
	}
	@Test
	public void screenshot() throws Exception{
		try{
		ssk.navigate().to(url);
		ssk.findElement(By.name(txt_loginname)).sendKeys(un);
		ssk.findElement(By.name(txt_Password)).sendKeys(pwd);
		ssk.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);
		WebElement WE=ssk.findElement(By.linkText("PIM"));
		Actions action=new Actions(ssk);
		action.moveToElement(WE).perform();
		Thread.sleep(2000);
		ssk.findElement(By.linkText("Add Employee1")).click();
		Thread.sleep(2000);
		System.out.println("Add Employee is clicked");
		}	
		catch(Exception e){
			File f1=((TakesScreenshot)ssk).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:\\Screenshot.jpeg"));
		}
		ssk.quit();
	}
}
