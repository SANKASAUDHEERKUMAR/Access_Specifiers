package com.hrms.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.Basic;
import com.hrms.utility.log;

public class Verify extends Basic{

	public static void verifying(){
		log.info("***********Verify Title************");
		Reporter.log("Verify Title");
	String Homepagetitle="OrangeHRM - New Level of HR Management";
	if(ssk.getTitle().equals(Homepagetitle)){
		System.out.println("Title matched");
		Reporter.log("Title mached");
		log.info("***********Title Matched************");
	}
	else{
		System.out.println("Title not matched with the Title of " + ssk.getTitle());
		log.info("***********Title not Matched************");
		Reporter.log("Title not Mached");
	}
}
	public static void verifytext(){
		log.info("***********Verify text************");
		Reporter.log("Verify text");
		assertTrue(ssk.findElement(By.xpath("//li[text()='Welcome admin']")).getText().matches("Welcome admin"));
		log.info("***********Text Verified************");
		Reporter.log("Text Verified");
	}
}
