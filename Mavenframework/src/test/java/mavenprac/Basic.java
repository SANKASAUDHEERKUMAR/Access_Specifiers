package mavenprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Log;

public class Basic {

	WebDriver ssk=new ChromeDriver();
	public void open(){
	
	ssk.get("http://localhost/orangehrm-2.6/login.php");
	Log.info("************ Url Opened************");
	}
	public void Close(){
		ssk.close();
		Log.info("************ Browser closed************");
		
	}
	public void login(){
		ssk.findElement(By.name("txtUserName")).sendKeys("admin");
		ssk.findElement(By.name("txtPassword")).sendKeys("admin");
		ssk.findElement(By.name("Submit")).click();
		Log.info("************ Login Completed************");
	}
	public void Logout(){
		ssk.findElement(By.linkText("Logout")).click();
		Log.info("************ Logout Completed************");
	}
}
