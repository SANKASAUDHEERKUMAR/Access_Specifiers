package Selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Page_Factory {

	static WebDriver ssk;
	@FindBy(how=How.NAME,using="txtUserName")
	@CacheLookup
	static WebElement txt_UserName;
	@FindBy(how=How.NAME,using="txtPassword")
	static WebElement txt_Password;
	@FindBy(how=How.NAME,using="Submit")
	static WebElement submit;
	public static void main(String args[]){
		ssk=new ChromeDriver();
		ssk.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ssk.get("http://localhost/orangehrm-2.6/login.php");
		PageFactory.initElements(ssk,Page_Factory.class);
		txt_UserName.sendKeys("admin");
		txt_Password.sendKeys("admin");
		submit.click();
		ssk.close();
		
	}
}
