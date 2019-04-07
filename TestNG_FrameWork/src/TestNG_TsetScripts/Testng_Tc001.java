package TestNG_TsetScripts;

import org.testng.annotations.Test;

import TestNG_fun.testng_Functionals;

public class Testng_Tc001 {

	@Test
	public static void tc1(){
		testng_Functionals fun=new testng_Functionals();
		fun.openapp();
		fun.Login();
		fun.mousemover();
		fun.Logout();
		fun.Closeapp();
	}
}