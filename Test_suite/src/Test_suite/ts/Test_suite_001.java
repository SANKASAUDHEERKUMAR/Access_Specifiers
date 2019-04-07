package Test_suite.ts;

import org.testng.annotations.Test;

import Test_suite.fun.testsuitefun;

public class Test_suite_001 {

	@Test
	public static void tc1() throws Exception{
		testsuitefun fun=new testsuitefun();
		fun.openapp();
		fun.Login();
		fun.mousemover();
		fun.Entryframe();
		fun.time();
		fun.Exporthrdata();
		fun.time();
		fun.Exitframe();
		fun.time();
		fun.Logout();
		fun.Closeapp();
	}
}
