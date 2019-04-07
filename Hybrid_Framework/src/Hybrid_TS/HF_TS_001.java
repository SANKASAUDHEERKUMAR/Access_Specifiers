package Hybrid_TS;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Hybrid_Fun.HF_Functions;

public class HF_TS_001 {

	@Test
	public void HFTS001() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		HF_Functions hf=new HF_Functions();
		hf.openapp();
		hf.Login();
		hf.mousemover();
		hf.Entryframe();
		hf.Exporthrdata();
		hf.Exitframe();
		hf.Logout();
		hf.Closeapp();
	}
}
