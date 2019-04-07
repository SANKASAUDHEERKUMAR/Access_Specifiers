package com.hrms.ts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.pages.Loginapp;
import com.hrms.pages.Logoutapp;
import com.hrms.pages.Verify;
import com.hrms.utility.Basic;

public class TS_001 {
	@Test
	public static void ts001() {
		DOMConfigurator.configure("log4j.xml");
		Basic.Openapp();
		Verify.verifying();
		Loginapp.login("admin", "admin");
		Verify.verifytext();
		Logoutapp.logout();
		Basic.Closeapp();
	}
}
