package com.hrms.TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_103_DeleteEmp {
	@Test
	public void Delete() throws Exception{
		General g=new General();
		g.openapplication();
		g.waiting();
		g.verifyTitle();
		g.login();
		g.waiting();
		g.verifyTitle();
		g.Verifytext();
		g.waiting();
		g.MousemovingEmplist();
		g.waiting();
		g.Frameenter();
		g.Empinfo();
		g.DeleteEmp();
		g.Frameexit();
		g.waiting();
		g.logout();
		g.close();
	}
}

