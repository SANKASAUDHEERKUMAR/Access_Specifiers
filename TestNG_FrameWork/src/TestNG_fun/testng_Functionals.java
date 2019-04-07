package TestNG_fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;


public class testng_Functionals extends testng_objver{

	public void openapp() {
		System.setProperty("webdriver.chrome.driver","E:/drivers/chromedriver_win32/chromedriver.exe");
		ssk=new ChromeDriver();
		ssk.get("http://localhost/orangehrm-2.6/login.php");
		ssk.manage().window().maximize();
		Reporter.log("Browser Opened");
	}
	public void Closeapp(){
		ssk.quit();
		Reporter.log("Browser Closed");
	}
	public void Login(){
		ssk.findElement(By.name(UID)).sendKeys(un);
		ssk.findElement(By.name(PWD)).sendKeys(pw);
		ssk.findElement(By.name(submit)).click();
		Reporter.log("Login Successfully");
	}
	public void Logout(){
		ssk.findElement(By.linkText(logout)).click();
		Reporter.log("Logout Successfully");
	}
	public void mousemover(){
		WebElement we=ssk.findElement(By.xpath("//li[@id='admin']/a/span"));
		Actions ac=new Actions(ssk);
		ac.moveToElement(we).perform();
		WebElement we1= ssk.findElement(By.xpath("//li[@id='admin']/ul/li[10]/a/span"));
		ac.moveToElement(we1).perform();
		ssk.findElement(By.xpath("//li[@id='admin']/ul/li[10]/ul/li[2]/a/span")).click();
	}
	
	
}
