package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.utility.log;

//import org.openqa.selenium.firefox.FirefoxDriver;
import static org.testng.Assert.assertTrue;

public class General extends Global{
	public void openapplication(){
		log.info("***************Open browser************");
		System.setProperty(chromedrivername,chromedriverpath);
		ssk=new ChromeDriver();
		log.info("************Enter URL**********");
		
		ssk.get(url);
		
		log.info("*************Application Opened************");
		System.out.println("Open Allication");
	}
	@Test
	public void waiting() throws Exception{
		Thread.sleep(2000);
	}
	
	public void verifyTitle(){
		if(ssk.getTitle().equals(Homepagetitle)){
			System.out.println("Title matched");
			log.info("************Title Verified************");
		}
		else{
			System.out.println("Title not matched");
			log.info("************Title Not Verified************");
		}
	}
	public void login(){
		
		ssk.findElement(By.name(txt_loginname)).sendKeys(un);
		ssk.findElement(By.name(txt_Password)).sendKeys(pwd);
		ssk.findElement(By.name(btn_login)).click();
		Reporter.log("Function Ok");
		log.info("************Login Completed************");
	}
	public void Verifytext(){
		assertTrue(ssk.findElement(By.xpath("//li[text()='Welcome admin']")).getText().matches(Verify_txt));
	}
	public void Mousemovingaddemp(){
		WebElement WE=ssk.findElement(By.xpath("//ul[@id='nav']/li[2]/a/span"));
		action=new Actions(ssk);
		action.moveToElement(WE).perform();
		ssk.findElement(By.xpath("//ul[@id='nav']/li[2]/ul/li[2]/a/span")).click();
		Reporter.log("Function Ok");
		log.info("************ Mouse moved to PIM ************");
	}
	public void MousemovingEmplist(){
		WebElement WE=ssk.findElement(By.xpath("//ul[@id='nav']/li[2]/a/span"));
		action=new Actions(ssk);
		action.moveToElement(WE).perform();
		ssk.findElement(By.xpath("//ul[@id='nav']/li[2]/ul/li/a/span")).click();
		log.info("************ Employee List Selected ************");
	}
	public void Empinfo(){
		Select drpdwn=new Select(ssk.findElement(By.name("loc_code"))); 
		drpdwn.selectByVisibleText("Emp. First Name");
		ssk.findElement(By.xpath("//input[@name='loc_name']")).sendKeys("sath");
		ssk.findElement(By.xpath("//input[@value='Search']")).click();
		log.info("************ Employee Details Entered ************");
	}
	public void DeleteEmp(){
		ssk.findElement(By.xpath("//input[@name='chkLocID[]']")).click();
		ssk.findElement(By.xpath("//input[@value='Delete']")).click();
		log.info("************ Employee Deleted ************");
	}
	public void Frameenter(){
		ssk.switchTo().frame("rightMenu");
		log.info("************ Entered in Frame************");
	}
	public void pim_addemployee(){
		
		String Empid=ssk.findElement(By.xpath("//input[@id='txtEmployeeId']")).getAttribute("value");
		System.out.println(Empid);
		ssk.findElement(By.xpath("//input[@name='txtEmpLastName']")).sendKeys("korada");
		ssk.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("Sathish");
		ssk.findElement(By.xpath("//input[@name='txtEmpMiddleName']")).sendKeys("UK");
		ssk.findElement(By.xpath("//input[@name='txtEmpNickName']")).sendKeys("Bakka");
		ssk.findElement(By.xpath("//input[@id='btnEdit']")).click();
		log.info("************ Employee Added ************");
	}
	public void Frameexit(){
		ssk.switchTo().defaultContent();
		log.info("********** Exit From Frame************");
	}
	public void logout(){
		ssk.findElement(By.linkText(btn_Logout)).click();
		log.info("************Logout Successfully************");
	}
	public void close(){
		ssk.quit();
		log.info("************ Browser Closed ************");
	}
	
}
