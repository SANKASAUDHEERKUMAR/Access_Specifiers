package com.hrms.pages;

import org.openqa.selenium.By;

import com.hrms.utility.Basic;
import com.hrms.utility.log;

public class Logoutapp extends Basic {

	static By link_logout=By.linkText("Logout");
	
	public static void logout(){
		log.info("***********Click the Logout************");
		
		ssk.findElement(link_logout).click();
		
		log.info("***********Logout Successfully************");
	}
}
