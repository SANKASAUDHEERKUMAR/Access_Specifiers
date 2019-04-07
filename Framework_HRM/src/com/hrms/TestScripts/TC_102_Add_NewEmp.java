package com.hrms.TestScripts;
import org.testng.annotations.Test;

import com.hrms.lib.*;
public class TC_102_Add_NewEmp {
	@Test(groups="sanity",priority=2)
	public void chhh() throws Exception{
		General g=new General();
		g.openapplication();
		g.waiting();
		g.verifyTitle();
		g.login();
		g.waiting();
		g.verifyTitle();
		g.Verifytext();
		g.waiting();
		g.Mousemovingaddemp();
		g.waiting();
		g.Frameenter();
		g.pim_addemployee();
		g.Frameexit();
		g.waiting();
		g.logout();
		g.close();
	}

}
