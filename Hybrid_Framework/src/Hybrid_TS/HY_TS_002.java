package Hybrid_TS;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Hybrid_Fun.HF_Functions;

public class HY_TS_002 {

	@Test
	public void HFTS002() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		HF_Functions hf=new HF_Functions();
		hf.openapp();
		hf.Login();
		hf.AddEmpselect();
		hf.Entryframe();
		hf.AddEmployee();
		hf.Exitframe();
		hf.Logout();
		hf.Closeapp();
	}
}
