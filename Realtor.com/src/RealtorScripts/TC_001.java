package RealtorScripts;

import org.testng.annotations.Test;

import Realtorproject.Com_Realtor_fun;

public class TC_001 {
	
	@Test
	public void tc001(){
	Com_Realtor_fun Real=new Com_Realtor_fun();
	Real.openapp();
	Real.Register();
	}
}
