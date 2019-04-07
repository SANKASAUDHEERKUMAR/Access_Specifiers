package Framework_lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Global {
	public WebDriver ssk;
	public Actions action;
	//public Select drpdwn;
	public String url="http://localhost/orangehrm-2.6/";
	public String un="admin";
	public String pwd="admin";
	public String Homepagetitle="OrangeHRM - New Level of HR Management";
	public String chromedrivername="webdriver.chrome.driver";
	public String chromedriverpath="E:\\drivers\\chromedriver_win32\\chromedriver.exe";
	//public String Firefoxdrivername="webdriver.gecko.driver";
	//public String Firefoxdriverpath="E:\\drivers\\geckodriver-v0.23.0-win64\\geckodriver.exe";
	//public String Verifytxt_path="//ul[id='option-menu']/li";
	
	public String txt_loginname="txtUserName";
	public String txt_Password="txtPassword";
	public String btn_login="Submit";
	public String btn_Logout="Logout";
	public String Verify_txt="Welcome admin";
	//public String Dropd_listval="Emp. First Name";
	//public String Empinfo_pathname="loc_code";
	

}
