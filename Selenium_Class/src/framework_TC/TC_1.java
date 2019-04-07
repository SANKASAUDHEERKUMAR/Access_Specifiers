package framework_TC;

import org.testng.annotations.Test;

import Framework_lib.General;

public class TC_1 {

	@Test
	public void sub(){
		General g=new General();
		g.openapp();
		g.login();
		g.Add();
		g.logout();
		g.close();
	}
}
