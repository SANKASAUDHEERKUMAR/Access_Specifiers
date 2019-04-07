package Page_Factory_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openclose {

	public WebDriver ssk;
	public void Open(){
		System.setProperty("webdriver.chrome.driver","E:/drivers/chromedriver_win32/chromedriver.exe");
		WebDriver ssk=new FirefoxDriver();
		ssk.get("http://localhost/orangehrm-2.6/login.php");
	}
	public void close(){
		ssk.close();
	}
}
