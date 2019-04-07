package com.hrms.TestScripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.*;
public class TC_101_VerifyLogin {
	@Test(groups="Reg",priority=1)
	public void sskg() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		General g=new General();
		g.openapplication();
		g.waiting();
		g.verifyTitle();
		g.login();
		g.verifyTitle();
		g.Verifytext();
		g.logout();
		g.close();
	}

}
