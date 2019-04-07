package Test_suite.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class testsuitefun extends testsuiteobjver{

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
	public void time() throws Exception{
		Thread.sleep(3000);
	}
	public void mousemover(){
		WebElement we=ssk.findElement(By.xpath(admin));
		Actions ac=new Actions(ssk);
		ac.moveToElement(we).perform();
		WebElement we1= ssk.findElement(By.xpath(importexport));
		ac.moveToElement(we1).perform();
		ssk.findElement(By.xpath(Export)).click();
	}
	public void Entryframe(){
		ssk.switchTo().frame("rightMenu");
	}
	public void Exitframe(){
		ssk.switchTo().defaultContent();
	}
	public void Exporthrdata() throws Exception{
		Select EXHRD=new Select(ssk.findElement(By.xpath("//select[@id='cmbExportType']")));
		EXHRD.selectByIndex(1);
		time();
		ssk.findElement(By.id("btnExport"));
		System.out.println("button clicked");
	}
}















