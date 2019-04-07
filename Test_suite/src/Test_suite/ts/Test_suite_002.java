package Test_suite.ts;

import org.testng.annotations.Test;

import Test_suite.fun.testsuitefun;

public class Test_suite_002 {

	@Test
	public static void tc2(){
		testsuitefun fun=new testsuitefun();
		fun.openapp();
		fun.Login();
		fun.mousemover();
		fun.Logout();
		fun.Closeapp();
	}
}
