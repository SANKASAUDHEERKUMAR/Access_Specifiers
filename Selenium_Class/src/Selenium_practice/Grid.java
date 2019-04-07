package Selenium_practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Grid {

	static WebDriver ssk;
	static String nodeUrl;
	
	public static void main(String[] args) throws Exception {
		try {
			nodeUrl = "http://192.168.0.120:4444/wd/hub";
			DesiredCapabilities caps= DesiredCapabilities.chrome();
			caps.setBrowserName("chrome");
			caps.setPlatform(Platform.WINDOWS);
			ssk=new RemoteWebDriver(new URL(nodeUrl), caps);
			ssk.manage().deleteAllCookies();
			//ssk.manage().window().maximize();
			ssk.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			ssk.manage().timeouts().pageLoadTimeout(45,TimeUnit.SECONDS);  
			ssk.get("http://localhost/orangehrm-2.6/login.php");
			System.out.println("Title is:"+ ssk.getTitle());
			ssk.findElement(By.name("txtUserName")).sendKeys("admin");
			ssk.findElement(By.name("txtPassword")).sendKeys("admin");
			ssk.findElement(By.name("Submit")).click();
			Thread.sleep(3000);
			//ssk.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			ssk.findElement(By.linkText("Logout")).click();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
