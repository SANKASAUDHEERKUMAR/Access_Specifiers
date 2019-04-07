package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.Basic;
import com.hrms.utility.log;

public class Loginapp extends Basic{

	static By Txt_name=By.name("txtUserName");
	static By Txt_pwd=By.name("txtPassword");
	static By Btn_Login=By.name("Submit");
	public static void login(String un,String pwd){
		log.info("***********Enter USerName and Password************");
		Reporter.log("Enter USerName and Password");
		ssk.findElement(Txt_name).sendKeys(un);
		ssk.findElement(Txt_pwd).sendKeys(pwd);
		ssk.findElement(Btn_Login).click();
		log.info("***********Login Successfully************");
		Reporter.log("Login Successfully");
		}

}
