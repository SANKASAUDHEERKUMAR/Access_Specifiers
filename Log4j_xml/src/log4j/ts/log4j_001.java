package log4j.ts;

import org.apache.log4j.xml.DOMConfigurator;

import log4j.fun.log4j_functions;

public class log4j_001 {

	public static void main(String args[]) throws Exception{
		DOMConfigurator.configure("log4j.xml");
		log4j_functions  fun=new log4j_functions();
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
