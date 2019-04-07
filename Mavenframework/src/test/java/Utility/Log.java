package Utility;

import java.util.logging.Logger;

public class Log {
	
	private static Logger Log = Logger.getLogger(Log.class.getName());

	// Need to create these methods, so that they can be called  
	public static void info(String message) {
	   Log.info(message);
	   }
	/*public static void error(String message) {
		   Log.error(message);
		   }*/
	}	


